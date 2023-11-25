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
import java.util.List;
import Model.QLSanPham;
import java.util.ArrayList;

public class QLsanPham_service {

    List<QLSanPham> list;
    Connection con = null;//Connection là một interface cung cấp tất cả các method
    //cần thiết cho việc giao tiếp với database
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = null;

    public List<QLSanPham> getAll() {
        list = new ArrayList<>();
        sql = "select MaMatHang,TenHang,GiaSP,SoLuongTon,MaNSX from MatHang";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                QLSanPham sp = new QLSanPham(rs.getString(1), rs.getString(2), rs.getDouble(3), rs.getInt(4), rs.getString(5));
                list.add(sp);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public int insertSP(QLSanPham sp) {
        int kq = 0;
        sql = "insert into MatHang(MaMatHang,TenHang,GiaSP,SoLuongTon,MaNSX) values (?,?,?,?,?)";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, sp.getMasp());
            ps.setObject(2, sp.getTensp());
            ps.setObject(3, sp.getGiasp());
            ps.setObject(4, sp.getSoluongsp());
            ps.setObject(5, sp.getMaNSX());
            kq = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            kq = 0;
        } finally {
            try {
                ps.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return kq;
    }

    public int delete(String ma) {
        int kq = 0;
        sql = "delete from MatHang where MaMatHang like ?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, ma);
            kq = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            kq = 0;
        }
        return kq;
    }

    public int update(String ma, QLSanPham sp) {
        int kq = 0;
        sql = "update MatHang set TenHang=?,GiaSP=?,SoLuongTon=?,MaNSX=? where MaMatHang=?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, sp.getTensp());
            ps.setObject(2, sp.getGiasp());
            ps.setObject(3, sp.getSoluongsp());
            ps.setObject(4, sp.getMaNSX());
            ps.setObject(5, ma);
            kq=ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            kq=0;
        }
        finally{
            try {
                ps.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return kq;
    }
    public List<QLSanPham> serch(String tim){
        list=new ArrayList<>();
        sql="select MaMatHang,TenHang,GiaSP,SoLuongTon,MaNSX from MatHang where MaMatHang like ? or TenHang like ? or MaNSX like ?";
        try {
            con=DBConnect.getConnection();
            ps=con.prepareStatement(sql);
            ps.setObject(1, tim);
            ps.setObject(2, tim);
            ps.setObject(3, tim);
            rs=ps.executeQuery();
            while (rs.next()) {                
                QLSanPham sp=new QLSanPham(rs.getString(1),rs.getString(2),rs.getDouble(3),rs.getInt(4),rs.getString(5));
                list.add(sp);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally{
            try {
                ps.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public QLSanPham getAt(int index) {
        return list.get(index);

    }
}
