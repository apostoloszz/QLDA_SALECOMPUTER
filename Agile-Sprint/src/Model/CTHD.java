/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class CTHD {
       private String ma;
       private Date ngayTao;
       private double tongTienHD;
       private String tenSP,maSP;
       private int soLuongmua;
       private double giaSP,tongTienSP;
       private String tenNV,maNV;

    public CTHD() {
    }

    public CTHD(String ma, Date ngayTao, double tongTienHD) {
        this.ma = ma;
        this.ngayTao = ngayTao;
        this.tongTienHD = tongTienHD;
    }

    public CTHD(String tenSP, String maSP, int soLuongmua, double giaSP, double tongTienSP, String tenNV, String maNV) {
        this.tenSP = tenSP;
        this.maSP = maSP;
        this.soLuongmua = soLuongmua;
        this.giaSP = giaSP;
        this.tongTienSP = tongTienSP;
        this.tenNV = tenNV;
        this.maNV = maNV;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public double getTongTienHD() {
        return tongTienHD;
    }

    public void setTongTienHD(double tongTienHD) {
        this.tongTienHD = tongTienHD;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public int getSoLuongmua() {
        return soLuongmua;
    }

    public void setSoLuongmua(int soLuongmua) {
        this.soLuongmua = soLuongmua;
    }

    public double getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(double giaSP) {
        this.giaSP = giaSP;
    }

    public double getTongTienSP() {
        return tongTienSP;
    }

    public void setTongTienSP(double tongTienSP) {
        this.tongTienSP = tongTienSP;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }
       
       
    
}
