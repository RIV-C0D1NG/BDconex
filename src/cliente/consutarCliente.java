/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
public class consutarCliente {
    public static void main(String[] args){
        conexxion con = new conexxion();
        Connection cc;
        Statement sm;
        ResultSet rs;
        
        // Datos agg
        //int idElim = 3;
        //String nombreE = "david";
        //String apellidoE = "burbano";
        
        //sentencia 
        //String sql = "";
        
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
                
         }
        catch(ClassNotFoundException ex){
            Logger.getLogger(eliminarCliente.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        try {
            cc = con.getConection();
            sm = cc.createStatement();
            //sm.executeUpdate(sql);
            rs = sm.executeQuery("SELECT * FROM cliente");
            rs.next();
            
            do{
                System.out.println(rs.getInt("id")+":"+ rs.getString("codigo"));
            }
            while(rs.next());
        }
        catch(SQLException ex){
            Logger.getLogger(eliminarCliente.class.getName()).log(Level.SEVERE,null, ex);
        }
    }
    
}
