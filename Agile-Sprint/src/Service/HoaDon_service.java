/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

/**
 *
 * @author Admin
 */
import Model.QLSanPham;
import Model.NhanVien;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HoaDon_service {

    Connection con = null;
    List<QLSanPham> list;
    List<QLSanPham> list2 = new ArrayList<>();
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = null;

    public List<QLSanPham> getAll() {
        list = new ArrayList<>();
        sql = "select TenHang,MaMatHang,SoLuongTon,GiaSP from MatHang";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                QLSanPham sp = new QLSanPham(rs.getString(2), rs.getString(1), rs.getDouble(4), rs.getInt(3), null);
                list.add(sp);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<NhanVien> getAll2() {
        List<NhanVien> listNV = new ArrayList<>();
        sql = "select TenNV,MaNV,Email,SDT,DiaChi from NhanVien";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien nv = new NhanVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                listNV.add(nv);
            }
            return listNV;
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

//    public int insertDonDH(QLSanPham sp) {
//        int result = 0;
//        try {
//            con = DBConnect.getConnection();
//            CallableStatement cs = con.prepareCall("{call them_DonDatHang(?,?}");
//            cs.setString(1, sp.getNgayDat());
//            cs.setString(2, sp.getSDTkhach());
//            result = cs.executeUpdate();
//            for (QLSanPham qLSanPham : getAllGioHang()) {
//                con = DBConnect.getConnection();
//                CallableStatement cs1 = con.prepareCall("{call them_CTDonDatHang(?,?)}");
//                cs1.setString(1, qLSanPham.getMasp());
//                cs1.setInt(2, qLSanPham.getSoLuongMua());
//                result = cs1.executeUpdate();
//                System.out.println(qLSanPham.getMasp());
//            }
//
//            return result;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return result = 0;
//        }
//    }

    public List<QLSanPham> getAllGioHang() {
        return list2;
    }

    public void addGioHang(QLSanPham sp) {

        list2.add(sp);
    }

    public QLSanPham delete(int index) {
        return list2.remove(index);
    }

    public QLSanPham getAt(int index) {
        return list.get(index);
    }

    public QLSanPham getAt2(int index) {
        return list2.get(index);
    }

}
