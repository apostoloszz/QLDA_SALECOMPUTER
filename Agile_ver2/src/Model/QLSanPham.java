/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class QLSanPham {
    private String masp,tensp,magiamgia;
    private double giasp;
    private int soluongsp;
    private String maNSX;
    private int soLuongMua;
    private double thanhtien;
    private String SDTkhach;
    private String ngayDat;

   
    public QLSanPham() {
    }

    public QLSanPham(String masp, String tensp, double giasp, int soluongsp, String maNSX) {
        this.masp = masp;
        this.tensp = tensp;
        this.giasp = giasp;
        this.soluongsp = soluongsp;
        this.maNSX = maNSX;
    }


    public QLSanPham(String masp, String tensp, String magiamgia, double giasp, int soLuongMua, double thanhtien, String SDTkhach,String ngayDat) {
        this.masp = masp;
        this.tensp = tensp;
        this.magiamgia = magiamgia;
        this.giasp = giasp;
        this.soLuongMua = soLuongMua;
        this.thanhtien = thanhtien;
        this.SDTkhach = SDTkhach;
        this.ngayDat=ngayDat;
    }

    public String getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(String ngayDat) {
        this.ngayDat = ngayDat;
    }

    public String getMagiamgia() {
        return magiamgia;
    }

    public void setMagiamgia(String magiamgia) {
        this.magiamgia = magiamgia;
    }

    public String getSDTkhach() {
        return SDTkhach;
    }

    public void setSDTkhach(String SDTkhach) {
        this.SDTkhach = SDTkhach;
    }

   
    

    public int getSoLuongMua() {
        return soLuongMua;
    }

    public void setSoLuongMua(int soLuongMua) {
        this.soLuongMua = soLuongMua;
    }

    public double getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(double thanhtien) {
        this.thanhtien = thanhtien;
    }
    

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public double getGiasp() {
        return giasp;
    }

    public void setGiasp(double giasp) {
        this.giasp = giasp;
    }

    public int getSoluongsp() {
        return soluongsp;
    }

    public void setSoluongsp(int soluongsp) {
        this.soluongsp = soluongsp;
    }

    public String getMaNSX() {
        return maNSX;
    }

    public void setMaNSX(String maNSX) {
        this.maNSX = maNSX;
    }
    
    public Object[] toDataRow(){
        return new Object[]{this.getTensp(),this.getMasp(),this.getGiasp(),this.getSoluongsp(),this.getMaNSX()};
        
    }
}
