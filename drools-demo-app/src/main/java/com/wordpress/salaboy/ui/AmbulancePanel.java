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
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.plugtree.training.model.Ambulance;
import org.plugtree.training.model.MedicalKit;

/**
 *
 * @author esteban
 */
public class AmbulancePanel extends javax.swing.JPanel {

    private AmbulanceControlPanel parent;
    
    /** Creates new form AmbulancePanel */
    public AmbulancePanel(AmbulanceControlPanel parent) {
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setName("Ambulances"); // NOI18N
        setPreferredSize(new java.awt.Dimension(300, 480));

        sendAmbulancejButton.setText("Send Ambulance");
        sendAmbulancejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendAmbulancejButtonActionPerformed(evt);
            }
        });

        ambulancejList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Ambulance01: Fire Ambulance", "Ambulance02: Car Crash & Fire Ambulance", "Ambulance03: Heart Attack Ambulance", "Ambulance04: Generic Ambulance" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        ambulancejList.setPreferredSize(new java.awt.Dimension(220, 50));
        ambulancejList.setVisibleRowCount(6);
        ambulancejList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ambulancejListselectedAmbulance(evt);
            }
        });
        jScrollPane2.setViewportView(ambulancejList);

        jLabel6.setText("Available Ambulances");

        medicalKitsJInternalFrame.setTitle("Medical Kits");
        medicalKitsJInternalFrame.setPreferredSize(new java.awt.Dimension(220, 150));
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
                .addContainerGap(62, Short.MAX_VALUE))
        );
        medicalKitsJInternalFrameLayout.setVerticalGroup(
            medicalKitsJInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medicalKitsJInternalFrameLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(medicalKitsJInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMedFire, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, medicalKitsJInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblMedBone)
                        .addComponent(lblMedHeart)))
                .addContainerGap())
        );

        jScrollPane3.setPreferredSize(new java.awt.Dimension(300, 480));

        doctorsjList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Doctor01: Burns Specialist ", "Doctor02: Bones Specialist", "Doctor03: Reanimation Specialist" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        doctorsjList.setPreferredSize(new java.awt.Dimension(220, 80));
        doctorsjList.setVisibleRowCount(4);
        jScrollPane3.setViewportView(doctorsjList);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18));
        jLabel1.setForeground(new java.awt.Color(51, 153, 0));
        jLabel1.setText("User: Control Operator");

        jLabel7.setText("Available Doctors");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jScrollPane3, 0, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sendAmbulancejButton)
                .addContainerGap(159, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(56, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(138, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(medicalKitsJInternalFrame, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                        .addGap(3, 3, 3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(167, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(medicalKitsJInternalFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sendAmbulancejButton)
                .addContainerGap(53, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sendAmbulancejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendAmbulancejButtonActionPerformed
        try {
            this.parent.sendAmbulance();
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList ambulancejList;
    private javax.swing.JList doctorsjList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblMedBone;
    private javax.swing.JLabel lblMedFire;
    private javax.swing.JLabel lblMedHeart;
    private javax.swing.JInternalFrame medicalKitsJInternalFrame;
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
