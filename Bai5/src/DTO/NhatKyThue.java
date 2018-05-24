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
public class NhatKyThue {
    private String SoXe;
    private String MaKhach;
    private String TuNgay;
    private String DenNgay;

    public NhatKyThue(String soXe, String maKhach, String tuNgay, String toiNgay) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setSoXe (String SoXe) {
        this.SoXe = SoXe;
    }
    public String getSoXe() {
        return SoXe;
    }
    public void setMaKhach (String MaKhach) {
        this.MaKhach = MaKhach;
    }
    public String getMaKhach() {
        return MaKhach;
    }
    public void setTuNgay (String TuNgay) {
        this.TuNgay = TuNgay;
    }
    public String getTuNgay() {
        return TuNgay;
    }
    public void setDenNgay (String DenNgay) {
        this.DenNgay = DenNgay;
    }
    public String getDenNgay() {
        return DenNgay;
    }
}
