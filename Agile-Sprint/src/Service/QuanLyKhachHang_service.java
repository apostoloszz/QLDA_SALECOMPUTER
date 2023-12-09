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
import java.util.ArrayList;
import java.util.List;
import Model.KhachHang;

public class QuanLyKhachHang_service {

    List<KhachHang> listKH;
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = null;

    public List<KhachHang> getAll() {
        listKH = new ArrayList<>();
        sql = "select MaKhacHang,TenKhachHang,Email,SDT,DiaChi from KhachHang";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                listKH.add(kh);
            }
            return listKH;
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

    public int saveSV(KhachHang kh) {
        int kq = 0;

        try {

            sql = "INSERT INTO KhachHang(MaKhacHang,TenKhachHang,Email,SDT,DiaChi) values(?,?,?,?,?)";
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, kh.getMakh());
            ps.setString(2, kh.getTenkh());
            ps.setString(3, kh.getEmail());
            ps.setString(4, kh.getSdt());
            ps.setString(5, kh.getDiachi());
            kq = ps.executeUpdate();
            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
            kq = 0;
        }
        return kq;
    }

//    public boolean checkma(String ma){
//        try {
//            sql="select MASV,HoTen,Email,SoDT,GioiTinh,DiaChi,Hinh  from STUDENTS ";
//            con=DBConnect.getConnection();
//            ps=con.prepareStatement(sql);
//            return ps.executeQuery().next();
//        
//        } catch (Exception e) {
//            e.printStackTrace();
//            return false;
//        }
//    
//    }
    public int deleteSV(String ma) {
        int kq = 0;

        try {
            sql = "delete from TaiKhoan where MaKH like ?";
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, ma);
            kq = ps.executeUpdate();
            ps.close();

            sql = "delete ChiTietDatHang where MaDonDatHang=(select MaDon from DonDatHang where MaKhachHang=?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, ma);
            kq = ps.executeUpdate();
            ps.close();

            sql = "  delete TinhTrangDonHang where MaDonHang=(select MaDon from DonDatHang where MaKhachHang=?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, ma);
            kq = ps.executeUpdate();
            ps.close();

            sql = "delete HoaDon where MaDonDatHang=(select MaDon from DonDatHang where MaKhachHang=?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, ma);
            kq = ps.executeUpdate();
            ps.close();

            sql = "delete from DonDatHang where MaKhachHang =?";
            ps = con.prepareStatement(sql);
            ps.setString(1, ma);
            kq = ps.executeUpdate();
            ps.close();

            sql = "delete from KhachHang where MaKhacHang =?";
            ps = con.prepareStatement(sql);
            ps.setString(1, ma);
            kq = ps.executeUpdate();
            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
            return kq = 0;
        }
        return kq;
    }

    public int update(KhachHang sv, String ma) {
        int kq = 0;
        sql = "update KhachHang set TenKhachHang=?,Email=?,SDT=?,DiaChi=? where MaKhacHang =?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, sv.getTenkh());
            ps.setString(2, sv.getEmail());
            ps.setString(3, sv.getSdt());
            ps.setString(4, sv.getDiachi());
            ps.setString(5, ma);
            kq = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return kq = 0;
        }
        return kq;
    }

    public KhachHang getAt(int index) {
        return listKH.get(index);
    }
}
