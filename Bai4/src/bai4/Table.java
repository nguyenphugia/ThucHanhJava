
package bai4;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author PhuGia
 */
public class Table extends javax.swing.JFrame {

    public static class ThongTin {
        String MaNV;
        String PhanXuong;
        int SoSP;
        public ThongTin() {}
        public ThongTin (String a, String b, int c) {
            this.MaNV = a;
            this.PhanXuong = b;
            this.SoSP = c;
        }
        public String getMaNV() {
            return MaNV;
        }
        public String getPhanXuong() {
            return PhanXuong;
        }
        public int getSoSP() {
            return SoSP;
        }
        public void setMaNV (String a) {
            this.MaNV = a;
        }
        public void setPhanXuong (String a) {
            this.PhanXuong = a;
        }
        public void setSoSP (int a) {
            this.SoSP = a;
        }
        public static int getChuan (String a) {
            if (a.equals("A"))   return 300;
            return 500;
        }
        public boolean vuotChuan() {
            if ("A".equals(PhanXuong))
                if (SoSP > 300) return true;
                else return false;
            else {
                if (SoSP > 500)  return true;
                else return false;
            }
        }
        public int tinhLuong() {
            int luong;
            if (vuotChuan())    luong = 30000 * SoSP;
            else luong = 20000 * SoSP;
            return luong;
        }
        public String toString() {
            return MaNV;
        }
    }
    
    public Table() {
        initComponents();
    }
    
    public boolean KTrong (JTextField a) {
        if (a.getText().isEmpty())  return true;
        else return false;
    }
    public boolean TrungNV () {
        for (int i = 0; i < jTable1.getRowCount(); i++)
            if (txtMaNV.getText().equals(jTable1.getValueAt(i, 0)))
                return true;
            return false;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        txtSoSP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtSoSPC = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtLuong = new javax.swing.JTextField();
        btnLuong = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bảng thông tin");

        jLabel1.setText("Mã nhân viên");

        jLabel2.setText("Số sản phẩm");

        jLabel3.setText("Phân xưởng");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Số sản phẩm chuẩn");

        txtSoSPC.setEnabled(false);

        jLabel5.setText("Tính lương");

        txtLuong.setText(" ");
        txtLuong.setEnabled(false);

        btnLuong.setText("Tính lương");
        btnLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuongActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Phân xưởng", "Số sản phẩm chuẩn", "Vượt chuẩn"
            }
        ));
        jTable1.setEnabled(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaNV)
                            .addComponent(txtSoSP)
                            .addComponent(txtLuong)
                            .addComponent(txtSoSPC, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnLuong)
                        .addGap(18, 18, 18)
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua)))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSoSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSoSPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLuong)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnSua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuongActionPerformed
        if (!KTrong (txtSoSP))
            try {
                Integer.valueOf(txtSoSP.getText());
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Phải nhập số sản phẩm!");
                txtSoSP.setText("");
            }
        if (!KTrong(txtMaNV) &&  !KTrong(txtSoSP)) {
            ThongTin tt = new ThongTin(txtMaNV.getText(), jComboBox1.getSelectedItem().toString(), Integer.valueOf(txtSoSP.getText()));
            txtLuong.setText(String.valueOf(tt.tinhLuong()));
        }
        else JOptionPane.showMessageDialog(this, "Vui lòng điền đủ dữ liệu!");
    }//GEN-LAST:event_btnLuongActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        String s = "";
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        if (KTrong(txtMaNV) || KTrong(txtSoSP))
            JOptionPane.showMessageDialog(this, "Vui lòng điền đủ dữ liệu! ");
        if (!KTrong(txtSoSP))
            try {
                Integer.valueOf(txtSoSP.getText());
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập số sản phẩm");         
            }
        ThongTin tt = new ThongTin(txtMaNV.getText(), jComboBox1.getSelectedItem().toString(), Integer.valueOf(txtSoSP.getText()));
        if (TrungNV())
            JOptionPane.showMessageDialog(this, "Đã có nhân viên này!");
        else {
            if (tt.vuotChuan())
                s = "  X";
            else s = "";
            model.addRow(new Object[] {txtMaNV.getText(), jComboBox1.getSelectedItem(), txtSoSP.getText(), s});
        }
        jTable1.setModel(model);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRow() < 0)
            JOptionPane.showMessageDialog(this, "Vui lòng chọn hàng cần xóa!");
        else {
            int n = JOptionPane.showMessageDialog(this, "Bạn có chắc chắn xóa không?", "Thông báo", JOptionPane.OK_CANCEL_OPTION);
            if (n == JOptionPane.OK_OPTION) {
                int [] index = jTable1.getSelectedRows();
                for (int i = index.length -1; i >= 0; i--)
                    model.removeRow(index[i]);
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        String s;
        jTable1.setValueAt(String.valueOf(txtMaNV.getText()), jTable1.getSelectedRow(), 0);
        jTable1.setValueAt(String.valueOf(txtSoSP.getText()), jTable1.getSelectedRow(), 1);
        jTable1.setValueAt(String.valueOf(txtSoSP.getText()), jTable1.getSelectedRow(), 2);
        ThongTin tt = new ThongTin(txtMaNV.getText(), jComboBox1.getSelectedItem().toString(), Integer.valueOf(txtSoSP.getText()));
        if (tt.vuotChuan())
            s = "  X";
        else s = "";
        jTable1.setValueAt(s, jTable1.getSelectedRow(), 3);
    }//GEN-LAST:event_btnSuaActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        txtSoSPC.setText(String.valueOf(ThongTin.getChuan(jComboBox1.getSelectedItem().toString())));
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Table().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuong;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtSoSP;
    private javax.swing.JTextField txtSoSPC;
    // End of variables declaration//GEN-END:variables
}
