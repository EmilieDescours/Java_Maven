package warriors.engine;

import java.sql.Connection;
import java.util.ArrayList;

public abstract class DAO <T> {
	
//connection à la bdd
	protected Connection connection;
	
	//constructeur de ma DAO
	public DAO(Connection connection) {
		
		this.connection = connection;
	}
	
	public abstract ArrayList <T> findAll() ;
	
	public abstract void create (T objet);
	
}
 