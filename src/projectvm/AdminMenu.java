/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AdminMenu.java
 *
 * Created on Nov 18, 2011, 1:10:16 AM
 */
package projectvm;
import javax.swing.JOptionPane;
import java.io.*;
/**
 *
 * @author Shruti Vangari
 */
public class AdminMenu extends javax.swing.JFrame {

    /** Creates new form AdminMenu */
    public AdminMenu() {
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

        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(projectvm.ProjectvmApp.class).getContext().getResourceMap(AdminMenu.class);
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jRadioButton1.setText(resourceMap.getString("jRadioButton1.text")); // NOI18N
        jRadioButton1.setName("jRadioButton1"); // NOI18N
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText(resourceMap.getString("jRadioButton2.text")); // NOI18N
        jRadioButton2.setName("jRadioButton2"); // NOI18N
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setText(resourceMap.getString("jRadioButton3.text")); // NOI18N
        jRadioButton3.setName("jRadioButton3"); // NOI18N
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setText(resourceMap.getString("jRadioButton4.text")); // NOI18N
        jRadioButton4.setName("jRadioButton4"); // NOI18N
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jRadioButton5.setText(resourceMap.getString("jRadioButton5.text")); // NOI18N
        jRadioButton5.setName("jRadioButton5"); // NOI18N
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton5))))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton3)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton4)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton5)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
// TODO add your handling code here:
    nv.setVisible(true);
    this.setVisible(false);
}//GEN-LAST:event_jRadioButton1ActionPerformed

private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
// TODO add your handling code here:
    nc.setVisible(true);
    this.setVisible(false);
}//GEN-LAST:event_jRadioButton2ActionPerformed

private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
// TODO add your handling code here:
    //System.out.printf("Admin Menu %b %b %b \n", nc.CheckBox2Selected(), nc.CheckBox3Selected(), nc.CheckBox4Selected());
   
    if(nc.CheckBox2Selected())
    {
        d2d.setVisible(true);
        this.setVisible(false);
    }
    if(nc.CheckBox3Selected())
    {
        d3d.setVisible(true);
        this.setVisible(false);
    }
    if(nc.CheckBox4Selected() )
    {
        d4d.setVisible(true);
        this.setVisible(false);
    }
    
//    else
//    {
//        JOptionPane.showMessageDialog(null,"Please select the number of candidates");
//    }
   
}//GEN-LAST:event_jRadioButton3ActionPerformed

private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
// TODO add your handling code here:
    ms.setVisible(true);
    this.setVisible(false);
}//GEN-LAST:event_jRadioButton4ActionPerformed

private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
// TODO add your handling code here:
    if(nc.CheckBox2Selected())
    {
        res1.setVisible(true);
        this.setVisible(false);
    }
    if(nc.CheckBox3Selected())
    {
        res2.setVisible(true);
        this.setVisible(false);
    }
    if(nc.CheckBox4Selected() )
    {
        res3.setVisible(true);
        this.setVisible(false);
    }
    
}//GEN-LAST:event_jRadioButton5ActionPerformed

public void InitializeNoVotersRB(NumberVoters n)
{
    nv = n;
}

public void InitializeNoCandidatesRB (NumberCandidates c)
{
    nc = c;
}

public void InitializeDisplayRB (Display2Data d2)
{
    d2d = d2;
}

public void InitializeDisplayRB (Display3Data d3)
{
    d3d = d3;
}
public void InitializeDisplayRB (Display4Data d4)
{
    d4d = d4;
}

public void InitializeMethodRB(MethodSelection m)
{
    ms=m;
}

public void InitializeResultsPageRB(Results1 r1)
{
    res1=r1;
}

public void InitializeResultsPageRB(Results2 r2)
{
    res2=r2;
}

public void InitializeResultsPageRB(Results3 r3)
{
    res3=r3;
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    // End of variables declaration//GEN-END:variables
NumberVoters nv;
NumberCandidates nc;
Display2Data d2d;
Display3Data d3d;
Display4Data d4d;
MethodSelection ms;
Results1 res1;
Results2 res2;
Results3 res3;
}
