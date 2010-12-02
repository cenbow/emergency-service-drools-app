/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AmbulancePanel.java
 *
 * Created on Nov 24, 2010, 4:17:24 PM
 */

package com.wordpress.salaboy.ui;

import com.wordpress.salaboy.MyDroolsService;
import com.wordpress.salaboy.util.MedicalKitUtil;
import java.awt.Color;
import java.awt.Dimension;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import org.plugtree.training.model.Ambulance;
import org.plugtree.training.model.MedicalKit;

/**
 *
 * @author esteban
 */
public class AmbulancePanel extends javax.swing.JPanel {

    private UserUI parent;
    
    /** Creates new form AmbulancePanel */
    public AmbulancePanel(UserUI parent) {
        this.parent = parent;
        initComponents();
        
        lblMedBone.setVisible(false);
        lblMedFire.setVisible(false);
        lblMedHeart.setVisible(false);
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sendAmbulancejButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ambulancejList = new javax.swing.JList();
        jLabel6 = new javax.swing.JLabel();
        medicalKitsJInternalFrame = new javax.swing.JInternalFrame();
        lblMedHeart = new javax.swing.JLabel();
        lblMedFire = new javax.swing.JLabel();
        lblMedBone = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        doctorsjList = new javax.swing.JList();
        jLabel7 = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();

        setName("Ambulances"); // NOI18N

        sendAmbulancejButton.setText("Send Ambulance");
        sendAmbulancejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendAmbulancejButtonActionPerformed(evt);
            }
        });

        ambulancejList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Ambulance S00001", "Ambulance S00002", "Ambulance S00003", "Ambulance S00004" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        ambulancejList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ambulancejListselectedAmbulance(evt);
            }
        });
        jScrollPane2.setViewportView(ambulancejList);

        jLabel6.setText("Available Ambulances");

        medicalKitsJInternalFrame.setTitle("Medical Kits");
        medicalKitsJInternalFrame.setVisible(true);

        lblMedHeart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/png/eletrochock.png"))); // NOI18N

        lblMedFire.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/png/crema.png"))); // NOI18N

        lblMedBone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/png/cuello.png"))); // NOI18N

        javax.swing.GroupLayout medicalKitsJInternalFrameLayout = new javax.swing.GroupLayout(medicalKitsJInternalFrame.getContentPane());
        medicalKitsJInternalFrame.getContentPane().setLayout(medicalKitsJInternalFrameLayout);
        medicalKitsJInternalFrameLayout.setHorizontalGroup(
            medicalKitsJInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medicalKitsJInternalFrameLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblMedFire)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMedHeart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMedBone)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        medicalKitsJInternalFrameLayout.setVerticalGroup(
            medicalKitsJInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medicalKitsJInternalFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(medicalKitsJInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMedBone)
                    .addComponent(lblMedHeart)
                    .addComponent(lblMedFire))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        doctorsjList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Doctor D0001", "Doctor D0002" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(doctorsjList);

        jLabel7.setText("Available Doctors");

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sendAmbulancejButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                            .addComponent(medicalKitsJInternalFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(refreshButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(refreshButton)
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(medicalKitsJInternalFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(sendAmbulancejButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sendAmbulancejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendAmbulancejButtonActionPerformed
        try {
            parent.sendAmbulance();
        } catch (IOException ex) {
            Logger.getLogger(AmbulancePanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AmbulancePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sendAmbulancejButtonActionPerformed

    private void ambulancejListselectedAmbulance(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ambulancejListselectedAmbulance
        // TODO add your handling code here:
        //From the list of selected ambulance show the ambulance details
    }//GEN-LAST:event_ambulancejListselectedAmbulance

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        //parent.updateUIMap();
}//GEN-LAST:event_refreshButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList ambulancejList;
    private javax.swing.JList doctorsjList;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblMedBone;
    private javax.swing.JLabel lblMedFire;
    private javax.swing.JLabel lblMedHeart;
    private javax.swing.JInternalFrame medicalKitsJInternalFrame;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton sendAmbulancejButton;
    // End of variables declaration//GEN-END:variables

    void configurePanel(String taskinfo) {
        String[] values= taskinfo.split(",");
        String doctorId = values[0].trim(); 
        String ambulanceId = values[1].trim(); 
        String patientName = values[2].trim(); 
        String patientAge = values[3].trim(); 
        String patientGender = values[4].trim(); 
        String emergencyLocation = values[5].trim(); 
        String emergencyType = values[6].trim(); 
        
        this.ambulancejList.setSelectedIndex(Integer.parseInt(ambulanceId));
        this.doctorsjList.setSelectedIndex(Integer.parseInt(doctorId));
        
        this.lblMedBone.setVisible(false);
        this.lblMedFire.setVisible(false);
        this.lblMedHeart.setVisible(false);
        
        Ambulance ambulance = MyDroolsService.getAmbulanceById(Long.parseLong(ambulanceId));
        List<MedicalKit> kits = ambulance.getKits();
        
        for (MedicalKit medicalKit : kits) {
            switch (medicalKit.getType()){
                case BONES:
                    this.lblMedBone.setVisible(true);
                    break;
                case BURNS:
                    this.lblMedFire.setVisible(true);
                    break;
                case REANIMATION:
                    this.lblMedHeart.setVisible(true);
                    break;
                    
            }
        }
        
        this.medicalKitsJInternalFrame.validate();
        
    }
    
}
