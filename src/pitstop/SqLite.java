package pitstop;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqLite {
    public void ExecuteQuery(String query){
        try
        (
          Connection connection = DriverManager.getConnection("jdbc:sqlite:data.db");
          Statement statement = connection.createStatement();
        )
        {
          statement.setQueryTimeout(30);
          statement.executeUpdate(query);
          
          statement.close();
          connection.close();
          
        }
        catch(SQLException e)
        {
          e.printStackTrace(System.err);
        }
    }
}
