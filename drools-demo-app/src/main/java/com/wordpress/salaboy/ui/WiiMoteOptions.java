/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * WiiMoteOptions.java
 *
 * Created on Dec 6, 2010, 7:47:32 AM
 */

package com.wordpress.salaboy.ui;

import com.intel.bluetooth.BlueCoveConfigProperties;
import com.wordpress.salaboy.EmergencyService;
import com.wordpress.salaboy.events.PatientVitalSignNotifierEvent;
import com.wordpress.salaboy.events.wiimote.SimpleMoteFinder;
import com.wordpress.salaboy.events.wiimote.WiiMoteEvent;
import motej.Mote;
import motej.event.AccelerometerEvent;
import motej.event.AccelerometerListener;
import motej.event.MoteDisconnectedEvent;
import motej.event.MoteDisconnectedListener;
import motej.request.ReportModeRequest;

/**
 *
 * @author salaboy
 */
public class WiiMoteOptions extends javax.swing.JFrame {
    private Mote mote = null;
    private CityMapUI game = null;
    /** Creates new form WiiMoteOptions */
    public WiiMoteOptions(CityMapUI game) {
        initComponents();
        this.game = game;
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("Lookup WiiMote");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("Messages");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(68, 68, 68)
                        .add(jButton1))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(13, 13, 13)
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jButton1)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        initWiiMote();
    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    private void initWiiMote() {
        System.setProperty(BlueCoveConfigProperties.PROPERTY_JSR_82_PSM_MINIMUM_OFF, "true");
        SimpleMoteFinder simpleMoteFinder = new SimpleMoteFinder();
        mote = simpleMoteFinder.findMote();
        if(mote == null){
            jTextArea1.insert("Wii mote not found! ", 0);
            
        }
        else{
            jTextArea1.insert("Wii mote found! ", 0);
        }
        AccelerometerListener<Mote> listener = new AccelerometerListener<Mote>()   {

            @Override
            public void accelerometerChanged(AccelerometerEvent<Mote> evt) {
                
                if (evt.getY() > 225) {
                    jTextArea1.insert("sended " + evt.getY() + " heartbeat\n", 0);
                    if(AmbulanceMonitorService.getInstance().isRunning()){
                        // add the ambulanceId
                        EmergencyService.getInstance().getMapEventsNotifier().notifyMapEventsListeners(MapEventsNotifier.EventType.HEART_BEAT_RECEIVED, new PatientVitalSignNotifierEvent(new WiiMoteEvent(evt,"acc"), 0L));
                        //AmbulanceMonitorService.getInstance().sendNotification(y, y, y);
                    }
                    
                    
                }
            }
            
            
        };
        MoteDisconnectedListener<Mote> disconnectedListener = new MoteDisconnectedListener<Mote>(){

            @Override
            public void moteDisconnected(MoteDisconnectedEvent<Mote> mde) {
                jTextArea1.insert("Wii MOTE DISCONECTED!!!!\n", 0);
            }
        
            
        };
        
        mote.setReportMode(ReportModeRequest.DATA_REPORT_0x31);
        mote.addMoteDisconnectedListener(disconnectedListener);
        mote.addAccelerometerListener(listener);
        

    }
}
