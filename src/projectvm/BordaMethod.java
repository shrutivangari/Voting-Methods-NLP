/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * BordaMethod.java
 *
 * Created on Nov 18, 2011, 5:36:19 PM
 */
package projectvm;

/**
 *
 * @author Shruti Vangari
 */
public class BordaMethod extends javax.swing.JFrame {
public int B2N1first,B2N1second,B2N2first,B2N2second;
public int B3N1first,B3N1second,B3N1third,B3N2first,B3N2second,B3N2third,B3N3first,B3N3second,B3N3third;
public int B4N1first, B4N1second,B4N1third,B4N1fourth;
public int B4N2first, B4N2second,B4N2third,B4N2fourth;
public int B4N3first, B4N3second,B4N3third,B4N3fourth;
public int B4N4first, B4N4second,B4N4third,B4N4fourth;
public int N;
public int BC2Name1, BC2Name2;
public int BC3Name1, BC3Name2,BC3Name3;
public int BC4Name1, BC4Name2, BC4Name3, BC4Name4;
    /** Creates new form BordaMethod */
    public BordaMethod() {
        initComponents();
    }
    
    public void BordaCount()
    {
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(projectvm.ProjectvmApp.class).getContext().getResourceMap(BordaMethod.class);
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText(resourceMap.getString("jTextArea1.text")); // NOI18N
        jTextArea1.setName("jTextArea1"); // NOI18N
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText(resourceMap.getString("jButton3.text")); // NOI18N
        jButton3.setName("jButton3"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jButton1)))
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 353, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
        if(nc.CheckBox2Selected())
    {
        N=2;
        B2N1first = d2d.Borda2Name1First(e2d.Name1);
        B2N1second = d2d.Borda2Name1Second(e2d.Name1);
        B2N2first = d2d.Borda2Name2First(e2d.Name2);
        B2N2second = d2d.Borda2Name2Second(e2d.Name2);
        BC2Name1 = (((N-1)*B2N1first) + ((N-2)*B2N1second));
        BC2Name2 = (((N-1)*B2N2first) + ((N-2)*B2N2second));
        
        System.out.printf("For 2 candidates %d %d \n", +BC2Name1, +BC2Name2);
        r1.GetBorda();
        r1.setVisible(true);
        this.setVisible(false);
      
    }
    if(nc.CheckBox3Selected())
    {
        N=3;
        B3N1first = d3d.Borda3Name1First(e3d.Name1);
        B3N1second = d3d.Borda3Name1Second(e3d.Name1);
        B3N1third = d3d.Borda3Name1Third(e3d.Name1);
        B3N2first = d3d.Borda3Name2First(e3d.Name2);
        B3N2second = d3d.Borda3Name2Second(e3d.Name2);
        B3N2third = d3d.Borda3Name1Third(e3d.Name2);
        B3N3first = d3d.Borda3Name3First(e3d.Name3);
        B3N3second = d3d.Borda3Name3Second(e3d.Name3);
        B3N3third = d3d.Borda3Name3Third(e3d.Name3);
        BC3Name1 = (((N-1)*B3N1first) + ((N-2)*B3N1second) + ((N-3)*B3N1third));
        BC3Name2 = (((N-1)*B3N2first) + ((N-2)*B3N2second) + ((N-3)*B3N2third));
        BC3Name3 = (((N-1)*B3N3first) + ((N-2)*B3N3second) + ((N-3)*B3N3third));
        
        System.out.printf("For 3 candidates %d %d %d\n", +BC3Name1, +BC3Name2, +BC3Name3);
        r2.GetBorda();
        r2.setVisible(true);
        this.setVisible(false);
    }
    
    if(nc.CheckBox4Selected())
    {
        N=4;
        B4N1first = d4d.Borda4Name1First(e4d.Name1);
        B4N1second = d4d.Borda4Name1Second(e4d.Name1);
        B4N1third = d4d.Borda4Name1Third(e4d.Name1);
        B4N1fourth = d4d.Borda4Name1Fourth(e4d.Name1);
        
        B4N2first = d4d.Borda4Name2First(e4d.Name2);
        B4N2second = d4d.Borda4Name2Second(e4d.Name2);
        B4N2third = d4d.Borda4Name2Third(e4d.Name2);
        B4N2fourth = d4d.Borda4Name2Fourth(e4d.Name2);
        
        B4N3first = d4d.Borda4Name3First(e4d.Name3);
        B4N3second = d4d.Borda4Name3Second(e4d.Name3);
        B4N3third = d4d.Borda4Name3Third(e4d.Name3);
        B4N3fourth = d4d.Borda4Name3Fourth(e4d.Name3);
        
        B4N4first = d4d.Borda4Name3First(e4d.Name4);
        B4N4second = d4d.Borda4Name3Second(e4d.Name4);
        B4N4third = d4d.Borda4Name3Third(e4d.Name4);
        B4N4fourth = d4d.Borda4Name3Fourth(e4d.Name4);
        
        BC4Name1 = (((N-1)*B4N1first) + ((N-2)*B4N1second) + ((N-3)*B4N1third) + ((N-4)*B4N1fourth));
        BC4Name2 = (((N-1)*B4N2first) + ((N-2)*B4N2second) + ((N-3)*B4N2third) + ((N-4)*B4N2fourth));
        BC4Name3 = (((N-1)*B4N3first) + ((N-2)*B4N3second) + ((N-3)*B4N3third) + ((N-4)*B4N3fourth));
        BC4Name4 = (((N-1)*B4N4first) + ((N-2)*B4N4second) + ((N-3)*B4N4third) + ((N-4)*B4N4fourth));
        
        System.out.printf("For 3 candidates %d %d %d %d\n", +BC4Name1, +BC4Name2, +BC4Name3, +BC4Name4);
    r3.GetBorda();
    r3.setVisible(true);
    this.setVisible(false);
    }
   
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here:
    am.setVisible(true);
    this.setVisible(false);
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
// TODO add your handling code here:
    hp.setVisible(true);
    this.setVisible(false);
}//GEN-LAST:event_jButton3ActionPerformed

public void BordaCalculateButton (NumberCandidates n)
{
    nc=n;
}

public void BordaCalculateButton (Enter2Data e2)
{
    e2d=e2;
}

public void BordaCalculateButton (Enter3Data e3)
{
    e3d=e3;
}

public void BordaCalculateButton (Enter4Data e4)
{
    e4d=e4;
}

public void BordaCalculateButton (Display2Data d2)
{
    d2d=d2;
}

public void BordaCalculateButton (Display3Data d3)
{
    d3d=d3;
}

public void BordaCalculateButton (Display4Data d4)
{
    d4d=d4;
}

public void InitializeAdminMenuButton (AdminMenu amm)
{
    am=amm;
}


public void InitializeHomePageButton (HomePage hpp)
{
    hp=hpp;
}


public void BordaCalculateButton (Results1 r11)
{
    r1=r11;
}


  public void BordaCalculateButton(Results2 r22)
{
    r2=r22;
}

public void BordaCalculateButton(Results3 r33)
{
    r3=r33;
}
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
AdminMenu am;
HomePage hp;
Display2Data d2d;
Display3Data d3d;
Display4Data d4d;
NumberCandidates nc;
Enter2Data e2d;
Enter3Data e3d;
Enter4Data e4d;
Results1 r1;
Results2 r2;
Results3 r3;
}
