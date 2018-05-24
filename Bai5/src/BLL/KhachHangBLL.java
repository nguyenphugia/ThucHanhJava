/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.KhachHangDAL;
import DTO.KhachHang;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
 /**
 *
 * @author PhuGia
 */
public class KhachHangBLL {
    KhachHangDAL khDAl = new KhachHangDAL();
    public void loadDskh (JTable tb) {
        Vector tbTieuDe = new Vector();
        Vector tbDong = new Vector();
        tbTieuDe.add("Họ tên khách");
        tbTieuDe.add("Địa chỉ");
        tbTieuDe.add("Điện thoại");
        for (KhachHang kh : khDAl.LoadDsKH()) {
            Vector v = new Vector();
            v.add(kh.getHoTenKhach());
            v.add(kh.getDiaChi());
            v.add(kh.getDienThoai());
            tbDong.add(v);
            tb.setModel(new DefaultTableModel(tbDong, tbTieuDe));
        }
        khDAl.LoadDsKH();
    }
   
    public void Them (KhachHang kh) {
        khDAl.Them(kh);
    }
    
    public void Xoa (String ten) {
        khDAl.Xoa(ten);
    }
    
    public void Sua (KhachHang kh) {
        khDAl.Sua(kh);
    }
    
    public Boolean ktraDT (String dt) {
        boolean kt = true;
        try {
            int d = Integer.parseInt(dt);
            kt = true;
        } catch (Exception ex) {
            kt = false;
        }
        return kt;
    }
    
    public Boolean getID (String ten) {
        return khDAl.getID(ten);
    }
}
