package warriors.engine;

import warriors.contracts.GameState;
import warriors.contracts.GameStatus;
import warriors.contracts.Hero;
import warriors.contracts.Map;
import warriors.engine.BaseMap;

public class GamePlayerState implements GameState {

	String namePlayer;
	Hero chosenHero;
	BaseMap chosenMap;
	private String gameId;
	private int currentCase;
	GameStatus status;
	String lastLog;

	// *construct

	public GamePlayerState(String namePlayer, Hero chosenHero, BaseMap chosenMap, String gameId) {

		this.namePlayer = namePlayer;
		this.chosenHero = chosenHero;
		this.chosenMap = chosenMap;
		this.gameId = gameId;
		currentCase = 0;
		status = GameStatus.IN_PROGRESS;
		lastLog = "Bienvenue " + chosenHero.getName() + "!";

	}

	@Override
	public String getPlayerName() {
		return namePlayer;
	}

	@Override
	public String getGameId() {
		return gameId;
	}

	@Override
	public GameStatus getGameStatus() {
		return status;
	}

	@Override
	public Hero getHero() {
		return chosenHero;
	}

	@Override
	public Map getMap() {
		return chosenMap;
	}

	@Override
	public String getLastLog() {
		return lastLog;
	}

	@Override
	public int getCurrentCase() {
		return currentCase;
	}

	public void moveHero(int count) {
		currentCase = currentCase + count;
		lastLog = "Vous avez avancé de " + count + " et vous êtes à la case " + currentCase;
		if (currentCase >= chosenMap.getNumberOfCase()) {
			status = GameStatus.FINISHED;
			lastLog = "Le jeu est terminé !!!";
		} else if (chosenHero.getLife() <= 0) {
			Case positionCase = chosenMap.getListCase().get(currentCase);
			status = GameStatus.FINISHED;
			lastLog = "Vous avez avancé de " + count + " et vous êtes à la case " + currentCase + "\n"
					+ positionCase.open((Personnages) chosenHero) + "\n" + "Vous êtes Mort, La partie est terminé !!!";

		} else {
			Case positionCase = chosenMap.getListCase().get(currentCase);
			lastLog = "Vous avez avancé de " + count + " et vous êtes à la case " + currentCase + "\n"
					+ positionCase.open((Personnages) chosenHero);
			if (chosenHero.getLife() <= 0) {
				status = GameStatus.FINISHED;
			}
		}
	}
}
