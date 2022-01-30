package guischool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


@SuppressWarnings("serial")
public class CourseRegistration extends javax.swing.JFrame {

     Connection con = null; //Creating a connection
        PreparedStatement insert;
    /**
     * Creates new form CourseRegistration
     */
    public CourseRegistration() {
        initComponents();
        table_Update();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setText("COURSE REGISTRATION");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Course Registration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("Course ID");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("Course Name");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("Credit");

        jButton1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton3.setText("Edit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addComponent(cre)
                    .addComponent(cname)
                    .addComponent(cid))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course ID", "Course Name", "Credit"
            }
        ) {
            @SuppressWarnings("rawtypes")
			Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            @SuppressWarnings("rawtypes")
			public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        back.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        back.setText("Go Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(back)
                        .addGap(106, 106, 106)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(back))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

      @SuppressWarnings("unchecked")
	private void table_Update()
    {
        int c;
           try
                        {
                            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/school", "root", "");
                            insert = con.prepareStatement("select * from courses");
                           ResultSet rs = insert.executeQuery();
                           ResultSetMetaData rss = rs.getMetaData();
                           c = rss.getColumnCount();
                           DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
                           df.setRowCount(0);
                           
                          while(rs.next())
                           {
                               @SuppressWarnings("rawtypes")
							Vector v2 = new Vector();
                               
                               for(int a=1; a<=c; a++)
                               {
                                   v2.add(rs.getString("course_ID"));
                                    v2.add(rs.getString("course_Name"));
                                     v2.add(rs.getString("credit"));
                               }
                               
                               df.addRow(v2);
                           }                 
                        }catch(Exception e)
                        {
                            System.out.println(e.getMessage());
                        }
    }
    //Add button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
                     String course_ID = cid.getText();
                    String course_Name = cname.getText();
                    String credit = cre.getText();
                               
                        try
                        {
                            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/school", "root", "");
                            insert = con.prepareStatement("insert into courses values(?, ?, ?)");
                            insert.setString(1, course_ID);
                            insert.setString(2, course_Name);
                            insert.setString(3, credit);
                            insert.executeUpdate();
                                                       
                               cid.setText("");
                               cname.setText("");
                               cre.setText("");
                              
                             
                                    JOptionPane.showMessageDialog(this, "Record Added Successfully");                           
                        }catch(Exception e)
                        {
                            System.out.println(e.getMessage());
                        }
        
    }                                        

    //delete Button
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
          @SuppressWarnings("unused")
		DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
              @SuppressWarnings("unused")
			int SelectedIndex = jTable1.getSelectedRow();
        
              try
                        {
                            String course_ID = cid.getText();
                     
                            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to delete the record", "Warning", JOptionPane.YES_NO_OPTION);
                    
                            if(dialogResult == JOptionPane.YES_OPTION)
                            {
                                
                            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/school", "root", "");
                            insert = con.prepareStatement("delete from courses where course_ID  = ? ");
                            insert.setString(1, course_ID);
                            
                            insert.executeUpdate();
                                                       
                              cid.setText("");
                              cname.setText("");
                              cre.setText("");
                                                
                                    JOptionPane.showMessageDialog(this, "Record Deleted Successfully");          
                                    table_Update();
                            }
                        }catch(Exception e)
                        {
                            System.out.println(e.getMessage());
                        }
    }                                        

   //Method to selected a row in the database
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
      
           DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
        int SelectedIndex = jTable1.getSelectedRow();
        
          cid.setText(df.getValueAt(SelectedIndex, 0) .toString());
          cname.setText(df.getValueAt(SelectedIndex, 1) .toString());
          cre.setText(df.getValueAt(SelectedIndex, 2) .toString());
    }                                    

    //Edit Button
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
           @SuppressWarnings("unused")
		DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
        @SuppressWarnings("unused")
		int SelectedIndex = jTable1.getSelectedRow();
        
              try
                        {
                                String course_ID = cid.getText();
                                String course_Name = cname.getText();
                                String credit = cre.getText();
                                                
                            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/school", "root", "");
                            insert = con.prepareStatement("update courses set course_Name = ?, credit = ? where course_ID  = ? ");
                            insert.setString(1, course_Name);
                            insert.setString(2, credit);
                            insert.setString(3, course_ID);
                                                   
                            insert.executeUpdate();
                                                       
                              cid.setText("");
                              cname.setText("");
                              cre.setText("");
                                                          
                                    JOptionPane.showMessageDialog(this, "Record Updated Successfully");          
                                    table_Update();
                        }catch(Exception e)
                        {
                            System.out.println(e.getMessage());
                        }
    }                                        

    //Go Back Button
    private void backActionPerformed(java.awt.event.ActionEvent evt) {                                     
       this.setVisible(false);
       new HomePage().setVisible(true);
    }                                    

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
            java.util.logging.Logger.getLogger(CourseRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourseRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourseRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourseRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton back;
    private javax.swing.JTextField cid;
    private javax.swing.JTextField cname;
    private javax.swing.JTextField cre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration                   
}