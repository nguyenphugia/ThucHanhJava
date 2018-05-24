/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.KhachHang;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

/**
 *
 * @author PhuGia
 */
public class KhachHangDAL {
        DBConnect db = new DBConnect();
        Connection con = db.getConnection();
        public ArrayList <KhachHang> LoadDsKH() {
            ArrayList<KhachHang> dskh = new ArrayList<>();
            try {
                String sql = "select * from KhachHang";
                Statement ss = con.createStatement();
                ResultSet rs = ss.executeQuery(sql);
                while (rs.next()) {
                String hoTen = rs.getString("HoTenKhach");
                String diaChi = rs.getString("DiaChi");
                String dienThoai = rs.getString("DienThoai");
                KhachHang kh = new KhachHang(hoTen, diaChi, dienThoai);
                dskh.add(kh);
                }
            }catch (SQLException ex) {}
            return dskh;
        }
        
        public boolean getID (String hoTen){
        Boolean ktra = true;
        try {
            String sql = "Select HoTenKhach from KhachHang";
            Statement ss = con.createStatement();
            ResultSet rs = ss.executeQuery(sql);
            while (rs.next()) {
                if (hoTen.equals(rs.getString("HoTenKhach")))
                    ktra = true;
                else ktra = false;
                break;
            }
        } catch (SQLException ex) {}
        return ktra;       
        }
        
        public void Them(KhachHang kh) {
            try {
                String sql = "{call KhachHang_Them(?,?,?)}";
                CallableStatement cs = con.prepareCall(sql);
                cs.setString(1, kh.getHoTenKhach());
                cs.setString(2, kh.getDiaChi());
                cs.setString(3, kh.getDienThoai());
                cs.execute();
            } catch (SQLException ex){}
        }
        
        public void Xoa (String hoTen) {
            try {
                String sql = "{call KhachHang_Xoa(?)}";
                CallableStatement cs = con.prepareCall(sql);
                cs.setString(1, hoTen);
                cs.execute();
            } catch (SQLException ex){
                Logger.getLogger(KhachHang.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        public void Sua (KhachHang kh) {
            try {
                String sql = "{call KhachHang_Sua(?,?,?)}";
                CallableStatement cs = con.prepareCall(sql);
                cs.setString(1, kh.getHoTenKhach());
                cs.setString(2, kh.getDiaChi());
                cs.setString(3, kh.getDienThoai());
                cs.execute();
            } catch (SQLException ex){}
        }
}

