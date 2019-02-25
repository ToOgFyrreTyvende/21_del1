package utils;

import data.dal.IUserDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLGenerator {
    static String[] createStatements = {
            "drop table if exists 21_d1_users;",
            "CREATE TABLE 21_d1_users (userID INT NOT NULL PRIMARY KEY,userName VARCHAR(20) UNIQUE not null,ini VARCHAR(4), " +
                    "cpr VARCHAR(11) NOT NULL, password VARCHAR(128) NOT NULL, roles varchar(64) not null," +
                    "CHECK (userID>=11 AND userID <=99)," +
                    "CHECK (LENGTH(ini) >= 2)," +
                    "CHECK (LENGTH(userName) >= 2 AND LENGTH(userName) <= 20));"
    };
    
    static public Connection createConnection() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            return DriverManager.getConnection(
                    "jdbc:mysql://" + System.getenv("DB_URL") + "/" + System.getenv("DB_USER"),
                    System.getenv("DB_USER"),System.getenv("DB_PASS"));
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }

    static public void generateTable(){
        try{
            Connection c = createConnection();
            for (String statement : createStatements) {
                c.createStatement().executeUpdate(statement);
            }
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
