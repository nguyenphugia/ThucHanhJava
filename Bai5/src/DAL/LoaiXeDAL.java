/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.LoaiXe;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PhuGia
 */
public class LoaiXeDAL {
     DBConnect db = new DBConnect();
        Connection con = db.getConnection();
        public ArrayList <LoaiXe> LoadDsx() {
            ArrayList<LoaiXe> dsX = new ArrayList<>();
            try {
                String sql = "select * from LoaiXe";
                Statement ss = con.createStatement();
                ResultSet rs = ss.executeQuery(sql);
                while (rs.next()) {
                String tenLoai = rs.getString("TenLoai");
                int donGia = rs.getInt("DonGia");
                LoaiXe lx = new LoaiXe(tenLoai, donGia);
                dsX.add(lx);
                }
            }catch (SQLException ex) {}
            return dsX;
        }
        
        public boolean getID (String tenLoai){
        Boolean ktra = true;
        try {
            String sql = "Select TenLoai from LoaiXe";
            Statement ss = con.createStatement();
            ResultSet rs = ss.executeQuery(sql);
            while (rs.next()) {
                if (tenLoai.equals(rs.getString("TenLoai")))
                    ktra = true;
                else ktra = false;
                break;
            }
        } catch (SQLException ex) {}
        return ktra;       
        }
        
        public void Them(LoaiXe lx) {
            try {
                String sql = "{call LoaiXe_Them(?,?)}";
                CallableStatement cs = con.prepareCall(sql);
                cs.setString(1, lx.getTenLoai());
                cs.setInt(2, lx.getDonGia());
                cs.execute();
            } catch (SQLException ex){}
        }
        
        public void Xoa (String tenLoai) {
            try {
                String sql = "{call LoaiXe_Xoa(?)}";
                CallableStatement cs = con.prepareCall(sql);
                cs.setString(1, tenLoai);
                cs.execute();
            } catch (SQLException ex){
                Logger.getLogger(LoaiXe.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        public void Sua (LoaiXe lx) {
            try {
                String sql = "{call KhachHang_Sua(?,?,?)}";
                CallableStatement cs = con.prepareCall(sql);
                cs.setString(1, lx.getTenLoai());
                cs.setInt(2, lx.getDonGia());
                cs.execute();
            } catch (SQLException ex){}
        }
}
