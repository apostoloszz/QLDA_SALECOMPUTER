/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

/**
 *
 * @author Admin
 */
import Model.CTHD;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ChiTietHoaDon_Service {
    
    Connection con=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    String sql="";
    
    public List<CTHD> getAll(){
        List<CTHD> list1=new ArrayList<>();
        sql="select MaHoaDon,NgayTao,TongTien from HoaDon";
        try {
            con=DBConnect.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {                
                CTHD hd=new CTHD(rs.getString(1), rs.getDate(2), rs.getDouble(3));
                list1.add(hd);
            }
            return list1;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        finally{
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public List<CTHD> getCTHD(String ma){
        List<CTHD> list2=new ArrayList<>();
        sql="select MatHang.TenHang,MatHang.MaMatHang,DonDatHang.SoLuongSP,MatHang.GiaSP,MatHang.GiaSP,TinhTrangDonHang.NguoiPhuTrach,NhanVien.MaNV  from DonDatHang inner join HoaDon on HoaDon.MaHoaDon=DonDatHang.MaHoaDon  inner join ChiTietDatHang on ChiTietDatHang.MaDonDatHang=DonDatHang.MaDon inner join MatHang on MatHang.MaMatHang=ChiTietDatHang.MaMatHang inner join TinhTrangDonHang on TinhTrangDonHang.MaDonHang=DonDatHang.MaDon inner join NhanVien on NhanVien.MaNV=TinhTrangDonHang.MaNV where HoaDon.MaHoaDon =?";
        try {
            con=DBConnect.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, ma);
            rs=ps.executeQuery();
            while(rs.next()){
                CTHD hd=new CTHD(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getDouble(5), rs.getString(6), rs.getString(7));
                list2.add(hd);
            }
            return list2;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally{
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }
    
    
}
