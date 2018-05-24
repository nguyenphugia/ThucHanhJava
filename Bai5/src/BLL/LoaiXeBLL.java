/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.LoaiXeDAL;
import DTO.LoaiXe;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author PhuGia
 */
public class LoaiXeBLL {
    LoaiXeDAL lxDAL = new LoaiXeDAL();
    public void LoadDsx (JTable tb) {
        Vector tbTieuDe = new Vector();
        Vector tbDong = new Vector();
        tbTieuDe.add("Tên loại");
        tbTieuDe.add("Đơn giá");
        for (LoaiXe lx : lxDAL.LoadDsx()) {
            Vector v = new Vector();
            v.add(lx.getTenLoai());
            v.add(lx.getDonGia());
            tbDong.add(v);
            tb.setModel(new DefaultTableModel(tbDong, tbTieuDe));
        }
    }
    
    public void Them (LoaiXe lx) {
        lxDAL.Them(lx);
    }
    
    public void Xoa (String lx) {
        lxDAL.Xoa(lx);
    }
    
    public void Sua (LoaiXe lx) {
        lxDAL.Sua(lx);
    }
       
    public Boolean getID (String xe) {
        return lxDAL.getID(xe);
    }
}
    
