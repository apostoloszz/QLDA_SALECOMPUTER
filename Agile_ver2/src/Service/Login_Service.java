/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.util.List;

import java.sql.*;
import Model.Login;
import java.util.ArrayList;

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
    List<Login> list;

    public List<Login> dangNhap(String user, String passWord) {
        list=new ArrayList<>();
        sql = "select TenTK,MatKhau,LoaiTK from TaiKhoan where TenTK=? and MatKhau=?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, user);
            ps.setObject(2, passWord);
            rs = ps.executeQuery();
            while (rs.next()) {
                Login login = new Login(rs.getString(1), rs.getString(2), rs.getString(3));
                list.add(login);
            }
            return list;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                rs.close();
                ps.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
}
