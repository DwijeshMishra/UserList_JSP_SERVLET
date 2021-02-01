
package connection;
import java.sql.*;
public class MyCon 
{
    static Connection con=null;
    static
    {
        try 
        {
             Class.forName("com.mysql.cj.jdbc.Driver");
             System.out.println("Driver load...........");
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }  
    }
    
    public static Connection getConnection()
    {
        try {
             con=DriverManager.getConnection("jdbc:mysql://listview.cghdpec8e9fn.us-east-1.rds.amazonaws.com:3306/list", "root", "VasuMishra890");
             System.out.println("Data base Conneted.........");
          } 
        catch (SQLException e) 
        {
            System.out.println(e);
        } 
        return con;
    }
    public static void main(String[] args) {
        System.out.println(MyCon.getConnection());
    }
}
