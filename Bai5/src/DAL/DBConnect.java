/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author PhuGia
 */
public class DBConnect {
    private Connection con;
    public DBConnect () {
        try {
            con = DriverManager.getConnection("jdbc:sqlserver://PHUGIA-PC:1433;databaseName=QUANLYXE_57130493;user=sa;password=phugia");
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Connection getConnection() {
        return con;
    }
//    public static void main(String[] args) {
//        DBConnect db= new DBConnect();
//        Connection a = db.getConnection();
//        if (a != null)
//            System.out.println("Kết nối thành công!");
//        else System.out.println("Kết nối không thành công, vui lòng kiểm tra lại!");
//    }
}



