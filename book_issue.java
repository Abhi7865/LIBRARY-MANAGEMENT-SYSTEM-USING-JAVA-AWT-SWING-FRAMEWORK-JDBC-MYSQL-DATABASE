
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.*;
import java.time.*;
import java.time.format.*;
import java.util.Calendar;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANHIJEET
 */
public class book_issue extends javax.swing.JInternalFrame {
String returndate,isssuedate;
    /**
     * Creates new form book_issue
     */
    public book_issue() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtstudent_id = new javax.swing.JTextField();
        txtstudent_name = new javax.swing.JTextField();
        cmb_course = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtbook_id = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtbook_name = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtbook_Author = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtbook_publisher = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        issue_date = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        return_date = new com.toedter.calendar.JDateChooser();
        btn_issuebook = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel1.setText("BOOK ISSUE");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setText("Student Details :");

        jLabel3.setText("Student id :");

        jLabel4.setText("student name :");

        jLabel5.setText("student course :");

        txtstudent_id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtstudent_idFocusLost(evt);
            }
        });
        txtstudent_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstudent_idActionPerformed(evt);
            }
        });

        txtstudent_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstudent_nameActionPerformed(evt);
            }
        });

        cmb_course.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "ME", "ELE", "CIVIL" }));
        cmb_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_courseActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel6.setText("BOOK Details :");

        jLabel7.setText("BOOK id :");

        txtbook_id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtbook_idFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtbook_idFocusLost(evt);
            }
        });
        txtbook_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbook_idActionPerformed(evt);
            }
        });

        jLabel8.setText("BOOK Name: ");

        txtbook_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtbook_nameFocusLost(evt);
            }
        });

        jLabel9.setText("BOOK Auther :");

        jLabel10.setText("BOOK Publisher :");

        jLabel11.setText("BOOK ISSUE DATE :");

        jLabel12.setText("BOOK RETURN DATE :");

        btn_issuebook.setBackground(new java.awt.Color(0, 0, 0));
        btn_issuebook.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn_issuebook.setText("ISSUE BOOK ");
        btn_issuebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_issuebookActionPerformed(evt);
            }
        });

        btn_clear.setBackground(new java.awt.Color(0, 0, 0));
        btn_clear.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn_clear.setText("CLEAR");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(28, 28, 28)
                                .addComponent(txtbook_id, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(txtbook_name, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtbook_Author, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtstudent_id, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(jLabel4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(txtstudent_name, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)
                                        .addComponent(jLabel5)
                                        .addGap(39, 39, 39)
                                        .addComponent(cmb_course, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(txtbook_publisher, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(issue_date, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(108, 108, 108)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(return_date, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(btn_issuebook, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(241, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtstudent_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtstudent_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cmb_course, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtbook_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbook_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbook_Author, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txtbook_publisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(105, 105, 105)
                                .addComponent(jLabel11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(return_date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(issue_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_issuebook, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtstudent_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstudent_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstudent_idActionPerformed

    private void txtstudent_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstudent_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstudent_nameActionPerformed

    private void cmb_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_courseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_courseActionPerformed

    private void txtbook_idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtbook_idFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbook_idFocusGained

    private void txtbook_idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtbook_idFocusLost
        // TODO add your handling code here:
        
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydatabase", "root", "");
            String sql="select * from book_entry where book_id= '"+txtbook_id.getText()+"'";
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            int status=0;
            
            while(rs.next()){
                status +=1;
                txtbook_Author.setText(rs.getString("author"));
                txtbook_name.setText(rs.getString("name"));
                txtbook_publisher.setText(rs.getString("publisher"));
                
                
            }
            pst.close();
            con.close();
         }
          catch(Exception ex){
          JOptionPane.showMessageDialog(null, ex.getMessage());}
        
        
        
        
        
   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
   LocalDateTime now = LocalDateTime.now();  
   isssuedate=dtf.format(now);
      
   DateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
   Calendar cal=Calendar.getInstance();
   cal.add(Calendar.DATE, 15);
   returndate =dateFormat.format(cal.getTime());
        try {
            java.util.Date date1= new SimpleDateFormat("dd/MM/yyyy").parse(returndate);
            java.util.Date date= new SimpleDateFormat("dd/MM/yyyy").parse(isssuedate);
            issue_date.setDate(date);issue_date.disable();
            return_date.setDate(date1);return_date.disable();
             
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, ex);
        }
        
        
        
        
    }//GEN-LAST:event_txtbook_idFocusLost

    private void txtstudent_idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtstudent_idFocusLost
        // TODO add your handling code here:
          
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydatabase", "root", "");
            String sql="select * from studen_reg where id= '"+txtstudent_id.getText()+"'";
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            int status=0;
            
            while(rs.next()){
                status +=1;
                txtstudent_name.setText(rs.getString("name"));
                cmb_course.setSelectedItem(rs.getString("course"));
            }}
          catch(Exception ex){
          JOptionPane.showMessageDialog(null, ex.getMessage());}
    }//GEN-LAST:event_txtstudent_idFocusLost

    private void txtbook_nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtbook_nameFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtbook_nameFocusLost

    private void btn_issuebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_issuebookActionPerformed
       
         try{
            int status=1;
            String sqlq;
            int availableS=0;String a=" ";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydatabase","root","");
           
            
            
                sqlq="select availablestock from book_entry where book_id='"+txtbook_id.getText()+"'";
                PreparedStatement pst6= con.prepareStatement(sqlq);
                ResultSet rs3=pst6.executeQuery();
              while(rs3.next()){
              a= rs3.getString(1);
               }
             availableS=Integer.parseInt(a);
            
            
            
            
            
            
            
            
            
            
           // minimum 4 books
             sqlq =" select count(*) from book_issue where sid='"+txtstudent_id.getText()+"' and status='"+1+"' ";
            PreparedStatement pst2=con.prepareStatement(sqlq);
            ResultSet rs1=pst2.executeQuery();
            if(rs1.next()){
               String no=rs1.getString(1);
               
               int no1=Integer.parseInt(no);
               if(no1<4){
                   // same book 
             String check = "select * from book_issue where sid='"+txtstudent_id.getText() +"' AND bid='"+txtbook_id.getText()+"' ";
             PreparedStatement pst=con.prepareStatement(check);
            ResultSet rs=pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null ," this book is already issued on your id...");
            }
           else{
             if(availableS>0){
                 sqlq="insert into book_issue(sid,sname,scourse,bid,bname,bauthor,bpublisher,bissuedate,breturndate,status) values('" +txtstudent_id.getText()+"','" +txtstudent_name.getText()+"','" +cmb_course.getSelectedItem()+"','" +txtbook_id.getText()+"','" +txtbook_name.getText()+"','"+txtbook_Author.getText()+ "','"+txtbook_publisher.getText()+"','" +isssuedate+"','"+returndate +"','"+status+"')  ";
            PreparedStatement pst1= con.prepareStatement(sqlq);
            int i=pst1.executeUpdate();
            if(i>0) {
            JOptionPane.showMessageDialog(null, "record save sucess");
            
            sqlq="update book_entry set availablestock='"+(availableS-1)+"' where book_id='"+txtbook_id.getText()+"'";
             PreparedStatement pst5= con.prepareStatement(sqlq);
             pst5.executeUpdate();
           
           }}else if(availableS<=0){
                 JOptionPane.showMessageDialog(null, "book is not available right now...");
            }
            
            }}
               else{
               JOptionPane.showMessageDialog(null, "you already issued 4 books on your id.");}
           
            con.close();
            pst2.close();
                                       
       
            }}
        catch(Exception e){
            JOptionPane.showMessageDialog(null, " catch exception"+e.getMessage());
        }
    }//GEN-LAST:event_btn_issuebookActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        txtbook_Author.setText(" ");
        txtbook_id.setText(" ");
        txtbook_name.setText(" ");
        txtbook_publisher.setText(" ");
        txtstudent_name.setText(" ");
        txtstudent_id.setText(" ");
        issue_date.setDate(null);
        return_date.setDate(null);
        
    }//GEN-LAST:event_btn_clearActionPerformed

    private void txtbook_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbook_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbook_idActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_issuebook;
    private javax.swing.JComboBox<String> cmb_course;
    private com.toedter.calendar.JDateChooser issue_date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser return_date;
    private javax.swing.JTextField txtbook_Author;
    private javax.swing.JTextField txtbook_id;
    private javax.swing.JTextField txtbook_name;
    private javax.swing.JTextField txtbook_publisher;
    private javax.swing.JTextField txtstudent_id;
    private javax.swing.JTextField txtstudent_name;
    // End of variables declaration//GEN-END:variables
}
