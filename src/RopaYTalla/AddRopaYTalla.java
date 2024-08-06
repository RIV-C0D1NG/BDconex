
package RopaYTalla;


import conexxion.conexxion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Ma153
 */
public class AddRopaYTalla {
    public static void main (String[] args){
        conexxion con = new conexxion();
        Connection cc;
        Statement sm;
        ResultSet rs;
        
        // Datos agg
        String id_talla1 = "3";
        String id_marca = "3";
        
        //sentencia 
        String sql = "INSERT INTO ropa_y_talla (id_talla1, id_marca)values ('"+id_talla1+"','"+id_marca+"')";
        
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
                
         }
        catch(ClassNotFoundException ex){
            Logger.getLogger(AddRopaYTalla.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        try {
            cc = con.getConection();
            sm = cc.createStatement();
            sm.executeUpdate(sql);
            rs = sm.executeQuery("SELECT * FROM ropa_y_talla");
            rs.next();
            
            do{
                System.out.println(rs.getInt("id")+":"+ rs.getString("codigo"));
            }
            while(rs.next());
        }
        catch(SQLException ex){
            Logger.getLogger(AddRopaYTalla.class.getName()).log(Level.SEVERE,null, ex);
        }
              
          
    }
    
    
    
    
}
