package warriors.engine;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import warriors.contracts.Hero;

public class HeroDAO extends DAO<Hero> {

	public HeroDAO(Connection connection) {
		super(connection);

	}

	@Override
	public ArrayList<Hero> findAll() {
		Hero tmp = null;
		ArrayList<Hero> listPersonnage = new ArrayList<Hero>();

		// creation d'un objet Statement
		try {
			Statement state = this.connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);

			// L'objet Resultset contient le résultat de la requete sql
			ResultSet result = state.executeQuery("SELECT * FROM Hero");
			while (result.next()) {
				tmp = null;

				int id = result.getInt("id");
				String nom = result.getString("Nom");
				int life = result.getInt("Niveau de vie");
				String image = result.getString("Image");
				int attack = result.getInt("Niveau de force");
				String arme = result.getString("Arme/Sort");
				String shield = result.getString("Bouclier");
				String type = result.getString("Type");

				if (type.equals("Warrior")) {
					tmp = new WarriorHero(nom, id, life, attack, arme, image, shield);
				} else if (type.equals("Magicien")) {
					tmp = new WitcherHero(nom, id, life, attack, arme, image, shield);
				}
				if (tmp != null) {
					listPersonnage.add(tmp);
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listPersonnage;
	}

	@Override
	public void create(Hero objet) {
		
		
	}

}
