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
public class KhachHang {
    private String MaKhach;
    private String HoTenKhach;
    private String DiaChi;
    private String DienThoai;

    public KhachHang(String hoTen, String diaChi, String dienThoai) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public KhachHang(String MaKhach, String HoTenKhach, String DiaChi, String DienThoai) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setHoTenKhach (String HoTenKhach) {
        this.HoTenKhach = HoTenKhach;
    }
    public String getHoTenKhach() {
        return HoTenKhach;
    }
    public void setDiaChi (String DiaChi) {
        this.DiaChi = DiaChi;
    }
    public String getDiaChi() {
        return DiaChi;
    }
    public void setDienThoai (String DienThoai) {
        this.DienThoai = DienThoai;
    }
    public String getDienThoai() {
        return DienThoai;
    }

    /**
     * @return the MaKhach
     */
    public String getMaKhach() {
        return MaKhach;
    }

    /**
     * @param MaKhach the MaKhach to set
     */
    public void setMaKhach(String MaKhach) {
        this.MaKhach = MaKhach;
    }
     
}
