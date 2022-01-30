package guischool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ues
 */
@SuppressWarnings("serial")
public class MarksRegistration extends javax.swing.JFrame {

        Connection con = null;  //Creating a Connection
        PreparedStatement insert;
        
    /** Creates new form MarksRegistration */
    public MarksRegistration() {
        initComponents();
        table_Update();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        sid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ex = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setText("MARKS REGISTRATION");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Marks Registration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("Student_ID");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("Course ID");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("Cat");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setText("Exam");

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
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addComponent(ca)
                    .addComponent(cid)
                    .addComponent(sid)
                    .addComponent(ex))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton4.setText("Go Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Course ID", "Cat", "Exam"
            }
        ) {
            @SuppressWarnings("rawtypes")
			Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButton4)
                        .addGap(125, 125, 125)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                            insert = con.prepareStatement("select * from mark");
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
                                   v2.add(rs.getString("student_ID"));
                                    v2.add(rs.getString("course_ID"));
                                     v2.add(rs.getFloat("cat"));
                                     v2.add(rs.getFloat("exam"));
                               }
                               
                               df.addRow(v2);
                           }                 
                        }catch(Exception e)
                        {
                            System.out.println(e.getMessage());
                        }
    }
    //Button to Add Marks Records
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
                    String student_ID = sid.getText();
                    String course_ID = cid.getText();
                    String cat = ca.getText();
                    String exam = ex.getText();
                               
                        try
                        {
                            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/school", "root", "");
                            insert = con.prepareStatement("insert into mark values(?, ?, ?, ?)");
                            insert.setString(1, student_ID);
                            insert.setString(2, course_ID);
                            insert.setString(3, cat);
                            insert.setString(4, exam);
                            insert.executeUpdate();
                                                       
                                sid.setText("");
                               cid.setText("");
                                ca.setText("");
                               ex.setText("");
                              
                             
                                    JOptionPane.showMessageDialog(this, "Record Added Successfully");                           
                        }catch(Exception e)
                        {
                            System.out.println(e.getMessage());
                        }

    }                                        

    //JTable
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
       
          DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
        int SelectedIndex = jTable1.getSelectedRow();
        
          sid.setText(df.getValueAt(SelectedIndex, 0) .toString());
          cid.setText(df.getValueAt(SelectedIndex, 1) .toString());
          ca.setText(df.getValueAt(SelectedIndex, 2) .toString());
          ex.setText(df.getValueAt(SelectedIndex, 2) .toString());
          
    }                                    

    //Button to delete Record
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
          @SuppressWarnings("unused")
		DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
        @SuppressWarnings("unused")
		int SelectedIndex = jTable1.getSelectedRow();
        
              try
                        {
                            String student_ID = sid.getText();
                            String course_ID = cid.getText();
                     
                            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to delete the record", "Warning", JOptionPane.YES_NO_OPTION);
                    
                            if(dialogResult == JOptionPane.YES_OPTION)
                            {
                                
                            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/school", "root", "");
                            insert = con.prepareStatement("delete from mark where student_ID  = ? and course_ID = ?  ");
                            insert.setString(1, student_ID);
                            insert.setString(2, course_ID);
                            
                            insert.executeUpdate();
                                                       
                             sid.setText("");
                              cid.setText("");
                              ca.setText("");
                              ex.setText("");
                                                
                                    JOptionPane.showMessageDialog(this, "Record Deleted Successfully");          
                                    table_Update();
                            }
                        }catch(Exception e)
                        {
                            System.out.println(e.getMessage());
                        }
    }                                        

    //Button to edit Records
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
      
          @SuppressWarnings("unused")
		DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
        @SuppressWarnings("unused")
		int SelectedIndex = jTable1.getSelectedRow();
        
              try
                        {
                                String student_ID = sid.getText();
                                String course_ID = cid.getText();
                                String cat = ca.getText();
                                String exam = ex.getText();
                                                
                            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/school", "root", "");
                            insert = con.prepareStatement("update mark set course_ID = ?, cat = ?, exam = ? where student_ID  = ? ");
                            insert.setString(1, course_ID);
                            insert.setString(2, cat);
                            insert.setString(3, exam);
                            insert.setString(4, student_ID);
                                                   
                            insert.executeUpdate();
                                                       
                              sid.setText("");
                              cid.setText("");
                              ca.setText("");
                              ex.setText("");
                                                          
                                    JOptionPane.showMessageDialog(this, "Record Updated Successfully");          
                                    table_Update();
                        }catch(Exception e)
                        {
                            System.out.println(e.getMessage());
                        }
    }                                        

    //Go Back Button
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
        this.setVisible(false);
        new HomePage().setVisible(true);
    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MarksRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarksRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarksRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarksRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarksRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField ca;
    private javax.swing.JTextField cid;
    private javax.swing.JTextField ex;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField sid;
    // End of variables declaration                   

}
