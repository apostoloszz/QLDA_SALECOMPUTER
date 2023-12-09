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
import com.toedter.calendar.JDateChooser;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;
public class thongKeDoanhThu_service {
    List<CTHD> list;
    Connection con=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    String sql="";
    
    public List<CTHD> getAll(){
        list= new ArrayList<>();
        sql="select MaHoaDon,NgayTao,TongTien from HoaDon";
        try {
            con=DBConnect.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {                
                CTHD hd=new CTHD(rs.getString(1),rs.getDate(2), rs.getDouble(3));
                list.add(hd);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
     public List<CTHD> timTheoNgay(JDateChooser date){
        list= new ArrayList<>();
        sql="select MaHoaDon,NgayTao,TongTien from HoaDon where NgayTao like ? ";
        try {
            con=DBConnect.getConnection();
            ps=con.prepareStatement(sql);
            ps.setDate(1,new java.sql.Date(date.getDate().getTime()));
            rs=ps.executeQuery();
            while (rs.next()) {                
                CTHD hd=new CTHD(rs.getString(1),rs.getDate(2), rs.getDouble(3));
                list.add(hd);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

   
}
