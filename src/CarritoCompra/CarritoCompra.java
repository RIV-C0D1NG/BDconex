
package CarritoCompra;


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
public class CarritoCompra {
    public static void main (String[] args){
        conexxion con = new conexxion();
        Connection cc;
        Statement sm;
        ResultSet rs;
        
        // Datos agg
        String id_carrito = "5";
        String id_cliente = "5";
        
        //sentencia 
        String sql = "INSERT INTO carrito_de_compra (id_carrito, id_cliente)values ('"+id_carrito+"','"+id_cliente+"')";
        
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
                
         }
        catch(ClassNotFoundException ex){
            Logger.getLogger(CarritoCompra.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        try {
            cc = con.getConection();
            sm = cc.createStatement();
            sm.executeUpdate(sql);
            rs = sm.executeQuery("SELECT * FROM carrito_de_compra");
            rs.next();
            
            do{
                System.out.println(rs.getInt("id")+":"+ rs.getString("codigo"));
            }
            while(rs.next());
        }
        catch(SQLException ex){
            Logger.getLogger(CarritoCompra.class.getName()).log(Level.SEVERE,null, ex);
        }
              
          
    }
        
    
    
}
