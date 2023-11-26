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
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class HoaDon_service {
    Connection con=null;
    List<QLSanPham> list;
    PreparedStatement ps=null;
    ResultSet rs=null;
    String sql=null;
    
    public List<QLSanPham> getAll(){
        list=new ArrayList<>();
        sql="select TenHang,MaMatHang,SoLuongTon,GiaSP from MatHang";
        try {
            con=DBConnect.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                QLSanPham sp= new QLSanPham(rs.getString(1), rs.getString(2), rs.getDouble(4), rs.getInt(3), null);
                list.add(sp);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public QLSanPham getAt(int index){
        return list.get(index);
    }
    
    
}
