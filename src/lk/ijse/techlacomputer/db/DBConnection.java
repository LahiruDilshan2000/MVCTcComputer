package lk.ijse.techlacomputer.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static DBConnection dbConnection;
    private Connection connection;

    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/TechlaComputer?useSSL=false&allowPublicKeyRetrieval=true","root","1234");
    }
    public static DBConnection getInstance() throws ClassNotFoundException, SQLException {
        return (dbConnection == null) ? dbConnection=new DBConnection(): dbConnection;
    }
    public Connection getConnection(){
        return connection;
    }
}
