/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
/**
 *
 * @author PhuGia
 */
public class ComboBox {
    public void LoadComboBox (JComboBox cb, String sql, String a) {
        try {
            DBConnect db = new DBConnect();
            Connection con = db.getConnection();
            Statement ss = con.createStatement();
            ResultSet rs = ss.executeQuery(sql);
            while (rs.next()) {
                cb.addItem(rs.getString(a));
            }
        }  catch (Exception ex){}
    }
    public void LoadComJboBoxXe(JComboBox cb) {
        cb.removeAllItems();
        String sql = "Select * from Xe";
        String a = "MaLoai";
        LoadComboBox (cb, sql, a);
    }

    public void LoadComboBoxNKTxe(JComboBox cb) {
        cb.removeAllItems();
        String sql = "Select * from NhatKyThue";
        String a = "SoXe";
        LoadComboBox (cb, sql, a);
    }
    public void LoadComboBoxNKTkhach(JComboBox cb) {
        cb.removeAllItems();
        String sql = "Select * from Xe";
        String a = "MaKhach";
        LoadComboBox (cb, sql, a);
    }
}
