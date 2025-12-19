package singleton;

//1. način - nestrpljivo učitavnje
public class DatabaseConnection {
	
	private static DatabaseConnection instance = new DatabaseConnection();

	/*public*/ private DatabaseConnection() {

	}

	//logika povezivanja na BP
	
	public static DatabaseConnection getInstance() {
		return instance;
	}
	
}
