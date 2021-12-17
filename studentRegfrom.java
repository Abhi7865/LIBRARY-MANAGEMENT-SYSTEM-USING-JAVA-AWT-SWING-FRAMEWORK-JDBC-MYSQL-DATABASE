
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANHIJEET
 */
public class studentRegfrom extends javax.swing.JInternalFrame {
  String imagename,gender;
    /**
     * Creates new form studentRegfrom
     */
    public studentRegfrom() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panal_studentregfrom = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        datechooser = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        rdmale = new javax.swing.JRadioButton();
        rdfemale = new javax.swing.JRadioButton();
        rother = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        cmbostream = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        lblprofile = new javax.swing.JLabel();
        btnselectprofile = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Student Registration from");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panal_studentregfrom.setBackground(new java.awt.Color(204, 204, 204));
        panal_studentregfrom.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setText("STUDENT REGISTRATION FROM");
        panal_studentregfrom.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 250, 30));

        jLabel2.setText("Full Name: ");
        panal_studentregfrom.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        panal_studentregfrom.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 102, 220, 30));

        jLabel3.setText("E-mail :");
        panal_studentregfrom.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        txtmail.setToolTipText("format: abc@gmail.com");
        txtmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmailActionPerformed(evt);
            }
        });
        panal_studentregfrom.add(txtmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 152, 220, 30));

        jLabel4.setText("Password :");
        panal_studentregfrom.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));
        panal_studentregfrom.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 202, 220, 30));

        jLabel5.setText("Date of Birth: ");
        panal_studentregfrom.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));
        panal_studentregfrom.add(datechooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 220, 30));

        jLabel6.setText("Gender :");
        panal_studentregfrom.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 20));

        rdmale.setText("Male");
        rdmale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdmaleActionPerformed(evt);
            }
        });
        panal_studentregfrom.add(rdmale, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));

        rdfemale.setText("Female");
        rdfemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdfemaleActionPerformed(evt);
            }
        });
        panal_studentregfrom.add(rdfemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        rother.setText("Other");
        rother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotherActionPerformed(evt);
            }
        });
        panal_studentregfrom.add(rother, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, -1, -1));

        jLabel7.setText("Stream/Course :");
        panal_studentregfrom.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, 20));

        cmbostream.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "ME", "ELE", "CIVIL" }));
        panal_studentregfrom.add(cmbostream, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 190, -1));

        jLabel8.setText("Addess: ");
        panal_studentregfrom.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        txtaddress.setColumns(20);
        txtaddress.setRows(5);
        jScrollPane1.setViewportView(txtaddress);

        panal_studentregfrom.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 230, 130));

        lblprofile.setIcon(new javax.swing.ImageIcon("G:\\internship\\images\\def.jpg")); // NOI18N
        lblprofile.setText("lblprofilephoto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblprofile, javax.swing.GroupLayout.PREFERRED_SIZE, 210, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblprofile, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );

        panal_studentregfrom.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 210, 230));

        btnselectprofile.setText("SELECT IMG");
        btnselectprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnselectprofileActionPerformed(evt);
            }
        });
        panal_studentregfrom.add(btnselectprofile, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, -1, -1));

        btnsave.setText("REGISTER STUDENT");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        panal_studentregfrom.add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 660, 160, 30));

        btnclear.setText("CLEAR");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        panal_studentregfrom.add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 660, -1, 30));

        getContentPane().add(panal_studentregfrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 658, 788));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmailActionPerformed

    private void btnselectprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnselectprofileActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        int i = chooser.showOpenDialog(btnselectprofile);
        if(i==JFileChooser.APPROVE_OPTION){
        File file = chooser.getSelectedFile();
        String path = file.getPath();
        imagename = file.getName();
        lblprofile.setIcon(new ImageIcon(path));
        }
    }//GEN-LAST:event_btnselectprofileActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        java.util.Date date = datechooser.getDate();
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String dateofbirth = formatter.format(date);
          try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydatabase","root","");
            String sql="insert into studen_reg(name,mail,password,dob,gender,course,address,photo) values('" +txtname.getText()+"','" +txtmail.getText()+"','" +txtpass.getText()+"','" +dateofbirth+"','" +gender+"','" +cmbostream.getSelectedItem()+"','"+txtaddress.getText()+"','" +imagename+"')  ";
            PreparedStatement pst= con.prepareStatement(sql);
            int i=pst.executeUpdate();
					if(i>0) {
						JOptionPane.showMessageDialog(null, "record save sucess");
				}
					con.close();
					pst.close();
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, " "+e.getMessage());
        }

    }//GEN-LAST:event_btnsaveActionPerformed

    private void rdmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdmaleActionPerformed
        // TODO add your handling code here:
         gender = rdmale.getText();
        if(rdmale.isSelected()){
            rdmale.setSelected(true);
        rdfemale.setSelected(false);
        rother.setSelected(false);
        }
    }//GEN-LAST:event_rdmaleActionPerformed

    private void rdfemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdfemaleActionPerformed
        // TODO add your handling code here:
         gender = rdfemale.getText();
        if(rdfemale.isSelected()){
        rdmale.setSelected(false);
        rdfemale.setSelected(true);
        rother.setSelected(false);
    }//GEN-LAST:event_rdfemaleActionPerformed

    private void rotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rotherActionPerformed
        
       
    }//GEN-LAST:event_rotherActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
           rdmale.setSelected(false);
         rdfemale.setSelected(false);
         rother.setSelected(false);
           txtmail.setText(" ");
            txtname.setText(" ");
            txtpass.setText(null);
            cmbostream.setSelectedItem(null);
            txtaddress.setText(" ");
    
    }//GEN-LAST:event_btnclearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnselectprofile;
    private javax.swing.JComboBox<String> cmbostream;
    private com.toedter.calendar.JDateChooser datechooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblprofile;
    private javax.swing.JPanel panal_studentregfrom;
    private javax.swing.JRadioButton rdfemale;
    private javax.swing.JRadioButton rdmale;
    private javax.swing.JRadioButton rother;
    private javax.swing.JTextArea txtaddress;
    private javax.swing.JTextField txtmail;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables
}
