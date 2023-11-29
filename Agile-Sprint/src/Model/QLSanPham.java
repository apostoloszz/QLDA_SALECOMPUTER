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

    public QLSanPham() {
    }

    public QLSanPham(String masp, String tensp, double giasp, int soluongsp, String maNSX) {
        this.masp = masp;
        this.tensp = tensp;
        this.giasp = giasp;
        this.soluongsp = soluongsp;
        this.maNSX = maNSX;
    }

    public QLSanPham(String masp, String tensp, double giasp, int soLuongMua, String magiamgia, double thanhtien) {
        this.masp = masp;
        this.tensp = tensp;
        this.giasp = giasp;
        this.soLuongMua = soLuongMua;
        this.magiamgia = magiamgia;
        this.thanhtien = thanhtien;
    }

    public String getMagiamgia() {
        return magiamgia;
    }

    public void setMagiamgia(String magiamgia) {
        this.magiamgia = magiamgia;
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
        return new Object[]{this.getMasp(),this.getTensp(),this.getGiasp(),this.getSoluongsp(),this.getMaNSX()};
        
    }
}
