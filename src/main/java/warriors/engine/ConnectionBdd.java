package warriors.engine;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBdd {

	// URL de connexion
	private static String url = "jdbc:mysql://adminer.local/Donjons&Dragons?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

	// Nom de l'user
	private static String user = "emilie_user";
	// Mot de passe de l'utilisateur
	private static String passwd = "emisabine";

	// objet de connexion
	private static Connection connect;

	// Methode qui retourne notre instance et la créer si elle n'exsite pas
	public static Connection getInstance() {
		if (connect == null) {
			try {
				connect = (Connection) DriverManager.getConnection(url, user, passwd);
				System.out.println("INSTANCIATION DE LA CONNEXION SQL ! ");

				 System.out.println("CONNEXION SQL EXISTANTE ! ");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return connect;
	}
}
