/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CUSTOMER_BUY.java
 *
 * Created on 4 Aug, 2018, 10:30:27 PM
 */

/**
 *
 * @author Manoharan
 */
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.GroupLayout;
import java.io.FilenameFilter;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class CUSTOMER_BUY extends javax.swing.JFrame {

    /** Creates new form CUSTOMER_BUY */
    public CUSTOMER_BUY() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Abhishek's DRUG Emporium");

        jPanel1.setBackground(new java.awt.Color(-16711681,true));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 36));
        jLabel1.setText("SELECT THE DRUG FROM THE CATALOGUE : ");

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 24));
        jLabel3.setText("DRUG CATALOGUE : ");

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 36));
        jLabel4.setText("PRICE : ");

        jTextField2.setEditable(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 24));
        jLabel5.setText("QUANTITY : ");

        jSpinner1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSpinner1MouseClicked(evt);
            }
        });

        jButton2.setText("ADD TO CART");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("GO BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 48));
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(-16777216,true)));

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 24));
        jLabel7.setText("MEDICINE NAME : ");

        jButton4.setText("UPLOAD PRESCRIPTION");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setText("NO FILE CHOSEN");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MEDID", "NAME", "FUNCTION", "COMPOSITION", "PRICE", "MFD", "EXP", "MANUFACTURER", "DOSE", "SCHEDULEDHDRUG"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 48));
        jLabel2.setText("BUY MEDICINES");

        jButton5.setText("CART");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 24));
        jLabel8.setText("FOR SCHEDULED-H DRUGS : ");

        jTextField1.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1523, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 453, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(30, 30, 30)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 525, Short.MAX_VALUE)
                                .addComponent(jButton5)
                                .addGap(64, 64, 64)
                                .addComponent(jButton3)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(18, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2)
                        .addComponent(jButton3)
                        .addComponent(jButton5)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        CUSTOMER_HOME C=new CUSTOMER_HOME();
        C.jLabel7.setText(jLabel6.getText());
        C.jLabel7.setHorizontalAlignment(SwingConstants.CENTER);
        C.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
    int returnValue = fileChooser.showOpenDialog(null);
    if (returnValue == JFileChooser.APPROVE_OPTION)
    {
    File selectedFile = fileChooser.getSelectedFile();
    jTextField3.setText(selectedFile.getName());
 
    }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
     
       
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         int b=jTable1.getSelectedRow();
        String value=jTable1.getModel().getValueAt(b,4).toString();
        double v=Double.parseDouble(value);
        String name=jTable1.getModel().getValueAt(b,1).toString();
        jTextField1.setText(name);
         int s=Integer.parseInt(jSpinner1.getValue().toString());
         double price=v*s;
         jTextField2.setText(price+"");
    }//GEN-LAST:event_jTable1MouseClicked

    private void jSpinner1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSpinner1MouseClicked
        // TODO add your handling code here:
        int b=jTable1.getSelectedRow();
        String value=jTable1.getModel().getValueAt(b,4).toString();
        double v=Double.parseDouble(value);
       
         int s=Integer.parseInt(jSpinner1.getValue().toString());
         double price=v*s;
         jTextField2.setText(price+"");
    }//GEN-LAST:event_jSpinner1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
       try{
        Class.forName("java.sql.DriverManager");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ipproject","root","muruga123");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("SELECT * FROM CART");
        CUSTOMER_CART C=new CUSTOMER_CART();
        C.jLabel6.setText(jLabel6.getText());
         C.jLabel6.setHorizontalAlignment(SwingConstants.CENTER);
        while(rs.next()){
                String a=rs.getString("SNO");
                String b=rs.getString("MEDNAME");

                String d=rs.getString("MEDCOMP");
                String e=rs.getString("MEDPRICE");
                String f=rs.getString("MEDMFD");
                String g=rs.getString("MEDEXP");
                String h=rs.getString("MEDMANF");
                String i=rs.getString("MEDDOSE");
                String j=rs.getString("SCHEDULEDHDRUG");
                String k=rs.getString("QUANTITY");
                String l=rs.getString("TOTAL");
           DefaultTableModel n=(DefaultTableModel)C.jTable1.getModel();
           n.addRow(new Object[] {a,b,d,e,f,g,h,i,j,k,l} );
           }
         int i=0;
         double sum=0;
         int a=C.jTable1.getRowCount();
         while(i<a){
         double m=Double.parseDouble(C.jTable1.getValueAt(i,10).toString());
         sum=sum+m;
         i++;
           }
         C.jTextField1.setText(sum+"");
         C.setVisible(true);
        this.setVisible(false);
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null,e.getMessage());
         }
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
        Class.forName("java.sql.DriverManager");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ipproject","root","muruga123");
        Statement st=con.createStatement();
        Statement st1=con.createStatement();
        int s=1;
        ResultSet rs=st1.executeQuery("SELECT * FROM CART");
        if(rs.next()){
            rs.last();
            String st2=rs.getString("SNO");
            if( st2 == null) s=1;
            else s = Integer.parseInt(st2)+1;}
        int b=jTable1.getSelectedRow();
        int c=Integer.parseInt(jSpinner1.getValue().toString());
        double d=Double.parseDouble(jTextField2.getText());
        String s2=jTable1.getValueAt(b,1).toString();
        String s4=jTable1.getValueAt(b,3).toString();
        String s5=jTable1.getValueAt(b,4).toString();
        String s6=jTable1.getValueAt(b,5).toString();
        String s7=jTable1.getValueAt(b,6).toString();
        String s8=jTable1.getValueAt(b,7).toString();
        String s9=jTable1.getValueAt(b,8).toString();
        String s10=jTable1.getValueAt(b,9).toString();
        String s11=jTable1.getValueAt(b, 0).toString();

        boolean bo=true;
        Statement st2=con.createStatement();
        ResultSet rs1=st2.executeQuery("SELECT STOCK FROM MEDICINES WHERE MEDID="+s11);
        if(rs1.next()){
            if(rs1.getString("STOCK").equalsIgnoreCase("0")){
                JOptionPane.showMessageDialog(null,"OUT OF STOCK !");
                bo=false;
            }
        }
        if(bo==true){
        if((!jTextField3.getText().equalsIgnoreCase("NO FILE CHOSEN")) && (!jTextField3.getText().isEmpty()) && s10.equalsIgnoreCase("YES")){
        int n=st.executeUpdate("INSERT INTO CART VALUES("+s+",'"+s2+"','"+s4+"',"+Double.parseDouble(s5)+",'"+s6+"','"+s7+"','"+s8+"','"+s9+"','"+s10+"',"+c+","+d+")");
        if(n==1) JOptionPane.showMessageDialog(null,"Item added successfully");
        else JOptionPane.showMessageDialog(null,"Error");}
 else if((jTextField3.getText().isEmpty() || jTextField3.getText().equalsIgnoreCase("NO FILE CHOSEN")) && s10.equalsIgnoreCase("YES"))
        JOptionPane.showMessageDialog(null,"Upload valid prescription");
        else if(s10.equalsIgnoreCase("NO")){
            int n=st.executeUpdate("INSERT INTO CART VALUES("+s+",'"+s2+"','"+s4+"',"+Double.parseDouble(s5)+",'"+s6+"','"+s7+"','"+s8+"','"+s9+"','"+s10+"',"+c+","+d+",'"+jLabel6.getText()+"')");
        if(n==1) JOptionPane.showMessageDialog(null,"Item added successfully");
        else JOptionPane.showMessageDialog(null,"Error");
        }
 else JOptionPane.showMessageDialog(null,"Invalid Input");
        }
 else JOptionPane.showMessageDialog(null,"OUT OF STOCK!!!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CUSTOMER_BUY().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

}