/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AFTER_PAYMENT.java
 *
 * Created on 6 Nov, 2018, 3:44:44 PM
 */

/**
 *
 * @author Manoharan
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
public class AFTER_PAYMENT extends javax.swing.JFrame {

    /** Creates new form AFTER_PAYMENT */
    public AFTER_PAYMENT() {
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
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(-1,true));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 48));
        jLabel1.setText("IT WILL REACH YOU SOON.");

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 48));
        jLabel2.setText("YOUR ORDER HAS BEEN PLACED !");

        jButton1.setBackground(new java.awt.Color(-65536,true));
        jButton1.setFont(new java.awt.Font("Monospaced", 1, 48));
        jButton1.setText("HOME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(-16776961,true));
        jButton2.setFont(new java.awt.Font("Monospaced", 1, 48));
        jButton2.setForeground(new java.awt.Color(-1,true));
        jButton2.setText("NEW ORDER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORDER_ID", "CUSTOMER NAME", "ORDER PRICE", "DATE OF PLACEMENT", "DELIVERY DATE", "NO.OF ITEMS"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton3.setBackground(new java.awt.Color(-256,true));
        jButton3.setFont(new java.awt.Font("Monospaced", 1, 48));
        jButton3.setText("MY ORDERS");
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
                .addGap(49, 49, 49)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(65, 65, 65)
                .addComponent(jButton2)
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(192, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(114, 114, 114))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 949, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(47, 47, 47))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel m=(DefaultTableModel)jTable1.getModel();
        String n=m.getValueAt(0,1).toString();
        CUSTOMER_HOME M=new CUSTOMER_HOME();
        M.jLabel7.setText(n);
        M.jLabel7.setHorizontalAlignment(SwingConstants.CENTER);
        M.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel m=(DefaultTableModel)jTable1.getModel();
        String n=m.getValueAt(0,1).toString();
        CUSTOMER_BUY M=new CUSTOMER_BUY();
        M.jLabel6.setText(n);
        M.jLabel6.setHorizontalAlignment(SwingConstants.CENTER);
        M.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel m=(DefaultTableModel)jTable1.getModel();
        String a=m.getValueAt(0,1).toString();
        CUSTOMER_ORDER_HISTORY M=new CUSTOMER_ORDER_HISTORY();
        M.jLabel4.setText(a);
        M.jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        DefaultTableModel n=(DefaultTableModel)M.jTable2.getModel();
        try{
            Class.forName("java.sql.DriverManager");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ipproject","root","muruga123");
            Statement st=con.createStatement();
            DefaultTableModel o=(DefaultTableModel) jTable1.getModel();
            String s=o.getValueAt(0,1).toString();
            ResultSet rs=st.executeQuery("SELECT * FROM ORDERS WHERE CUSNAME='"+s+"'");
            while(rs.next()){
                String st1=rs.getString("ORDERID");
                String st2=rs.getString("CUSNAME");
                String st3=rs.getString("ORDERPRICE");
                String st4=rs.getString("PLACEDATE");
                String st5=rs.getString("DELIVERYDATE");
                String st6=rs.getString("NOOFITEMS");
               

                n.addRow(new Object[] {st1,st2,st3,st4,st5,st6});

            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        M.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AFTER_PAYMENT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
