/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * WindowEventDemo.java
 *
 * Created on Apr 25, 2018, 5:33:17 PM
 */
package centrolControl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import org.micromanager.MMStudio;
import org.micromanager.utils.MMException;
import org.micromanager.utils.MMScriptException;
import org.micromanager.api.PositionList;

/**
 *
 * @author Nikon
 */
public class WindowEventDemo extends javax.swing.JFrame {

    //Fluidic Control
    Fluidic experiment;
    MMStudio gui_;

    /** Creates new form WindowEventDemo */
    public WindowEventDemo() {
        experiment = new Fluidic();
        gui_ = new MMStudio(false);
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

        btnWash = new javax.swing.JButton();
        btnInjectBuffer = new javax.swing.JButton();
        btnCyc0 = new javax.swing.JButton();
        btnInvokeMM = new javax.swing.JButton();
        btnSequencing = new javax.swing.JButton();
        btnContinueCyc0 = new javax.swing.JButton();
        TextFieldNumCycles = new javax.swing.JTextField();
        LabelNumOfCyc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnWash.setText("Wash");
        btnWash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWashActionPerformed(evt);
            }
        });

        btnInjectBuffer.setText("Inject Buffer");
        btnInjectBuffer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInjectBufferActionPerformed(evt);
            }
        });

        btnCyc0.setText("cycle 0");
        btnCyc0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCyc0ActionPerformed(evt);
            }
        });

        btnInvokeMM.setText("set FOVs");
        btnInvokeMM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvokeMMActionPerformed(evt);
            }
        });

        btnSequencing.setText("seqencing");
        btnSequencing.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSequencingMouseClicked(evt);
            }
        });
        btnSequencing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSequencingActionPerformed(evt);
            }
        });

        btnContinueCyc0.setText("Continue");
        btnContinueCyc0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnContinueCyc0MouseClicked(evt);
            }
        });

        TextFieldNumCycles.setColumns(5);
        TextFieldNumCycles.setText("1");

        LabelNumOfCyc.setText("Number Of Cycles");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnWash)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInjectBuffer))
                    .addComponent(btnInvokeMM)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCyc0)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnContinueCyc0))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSequencing)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextFieldNumCycles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LabelNumOfCyc)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnWash)
                    .addComponent(btnInjectBuffer))
                .addGap(18, 18, 18)
                .addComponent(btnInvokeMM)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCyc0)
                    .addComponent(btnContinueCyc0))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSequencing)
                        .addComponent(TextFieldNumCycles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LabelNumOfCyc))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {LabelNumOfCyc, TextFieldNumCycles, btnSequencing});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnWashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWashActionPerformed
        try {
            // TODO add your handling code here:
            experiment.wash();
        } catch (InterruptedException ex) {
            Logger.getLogger(WindowEventDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnWashActionPerformed

    private void btnInjectBufferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInjectBufferActionPerformed
        try {
            // TODO add your handling code here:
            experiment.injectBuffer();
        } catch (InterruptedException ex) {
            Logger.getLogger(WindowEventDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(WindowEventDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(WindowEventDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            System.out.println("There was an error.");
        }
    }//GEN-LAST:event_btnInjectBufferActionPerformed

    private void btnCyc0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCyc0ActionPerformed
        try {
            // TODO add your handling code here:
            experiment.startIncorp0();
        } catch (InterruptedException ex) {
            Logger.getLogger(WindowEventDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(WindowEventDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(WindowEventDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            System.out.println("There was an error.");
        }
    }//GEN-LAST:event_btnCyc0ActionPerformed

    private void btnInvokeMMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvokeMMActionPerformed
        // TODO add your handling code here:
        //Imaging System Control

        //open Acquisition Control Dialog for cycle 0
        gui_.openAcqControlDialog();

    }//GEN-LAST:event_btnInvokeMMActionPerformed

    private void btnSequencingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSequencingMouseClicked
        try {
            int numOfCyc = Integer.parseInt(TextFieldNumCycles.getText());
            // TODO add your handling code here:

            experiment.showMessage("Please choose the Multi-D configuration file", "File Selection");
            String acquisitionConfigFile = fileChooser();
            acquisitionConfigFile = acquisitionConfigFile.replace("\\", "\\\\");
            gui_.loadAcquisition(acquisitionConfigFile);
//            gui_.loadAcquisition("C:\\Users\\Nikon\\Desktop\\Micromanager_test\\20180427_testrun\\AcqSettings20180427.xml");


            PositionList positionList = gui_.getPositionList();
            experiment.showMessage("Please choose the position list file", "File Selection");
            String positionListFile = fileChooser();
            positionListFile = positionListFile.replace("\\", "\\\\");
            positionList.load(positionListFile);
//            positionList.load("C:\\Users\\Nikon\\Desktop\\Micromanager_test\\20180427_testrun\\20180427_test.pos");


            experiment.showMessage("Please choose where you want to save the images", "Save Directory");
            String saveDirectory = dirChooser();
            saveDirectory = saveDirectory.replace("\\", "\\\\");

            for (int i = 0; i < numOfCyc; i++) {

                experiment.runSequencing(i + 1);
                gui_.runAcquisition("Incorp", saveDirectory);
            }
            gui_.closeSequence(true);
            gui_.closeAllAcquisitions();
//            System.exit(0);
        } catch (InterruptedException ex) {
            Logger.getLogger(WindowEventDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MMException ex) {
            Logger.getLogger(WindowEventDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MMScriptException ex) {
            Logger.getLogger(WindowEventDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            System.out.println("There was an error.");
        }
    }//GEN-LAST:event_btnSequencingMouseClicked

    private String fileChooser() {
        JFileChooser f = new JFileChooser();
        f.setFileSelectionMode(JFileChooser.FILES_ONLY);
        f.showSaveDialog(null);
        return f.getSelectedFile().getAbsolutePath();
    }

    private String dirChooser() {
        JFileChooser f = new JFileChooser();
        f.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        f.showSaveDialog(null);
        return f.getSelectedFile().getAbsolutePath();
    }

    private void btnSequencingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSequencingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSequencingActionPerformed

    private void btnContinueCyc0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContinueCyc0MouseClicked
        try {
            // TODO add your handling code here:
            experiment.cyc0LastStep();
        } catch (InterruptedException ex) {
            Logger.getLogger(WindowEventDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            System.out.println("There was an error.");
        }
    }//GEN-LAST:event_btnContinueCyc0MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new WindowEventDemo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelNumOfCyc;
    private javax.swing.JTextField TextFieldNumCycles;
    private javax.swing.JButton btnContinueCyc0;
    private javax.swing.JButton btnCyc0;
    private javax.swing.JButton btnInjectBuffer;
    private javax.swing.JButton btnInvokeMM;
    private javax.swing.JButton btnSequencing;
    private javax.swing.JButton btnWash;
    // End of variables declaration//GEN-END:variables
}
