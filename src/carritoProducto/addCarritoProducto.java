
package carritoProducto;


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
public class addCarritoProducto {
    public static void main (String [] args){
    conexxion con = new conexxion();
        Connection cc;
        Statement sm;
        ResultSet rs;
        
        // Datos agg
        String id_carrito = "1";
        String id_cliente = "4";
        String id_producto1 = "2";
        
        //sentencia 
        String sql = "INSERT INTO carrito_producto (id_carrito, id_cliente,id_producto1)values ('"+id_carrito+"','"+id_cliente+"','"+id_producto1+"')";
        
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
                
         }
        catch(ClassNotFoundException ex){
            Logger.getLogger(addCarritoProducto.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        try {
            cc = con.getConection();
            sm = cc.createStatement();
            sm.executeUpdate(sql);
            rs = sm.executeQuery("SELECT * FROM carrito_producto");
            rs.next();
            
            do{
                System.out.println(rs.getInt("id")+":"+ rs.getString("codigo"));
            }
            while(rs.next());
        }
        catch(SQLException ex){
            Logger.getLogger(addCarritoProducto.class.getName()).log(Level.SEVERE,null, ex);
        }
              
          
    }
} 
    

