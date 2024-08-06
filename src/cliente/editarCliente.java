
package cliente;
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
public class editarCliente {
    public static void main(String[] args){
        
        conexxion con = new conexxion();
        Connection cc;
        Statement sm;
        ResultSet rs;
        
        // Datos agg
        int idE = 3;
        String nombreE = "david";
        String apellidoE = "burbano";
        
        //sentencia 
        String sql = "UPDATE cliente set nombre='"+nombreE+"','"+apellidoE+"'";
        
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
                
         }
        catch(ClassNotFoundException ex){
            Logger.getLogger(editarCliente.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        try {
            cc = con.getConection();
            sm = cc.createStatement();
            sm.executeUpdate(sql);
            rs = sm.executeQuery("SELECT * FROM cliente");
            rs.next();
            
            do{
                System.out.println(rs.getInt("id")+":"+ rs.getString("codigo"));
            }
            while(rs.next());
        }
        catch(SQLException ex){
            Logger.getLogger(editarCliente.class.getName()).log(Level.SEVERE,null, ex);
        }
    
    
    
    
    }
    
}
