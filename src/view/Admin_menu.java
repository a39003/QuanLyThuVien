
package view;

import java.awt.Dimension;

/**
 *
 * @author thien
 */
public class Admin_menu extends javax.swing.JFrame {
    
        Login login = new Login();

    /**
     * Creates new form admin_menu
     */
    public Admin_menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        deskopMain.setPreferredSize(new Dimension(1154, 754));
        deskopMain.add(new Admin_QlSinhVien());                                                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        diaLong_caiDat = new javax.swing.JDialog();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtHost = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDatabase = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        deskopMain = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        pnlHome = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnlQuanLySinhVien = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        pnlQuanLyViPham = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        pnlQuanLyPhieuMuon = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        pnlQuanLySach = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        pnlQuanLyTheLoaiSach = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        pnlCaiDat = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();

        diaLong_caiDat.setResizable(false);

        jSplitPane2.setDividerSize(0);

        jPanel2.setBackground(new java.awt.Color(52, 56, 57));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cài đặt chung");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(261, Short.MAX_VALUE))
        );

        jSplitPane2.setLeftComponent(jPanel2);

        jPanel3.setBackground(new java.awt.Color(37, 41, 49));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ngôn ngữ :");

        jComboBox1.setBackground(new java.awt.Color(37, 41, 49));
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiếng Việt ", "English" }));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Kết nối  dữ liệu");

        jSeparator1.setBackground(new java.awt.Color(52, 56, 57));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Địa chỉ host :");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tên người dùng:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Mật khẩu :");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tên cơ sở dữ liệu :");

        jButton1.setText("Cancel");

        jButton2.setText("OK");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1))))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtHost))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDatabase))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(61, 61, 61)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(20, 20, 20))
        );

        jSplitPane2.setRightComponent(jPanel3);

        diaLong_caiDat.getContentPane().add(jSplitPane2, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Thư Viện");

        jSplitPane1.setDividerSize(0);

        deskopMain.setBackground(new java.awt.Color(37, 41, 49));
        deskopMain.setMinimumSize(new java.awt.Dimension(1154, 754));
        deskopMain.setLayout(new java.awt.BorderLayout());
        jSplitPane1.setRightComponent(deskopMain);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(200, 620));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 520));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHome.setBackground(new java.awt.Color(51, 51, 51));
        pnlHome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlHome.setAutoscrolls(true);
        pnlHome.setMinimumSize(new java.awt.Dimension(36, 36));
        pnlHome.setPreferredSize(new java.awt.Dimension(36, 36));
        pnlHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Admin.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        pnlHome.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jPanel1.add(pnlHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 60));

        pnlQuanLySinhVien.setBackground(new java.awt.Color(51, 51, 51));
        pnlQuanLySinhVien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlQuanLySinhVien.setMinimumSize(new java.awt.Dimension(155, 26));
        pnlQuanLySinhVien.setPreferredSize(new java.awt.Dimension(155, 26));
        pnlQuanLySinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlQuanLySinhVienMouseClicked(evt);
            }
        });
        pnlQuanLySinhVien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setBackground(new java.awt.Color(51, 51, 51));
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/member.png"))); // NOI18N
        jLabel15.setText("Quản lý Sinh viên        ");
        pnlQuanLySinhVien.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 190, 58));

        jPanel1.add(pnlQuanLySinhVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 200, 60));

        pnlQuanLyViPham.setBackground(new java.awt.Color(51, 51, 51));
        pnlQuanLyViPham.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlQuanLyViPham.setMinimumSize(new java.awt.Dimension(155, 26));
        pnlQuanLyViPham.setPreferredSize(new java.awt.Dimension(155, 26));
        pnlQuanLyViPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlQuanLyViPhamMouseClicked(evt);
            }
        });
        pnlQuanLyViPham.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setBackground(new java.awt.Color(51, 51, 51));
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/member.png"))); // NOI18N
        jLabel19.setText("Quản Lý Vi Phạm        ");
        pnlQuanLyViPham.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 190, 58));

        jPanel1.add(pnlQuanLyViPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 200, 60));

        pnlQuanLyPhieuMuon.setBackground(new java.awt.Color(51, 51, 51));
        pnlQuanLyPhieuMuon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlQuanLyPhieuMuon.setMinimumSize(new java.awt.Dimension(155, 26));
        pnlQuanLyPhieuMuon.setPreferredSize(new java.awt.Dimension(155, 26));
        pnlQuanLyPhieuMuon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlQuanLyPhieuMuonMouseClicked(evt);
            }
        });
        pnlQuanLyPhieuMuon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setBackground(new java.awt.Color(51, 51, 51));
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/member.png"))); // NOI18N
        jLabel17.setText("Quản Lý Phiếu Mượn   ");
        pnlQuanLyPhieuMuon.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 190, 58));

        jPanel1.add(pnlQuanLyPhieuMuon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 200, 60));

        pnlQuanLySach.setBackground(new java.awt.Color(51, 51, 51));
        pnlQuanLySach.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlQuanLySach.setMinimumSize(new java.awt.Dimension(155, 26));
        pnlQuanLySach.setPreferredSize(new java.awt.Dimension(155, 26));
        pnlQuanLySach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlQuanLySachMouseClicked(evt);
            }
        });
        pnlQuanLySach.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(51, 51, 51));
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/member.png"))); // NOI18N
        jLabel14.setText("Quản Lý Sách             ");
        jLabel14.setMaximumSize(new java.awt.Dimension(141, 24));
        jLabel14.setMinimumSize(new java.awt.Dimension(141, 24));
        jLabel14.setPreferredSize(new java.awt.Dimension(141, 24));
        pnlQuanLySach.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 190, 58));

        jPanel1.add(pnlQuanLySach, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 200, 60));

        pnlQuanLyTheLoaiSach.setBackground(new java.awt.Color(51, 51, 51));
        pnlQuanLyTheLoaiSach.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlQuanLyTheLoaiSach.setMinimumSize(new java.awt.Dimension(155, 26));
        pnlQuanLyTheLoaiSach.setPreferredSize(new java.awt.Dimension(155, 26));
        pnlQuanLyTheLoaiSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlQuanLyTheLoaiSachMouseClicked(evt);
            }
        });
        pnlQuanLyTheLoaiSach.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setBackground(new java.awt.Color(51, 51, 51));
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/member.png"))); // NOI18N
        jLabel18.setText("Quản Lý Thể Loại Sách");
        pnlQuanLyTheLoaiSach.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 190, 60));

        jPanel1.add(pnlQuanLyTheLoaiSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 200, 60));

        pnlCaiDat.setBackground(new java.awt.Color(51, 51, 51));
        pnlCaiDat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlCaiDat.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        pnlCaiDat.setMinimumSize(new java.awt.Dimension(155, 26));
        pnlCaiDat.setPreferredSize(new java.awt.Dimension(155, 26));
        pnlCaiDat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlCaiDatMouseClicked(evt);
            }
        });
        pnlCaiDat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setBackground(new java.awt.Color(51, 51, 51));
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/member.png"))); // NOI18N
        jLabel20.setText(" Cài Đặt                  ");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        pnlCaiDat.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 190, 56));

        jPanel1.add(pnlCaiDat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 198, 58));

        jSplitPane1.setLeftComponent(jPanel1);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlQuanLySinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlQuanLySinhVienMouseClicked
        // TODO add your handling code here:
        Admin_QlSinhVien qlsv = new Admin_QlSinhVien();
        deskopMain.removeAll();
        deskopMain.add(qlsv).setVisible(true);
    }//GEN-LAST:event_pnlQuanLySinhVienMouseClicked

    private void pnlQuanLySachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlQuanLySachMouseClicked
        Admin_QlSach qlSach = new Admin_QlSach();
        deskopMain.removeAll();
        deskopMain.add(qlSach).setVisible(true);
    }//GEN-LAST:event_pnlQuanLySachMouseClicked

    private void pnlQuanLyTheLoaiSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlQuanLyTheLoaiSachMouseClicked
        Admin_QLTheLoaiSach qlTheLoaiSach = new Admin_QLTheLoaiSach();
        deskopMain.removeAll();
        deskopMain.add(qlTheLoaiSach).setVisible(true);
    }//GEN-LAST:event_pnlQuanLyTheLoaiSachMouseClicked

    private void pnlQuanLyPhieuMuonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlQuanLyPhieuMuonMouseClicked
        Admin_PhieuMuon phieuMuon = new Admin_PhieuMuon();
        deskopMain.removeAll();
        deskopMain.add(phieuMuon).setVisible(true);
    }//GEN-LAST:event_pnlQuanLyPhieuMuonMouseClicked

    private void pnlQuanLyViPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlQuanLyViPhamMouseClicked
         Admin_ViPham viPham = new Admin_ViPham();
        deskopMain.removeAll();
        deskopMain.add(viPham).setVisible(true);
                                         
    }//GEN-LAST:event_pnlQuanLyViPhamMouseClicked

    private void pnlCaiDatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCaiDatMouseClicked
//        diaLong_caiDat.setLocationRelativeTo(this);
//        diaLong_caiDat.setSize(430, 300);
//        diaLong_caiDat.setVisible(true);
                
    }//GEN-LAST:event_pnlCaiDatMouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        CaiDat cd = new CaiDat();
        cd.setVisible(true);
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
                login.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(Admin_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane deskopMain;
    private javax.swing.JDialog diaLong_caiDat;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JPanel pnlCaiDat;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlQuanLyPhieuMuon;
    private javax.swing.JPanel pnlQuanLySach;
    private javax.swing.JPanel pnlQuanLySinhVien;
    private javax.swing.JPanel pnlQuanLyTheLoaiSach;
    private javax.swing.JPanel pnlQuanLyViPham;
    private javax.swing.JTextField txtDatabase;
    private javax.swing.JTextField txtHost;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
