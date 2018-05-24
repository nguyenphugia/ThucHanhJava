/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.NhatKyThueDAL;
import DTO.NhatKyThue;
import DAL.ComboBox;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PhuGia
 */
public class NhatKyThueBLL {
    NhatKyThueDAL nkDAL = new NhatKyThueDAL();
    public void LoadDsT (JTable tb) {
        Vector tbTieuDe = new Vector();
        Vector tbDong = new Vector();
        tbTieuDe.add("Số xe");
        tbTieuDe.add("Mã khách");
        tbTieuDe.add("Từ ngày");
        tbTieuDe.add("Đến ngày");
        for (NhatKyThue nk : nkDAL.LoadDsT()) {
            Vector v = new Vector();
            v.add(nk.getSoXe());
            v.add(nk.getMaKhach());
            v.add(nk.getTuNgay());
            v.add(nk.getDenNgay());
            tbDong.add(v);
            tb.setModel(new DefaultTableModel(tbDong, tbTieuDe));
        }
    }
    public void LoadComboBoxNKTxe (JComboBox cb) {
        ComboBox lcb = new ComboBox();
        lcb.LoadComboBoxNKTxe(cb);
    }
    
    public void LoadComboBoxNKTkhach (JComboBox cb) {
        ComboBox lcb = new ComboBox();
        lcb.LoadComboBoxNKTkhach(cb);
    }
    
    public void Them (NhatKyThue nk) {
        nkDAL.Them(nk);
    }
    
    public void Xoa (String xe) {
        nkDAL.Xoa(xe);
    }
    
    public void Sua (NhatKyThue nk) {
        nkDAL.Sua(nk);
    }
       
    public Boolean getID (String xe) {
        return nkDAL.getID(xe);
    }
}
