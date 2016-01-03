
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Andy
 */
public class Warp_Monitor_Launch extends javax.swing.JFrame {

    /**
     * Creates new form Warp_Monitor_Launch
     */
    public Warp_Monitor_Launch() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        serverlabel = new javax.swing.JLabel();
        portlabel = new javax.swing.JLabel();
        locationlabel = new javax.swing.JLabel();
        ip = new javax.swing.JTextField();
        port = new javax.swing.JTextField();
        location = new javax.swing.JTextField();
        left = new javax.swing.JRadioButton();
        front = new javax.swing.JRadioButton();
        right = new javax.swing.JRadioButton();
        top = new javax.swing.JRadioButton();
        back = new javax.swing.JRadioButton();
        connect = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        whichviewscreen = new javax.swing.JLabel();
        serverdetails = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Artemis Warp Monitor");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Xolonium", 1, 10)); // NOI18N

        serverlabel.setFont(new java.awt.Font("Xolonium", 1, 11)); // NOI18N
        serverlabel.setText("Server IP Address/Hostname");

        portlabel.setFont(new java.awt.Font("Xolonium", 1, 11)); // NOI18N
        portlabel.setText("Server Port (2010 default)");

        locationlabel.setFont(new java.awt.Font("Xolonium", 0, 11)); // NOI18N
        locationlabel.setText("Location of Video Files");

        ip.setToolTipText("In the form of an IP address or DNS name");
        ip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipActionPerformed(evt);
            }
        });

        port.setText("2010");

        location.setToolTipText("In the form of C:\\Folder\\Folder\\");
            location.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    locationActionPerformed(evt);
                }
            });

            buttonGroup1.add(left);
            left.setFont(new java.awt.Font("Xolonium", 1, 11)); // NOI18N
            left.setText("Left");
            left.setToolTipText("Left hand side view (when facing front viewscreen)");

            buttonGroup1.add(front);
            front.setFont(new java.awt.Font("Xolonium", 1, 11)); // NOI18N
            front.setSelected(true);
            front.setText("Front (default)");
            front.setToolTipText("Main Viewscreen");

            buttonGroup1.add(right);
            right.setFont(new java.awt.Font("Xolonium", 1, 11)); // NOI18N
            right.setText("Right");
            right.setToolTipText("Right hand side (When facing front viewscreen)");

            buttonGroup1.add(top);
            top.setFont(new java.awt.Font("Xolonium", 1, 11)); // NOI18N
            top.setText("Top");
            top.setToolTipText("Top viewscreen");

            buttonGroup1.add(back);
            back.setFont(new java.awt.Font("Xolonium", 1, 11)); // NOI18N
            back.setText("Back");
            back.setToolTipText("Rear facing viewscreen");
            back.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    backActionPerformed(evt);
                }
            });

            connect.setFont(new java.awt.Font("Xolonium", 1, 11)); // NOI18N
            connect.setText("Connect");
            connect.setToolTipText("Connect to Artemis Server");
            connect.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    connectMouseClicked(evt);
                }
            });
            connect.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    connectActionPerformed(evt);
                }
            });

            exit.setFont(new java.awt.Font("Xolonium", 1, 11)); // NOI18N
            exit.setText("Exit");
            exit.setToolTipText("Exit the Application");
            exit.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    exitMouseClicked(evt);
                }
            });

            whichviewscreen.setFont(new java.awt.Font("Xolonium", 1, 14)); // NOI18N
            whichviewscreen.setText("Which Viewscreen?");
            whichviewscreen.setToolTipText("");

            serverdetails.setFont(new java.awt.Font("Xolonium", 1, 14)); // NOI18N
            serverdetails.setText("Server details");

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(162, 162, 162)
                            .addComponent(whichviewscreen))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(61, 61, 61)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(serverlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(portlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(locationlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ip)
                                        .addComponent(port, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                        .addComponent(location)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(65, 65, 65)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(connect)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(exit))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(left)
                                            .addGap(34, 34, 34)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(back)
                                                .addComponent(front)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(top)
                                                    .addGap(29, 29, 29)
                                                    .addComponent(right))))))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(187, 187, 187)
                            .addComponent(serverdetails)))
                    .addContainerGap(59, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(serverdetails)
                    .addGap(27, 27, 27)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(serverlabel)
                        .addComponent(ip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(22, 22, 22)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(portlabel)
                        .addComponent(port, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(locationlabel)
                        .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(whichviewscreen)
                    .addGap(25, 25, 25)
                    .addComponent(front)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(top)
                        .addComponent(right)
                        .addComponent(left))
                    .addGap(16, 16, 16)
                    .addComponent(back)
                    .addGap(27, 27, 27)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(connect)
                        .addComponent(exit))
                    .addContainerGap(33, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void connectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_connectActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void locationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationActionPerformed

    private void ipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ipActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
       {
        //Put JFrame close code here
            dispose ();
            System.exit (0);
        }
    }//GEN-LAST:event_exitMouseClicked

    private void connectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_connectMouseClicked

        try {
            String host = (ip.getText());
            int connectport = (Integer.parseInt(port.getText()));
            String videos = (location.getText());
            
            new Artemis_Warp_Monitor(host,connectport);
        } catch (IOException ex) {
            Logger.getLogger(Warp_Monitor_Launch.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_connectMouseClicked

    
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
            java.util.logging.Logger.getLogger(Warp_Monitor_Launch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Warp_Monitor_Launch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Warp_Monitor_Launch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Warp_Monitor_Launch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Warp_Monitor_Launch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton connect;
    private javax.swing.JButton exit;
    private javax.swing.JRadioButton front;
    private javax.swing.JTextField ip;
    private javax.swing.JRadioButton left;
    private javax.swing.JTextField location;
    private javax.swing.JLabel locationlabel;
    private javax.swing.JTextField port;
    private javax.swing.JLabel portlabel;
    private javax.swing.JRadioButton right;
    private javax.swing.JLabel serverdetails;
    private javax.swing.JLabel serverlabel;
    private javax.swing.JRadioButton top;
    private javax.swing.JLabel whichviewscreen;
    // End of variables declaration//GEN-END:variables

    private String String(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
