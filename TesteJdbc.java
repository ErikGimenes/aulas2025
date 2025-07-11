/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marcos
 */
public class TesteJdbc {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, pass;
            url = "jdbc:mysql://10.7.0.51:33062/db_marcos_vilhanueva";
            user = "marcos_vilhanueva";
            pass = "marcos_vilhanueva";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, pass);
            Statement stm = cnt.createStatement();
//            stm.executeUpdate("insert into grupo values(50, 'grupo do marcos', 'S')");
//            stm.executeUpdate("update grupo set descricao='grupo marcos novo', ativo='M' where idgrupo=50");
//            stm.executeUpdate("delete from grupo where idgrupo=50");
            ResultSet rs = stm.executeQuery("select * from grupo");
            while (rs.next() == true) {
                System.out.println(rs.getInt("idgrupo"));
                System.out.println(rs.getString("descricao"));
                System.out.println(rs.getString("ativo"));
            }
            System.out.println("Executado com sucesso.");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TesteJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TesteJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
