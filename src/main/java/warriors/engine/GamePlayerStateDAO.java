package warriors.engine;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import warriors.contracts.GameState;

public class GamePlayerStateDAO extends DAO<GameState> {

	public GamePlayerStateDAO(Connection connection) {
		super(connection);

	}

	@Override
	public ArrayList findAll() {

		return null;
	}

	@Override
	public void create(GameState objet) {
		GamePlayerState newtmpGame = (GamePlayerState) objet;
		try {
			Statement state = this.connection.createStatement();
			state.executeUpdate(String.format(
					"INSERT INTO GameState(namePlayer, chosenHeroId, chosenMapName, currentCase, status, lastLog) VALUES ('%s', '%d', '%s', '%d', '%s', '%s')",
					newtmpGame.getPlayerName(), ((Personnages) newtmpGame.getHero()).id, newtmpGame.getMap().getName(),
					newtmpGame.getCurrentCase(), newtmpGame.getGameStatus().toString(), newtmpGame.getLastLog()));
		} catch (SQLException e) {

		}

	}

}
