/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laptop
 */
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class javaconnect {

    public static Connection getConnection() {

        try {
            //load driver
            Class.forName("com.mysql.jdbc.Driver");
            // Establesh COnnection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mill?useUnicode=yes&characterEncoding=UTF-8", "root", "admjgptw");
            return con;
        } catch (Exception e) {
//            e.printStackTrace();
        }
        return null;
    }
}
