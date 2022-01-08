import java.sql.*;

public class Main {
    public static void main(String[] args) {

        try {
            Connection connection = DatabaseConnection.databaseConnection();


            Statement statement = connection.createStatement();

//            statement.executeUpdate("create table Lehrer " +
//                    "(lehrer_id int auto_increment, " +
//                    "vorname varchar(255) not null, " +
//                    "nachname varchar(255) not null, " +
//                    "primary key (lehrer_id))");

//            ResultSet resultSet = statement.executeQuery("SELECT * FROM mitarbeiter");
//
//            while (resultSet.next()) {
//                System.out.println(resultSet.getString(1) + " " +
//                        resultSet.getString(2) + " " +
//                        resultSet.getString(3));
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
