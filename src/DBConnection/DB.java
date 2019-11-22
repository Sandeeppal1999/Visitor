package DBConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class DB {
public Connection con;
    public Statement stmt;
    public PreparedStatement pstmt;
    public ResultSet rst;
    public DB()
    {
        try{
     //  Class.forName(org.sqlite.JDBC);
     //  con=DriverManager.getConnection(jdbc:sqlite:visitor(4).db);
 Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/visitor","root","root");
        }
        catch(Exception e)
        {
            e.getMessage();
        }
    } 
    public void close()
    {
    try {
    pstmt.close();
    rst.close();
    } catch (Exception ex) {
    Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    }
    