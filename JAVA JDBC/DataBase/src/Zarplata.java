
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PKS-15
 */
public class Zarplata extends javax.swing.JFrame {

    /**
     * Creates new form Zarplata
     */
    public Zarplata() {
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Добавить");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Введите год:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сеньтябрь", "Октябрь", "Ноябрь", "Декабрь" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Показать таблицу");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                .addGap(52, 52, 52))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    if ((jTextField1.getText().equals(""))){
        javax.swing.JOptionPane.showMessageDialog(null, "Вы не ввели год ");}
        else{
              try{
            String url = "jdbc:mysql://localhost/mydb?autoReconnect=true&useSSl = false";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,"root","123456");
            Statement stmt = conn.createStatement();
            String query = "insert into mydb.zarplata (idSotudniki, idZarplata, Mouth, Dolggnost, Oklad, Doplata, Zarplata)" + "value(?,?,?,?,?,?,?)";
            PreparedStatement preparedStat = conn.prepareStatement(query);
            DefaultTableModel d = (DefaultTableModel) jTable1.getModel();
            int comb = jComboBox1.getSelectedIndex() + 1;
            String g = jTextField1.getText() + "_" + comb;
            preparedStat.setInt(1, Integer.parseInt((String) d.getValueAt(jTable1.getSelectedRow(), 0)));
            preparedStat.setString(2, g);
            preparedStat.setString(3, (String)jComboBox1.getSelectedItem());
            preparedStat.setString(4, (String)d.getValueAt(jTable1.getSelectedRow(), 4));
            preparedStat.setDouble(5, Double.parseDouble((String) d.getValueAt(jTable1.getSelectedRow(), 5)));
            preparedStat.setDouble(6, Double.parseDouble((String) d.getValueAt(jTable1.getSelectedRow(), 6)));
            preparedStat.setDouble(7, Double.parseDouble((String) d.getValueAt(jTable1.getSelectedRow(), 5)) 
            + Double.parseDouble((String)d.getValueAt(jTable1.getSelectedRow(), 6)));
            preparedStat.execute();
            conn.close();
            }catch(Exception e){
            System.err.println(e.getMessage());
        }
             
              }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    String[] columnNamed = {"Номер", "Фамилия", "Имя", "Отчество","Должность", "Оклад","Доплата"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNamed);
        jTable1.setModel(model);
        try{
            String url = "jdbc:mysql://localhost/mydb?autoReconnect=true&useSSl = false";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,"root","123456");
            Statement stmt = conn.createStatement();
            ResultSet resSet = stmt.executeQuery("SELECT Sotrudniki.idSotrudniki,Sotrudniki.Familya,Sotrudniki.Imya,"
                    + "Sotrudniki.Otchestvo,Dolggnosti.Dolggnost,Dolggnosti.Oklad FROM mydb.Sotrudniki,mydb.Dolggnosti "
                    + "where sotrudniki.Dolggnosti_idDolggnosti = dolggnosti.idDolggnost");
            while(resSet.next()){
                model.addRow(new Object[]{
                    resSet.getString(1), resSet.getString(2), resSet.getString(3),
                    resSet.getString(4),resSet.getString(5),resSet.getString(6)
                });
            }
        conn.close();
        }catch(Exception e){
            System.err.println(e.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Zarplata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Zarplata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Zarplata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Zarplata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
  
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Zarplata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
