package task;

import java.sql.Connection;

public class SqlMain {
    public static void main(String[]arg){
        Connection client = SqlDBClient.getClient();
        Connection client2 = SqlDBClient.getClient();
        Connection client3 = SqlDBClient.getClient();

    }
}
