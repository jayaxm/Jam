

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Admission.java
 *
 * Created on Feb 8, 2019, 10:03:26 PM
 */

/**
 *
 * @author MP
 */
import java.awt.Desktop;
   import java.io.File;
   import java.io.IOException;
   import java.util.logging.Level;
   import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Admission extends javax.swing.JFrame {

    /** Creates new form Admission */
    public Admission() {
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

        jRadioButton1 = new javax.swing.JRadioButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 620));
        getContentPane().setLayout(null);

        jCheckBox1.setFont(new java.awt.Font("Arial Unicode MS", 3, 24)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(0, 102, 102));
        jCheckBox1.setText("I AGREE");
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(530, 310, 210, 41);

        jCheckBox2.setFont(new java.awt.Font("Arial Unicode MS", 3, 24)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(0, 102, 102));
        jCheckBox2.setText("I AGREE");
        jCheckBox2.setEnabled(false);
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jCheckBox2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCheckBox2PropertyChange(evt);
            }
        });
        getContentPane().add(jCheckBox2);
        jCheckBox2.setBounds(530, 310, 210, 41);

        jCheckBox3.setFont(new java.awt.Font("Arial Unicode MS", 3, 24)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(0, 102, 102));
        jCheckBox3.setText("I AGREE");
        jCheckBox3.setEnabled(false);
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jCheckBox3.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCheckBox3PropertyChange(evt);
            }
        });
        getContentPane().add(jCheckBox3);
        jCheckBox3.setBounds(530, 310, 210, 41);

        jCheckBox4.setFont(new java.awt.Font("Arial Unicode MS", 3, 24)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(0, 102, 102));
        jCheckBox4.setText("I AGREE");
        jCheckBox4.setEnabled(false);
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        jCheckBox4.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCheckBox4PropertyChange(evt);
            }
        });
        getContentPane().add(jCheckBox4);
        jCheckBox4.setBounds(530, 310, 210, 41);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 0, 0));
        jTextField1.setText("CHANGE IN STUDY PATTERN");
        jTextField1.setEnabled(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(200, 145, 370, 40);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 51));
        jButton1.setText("FREEZE YOUR SEAT");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(523, 473, 220, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WARNING.JPG"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 190, 530, 346);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iiita.JPG"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 820, 176);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/white.JPG"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-20, 120, 840, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseClicked
        try {
            // TODO add your handling code here:
            Desktop.getDesktop().open(new File("audioo.mp3"));
        } catch (IOException ex) {
            Logger.getLogger(Admission.class.getName()).log(Level.SEVERE, null, ex);
        }
      jCheckBox1.setEnabled(false);
      jCheckBox1.setVisible(false);
      jCheckBox2.setEnabled(true);
      jCheckBox2.setVisible(true);

    }//GEN-LAST:event_jCheckBox1MouseClicked

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:

        try {
            // TODO add your handling code here:
            Desktop.getDesktop().open(new File("audio2.mp3"));
        } catch (IOException ex) {
            Logger.getLogger(Admission.class.getName()).log(Level.SEVERE, null, ex);
        }
      jCheckBox3.setEnabled(false);
      jCheckBox3.setVisible(false);
      jCheckBox4.setEnabled(true);
      jCheckBox4.setVisible(true);
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Desktop.getDesktop().open(new File("audio1.mp3"));
        } catch (IOException ex) {
            Logger.getLogger(Admission.class.getName()).log(Level.SEVERE, null, ex);
        }
      jCheckBox2.setEnabled(false);
      jCheckBox2.setVisible(false);
      jCheckBox3.setEnabled(true);
      jCheckBox3.setVisible(true);
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCheckBox3PropertyChange
        // TODO add your handling code here:
        jCheckBox3.setVisible(false);
    }//GEN-LAST:event_jCheckBox3PropertyChange

    private void jCheckBox2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCheckBox2PropertyChange
        // TODO add your handling code here:
        jCheckBox2.setVisible(false);
    }//GEN-LAST:event_jCheckBox2PropertyChange

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
        jButton1.setEnabled(true);
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox4PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCheckBox4PropertyChange
        // TODO add your handling code here:
        jCheckBox4.setVisible(false);
    }//GEN-LAST:event_jCheckBox4PropertyChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"DO YOU STILL WANT TO GET INTO IIITA?");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admission().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
