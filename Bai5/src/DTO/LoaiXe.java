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
public class LoaiXe {
    private String MaLoai;
    private String TenLoai;
    private int DonGia;

    public LoaiXe(String tenLoai, int donGia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public LoaiXe(String ma, String ten, String dongia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setTenLoai (String TenLoai) {
        this.TenLoai = TenLoai;
    }
    public String getTenLoai() {
        return TenLoai;
    }
    public void setDonGia (int DonGia) {
        this.DonGia = DonGia;
    }
    public int getDonGia() {
        return DonGia;
    }

    /**
     * @return the MaLoai
     */
    public String getMaLoai() {
        return MaLoai;
    }

    /**
     * @param MaLoai the MaLoai to set
     */
    public void setMaLoai(String MaLoai) {
        this.MaLoai = MaLoai;
    }
}
