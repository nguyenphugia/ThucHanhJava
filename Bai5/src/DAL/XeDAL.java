/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.Xe;
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
public class XeDAL {
    DBConnect db = new DBConnect();
        Connection con = db.getConnection();
        public ArrayList <Xe> LoadDsx() {
            ArrayList<Xe> dsX = new ArrayList<>();
            try {
                String sql = "select * from Xe";
                Statement ss = con.createStatement();
                ResultSet rs = ss.executeQuery(sql);
                while (rs.next()) {
                String soXe = rs.getString("SoXe");
                int tinhTrang = rs.getInt("TinhTrang");
                String maLoai =rs.getString("MaLoai");
                Xe x = new Xe(soXe, tinhTrang, maLoai);
                dsX.add(x);
                }
            }catch (SQLException ex) {}
            return dsX;
        }
        
        public boolean getID (String soXe){
        Boolean ktra = true;
        try {
            String sql = "Select SoXe from Xe";
            Statement ss = con.createStatement();
            ResultSet rs = ss.executeQuery(sql);
            while (rs.next()) {
                if (soXe.equals(rs.getString("SoXe")))
                    ktra = true;
                else ktra = false;
                break;
            }
        } catch (SQLException ex) {}
        return ktra;       
        }
        
        public void Them(Xe x) {
            try {
                String sql = "{call Xe_Them(?,?)}";
                CallableStatement cs = con.prepareCall(sql);
                cs.setString(1, x.getSoXe());
                cs.setInt(2, x.getTinhTrang());
                cs.setString(3, x.getMaLoai());
                cs.execute();
            } catch (SQLException ex){}
        }
        
        public void Xoa (String soXe) {
            try {
                String sql = "{call Xe_Xoa(?)}";
                CallableStatement cs = con.prepareCall(sql);
                cs.setString(1, soXe);
                cs.execute();
            } catch (SQLException ex){
                Logger.getLogger(Xe.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        public void Sua (Xe x) {
            try {
                String sql = "{call Xe_Sua(?,?,?)}";
                CallableStatement cs = con.prepareCall(sql);
                cs.setString(1, x.getSoXe());
                cs.setInt(2, x.getTinhTrang());
                cs.setString(3, x.getMaLoai());
                cs.execute();
            } catch (SQLException ex){}
        }
}
