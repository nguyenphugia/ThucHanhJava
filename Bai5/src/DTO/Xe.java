/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author PhuGia
 */
public class Xe {
    private String SoXe;
    private int TinhTrang;
    private String MaLoai;

    public Xe(String soXe, int tinhTrang, String maLoai) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Xe(String soxe, String tinhtrang, String maloai) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setSoXe (String SoXe) {
        this.SoXe = SoXe;
    }
    public String getSoXe() {
        return SoXe;
    }
    public void setTinhTrang (int TinhTrang) {
        this.TinhTrang = TinhTrang;
    }
    public int getTinhTrang() {
        return TinhTrang;
    }
    public void setMaLoai (String MaLoai) {
        this.MaLoai = MaLoai;
    }
    public String getMaLoai() {
        return MaLoai;
    }
    
    
}
