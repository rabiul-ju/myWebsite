package database;

import java.sql.DriverManager;
import java.sql.*;
import java.sql.Connection;


public class DatabaseConnection {

public Connection getConnection(){
        
        final String db_url = "jdbc:mysql://localhost/mywebsite";
        final String user = "root";
        final String pass = "";
        
        Connection conn;
        try{
            
            Class.forName("com.mysql.jdbc.Driver");      
            conn = DriverManager.getConnection(db_url, user, pass);
            System.out.println("Database connected/.........");
            return conn;
        }
        
        catch(SQLException se){
            se.printStackTrace();
        
        }
        catch(Exception e){
        
            e.printStackTrace();
        }
                
        
        return null;
    }
	
}
