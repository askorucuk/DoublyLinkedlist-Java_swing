
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Puv0
 */
public class AddPeople extends javax.swing.JFrame {
    Boolean warning = false ;
    Bilgi newBilgi = new Bilgi() ; 
        Date date1 = new Date() ; 
        /**
     * Creates new form AddPeople
     */
    public AddPeople() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        datee = new javax.swing.JTextField();
        team = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        infoArea = new javax.swing.JTextArea();
        showingButton = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTextPane1);

        setTitle("Adding Sportsman");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Name and Surname:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Date:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Team: (You can add more team like: FB, GS)");

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        datee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateeActionPerformed(evt);
            }
        });

        team.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        team.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamActionPerformed(evt);
            }
        });

        save.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.jpg"))); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        jScrollPane2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jScrollPane2ComponentHidden(evt);
            }
        });

        infoArea.setColumns(20);
        infoArea.setRows(5);
        jScrollPane2.setViewportView(infoArea);

        showingButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        showingButton.setText("Show List");
        showingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showingButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(save))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(team, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(name)
                            .addComponent(datee, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(showingButton))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(datee, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(team, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(save)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showingButton))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        
        newBilgi.setAdSoyad(name.getText());
    }//GEN-LAST:event_nameActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        
        nameActionPerformed(evt);
        dateeActionPerformed(evt);
        teamActionPerformed(evt);
        if(warning ==true){
            newBilgi = new Bilgi() ; 
        }else{
        GuiMain.list.addOrder(newBilgi);
        infoArea.setText(newBilgi.toString());
        newBilgi = new Bilgi() ; 
        }
    }//GEN-LAST:event_saveActionPerformed

    private void jScrollPane2ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jScrollPane2ComponentHidden
    }//GEN-LAST:event_jScrollPane2ComponentHidden

    private void showingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showingButtonActionPerformed
        new ShowList().setVisible(true);
        
    }//GEN-LAST:event_showingButtonActionPerformed

    private void dateeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateeActionPerformed
        String date = datee.getText() ;
        if(!date.contains("/") ){
            warning = true ;
        }else{
            String[] split = date.split("/");
            date1.setDay(Integer.parseInt(split[0]));
            date1.setMonth(Integer.parseInt(split[1]));
            date1.setYear(Integer.parseInt(split[2]));
            newBilgi.setBirtDate(date1); 
            warning = false ;
        }
        if(warning == true){
          int res = JOptionPane.showOptionDialog(null, "Your Date is Wrong!!!", "Date Failed", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null) ;
        }
    }//GEN-LAST:event_dateeActionPerformed

    private void teamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamActionPerformed
        String teaam = team.getText();
            String[] split = teaam.split(",");
            ArrayList<String> array = new ArrayList<>() ;
            for(String i : split){
                array.add(i);
            }
            newBilgi.setTakımList(array);
    }//GEN-LAST:event_teamActionPerformed

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
            java.util.logging.Logger.getLogger(AddPeople.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPeople.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPeople.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPeople.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
          
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPeople().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField datee;
    private javax.swing.JTextArea infoArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField name;
    private javax.swing.JButton save;
    private javax.swing.JButton showingButton;
    private javax.swing.JTextField team;
    // End of variables declaration//GEN-END:variables
}
