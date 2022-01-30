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
public class Registration extends javax.swing.JFrame {

         Connection con =null; //Creating a connection
        PreparedStatement insert;
     
    /**
     * Creates new form Registration
     */
    public Registration() {
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
        fname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lev = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dept = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        pnum = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setText("STUDENT REGISTRATION");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("Student ID");

        sid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sidActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("First Name");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("Last Name");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setText("Level");

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setText("Department");

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setText("Phone Number");

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(48, 48, 48)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sid, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lev, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnum, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(pnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "First Name", "Last Name", "Level", "Department", "Telephone"
            }
        ) {
            @SuppressWarnings("rawtypes")
			Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
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
                        .addGap(19, 19, 19)
                        .addComponent(back)
                        .addGap(123, 123, 123)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    //Method of the Jtable
    @SuppressWarnings("unchecked")
	private void table_Update()
    {
        int c;
           try
                        {
                            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/school", "root", "");
                            insert = con.prepareStatement("select * from students");
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
                                    v2.add(rs.getString("first_Name"));
                                     v2.add(rs.getString("last_Name"));
                                      v2.add(rs.getString("level"));
                                       v2.add(rs.getString("department"));
                                        v2.add(rs.getString("phone_Number"));
                               }
                               
                               df.addRow(v2);
                           }                  
                        }catch(Exception e)
                        {
                            System.out.println(e.getMessage());
                        }
    }
    private void sidActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    //Button to add record
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         

                    String student_ID = sid.getText();
                    String first_Name = fname.getText();
                    String last_Name = lname.getText();
                    String level = lev.getText();
                    String department = dept.getText();
                    String phone_Number = pnum.getText();
                    
                        try
                        {
                            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/school", "root", "");
                            insert = con.prepareStatement("insert into students values(?, ?, ?, ?, ?, ?)");
                            insert.setString(1, student_ID);
                            insert.setString(2, first_Name);
                            insert.setString(3, last_Name);
                            insert.setString(4, level);
                            insert.setString(5, department);
                            insert.setString(6, phone_Number);
                            insert.executeUpdate();
                                                       
                              sid.setText("");
                              fname.setText("");
                              lname.setText("");
                              lev.setText("");
                              dept.setText("");
                              pnum.setText("");
                             
                                    JOptionPane.showMessageDialog(this, "Record Added Successfully");                           
                        }catch(Exception e)
                        {
                            System.out.println(e.getMessage());
                        }
    }                                        

    //Method to selected a row in the database
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
     
        DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
        int SelectedIndex = jTable1.getSelectedRow();
        
        sid.setText(df.getValueAt(SelectedIndex, 0) .toString());
        fname.setText(df.getValueAt(SelectedIndex, 1) .toString());
        lname.setText(df.getValueAt(SelectedIndex, 2) .toString());
        lev.setText(df.getValueAt(SelectedIndex, 3) .toString());
        dept.setText(df.getValueAt(SelectedIndex, 4) .toString());
        pnum.setText(df.getValueAt(SelectedIndex, 5) .toString());
    }                                    

    //Button to edit
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
           @SuppressWarnings("unused")
		DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
        @SuppressWarnings("unused")
		int SelectedIndex = jTable1.getSelectedRow();
        
              try
                        {
                                String student_ID = sid.getText();
                                String first_Name = fname.getText();
                                String last_Name = lname.getText();
                                String level = lev.getText();
                               String department = dept.getText();
                                String phone_Number = pnum.getText();
                    
                            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/school", "root", "");
                            insert = con.prepareStatement("update students set first_Name = ?, last_Name = ?, level = ?, department = ?, phone_Number = ?  where student_ID  = ? ");
                            insert.setString(1, first_Name);
                            insert.setString(2, last_Name);
                            insert.setString(3, level);
                            insert.setString(4, department);
                            insert.setString(5, phone_Number);
                            insert.setString(6, student_ID);
                            
                            insert.executeUpdate();
                                                       
                              sid.setText("");
                              fname.setText("");
                              lname.setText("");
                              lev.setText("");
                              dept.setText("");
                              pnum.setText("");
                             
                                    JOptionPane.showMessageDialog(this, "Record Updated Successfully");          
                                    table_Update();
                        }catch(Exception e)
                        {
                            System.out.println(e.getMessage());
                        }
    }                                        

    //delete button
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
     
          @SuppressWarnings("unused")
		DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
        @SuppressWarnings("unused")
		int SelectedIndex = jTable1.getSelectedRow();
        
              try
                        {
                            String student_ID = sid.getText();
                     
                            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to delete the record", "Warning", JOptionPane.YES_NO_OPTION);
                    
                            if(dialogResult == JOptionPane.YES_OPTION)
                            {
                                
                            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/school", "root", "");
                            insert = con.prepareStatement("delete from students where student_ID  = ? ");
                            insert.setString(1, student_ID);
                            
                            insert.executeUpdate();
                                                       
                              sid.setText("");
                              fname.setText("");
                              lname.setText("");
                              lev.setText("");
                              dept.setText("");
                              pnum.setText("");
                             
                                    JOptionPane.showMessageDialog(this, "Record Deleted Successfully");          
                                    table_Update();
                            }
                        }catch(Exception e)
                        {
                            System.out.println(e.getMessage());
                        }
    }                                        

    //Go back buttoon
    private void backActionPerformed(java.awt.event.ActionEvent evt) {                                     
       this.setVisible(false);
       new HomePage().setVisible(true);
    }                                    


    public static void main(String args[]) {
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton back;
    private javax.swing.JTextField dept;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lev;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField pnum;
    private javax.swing.JTextField sid;
    // End of variables declaration                   
}
