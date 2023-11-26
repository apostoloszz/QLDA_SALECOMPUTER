/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.util.List;

import java.sql.*;

/**
 *
 * @author Admin
 */
public class Login_Service {

    ;
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = null;

    public boolean dangNhap(String user, String passWord) {
        int kq=0;
        sql = "select count(*) as Tong from TaiKhoan where TenTK like ? and MatKhau like ?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, user);
            ps.setObject(2, passWord);
            rs = ps.executeQuery();
            if (rs.next()) {
                kq=rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                rs.close();
                ps.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return (kq>0);
    }
}
