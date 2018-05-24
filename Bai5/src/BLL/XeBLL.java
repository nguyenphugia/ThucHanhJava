/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.XeDAL;
import DAL.ComboBox;
import DTO.Xe;
import javax.swing.JComboBox;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PhuGia
 */
public class XeBLL {
    XeDAL xeDAl = new XeDAL();
    public void loadDsx (JTable tb) {
        Vector tbTieuDe = new Vector();
        Vector tbDong = new Vector();
        tbTieuDe.add("Số xe");
        tbTieuDe.add("Tình trạng");
        tbTieuDe.add("Mã loại");
        for (Xe xe : xeDAl.LoadDsx()) {
            Vector v = new Vector();
            v.add(xe.getSoXe());
            v.add(xe.getTinhTrang());
            v.add(xe.getMaLoai());
            tbDong.add(v);
            tb.setModel(new DefaultTableModel(tbDong, tbTieuDe));
        }
    }
    
    public void LoadComboBoxXe (JComboBox cb) {
        ComboBox lcb = new ComboBox();
        lcb.LoadComJboBoxXe(cb);
    }
    
    public void Them (Xe xe) {
        xeDAl.Them(xe);
    }
    
    public void Xoa (String xe) {
        xeDAl.Xoa(xe);
    }
    
    public void Sua (Xe xe) {
        xeDAl.Sua(xe);
    }
    
    public Boolean ktraDT (String soXe) {
        boolean kt = true;
        try {
            int d = Integer.parseInt(soXe);
            kt = true;
        } catch (Exception ex) {
            kt = false;
        }
        return kt;
    }
    
    public Boolean getID (String ten) {
        return xeDAl.getID(ten);
    }
}
