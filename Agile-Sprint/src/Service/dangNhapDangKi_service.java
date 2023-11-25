/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

/**
 *
 * @author Admin
 */
import java.sql.*;


public class dangNhapDangKi_service {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = null;

 
    public int DangNhap(String tk, String pass) {
        int kq = 0;
        sql = "select TenTK,MatKhau from TaiKhoan where TenTK like ? and MatKhau like ?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, tk);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            return kq = 1;
        } catch (Exception e) {
            e.printStackTrace();
            return kq;
        } finally {
            try {
                ps.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
