
package conexxion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Ma153
 */
public class conexxion {
    Connection con;
    public conexxion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nombredeBD","usuario","contraseña");
        }
        catch(ClassNotFoundException | SQLException e ){
            System.out.println("no se pudo conenctar");
        }
    
    }
    public Connection getConection(){
        return con;
    
    }
    
}

