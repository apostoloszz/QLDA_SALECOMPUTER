/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;


import Model.NhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class QuanLyNhanVien_service {
     List<NhanVien> listNV;
    Connection con=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    String sql=null;
    
    public List<NhanVien> getAll(){
        listNV=new ArrayList<>();
        sql="select TenNV,MaNV,Email,SDT,DiaChi from NhanVien";
        try {
            con=DBConnect.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {                
                NhanVien nv= new NhanVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                listNV.add(nv);
            }
            return listNV;
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
    public int saveSV(NhanVien kh){
        int kq=0;
       
        try {
           
            sql="insert into NhanVien(MaNV,TenNV,Email,SDT,DiaChi) values (?,?,?,?,?);";
            con=DBConnect.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, kh.getManv());
            ps.setString(2, kh.getTennv());
            ps.setString(5, kh.getEmail());
            ps.setString(3, kh.getSdt());
            ps.setString(4, kh.getDchi()); 
            kq=ps.executeUpdate();
            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
            kq=0;
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
    public int  deleteSV(String ma){
        int kq=0;
  
        try {
        String sql2="delete from TinhTrangDonHang where MaNV =?"; 
        con=DBConnect.getConnection();
        ps=con.prepareStatement(sql2);
        ps.setString(1, ma);
        kq=ps.executeUpdate();
        ps.close();
        sql="delete from NhanVien where MaNV =?"; 
        ps=con.prepareStatement(sql);
        ps.setString(1, ma);
        kq=ps.executeUpdate();
        ps.close();
     
        } catch (Exception e) {
            e.printStackTrace();
            return kq=0;
        }
        return kq;
    }
    public int update(NhanVien nv,String ma){
        int kq=0;
        sql="update NhanVien set TenNV=?,Email=?,SDT=?,DiaChi=? where MaNV like ?";
        try {
            con=DBConnect.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, nv.getTennv());
            ps.setString(2, nv.getEmail());
            ps.setString(3, nv.getSdt());
            ps.setString(4, nv.getDchi());
            ps.setString(5, ma);
            kq=ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return kq=0;
        }
        return kq;
    }
    
    public NhanVien getAt(int index){
        return listNV.get(index);
    }
}
