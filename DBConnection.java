package co.amzon.selenium.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {
    public final static String url="jdbc:mysql://localhost:3306/amazonproduct";
    public final static String username="root";
    public final static String password="root";
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connectionToDB=DriverManager.getConnection(url,username,password);
    return connectionToDB;
    }
}
