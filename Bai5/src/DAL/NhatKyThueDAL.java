/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.NhatKyThue;
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
public class NhatKyThueDAL {
       DBConnect db = new DBConnect();
        Connection con = db.getConnection();
        public ArrayList <NhatKyThue> LoadDsT() {
            ArrayList<NhatKyThue> dsT = new ArrayList<>();
            try {
                String sql = "select * from NhatKyThue";
                Statement ss = con.createStatement();
                ResultSet rs = ss.executeQuery(sql);
                while (rs.next()) {
                String soXe = rs.getString("SoXe");
                String maKhach = rs.getString("MaKhach");
                String tuNgay = rs.getString ("TuNgay");
                String toiNgay = rs.getString ("DenNgay");
                NhatKyThue nk = new NhatKyThue(soXe, maKhach, tuNgay, toiNgay);
                dsT.add(nk);
                }
            }catch (SQLException ex) {}
            return dsT;
        }
        
        public boolean getID (String soXe){
        Boolean ktra = true;
        try {
            String sql = "Select SoXe from NhatKyThue";
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
        
        public void Them(NhatKyThue nk) {
            try {
                String sql = "{call NhatKyThue_Them(?,?,?,?)}";
                CallableStatement cs = con.prepareCall(sql);
                cs.setString(1, nk.getSoXe());
                cs.setString(2, nk.getMaKhach());
                cs.setString(3, nk.getTuNgay());
                cs.setString(4, nk.getDenNgay());
                cs.execute();
            } catch (SQLException ex){}
        }
        
        public void Xoa (String soXe) {
            try {
                String sql = "{call NhatKyThue_Xoa(?)}";
                CallableStatement cs = con.prepareCall(sql);
                cs.setString(1, soXe);
                cs.execute();
            } catch (SQLException ex){
                Logger.getLogger(NhatKyThue.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        public void Sua (NhatKyThue nk) {
            try {
                String sql = "{call NhatKyThue_Sua(?,?,?,?)}";
                CallableStatement cs = con.prepareCall(sql);
                cs.setString(1, nk.getSoXe());
                cs.setString(2, nk.getMaKhach());
                cs.setString(3, nk.getTuNgay());
                cs.setString(4, nk.getDenNgay());
                cs.execute();
            } catch (SQLException ex){}
        }
    }
