
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class student_main extends javax.swing.JFrame {
String username,password,imagename;
    public student_main(String u,String p){
    initComponents();
    lblname.setText(u);
    txtpass.setText(p);
     try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydatabase", "root", "");
            
            String sql="select * from studen_reg where name='"+lblname.getText()+"' AND password= '"+txtpass.getText()+"'";
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            int status=0;
            
            while(rs.next()){
                status +=1;
                lblid.setText(rs.getString("id"));
                lblname.setText(rs.getString("name"));
                lblmail.setText(rs.getString("mail"));
                txtpass.setText(rs.getString("password"));
                lbladdress.setText(rs.getString("address"));
                lbldob.setText(rs.getString("dob"));
               // java.util.Date date = new SimpleDateFormat("dd/MM/yyyy").parse(d);
                
                String gender= rs.getString("gender");
                lblgender.setText(gender);
                
                lblcourse.setText(rs.getString("course"));
               String img = rs.getString("imagename");
               lbl_img.setIcon(new ImageIcon("G:\\internship\\images"+img));
                  
        }}catch(Exception e1){
            JOptionPane.showMessageDialog(null, e1.getMessage());
        }
                
        
    }
    public student_main() {
        initComponents();
            
         
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblmail = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        lbldob = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblgender = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblcourse = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lbladdress = new javax.swing.JLabel();
        btn_update = new javax.swing.JButton();
        btn_viewbooks = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbl_img = new javax.swing.JLabel();
        btn_profile = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_view = new javax.swing.JTable();
        menuBar = new javax.swing.JMenuBar();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("STUDENT HOME");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        btn_logout.setText("LOGOUT");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        jPanel1.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, -1, -1));

        jLabel2.setText("STUDENT INFO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        jLabel3.setText("STUDENT ID: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        jPanel1.add(lblid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 90, 20));

        jLabel5.setText("NAME: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));
        jPanel1.add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 160, 20));

        jLabel7.setText("G-MAIL :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));
        jPanel1.add(lblmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 180, 20));

        jLabel9.setText("PASSWORD :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));
        jPanel1.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 130, -1));

        jLabel10.setText("Date of Birth :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));
        jPanel1.add(lbldob, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 170, 20));

        jLabel12.setText("Gender :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));
        jPanel1.add(lblgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 150, 20));

        jLabel14.setText("Course :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));
        jPanel1.add(lblcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 150, 20));

        jLabel16.setText("Address :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, -1));
        jPanel1.add(lbladdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, 160, 20));

        btn_update.setText("UPDATE");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 580, -1, -1));

        btn_viewbooks.setText("VIEW BOOKS");
        btn_viewbooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewbooksActionPerformed(evt);
            }
        });
        jPanel1.add(btn_viewbooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 580, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_img, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lbl_img, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 150, 180));

        btn_profile.setText("SELECT IMG");
        btn_profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_profileActionPerformed(evt);
            }
        });
        jPanel1.add(btn_profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, -1, -1));

        table_view.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(table_view);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 620, 190));

        jScrollPane1.setViewportView(jPanel1);

        desktopPane.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 960, 830);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
          useroption u= new useroption();
        u.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_profileActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        int i = chooser.showOpenDialog(btn_profile);
        if(i==JFileChooser.APPROVE_OPTION){
        File file = chooser.getSelectedFile();
        String path = file.getPath();
        imagename = file.getName();
        lbl_img.setIcon(new ImageIcon(path));
        }
    }//GEN-LAST:event_btn_profileActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydatabase", "root", "");
            String sql="update studen_reg set password='"+txtpass.getText()+"',photo='"+imagename+"' where id='"+ lblid.getText()+"'";
            PreparedStatement pst=con.prepareStatement(sql);
            int i=pst.executeUpdate();
            if(i>0){
                 JOptionPane.showMessageDialog(null,"Record Update");
            }
             
        }catch(Exception e1){
            JOptionPane.showMessageDialog(null, e1.getMessage());
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_viewbooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewbooksActionPerformed
        // TODO add your handling code here:
        try{ int status=1;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydatabase", "root", "");
            String sql="select * from book_issue where sid='"+lblid.getText()+"' AND status='"+status+"'";
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            table_view.setModel(DbUtils.resultSetToTableModel(rs));
          
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null, ex.getMessage());
      }
    }//GEN-LAST:event_btn_viewbooksActionPerformed

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
            java.util.logging.Logger.getLogger(student_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(student_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(student_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(student_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new student_main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_profile;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton btn_viewbooks;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_img;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lblcourse;
    private javax.swing.JLabel lbldob;
    private javax.swing.JLabel lblgender;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblmail;
    private javax.swing.JLabel lblname;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JTable table_view;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables

}
