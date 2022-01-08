import java.sql.*;

public class DatabaseConnection {
    public static Connection databaseConnection () {
        String url = "jdbc:mysql://b2b896af869ff7:eea0b9b9@eu-cdbr-west-02.cleardb.net/heroku_61b9374dbf3c32f";
        String user = "b2b896af869ff7";
        String pass = "eea0b9b9";

        try {
            Connection connection = DriverManager.getConnection(url, user, pass);
            System.out.println("Verbindung erfolgreich hergestellt.");

            return connection;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
