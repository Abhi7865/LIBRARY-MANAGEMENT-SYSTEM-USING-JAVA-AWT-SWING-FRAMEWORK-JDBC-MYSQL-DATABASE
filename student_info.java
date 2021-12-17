
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANHIJEET
 */
public class student_info extends javax.swing.JInternalFrame {
String usern,pass,gender,imagename;
    
     
    public student_info(String u,String p) {
        
        usern=u;
        pass=p;
        
    }
    public student_info(){
        initComponents();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydatabase", "root", "");
            
            String sql="select * from studen_reg where name='"+usern+"' AND password= '"+pass+"'";
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            int status=0;
            
            while(rs.next()){
                status +=1;
                lbl_id.setText(rs.getString("id"));
                lbl_name.setText(rs.getString("name"));
                lbl_mail.setText(rs.getString("mail"));
                txtpass.setText(rs.getString("password"));
                lbl_address.setText(rs.getString("address"));
                lbl_dob.setText(rs.getString("dob"));
               // java.util.Date date = new SimpleDateFormat("dd/MM/yyyy").parse(d);
                
                gender= rs.getString("gender");
                lbl_gender.setText(gender);
                
                lblcourse.setText(rs.getString("course"));
               String img = rs.getString("imagename");
               lbl_img.setIcon(new ImageIcon("G:\\internship\\images"+img));
               
                
                
            }
            
        }catch(Exception e1){
            JOptionPane.showMessageDialog(null, e1.getMessage());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_viewbooks = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_view = new javax.swing.JTable();
        panelimg = new javax.swing.JPanel();
        lbl_img = new javax.swing.JLabel();
        btn_info = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_profile = new javax.swing.JButton();
        lbl_id = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        lbl_mail = new javax.swing.JLabel();
        lbl_dob = new javax.swing.JLabel();
        lbl_gender = new javax.swing.JLabel();
        lblcourse = new javax.swing.JLabel();
        lbl_address = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel1FocusGained(evt);
            }
        });

        jLabel1.setText("STUDENT INFOMATION");

        jLabel2.setText("ID :");

        jLabel3.setText("NAME :");

        jLabel4.setText("E-MAIL :");

        jLabel5.setText("PASSWORD :");

        jLabel6.setText("DOB :");

        jLabel7.setText("GENDER :");

        jLabel8.setText("COURSE :");

        jLabel9.setText("ADDRESS :");

        btn_viewbooks.setText("VIEW ISSUED BOOK");
        btn_viewbooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewbooksActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout panelimgLayout = new javax.swing.GroupLayout(panelimg);
        panelimg.setLayout(panelimgLayout);
        panelimgLayout.setHorizontalGroup(
            panelimgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_img, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
        );
        panelimgLayout.setVerticalGroup(
            panelimgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_img, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
        );

        btn_info.setText("STUDENT INFO");
        btn_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_infoActionPerformed(evt);
            }
        });

        btn_update.setText("UPDATE");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_profile.setText("select profile");
        btn_profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_profileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(307, 307, 307)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(363, 363, 363)
                                    .addComponent(btn_profile)
                                    .addGap(59, 59, 59))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(36, 36, 36)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lbl_address, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                            .addComponent(lblcourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbl_gender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbl_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbl_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbl_mail, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                            .addComponent(lbl_dob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(126, 126, 126)
                                    .addComponent(panelimg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn_info)
                            .addGap(44, 44, 44)
                            .addComponent(btn_update)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_viewbooks)
                            .addGap(181, 181, 181)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(lbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(lbl_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(panelimg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lbl_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lbl_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lblcourse, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(lbl_address, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_profile)))
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_viewbooks)
                    .addComponent(btn_info)
                    .addComponent(btn_update))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_viewbooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewbooksActionPerformed
        // TODO add your handling code here:
          try{ int status=1;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydatabase", "root", "");
            String sql="select * from book_issue where sid='"+lbl_id.getText()+"' AND status='"+status+"'";
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            table_view.setModel(DbUtils.resultSetToTableModel(rs));
          
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null, ex.getMessage());
      }
    
    }//GEN-LAST:event_btn_viewbooksActionPerformed

    private void btn_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_infoActionPerformed
        // TODO add your handling code here:
    }                                         

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_infoActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydatabase", "root", "");
            String sql="update studen_reg set password='"+txtpass.getText()+"',photo='"+imagename+"' where id='"+ lbl_id.getText()+"'";
            PreparedStatement pst=con.prepareStatement(sql);
            int i=pst.executeUpdate();
            if(i>0){
                 JOptionPane.showMessageDialog(null,"Record Update");
            }
             
        }catch(Exception e1){
            JOptionPane.showMessageDialog(null, e1.getMessage());
        }
    }//GEN-LAST:event_btn_updateActionPerformed

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

    private void jPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusGained
        // TODO add your handling code here:
                
    }//GEN-LAST:event_jPanel1FocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_info;
    private javax.swing.JButton btn_profile;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton btn_viewbooks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JLabel lbl_dob;
    private javax.swing.JLabel lbl_gender;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_img;
    private javax.swing.JLabel lbl_mail;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lblcourse;
    private javax.swing.JPanel panelimg;
    private javax.swing.JTable table_view;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables
}
