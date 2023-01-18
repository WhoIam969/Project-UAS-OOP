/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package my_package;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class MyFirstFrom extends javax.swing.JFrame {
    private final DataPlainText dataPlainText;
    private final Customer customer;
    private final ArrayList<Product> menu;
    private Integer totalBayarTemp;
    
    private final String steakPrice = "75000";
    private final String spaghettiPrice = "55000";
    private final String pizzaPrice = "65000";
    
     /**
     * Creates new form MyFirstFrom
     */
    public MyFirstFrom() {
        initComponents();
        customer = new Customer();
        menu = new ArrayList<>();
        totalBayarTemp = 0;
        initDaftarMakanan();
        dataPlainText = new DataPlainText();
    }

    public void initDaftarMakanan(){
        menu.add(new Product(CB_steak.getText(), steakPrice, CB_steak.isSelected()));
        menu.add(new Product(CB_spaghetti.getText(), spaghettiPrice, CB_spaghetti.isSelected()));
        menu.add(new Product(CB_pizza.getText(), pizzaPrice, CB_pizza.isSelected()));
    }
    
    public void selectedMenu(String name, Boolean isSelected){
        for(Product product : menu){
            if(product.getNamaProduk().equals(name)){
                product.setIsOrder(isSelected);
                Integer productPrice = Integer.valueOf(product.getHarga());
                if(product.isOrder()){
                    this.totalBayarTemp += productPrice;
                }
                else{
                    this.totalBayarTemp -= productPrice;
                }
            }
        }
    }
    
    public String order(){
        String orderList = "";
        for(Product product : menu){
            if(product.isOrder()){
                orderList += "\n    "
                        + product.getNamaProduk() + " : "
                        + product.getHarga();
            }
        }
        return orderList;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        title = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Field_Nama = new javax.swing.JTextField();
        Field_Alamat = new javax.swing.JTextField();
        Field_No = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        CB_steak = new javax.swing.JCheckBox();
        CB_spaghetti = new javax.swing.JCheckBox();
        CB_pizza = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Field_Total = new javax.swing.JTextArea();
        BTN_tambah = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Field_Data = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        BTN_clear = new javax.swing.JButton();
        saveData = new javax.swing.JButton();
        LoadDataPlain = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        title.setText("APLIKASI PEMESANAN");
        title.setToolTipText("");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Customer"));

        jLabel2.setText("Nama :");

        jLabel3.setText("Alamat :");

        jLabel4.setText("No. Telp :");
        jLabel4.setToolTipText("");

        Field_Nama.setToolTipText("");
        Field_Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field_NamaActionPerformed(evt);
            }
        });

        Field_Alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field_AlamatActionPerformed(evt);
            }
        });

        Field_No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field_NoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27)
                        .addComponent(Field_Nama, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Field_No)
                            .addComponent(Field_Alamat))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Field_Nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Field_Alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(Field_No, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Pilih Menu"));

        CB_steak.setText("Steak");
        CB_steak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_steakActionPerformed(evt);
            }
        });

        CB_spaghetti.setText("Spaghetti");
        CB_spaghetti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_spaghettiActionPerformed(evt);
            }
        });

        CB_pizza.setText("Pizza");
        CB_pizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_pizzaActionPerformed(evt);
            }
        });

        jLabel1.setText("Rp75.000");

        jLabel5.setText("Rp55.000");

        jLabel7.setText("Rp65.000");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CB_steak)
                    .addComponent(CB_spaghetti)
                    .addComponent(CB_pizza))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addGap(0, 27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CB_steak)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CB_spaghetti)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CB_pizza)
                    .addComponent(jLabel7))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, 144));

        jLabel6.setText("TOTAL BAYAR");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, -1));

        Field_Total.setEditable(false);
        Field_Total.setBackground(new java.awt.Color(0, 0, 0));
        Field_Total.setColumns(20);
        Field_Total.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        Field_Total.setForeground(new java.awt.Color(255, 255, 0));
        Field_Total.setLineWrap(true);
        Field_Total.setRows(1);
        Field_Total.setText("Rp. 0");
        Field_Total.setAutoscrolls(false);
        jScrollPane1.setViewportView(Field_Total);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 208, -1));

        BTN_tambah.setText("Tambah");
        BTN_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_tambahActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, -1, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel5.setToolTipText("Data Penjualan");

        Field_Data.setColumns(20);
        Field_Data.setRows(5);
        jScrollPane3.setViewportView(Field_Data);

        jLabel8.setText("Data Penjualan");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(471, 471, 471))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, -1, -1));

        BTN_clear.setText("Hapus");
        BTN_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_clearActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 69, -1));

        saveData.setText("Simpan Text");
        saveData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveDataActionPerformed(evt);
            }
        });
        getContentPane().add(saveData, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, -1, -1));

        LoadDataPlain.setText("Load Data Pesanan");
        LoadDataPlain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadDataPlainActionPerformed(evt);
            }
        });
        getContentPane().add(LoadDataPlain, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 580, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Field_NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field_NamaActionPerformed
        Field_Nama.getText();
    }//GEN-LAST:event_Field_NamaActionPerformed

    private void Field_AlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field_AlamatActionPerformed
        Field_Alamat.getText();
    }//GEN-LAST:event_Field_AlamatActionPerformed

    private void Field_NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field_NoActionPerformed
        Field_No.getText();
    }//GEN-LAST:event_Field_NoActionPerformed

    private void CB_steakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_steakActionPerformed
        selectedMenu(CB_steak.getText(), CB_steak.isSelected());
        Field_Total.setText("Rp. " + totalBayarTemp.toString());
    }//GEN-LAST:event_CB_steakActionPerformed

    private void CB_spaghettiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_spaghettiActionPerformed
        selectedMenu(CB_spaghetti.getText(), CB_spaghetti.isSelected());
        Field_Total.setText("Rp. " + totalBayarTemp.toString());
    }//GEN-LAST:event_CB_spaghettiActionPerformed

    private void CB_pizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_pizzaActionPerformed
        selectedMenu(CB_pizza.getText(), CB_pizza.isSelected());
        Field_Total.setText("Rp. " + totalBayarTemp.toString());
    }//GEN-LAST:event_CB_pizzaActionPerformed

    
    public String dataOrder(){
        String order = "\n " + customer 
                + "\n    ---------------------------------------------------------- \n    Pesanan : "
                + order()
                + "\n    ---------------------------------------------------------- \n    Total Bayar   : "
                + "Rp" + totalBayarTemp + "\n";
        return order;
    }

    private void BTN_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_tambahActionPerformed
        customer.setNamaCustomer(Field_Nama.getText());
        customer.setAlamat(Field_Alamat.getText());
        if(!customer.isEmpty()){
            try {
                customer.setNoTelepon(Integer.parseInt(Field_No.getText()));
                if(!CB_pizza.isSelected() && !CB_spaghetti.isSelected() && !CB_steak.isSelected()){
                    JOptionPane.showMessageDialog(null, "Pilih Menu Makanan!");
                }  else {
                    dataPlainText.setDataOrderTemp(dataPlainText.getDataOrderTemp() + dataOrder());
                    Field_Data.setText(dataPlainText.getDataOrderTemp());                                  
                }
            } catch(NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Harap Masukkan Angka Pada Kolom No Telepon");
            }
        } else{
            JOptionPane.showMessageDialog(null, "Harap Isi Data Pemesan!");
        }
    }//GEN-LAST:event_BTN_tambahActionPerformed

    private void BTN_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_clearActionPerformed
        Field_Data.setText("");
        dataPlainText.setDataOrderTemp("");
    }//GEN-LAST:event_BTN_clearActionPerformed

    private void saveDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveDataActionPerformed
        String message;
        if(dataPlainText.getDataOrderTemp().length() != 0){
            dataPlainText.updateDataPesanan();
            message = "Data Tersimpan!";
        } else{
            if(Field_Data.getText().equals("")){
                message = "Data order kosong!";
            } else{
                message = "Silahkan pilih button clear terlebih dahulu!";
            }
        }
        JOptionPane.showMessageDialog(null, message);
    }//GEN-LAST:event_saveDataActionPerformed

    private void LoadDataPlainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadDataPlainActionPerformed
        String message;
        dataPlainText.loadDataPesanan();
        if(dataPlainText.getDataOrderTemp().equals("")){
            message = "Belum ada data pada file!";
            JOptionPane.showMessageDialog(null, message);
        } else {
            Field_Data.setText(dataPlainText.getDataOrderTemp());
            dataPlainText.setDataOrderTemp("");
        }
    }//GEN-LAST:event_LoadDataPlainActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(MyFirstFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyFirstFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyFirstFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyFirstFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyFirstFrom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_clear;
    private javax.swing.JButton BTN_tambah;
    private javax.swing.JCheckBox CB_pizza;
    private javax.swing.JCheckBox CB_spaghetti;
    private javax.swing.JCheckBox CB_steak;
    private javax.swing.JTextField Field_Alamat;
    private javax.swing.JTextArea Field_Data;
    private javax.swing.JTextField Field_Nama;
    private javax.swing.JTextField Field_No;
    private javax.swing.JTextArea Field_Total;
    private javax.swing.JButton LoadDataPlain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton saveData;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}