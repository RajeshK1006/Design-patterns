

public class Main {
    public static void main(String[] args) {
        Database db = Database.getInstance();
        db.execute("SELECT * FROM users");

        Database db1 = Database.getInstance();
        db.execute("SELECT * FROM users");
    }
}
