package warriors.engine;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import warriors.contracts.GameState;
import warriors.contracts.Hero;
import warriors.contracts.Map;
import warriors.contracts.WarriorsAPI;
import warriors.engine.BaseMap;
import warriors.engine.FirstMap;

/**
 * class warriors
 * 
 * @author emilie
 *
 */
public class Warriors implements WarriorsAPI {

	int gameCount = 1;
	java.util.Map<String, GamePlayerState> startedGames = new HashMap<String, GamePlayerState>();

	@Override
	public List<? extends Hero> getHeroes() {
		List<Hero> heros = new ArrayList<Hero>();
		heros = new HeroDAO(ConnectionBdd.getInstance()).findAll();
		// heros.add(new WarriorHero());
		// heros.add(new WitcherHero());
		return heros;
	}

	@Override
	public List<? extends Map> getMaps() {
		// Même résultat que le List.of() au dessus
		List<Map> maps = new ArrayList<Map>();
		maps.add(new FirstMap());
		return maps;
	}

	@Override
	public GameState createGame(String playerName, Hero hero, Map map) {
		if (!(map instanceof BaseMap)) {
			throw new IllegalArgumentException("The map is not supported");
		}

		String gameId = "game - " + gameCount;
		GamePlayerState game = new GamePlayerState(playerName, hero, (BaseMap) map, gameId);
		gameCount = gameCount + 1;
		startedGames.put(gameId, game);
		new GamePlayerStateDAO(ConnectionBdd.getInstance()).create(game);
		return game;
	}

	@Override
	public GameState nextTurn(String gameID) {
		GamePlayerState game = startedGames.get(gameID);
		int rand = 1 + (int) (Math.random() * ((6 - 1) + 1));
		game.moveHero(rand);
		return game;
	}

}
