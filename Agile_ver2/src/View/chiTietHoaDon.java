/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;
import java.util.List;
import Model.CTHD;
import Service.ChiTietHoaDon_Service;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Admin
 */
public class chiTietHoaDon extends javax.swing.JPanel {

    /**
     * Creates new form chiTietHoaDon
     */
     DefaultTableModel model=new DefaultTableModel();
    ChiTietHoaDon_Service ss=new ChiTietHoaDon_Service();
    public chiTietHoaDon() {
        initComponents();
        fillTable1(ss.getAll());
    }
    public void fillTable1(List<CTHD> list1){
        model=(DefaultTableModel) tblLichSuHoaDon.getModel();
        model.setRowCount(0);
        for (CTHD cthd : list1) {
            Object[] row= new Object[]{cthd.getMa(),cthd.getNgayTao(),cthd.getTongTienHD()};
            model.addRow(row);
        }
    }
    public void fillTable2(List<CTHD> list2){
        model=(DefaultTableModel) tblChiTietHoaDon.getModel();
        model.setRowCount(0);
        for (CTHD cthd : list2) {
            Object[] row= new Object[]{cthd.getTenSP(),cthd.getMaSP(),cthd.getSoLuongmua(),cthd.getGiaSP(),cthd.getTongTienSP(),cthd.getTenNV(),cthd.getMaNV()};
            model.addRow(row);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLichSuHoaDon = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblChiTietHoaDon = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("LỊCH SỬ HÓA ĐƠN");

        tblLichSuHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã HĐ", "Ngày tạo", "Tổng tiền"
            }
        ));
        tblLichSuHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLichSuHoaDonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLichSuHoaDon);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("CHI TIẾT HÓA ĐƠN");

        tblChiTietHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Tên SP", "Mã SP", "Số lượng", "Giá SP", "Tổng tiền", "Tên nhân viên phụ trách", "Mã NV"
            }
        ));
        jScrollPane2.setViewportView(tblChiTietHoaDon);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Print preview.png"))); // NOI18N
        jButton1.setText("In hóa đơn");

        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Search.png"))); // NOI18N
        btnTimKiem.setText("Tìm kiếm ");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 899, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(312, 312, 312)
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(btnTimKiem))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 907, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(414, 414, 414)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(408, 408, 408)
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTimKiem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblLichSuHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLichSuHoaDonMouseClicked
        // TODO add your handling code here:
        int index= tblLichSuHoaDon.getSelectedRow();
        String ma=(String) tblLichSuHoaDon.getValueAt(index, 0);
        if(index>=0){
            fillTable2(ss.getCTHD(ma));
        }
    }//GEN-LAST:event_tblLichSuHoaDonMouseClicked

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        String ma=txtTimKiem.getText();
        if(ma.isEmpty()==false){
            if(ss.getCTHD(ma)!=null){
                fillTable2(ss.getCTHD(ma));
                JOptionPane.showMessageDialog(this, "Tìm thành công");
            }else{
                JOptionPane.showMessageDialog(this, "Không tìm thấy mã");
            }

        }else
        JOptionPane.showMessageDialog(this, "Mời nhập mã hóa đơn");
    }//GEN-LAST:event_btnTimKiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblChiTietHoaDon;
    private javax.swing.JTable tblLichSuHoaDon;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
