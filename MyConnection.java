package mini_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class MyConnection {
    
    private String url = "jdbc:mysql://localhost:3306/tecmis";
    
    private String user = "root";
    
    private String pw = "";
    
    private Connection myCon = null;
    
    private void registerMyConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
        }
        catch(ClassNotFoundException e){
            System.out.println("Error in registering the driver" + e.getMessage());
        }
    }
    
    public Connection getConnection(){
        registerMyConnection();
        try{
           myCon = DriverManager.getConnection(url, user, pw); 
           //System.out.println("connection");
        }
        catch(SQLException e){
            System.out.println("Error in getting connection");
        }
        
        return myCon;
        
    }
    
}