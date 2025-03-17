

public class Database {
    private static Database instance;

    private Database() {
        System.out.println("Database instance is created!!");
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void execute(String q) {
        System.out.println("Executing query: " + q);
    }
}
