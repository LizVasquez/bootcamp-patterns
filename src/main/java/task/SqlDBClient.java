package task;

import java.sql.Connection;
import java.sql.DriverManager;



public class SqlDBClient {
    public static Connection client = null;


    private SqlDBClient() {
        String url = "jdbc:mysql://localhost:3306/test";
        String driver = "com.mysql.cj.jdbc.Driver";
        String user = "usuario";
        String pass = "password";

        try {
            Class.forName(driver);
            client = DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    public static Connection getClient() {
        if (client == null){
            System.out.println("Primera vez");
            new SqlDBClient();

        }

        return client;
    }

}
