/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Preference4.java
 *
 * Created on Nov 18, 2011, 7:14:58 PM
 */
package projectvm;
import javax.swing.JOptionPane;
/**
 *
 * @author Shruti Vangari
 */
public class Preference4 extends javax.swing.JFrame {
    public int Pref4Counter1;
    public int Pref4Counter2;
    public int Pref4Counter3;
    public int Pref4Counter4;
    public int Pref4Counter5;
    public int Pref4Counter6;
    public int Pref4Counter7;
    public int Pref4Counter8;
    public int Pref4Counter9;
    public int Pref4Counter10;
    public int Pref4Counter11;
    public int Pref4Counter12;
    public int Pref4Counter13;
    public int Pref4Counter14;
    public int Pref4Counter15;
    public int Pref4Counter16;
    public int Pref4Counter17;
    public int Pref4Counter18;
    public int Pref4Counter19;
    public int Pref4Counter20;
    public int Pref4Counter21;
    public int Pref4Counter22;
    public int Pref4Counter23;
    public int Pref4Counter24;
    /** Creates new form Preference4 */
    public Preference4() {
        initComponents();
    }
    public void Disp4Names(String S1, String S2, String S3, String S4)
    {
        //1 column
        jTable1.setValueAt(S1, 0, 0);
        jTable1.setValueAt(S2, 1, 0);
        jTable1.setValueAt(S3, 2, 0);
        jTable1.setValueAt(S4, 3, 0);
        
        //2 column
        jTable1.setValueAt(S1, 0, 1);
        jTable1.setValueAt(S2, 1, 1);
        jTable1.setValueAt(S4, 2, 1);
        jTable1.setValueAt(S3, 3, 1);
        
        //3 column
        jTable1.setValueAt(S1, 0, 2);
        jTable1.setValueAt(S3, 1, 2);
        jTable1.setValueAt(S2, 2, 2);
        jTable1.setValueAt(S4, 3, 2);
        
        //4 column
        jTable1.setValueAt(S1, 0, 3);
        jTable1.setValueAt(S3, 1, 3);
        jTable1.setValueAt(S4, 2, 3);
        jTable1.setValueAt(S2, 3, 3);
        
        //5 column
        jTable1.setValueAt(S1, 0, 4);
        jTable1.setValueAt(S4, 1, 4);
        jTable1.setValueAt(S2, 2, 4);
        jTable1.setValueAt(S3, 3, 4);
        
        //6 column
        jTable1.setValueAt(S1, 0, 5);
        jTable1.setValueAt(S4, 1, 5);
        jTable1.setValueAt(S3, 2, 5);
        jTable1.setValueAt(S2, 3, 5);

        //7 col
        jTable1.setValueAt(S2, 0, 6);
        jTable1.setValueAt(S1, 1, 6);
        jTable1.setValueAt(S3, 2, 6);
        jTable1.setValueAt(S4, 3, 6);

        //8 col
        jTable1.setValueAt(S2, 0, 7);
        jTable1.setValueAt(S1, 1, 7);
        jTable1.setValueAt(S4, 2, 7);
        jTable1.setValueAt(S3, 3, 7);

        //9 col
        jTable1.setValueAt(S2, 0, 8);
        jTable1.setValueAt(S3, 1, 8);
        jTable1.setValueAt(S1, 2, 8);
        jTable1.setValueAt(S4, 3, 8);

        //10 col
        jTable1.setValueAt(S2, 0, 9);
        jTable1.setValueAt(S3, 1, 9);
        jTable1.setValueAt(S4, 2, 9);
        jTable1.setValueAt(S1, 3, 9);

        //11 col
        jTable1.setValueAt(S2, 0, 10);
        jTable1.setValueAt(S4, 1, 10);
        jTable1.setValueAt(S1, 2, 10);
        jTable1.setValueAt(S3, 3, 10);

        //12 col
        jTable1.setValueAt(S2, 0, 11);
        jTable1.setValueAt(S4, 1, 11);
        jTable1.setValueAt(S3, 2, 11);
        jTable1.setValueAt(S1, 3, 11);

        //13 col
        jTable1.setValueAt(S3, 0, 12);
        jTable1.setValueAt(S1, 1, 12);
        jTable1.setValueAt(S2, 2, 12);
        jTable1.setValueAt(S4, 3, 12);
   
        //14 col
        jTable1.setValueAt(S3, 0, 13);
        jTable1.setValueAt(S1, 1, 13);
        jTable1.setValueAt(S4, 2, 13);
        jTable1.setValueAt(S2, 3, 13);

        //15 col
        jTable1.setValueAt(S3, 0, 14);
        jTable1.setValueAt(S2, 1, 14);
        jTable1.setValueAt(S1, 2, 14);
        jTable1.setValueAt(S4, 3, 14);

        //16 col
        jTable1.setValueAt(S3, 0, 15);
        jTable1.setValueAt(S2, 1, 15);
        jTable1.setValueAt(S4, 2, 15);
        jTable1.setValueAt(S1, 3, 15);

        //17 col
        jTable1.setValueAt(S3, 0, 16);
        jTable1.setValueAt(S4, 1, 16);
        jTable1.setValueAt(S1, 2, 16);
        jTable1.setValueAt(S2, 3, 16);
    
        //18 col
        jTable1.setValueAt(S3, 0, 17);
        jTable1.setValueAt(S4, 1, 17);
        jTable1.setValueAt(S2, 2, 17);
        jTable1.setValueAt(S1, 3, 17);

        //19 col
        jTable1.setValueAt(S4, 0, 18);
        jTable1.setValueAt(S1, 1, 18);
        jTable1.setValueAt(S3, 2, 18);
        jTable1.setValueAt(S2, 3, 18);

        //20 col
        jTable1.setValueAt(S4, 0, 19);
        jTable1.setValueAt(S1, 1, 19);
        jTable1.setValueAt(S2, 2, 19);
        jTable1.setValueAt(S3, 3, 19);

        //21 col
        jTable1.setValueAt(S4, 0, 20);
        jTable1.setValueAt(S2, 1, 20);
        jTable1.setValueAt(S1, 2, 20);
        jTable1.setValueAt(S3, 3, 20);

        //22 col
        jTable1.setValueAt(S4, 0, 21);
        jTable1.setValueAt(S2, 1, 21);
        jTable1.setValueAt(S3, 2, 21);
        jTable1.setValueAt(S1, 3, 21);

        //23 col
        jTable1.setValueAt(S4, 0, 22);
        jTable1.setValueAt(S3, 1, 22);
        jTable1.setValueAt(S1, 2, 22);
        jTable1.setValueAt(S2, 3, 22);

        //24 col
        jTable1.setValueAt(S4, 0, 23);
        jTable1.setValueAt(S3, 1, 23);
        jTable1.setValueAt(S2, 2, 23);
        jTable1.setValueAt(S1, 3, 23);
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckBox21 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jCheckBox24 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(projectvm.ProjectvmApp.class).getContext().getResourceMap(Preference4.class);
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

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

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "P1", "P2", "P3", "P4", "P5", "P6", "P7", "P8", "P9", "P10", "P11", "P12", "P13", "P14", "P15", "P16", "P17", "P18", "P19", "P20", "P21", "P22", "P23", "P24"
            }
        ));
        jTable1.setName("jTable1"); // NOI18N
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setHeaderValue(resourceMap.getString("jTable1.columnModel.title0")); // NOI18N
        jTable1.getColumnModel().getColumn(1).setHeaderValue(resourceMap.getString("jTable1.columnModel.title1")); // NOI18N
        jTable1.getColumnModel().getColumn(2).setHeaderValue(resourceMap.getString("jTable1.columnModel.title2")); // NOI18N
        jTable1.getColumnModel().getColumn(3).setHeaderValue(resourceMap.getString("jTable1.columnModel.title3")); // NOI18N
        jTable1.getColumnModel().getColumn(4).setHeaderValue(resourceMap.getString("jTable1.columnModel.title4")); // NOI18N
        jTable1.getColumnModel().getColumn(5).setHeaderValue(resourceMap.getString("jTable1.columnModel.title5")); // NOI18N
        jTable1.getColumnModel().getColumn(6).setHeaderValue(resourceMap.getString("jTable1.columnModel.title6")); // NOI18N
        jTable1.getColumnModel().getColumn(7).setHeaderValue(resourceMap.getString("jTable1.columnModel.title7")); // NOI18N
        jTable1.getColumnModel().getColumn(8).setHeaderValue(resourceMap.getString("jTable1.columnModel.title8")); // NOI18N
        jTable1.getColumnModel().getColumn(9).setHeaderValue(resourceMap.getString("jTable1.columnModel.title9")); // NOI18N
        jTable1.getColumnModel().getColumn(10).setHeaderValue(resourceMap.getString("jTable1.columnModel.title10")); // NOI18N
        jTable1.getColumnModel().getColumn(11).setHeaderValue(resourceMap.getString("jTable1.columnModel.title11")); // NOI18N
        jTable1.getColumnModel().getColumn(12).setHeaderValue(resourceMap.getString("jTable1.columnModel.title12")); // NOI18N
        jTable1.getColumnModel().getColumn(13).setHeaderValue(resourceMap.getString("jTable1.columnModel.title13")); // NOI18N
        jTable1.getColumnModel().getColumn(14).setHeaderValue(resourceMap.getString("jTable1.columnModel.title14")); // NOI18N
        jTable1.getColumnModel().getColumn(15).setHeaderValue(resourceMap.getString("jTable1.columnModel.title15")); // NOI18N
        jTable1.getColumnModel().getColumn(16).setHeaderValue(resourceMap.getString("jTable1.columnModel.title16")); // NOI18N
        jTable1.getColumnModel().getColumn(17).setHeaderValue(resourceMap.getString("jTable1.columnModel.title17")); // NOI18N
        jTable1.getColumnModel().getColumn(18).setHeaderValue(resourceMap.getString("jTable1.columnModel.title18")); // NOI18N
        jTable1.getColumnModel().getColumn(19).setHeaderValue(resourceMap.getString("jTable1.columnModel.title19")); // NOI18N
        jTable1.getColumnModel().getColumn(20).setHeaderValue(resourceMap.getString("jTable1.columnModel.title20")); // NOI18N
        jTable1.getColumnModel().getColumn(21).setHeaderValue(resourceMap.getString("jTable1.columnModel.title21")); // NOI18N
        jTable1.getColumnModel().getColumn(22).setHeaderValue(resourceMap.getString("jTable1.columnModel.title22")); // NOI18N
        jTable1.getColumnModel().getColumn(23).setHeaderValue(resourceMap.getString("jTable1.columnModel.title23")); // NOI18N

        jCheckBox1.setText(resourceMap.getString("jCheckBox1.text")); // NOI18N
        jCheckBox1.setName("jCheckBox1"); // NOI18N

        jCheckBox2.setText(resourceMap.getString("jCheckBox2.text")); // NOI18N
        jCheckBox2.setName("jCheckBox2"); // NOI18N

        jCheckBox3.setText(resourceMap.getString("jCheckBox3.text")); // NOI18N
        jCheckBox3.setName("jCheckBox3"); // NOI18N

        jCheckBox4.setText(resourceMap.getString("jCheckBox4.text")); // NOI18N
        jCheckBox4.setName("jCheckBox4"); // NOI18N

        jCheckBox5.setText(resourceMap.getString("jCheckBox5.text")); // NOI18N
        jCheckBox5.setName("jCheckBox5"); // NOI18N

        jCheckBox6.setText(resourceMap.getString("jCheckBox6.text")); // NOI18N
        jCheckBox6.setName("jCheckBox6"); // NOI18N

        jCheckBox7.setText(resourceMap.getString("jCheckBox7.text")); // NOI18N
        jCheckBox7.setName("jCheckBox7"); // NOI18N

        jCheckBox8.setText(resourceMap.getString("jCheckBox8.text")); // NOI18N
        jCheckBox8.setName("jCheckBox8"); // NOI18N

        jCheckBox9.setText(resourceMap.getString("jCheckBox9.text")); // NOI18N
        jCheckBox9.setName("jCheckBox9"); // NOI18N

        jCheckBox10.setText(resourceMap.getString("jCheckBox10.text")); // NOI18N
        jCheckBox10.setName("jCheckBox10"); // NOI18N

        jCheckBox11.setText(resourceMap.getString("jCheckBox11.text")); // NOI18N
        jCheckBox11.setName("jCheckBox11"); // NOI18N

        jCheckBox12.setText(resourceMap.getString("jCheckBox12.text")); // NOI18N
        jCheckBox12.setName("jCheckBox12"); // NOI18N

        jCheckBox13.setText(resourceMap.getString("jCheckBox13.text")); // NOI18N
        jCheckBox13.setName("jCheckBox13"); // NOI18N

        jCheckBox14.setText(resourceMap.getString("jCheckBox14.text")); // NOI18N
        jCheckBox14.setName("jCheckBox14"); // NOI18N

        jCheckBox15.setText(resourceMap.getString("jCheckBox15.text")); // NOI18N
        jCheckBox15.setName("jCheckBox15"); // NOI18N

        jCheckBox16.setText(resourceMap.getString("jCheckBox16.text")); // NOI18N
        jCheckBox16.setName("jCheckBox16"); // NOI18N

        jCheckBox17.setText(resourceMap.getString("jCheckBox17.text")); // NOI18N
        jCheckBox17.setName("jCheckBox17"); // NOI18N

        jCheckBox18.setText(resourceMap.getString("jCheckBox18.text")); // NOI18N
        jCheckBox18.setName("jCheckBox18"); // NOI18N

        jCheckBox19.setText(resourceMap.getString("jCheckBox19.text")); // NOI18N
        jCheckBox19.setName("jCheckBox19"); // NOI18N

        jCheckBox20.setText(resourceMap.getString("jCheckBox20.text")); // NOI18N
        jCheckBox20.setName("jCheckBox20"); // NOI18N

        jCheckBox21.setText(resourceMap.getString("jCheckBox21.text")); // NOI18N
        jCheckBox21.setName("jCheckBox21"); // NOI18N

        jCheckBox22.setText(resourceMap.getString("jCheckBox22.text")); // NOI18N
        jCheckBox22.setName("jCheckBox22"); // NOI18N

        jCheckBox23.setText(resourceMap.getString("jCheckBox23.text")); // NOI18N
        jCheckBox23.setName("jCheckBox23"); // NOI18N

        jCheckBox24.setText(resourceMap.getString("jCheckBox24.text")); // NOI18N
        jCheckBox24.setName("jCheckBox24"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 971, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox2)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox3)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox4)
                                .addGap(10, 10, 10)
                                .addComponent(jCheckBox5)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox6)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox8)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox10)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox11)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox14)
                        .addGap(10, 10, 10)
                        .addComponent(jCheckBox15)
                        .addGap(10, 10, 10)
                        .addComponent(jCheckBox16)
                        .addGap(10, 10, 10)
                        .addComponent(jCheckBox17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox18)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox20)
                        .addGap(10, 10, 10)
                        .addComponent(jCheckBox21)
                        .addGap(10, 10, 10)
                        .addComponent(jCheckBox22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox24)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(578, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(571, 571, 571))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCheckBox1)
                                    .addComponent(jCheckBox2)
                                    .addComponent(jCheckBox3)
                                    .addComponent(jCheckBox4)
                                    .addComponent(jCheckBox5)
                                    .addComponent(jCheckBox6)
                                    .addComponent(jCheckBox7)
                                    .addComponent(jCheckBox8)
                                    .addComponent(jCheckBox9)
                                    .addComponent(jCheckBox10)
                                    .addComponent(jCheckBox11)
                                    .addComponent(jCheckBox12)
                                    .addComponent(jCheckBox13)
                                    .addComponent(jCheckBox14)
                                    .addComponent(jCheckBox16)
                                    .addComponent(jCheckBox15)
                                    .addComponent(jCheckBox17)
                                    .addComponent(jCheckBox18)
                                    .addComponent(jCheckBox19)
                                    .addComponent(jCheckBox20)
                                    .addComponent(jCheckBox21)
                                    .addComponent(jCheckBox22)
                                    .addComponent(jCheckBox23)
                                    .addComponent(jCheckBox24))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(27, 27, 27)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jButton3)))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jButton3ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here:
    uhp.setVisible(true);
    this.setVisible(false);
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
    Check4();
}//GEN-LAST:event_jButton1ActionPerformed

public void InitializeUserMenuButton(UserHomePage u)
{
    uhp=u;
}

public void InitializeHomePageButton(HomePage h)
{
    hp=h;
}
public void InitializeDisplayPref(DisplayPreference dpp)
{
    dp=dpp;
}

public void InitializeDisplayPref(Display4Data d4)
{
    d4d=d4;
}

public void InitializeDisplayPref(NumberVoters nvv)
{
    nv=nvv;
}



public void Check4()
{
      if((Pref4Counter1+Pref4Counter2+Pref4Counter3+Pref4Counter4+Pref4Counter5+Pref4Counter6+
          Pref4Counter7+Pref4Counter8+Pref4Counter9+Pref4Counter10+Pref4Counter11+Pref4Counter12+
          Pref4Counter13+Pref4Counter14+Pref4Counter15+Pref4Counter16+Pref4Counter17+Pref4Counter18 +
          Pref4Counter19+Pref4Counter20+Pref4Counter21+Pref4Counter22+Pref4Counter23+Pref4Counter24)<nv.CB1())
    {
        if(jCheckBox1.isSelected())
        {
                ++Pref4Counter1;
                System.out.printf("Count is"+Pref4Counter1);
		dp.setVisible(true);
                this.setVisible(false);
                jCheckBox1.setSelected(false);
         }
         
            if(jCheckBox2.isSelected())
            {
                     ++Pref4Counter2;
                    System.out.printf("Count is"+Pref4Counter2);
		    dp.setVisible(true);
                    this.setVisible(false);
                    jCheckBox2.setSelected(false);
                }

            if(jCheckBox3.isSelected())
            {
   
                    ++Pref4Counter3;
                    System.out.printf("Count is"+Pref4Counter3);
		    dp.setVisible(true);
                    this.setVisible(false);
                    jCheckBox3.setSelected(false);
                }
        
            if(jCheckBox4.isSelected())
            {
  
                    ++Pref4Counter4;
                    System.out.printf("Count is"+Pref4Counter4);
		    dp.setVisible(true);
                    this.setVisible(false);
                    jCheckBox4.setSelected(false);
                }

            if(jCheckBox5.isSelected())
            {
   
                    ++Pref4Counter5;
                    System.out.printf("Count is"+Pref4Counter5);
		    dp.setVisible(true);
                    this.setVisible(false);
                    jCheckBox5.setSelected(false);
                }
   
            if(jCheckBox6.isSelected())
            {
                 
                    ++Pref4Counter6;
                    System.out.printf("Count is"+Pref4Counter6);
		    dp.setVisible(true);
                    this.setVisible(false);
                    jCheckBox6.setSelected(false);
                }
             
        if(jCheckBox7.isSelected())
        {
                ++Pref4Counter7;
                System.out.printf("Count is"+Pref4Counter7);
		dp.setVisible(true);
                this.setVisible(false);
                jCheckBox7.setSelected(false);
         }
         
            if(jCheckBox8.isSelected())
            {
                     ++Pref4Counter8;
                    System.out.printf("Count is"+Pref4Counter8);
		    dp.setVisible(true);
                    this.setVisible(false);
                    jCheckBox8.setSelected(false);
                }

            if(jCheckBox9.isSelected())
            {
   
                    ++Pref4Counter9;
                    System.out.printf("Count is"+Pref4Counter9);
		    dp.setVisible(true);
                    this.setVisible(false);
                    jCheckBox9.setSelected(false);
                }
        
            if(jCheckBox10.isSelected())
            {
  
                    ++Pref4Counter10;
                    System.out.printf("Count is"+Pref4Counter10);
		    dp.setVisible(true);
                    this.setVisible(false);
                    jCheckBox10.setSelected(false);
                }

            if(jCheckBox11.isSelected())
            {
   
                    ++Pref4Counter11;
                    System.out.printf("Count is"+Pref4Counter11);
		    dp.setVisible(true);
                    this.setVisible(false);
                    jCheckBox11.setSelected(false);
                }
   
            if(jCheckBox12.isSelected())
            {
                    ++Pref4Counter12;
                    System.out.printf("Count is"+Pref4Counter12);
		    dp.setVisible(true);
                    this.setVisible(false);
                    jCheckBox12.setSelected(false);
                }
            
        if(jCheckBox13.isSelected())
        {
                ++Pref4Counter13;
                System.out.printf("Count is"+Pref4Counter13);
		dp.setVisible(true);
                this.setVisible(false);
                jCheckBox13.setSelected(false);
         }
         
            if(jCheckBox14.isSelected())
            {
                     ++Pref4Counter14;
                    System.out.printf("Count is"+Pref4Counter14);
		    dp.setVisible(true);
                    this.setVisible(false);
                    jCheckBox14.setSelected(false);
                }

            if(jCheckBox15.isSelected())
            {
   
                    ++Pref4Counter15;
                    System.out.printf("Count is"+Pref4Counter15);
		    dp.setVisible(true);
                    this.setVisible(false);
                    jCheckBox15.setSelected(false);
                }
        
            if(jCheckBox16.isSelected())
            {
  
                    ++Pref4Counter16;
                    System.out.printf("Count is"+Pref4Counter16);
		    dp.setVisible(true);
                    this.setVisible(false);
                    jCheckBox16.setSelected(false);
                }

            if(jCheckBox17.isSelected())
            {
   
                    ++Pref4Counter17;
                    System.out.printf("Count is"+Pref4Counter17);
		    dp.setVisible(true);
                    this.setVisible(false);
                    jCheckBox17.setSelected(false);
                }
   
            if(jCheckBox18.isSelected())
            {
                 
                    ++Pref4Counter18;
                    System.out.printf("Count is"+Pref4Counter18);
		    dp.setVisible(true);
                    this.setVisible(false);
                    jCheckBox18.setSelected(false);
                }
            
        if(jCheckBox19.isSelected())
        {
                ++Pref4Counter19;
                System.out.printf("Count is"+Pref4Counter19);
		dp.setVisible(true);
                this.setVisible(false);
                jCheckBox19.setSelected(false);
         }
         
            if(jCheckBox20.isSelected())
            {
                     ++Pref4Counter20;
                    System.out.printf("Count is"+Pref4Counter20);
		    dp.setVisible(true);
                    this.setVisible(false);
                    jCheckBox20.setSelected(false);
                }

            if(jCheckBox21.isSelected())
            {
   
                    ++Pref4Counter21;
                    System.out.printf("Count is"+Pref4Counter21);
		    dp.setVisible(true);
                    this.setVisible(false);
                    jCheckBox21.setSelected(false);
                }
        
            if(jCheckBox22.isSelected())
            {
  
                    ++Pref4Counter22;
                    System.out.printf("Count is"+Pref4Counter22);
		    dp.setVisible(true);
                    this.setVisible(false);
                    jCheckBox22.setSelected(false);
                }

            if(jCheckBox23.isSelected())
            {
   
                    ++Pref4Counter23;
                    System.out.printf("Count is"+Pref4Counter23);
		    dp.setVisible(true);
                    this.setVisible(false);
                    jCheckBox23.setSelected(false);
                }
   
            if(jCheckBox24.isSelected())
            {
                 
                    ++Pref4Counter24;
                    System.out.printf("Count is"+Pref4Counter24);
		    dp.setVisible(true);
                    this.setVisible(false);
                    jCheckBox24.setSelected(false);
                }
  
    String A= Integer.toString(Pref4Counter1);
    String B= Integer.toString(Pref4Counter2);
    String C= Integer.toString(Pref4Counter3);
    String D= Integer.toString(Pref4Counter4);
    String E= Integer.toString(Pref4Counter5);
    String F= Integer.toString(Pref4Counter6);
    String G= Integer.toString(Pref4Counter7);
    String H= Integer.toString(Pref4Counter8);
    String I= Integer.toString(Pref4Counter9);
    String J= Integer.toString(Pref4Counter10);
    String K= Integer.toString(Pref4Counter11);
    String L= Integer.toString(Pref4Counter12);
    String M= Integer.toString(Pref4Counter13);
    String N= Integer.toString(Pref4Counter14);
    String O= Integer.toString(Pref4Counter15);
    String P= Integer.toString(Pref4Counter16);
    String Q= Integer.toString(Pref4Counter17);
    String R= Integer.toString(Pref4Counter18);
    String S= Integer.toString(Pref4Counter19);
    String T= Integer.toString(Pref4Counter20);
    String U= Integer.toString(Pref4Counter21);
    String V= Integer.toString(Pref4Counter22);
    String W= Integer.toString(Pref4Counter23);
    String X= Integer.toString(Pref4Counter24);
    
    d4d.tableContent1(A);
    d4d.tableContent2(B);
    d4d.tableContent3(C);
    d4d.tableContent4(D);
    d4d.tableContent5(E);
    d4d.tableContent6(F);
    d4d.tableContent7(G);
    d4d.tableContent8(H);
    d4d.tableContent9(I);
    d4d.tableContent10(J);
    d4d.tableContent11(K);
    d4d.tableContent12(L);
    d4d.tableContent13(M);
    d4d.tableContent14(N);
    d4d.tableContent15(O);
    d4d.tableContent16(P);
    d4d.tableContent17(Q);
    d4d.tableContent18(R);
    d4d.tableContent19(S);
    d4d.tableContent20(T);
    d4d.tableContent21(U);
    d4d.tableContent22(V);
    d4d.tableContent23(W);
    d4d.tableContent24(X);
    }
    if((Pref4Counter1+Pref4Counter2+Pref4Counter3+Pref4Counter4+Pref4Counter5+Pref4Counter6+
          Pref4Counter7+Pref4Counter8+Pref4Counter9+Pref4Counter10+Pref4Counter11+Pref4Counter12+
          Pref4Counter13+Pref4Counter14+Pref4Counter15+Pref4Counter16+Pref4Counter17+Pref4Counter18 +
          Pref4Counter19+Pref4Counter20+Pref4Counter21+Pref4Counter22+Pref4Counter23+Pref4Counter24)>=nv.CB1())
    {
        jCheckBox1.setEnabled(false);
        jCheckBox2.setEnabled(false);
        jCheckBox3.setEnabled(false);
        jCheckBox4.setEnabled(false);
        jCheckBox5.setEnabled(false);
        jCheckBox6.setEnabled(false);
        jCheckBox7.setEnabled(false);
        jCheckBox8.setEnabled(false);
        jCheckBox9.setEnabled(false);
        jCheckBox10.setEnabled(false);
        jCheckBox11.setEnabled(false);
        jCheckBox12.setEnabled(false);
        jCheckBox13.setEnabled(false);
        jCheckBox14.setEnabled(false);
        jCheckBox15.setEnabled(false);
        jCheckBox16.setEnabled(false);
        jCheckBox17.setEnabled(false);
        jCheckBox18.setEnabled(false);
        jCheckBox19.setEnabled(false);
        jCheckBox20.setEnabled(false);
        jCheckBox21.setEnabled(false);
        jCheckBox22.setEnabled(false);
        jCheckBox23.setEnabled(false);
        jCheckBox24.setEnabled(false);
        
        JOptionPane.showMessageDialog(null,"Voting Closed!!");
    } 
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
UserHomePage uhp;
HomePage hp;
DisplayPreference dp;
Display4Data d4d;
NumberVoters nv;
}
