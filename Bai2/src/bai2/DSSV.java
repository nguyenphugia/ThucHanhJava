package bai2;

class DSSV {
    private int STT;
    private String ten;
    private String GioiTinh;
    private String NamSinh;
    public void setSTT(int stt){
        this.STT = stt;
    }
    public int getSTT(){
        return STT;
    }
    public void setGioiTinh(String gioiTinh){
        this.GioiTinh = gioiTinh;
    }
    public String getGioiTinh(){
        return GioiTinh;
    }
    public void setTen(String name){
        this.ten = name;
    }
    public String getTen(){
        return ten;
    }
    public void setNamSinh(String namSinh){
        this.NamSinh = namSinh;
    }
    public String getNamSinh(){
        return NamSinh;
    }
}
