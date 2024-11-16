
package com.mycompany.tastassiment;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class TecLogin extends javax.swing.JDialog {
Tastassiment obj1 ;
    word  obj ;
   
    String   otp , text  , em  ;
    private int timeLeft = 300; 
   private Timer timer;
    public TecLogin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
   
        ot1.setVisible(false);
        tf4.setVisible(false);
        rst.setVisible(false);
        otplabel.setVisible(false);
        obj = new word();
         obj.runword(tff1);
       
         
         
         
    }
    
    
     public void timela() {
  
    int countdownSeconds = 60; 
    timeLeft = countdownSeconds;

 
    timeLabel.setText("01:00");
    timeLabel.setFont(new Font("Arial", Font.BOLD, 20));

  
    timer = new Timer(1000, (ActionEvent e) -> {
        if (timeLeft > 0) {
            timeLeft--;

          
            int minutes = timeLeft / 60;
            int seconds = timeLeft % 60;

            
            timeLabel.setText(String.format(" %02d:%02d", minutes, seconds));
        } else {
            
            timer.stop();
            JOptionPane.showMessageDialog(null,
                    "OTP has expired! Please request a new OTP.",
                    "OTP Expired",
                    JOptionPane.WARNING_MESSAGE);
              ot1.setVisible(false);
        tf4.setVisible(false);
             rst.setVisible(true);
            System.out.println("OTP countdown finished.");
        }
    });
    
    timer.start();
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pannel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        ot1 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        tf3 = new javax.swing.JTextField();
        tf4 = new javax.swing.JTextField();
        rst = new javax.swing.JButton();
        send1 = new javax.swing.JButton();
        otplabel = new javax.swing.JLabel();
        tff1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pannel.setForeground(new java.awt.Color(255, 51, 51));

        jButton1.setBackground(new java.awt.Color(51, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 102, 102));
        jButton2.setText("forgeten password ");

        jLabel1.setBackground(new java.awt.Color(153, 51, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(221, 32, 212));
        jLabel1.setText("Teacher ID ");

        jLabel2.setBackground(new java.awt.Color(153, 51, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(221, 32, 212));
        jLabel2.setText("Password ");

        jLabel3.setBackground(new java.awt.Color(153, 51, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(221, 32, 212));
        jLabel3.setText("Email");

        ot1.setBackground(new java.awt.Color(153, 51, 0));
        ot1.setFont(new java.awt.Font("Segoe UI Historic", 3, 14)); // NOI18N
        ot1.setForeground(new java.awt.Color(221, 32, 212));
        ot1.setText("OTP");

        rst.setText("Re-send ");
        rst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rstActionPerformed(evt);
            }
        });

        send1.setText("Send ");
        send1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send1ActionPerformed(evt);
            }
        });

        otplabel.setForeground(new java.awt.Color(255, 0, 0));
        otplabel.setText("Wrong OTP");

        javax.swing.GroupLayout pannelLayout = new javax.swing.GroupLayout(pannel);
        pannel.setLayout(pannelLayout);
        pannelLayout.setHorizontalGroup(
            pannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pannelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pannelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pannelLayout.createSequentialGroup()
                        .addGroup(pannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(timeLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pannelLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ot1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(pannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pannelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))
                            .addGroup(pannelLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(pannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf4, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addComponent(rst, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(otplabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(pannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(send1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pannelLayout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        pannelLayout.setVerticalGroup(
            pannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pannelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(pannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(pannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(pannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(pannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(timeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(send1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)))
                .addGap(41, 41, 41)
                .addGroup(pannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ot1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(otplabel, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tff1.setBackground(new java.awt.Color(255, 153, 153));
        tff1.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        tff1.setForeground(new java.awt.Color(0, 255, 255));
        tff1.setText("Teacher  Verfication  Page  ( O  _  O )");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(tff1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tff1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void send1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send1ActionPerformed
    try {                                      
        // TODO add your handling code here:
        obj1 = new Tastassiment();
        String s, s1 , s2, s3= null ,s4 ;
        s1 = tf1.getText();
        s2 = tf2.getText();
        s = "  SELECT `teacher_id`, `teacher_name`, `email`, `department_id`, `password` FROM `teachers` WHERE  teacher_id ='"+s1+"' and  password = '"+s2+"' ";
        
        System.out.println(s);
       
            obj1.rs1 =  obj1.stm.executeQuery(s);
      
        System.out.println(obj1.rs1);
        if(obj1.rs1.next()){
          
                s3 = obj1.rs1.getString("email");
              s4 = obj1.rs1.getString("teacher_name");
                System.out.println(  s3 +" " + s4 );
          
            
        }
        
        em =tf3.getText();
        if( em .equals(s3)){
            
       
        
        otp =  Email.genOtp(4);
        text ="""
                  Dear [Teacher's Name],
                  Your One-Time Password (OTP) for verification is: [OTP]
                  Please use this OTP to complete the verification process. The OTP is valid for 59 seconds only.
                  Thank you,
                   Ramlakhan Patel  /  Task Assigment  """ ;
        
        
        
        Email.sendEmail(em, otp , text);
        
        System.out.println(otp);
        javax.swing.JOptionPane.showMessageDialog(null, "OTP send Your Email Please check Write Now ");
        timela();
        
        ot1.setVisible(true);
        tf4.setVisible(true);
       
        }else{
            javax.swing.JOptionPane.showMessageDialog(null, "plese fill right Email");
        } 
    } catch (SQLException ex) {
       System.out.println(ex.getMessage());
    }
          
    }//GEN-LAST:event_send1ActionPerformed

    private void rstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rstActionPerformed
        // TODO add your handling code here:
        send1.setVisible(false);
         otp =  Email.genOtp(4);
          Email.sendEmail(em, otp , text);
        timela();
         ot1.setVisible(true);
        tf4.setVisible(true);
    }//GEN-LAST:event_rstActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here
   String ot = tf4.getText();
        if(otp.equals(ot)){
          NRIPannel  obj =  new NRIPannel();
            this.setVisible(false);
        obj.setVisible(true);
         }else{
            
            otplabel.setVisible(true);
    //javax.swing.JOptionPane.showMessageDialog(null, "Please check OTP and try again");

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(TecLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TecLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TecLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TecLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TecLogin dialog = new TecLogin(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel ot1;
    private javax.swing.JLabel otplabel;
    private javax.swing.JPanel pannel;
    private javax.swing.JButton rst;
    private javax.swing.JButton send1;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tff1;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables
}
