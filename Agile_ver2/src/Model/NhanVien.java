/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class NhanVien {
    private String tennv,manv,email,sdt,dchi;

    public NhanVien() {
    }

    public NhanVien(String tennv, String manv, String email, String sdt, String dchi) {
        this.tennv = tennv;
        this.manv = manv;
        this.email = email;
        this.sdt = sdt;
        this.dchi = dchi;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDchi() {
        return dchi;
    }

    public void setDchi(String dchi) {
        this.dchi = dchi;
    }
    public Object[] todataRow(){
        return new Object[]{this.getManv(),this.getTennv(),this.getEmail(),this.getSdt(),this.getDchi()};
    }
}
