package pitstop;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqLite {
    public void UpdateQuery(String query){
        try
        (
          Connection connection = DriverManager.getConnection("jdbc:sqlite:data.db");
          Statement statement = connection.createStatement();
        )
        {
          statement.setQueryTimeout(30);
          statement.executeUpdate(query);          
        }
        catch(SQLException e)
        {
          e.printStackTrace(System.err);
        }
    }
    
    public ResultSet RetrieveQuery(String query){
        try 
        (
            Connection conn = DriverManager.getConnection("jdbc:sqlite:data.db");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query)
        ) 
        {   
            return rs;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
}
