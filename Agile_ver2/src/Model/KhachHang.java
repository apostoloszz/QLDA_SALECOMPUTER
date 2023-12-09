/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class KhachHang {
    private String makh,tenkh,email,sdt,diachi;

    public KhachHang(String makh, String tenkh, String email, String sdt, String diachi) {
        this.makh = makh;
        this.tenkh = tenkh;
        this.email = email;
        this.sdt = sdt;
        this.diachi = diachi;
    }

    public KhachHang() {
    }
    

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
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

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    public Object[] toDataRow(){
        return new Object[]{this.getMakh(),this.getTenkh(),this.getEmail(),this.getSdt(),this.getDiachi()};
    }
    
}
