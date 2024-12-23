
package com.mycompany.tastassiment;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class VeiwTask extends javax.swing.JDialog {
ResultSet res1 ;
Tastassiment  obj = new Tastassiment();

    String stuid , tecid , taskti,assida,email , contact , Data , name ,mail ;
       Dimension  screen = Toolkit.getDefaultToolkit().getScreenSize();
    Conform  obj1  ;
    public VeiwTask(java.awt.Frame parent, boolean modal)  {
           initComponents();
             this.setSize(screen.width,screen.height);  
    try {
        sqlFun();
    } catch (SQLException ex) {
        Logger.getLogger(VeiwTask.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
  
    
    public void sqlFun() throws SQLException{
        String s  = """
    SELECT 
        t.task_name,  
        t.assigned_date,  
        t.student_name, 
        t.teacher_id, 
        t.stuid,
        s.email, 
        s.phone_number
    FROM 
        tasks AS t
    JOIN 
        students AS s 
    ON 
        t.stuid = s.student_id
""";

        
        
        
        
              res1 =  obj.stm.executeQuery(s);
             DefaultTableModel model = (DefaultTableModel) jt1.getModel(); 
            model.setRowCount(0);
            
            System.out.println(res1);
          int rowCount = 0;
while (res1.next()) {
    rowCount++;
     stuid = res1.getString("stuid");
     tecid = res1.getString("teacher_id");
   taskti = res1.getString("task_name");
     assida = res1.getString("assigned_date");
    email = res1.getString("email");
    contact = res1.getString("phone_number");
     name = res1.getString("student_name");

    String[] Data = {stuid, tecid, taskti, assida, email, contact, name};
    model.addRow(Data);
}
System.out.println("Total Rows Added: " + rowCount);



    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jt1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jt1.setAutoCreateRowSorter(true);
        jt1.setBackground(new java.awt.Color(204, 204, 255));
        jt1.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        jt1.setForeground(new java.awt.Color(255, 0, 0));
        jt1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Id", "Teacher ID", "Task Name", "AssignDate ", "Email", "contact no ", "Student Name "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt1);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(204, 255, 204));
        jTextField1.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 0, 0));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setText("Information  for  all Student  working report   ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(368, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt1MouseClicked
        // TODO add your handling code here:
        
        
    int c;
    c=evt.getClickCount();
    if(c==2)
        
      { 
       int row =  jt1.getSelectedRow();
                DefaultTableModel  model = (DefaultTableModel)jt1.getModel();
                mail = (String) model.getValueAt(row,4);
                System.out.print(mail);
                   obj1 = new Conform(null,false,mail);
                   obj1.setVisible(true);
      
      }
    }//GEN-LAST:event_jt1MouseClicked

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VeiwTask dialog = new VeiwTask(new javax.swing.JFrame(), true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable jt1;
    // End of variables declaration//GEN-END:variables
}
