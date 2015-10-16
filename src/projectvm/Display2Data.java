/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Display2Data.java
 *
 * Created on Nov 18, 2011, 2:38:32 PM
 */
package projectvm;

/**
 *
 * @author Shruti Vangari
 */
public class Display2Data extends javax.swing.JFrame {
public int value1;
public int value2;
public int value3;
public int value4;
public int cw1value1,cw1value2;
    /** Creates new form Display2Data */
    public Display2Data() {
        initComponents();
    }
    public void Set2Names(String S1, String S2)
    {
        jTable1.setValueAt(S1, 0, 0);
        jTable1.setValueAt(S2, 0, 1);
        jTable1.setValueAt(S2, 1, 0);
        jTable1.setValueAt(S1, 1, 1);


    }

    public void SetN2Values(int N1, int N2)
    {
        jTable1.setValueAt(String.valueOf(N1), 2,0);
        jTable1.setValueAt(String.valueOf(N2), 2,1);
       // jLabel1.setText(String.valueOf(N1));
        //jLabel2.setText(String.valueOf(N2));
    }


    public int Borda2Name1First(String S1)
    {
        int i = jTable1.getRowCount();
        int j = jTable1.getColumnCount();
                 System.out.print("i="+i);
                  System.out.print("j="+j);

                      for(int n=0;n<j;++n)
                      {
                       //jTable1.toString();
                       if (S1 == (jTable1.getValueAt(0, n)))
                       {
                           if (jTable1.getValueAt(j,n).toString() == "")
                                {
                                    jTable1.setValueAt(0, j, n);
                                    value1 +=(Integer.parseInt(jTable1.getValueAt(j,n).toString()));
                                }
                           else
                           {
                               value1 +=(Integer.parseInt(jTable1.getValueAt(j,n).toString()));
                           }
                       }

                       //System.out.println("Name1 comes first total \n"+value1);
                      }
                      System.out.println("Name1 comes first total \n"+value1);
                      return value1;
    }
    public int Borda2Name1Second(String S1)
    {
        int i = jTable1.getRowCount();
        int j = jTable1.getColumnCount();
                 System.out.print("i="+i);
                  System.out.print("j="+j);

                      for(int n=0;n<j;++n)
                      {

                       if(S1 == (jTable1.getValueAt(1,n)))
                           value2 += (Integer.parseInt(jTable1.getValueAt(j,n).toString()));
                       //System.out.println("Name1 comes first total \n"+value2);
                      }
                      System.out.println("Name1 comes second total \n"+value2);
                      return value2;

    }
    public int Borda2Name2First(String S2)
    {
        int i = jTable1.getRowCount();
        int j = jTable1.getColumnCount();
                 System.out.print("i="+i);
                  System.out.print("j="+j);

                      for(int n=0;n<j;++n)
                      {
                       //jTable1.toString();
                       if (S2 == (jTable1.getValueAt(0, n)))
                            value3 +=(Integer.parseInt(jTable1.getValueAt(j,n).toString()));
                       //System.out.println("Name1 comes first total \n"+value1);
                      }
                      System.out.println("Name2 comes first total \n"+value3);
                      return value3;
    }
    public int Borda2Name2Second(String S2)
    {
        int i = jTable1.getRowCount();
        int j = jTable1.getColumnCount();
                 System.out.print("i="+i);
                  System.out.print("j="+j);

                      for(int n=0;n<j;++n)
                      {

                       if(S2 == (jTable1.getValueAt(1,n)))
                           value4 += (Integer.parseInt(jTable1.getValueAt(j,n).toString()));
                       //System.out.println("Name1 comes first total \n"+value2);
                      }
                      System.out.println("Name2 comes second total \n"+value4);
                      return value4;

    }
    
    public int Condorcet2Name1Name2(String S1, String S2)
    {
//        int i = jTable1.getRowCount()-1;
//        int j = jTable1.getColumnCount()-1;
//        for(int n=0;n<=j;++n)
//        {
//        if(((jTable1.getValueAt(0,n)) == S1) && ((jTable1.getValueAt(1,n))==S2))
//                {
//                 cw1value1 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
//                }
//        }
        cw1value1 = Integer.parseInt(jTable1.getValueAt(2, 0).toString());
        System.out.println("Name1 comes first total \n"+cw1value1);
        return cw1value1;
    }

    public int Condorcet2Name2Name1(String S1, String S2)
    {
//        int i = jTable1.getRowCount()-1;
//        int j = jTable1.getColumnCount()-1;
//        for(int n=0;n<=j;++n)
//        {
//        if(((jTable1.getValueAt(0,n)) == S2) && ((jTable1.getValueAt(1,n))==S1))
//                {
//                 cw1value2 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
//                }
//        }
        cw1value2 = Integer.parseInt(jTable1.getValueAt(2, 1).toString());
        System.out.println("Name2 comes first total \n"+value4);
        return cw1value2;
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
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(projectvm.ProjectvmApp.class).getContext().getResourceMap(Display2Data.class);
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {"0", "0"}
            },
            new String [] {
                "Preference1", "Preference2"
            }
        ));
        jTable1.setName("jTable1"); // NOI18N
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setHeaderValue(resourceMap.getString("jTable1.columnModel.title0")); // NOI18N
        jTable1.getColumnModel().getColumn(1).setHeaderValue(resourceMap.getString("jTable1.columnModel.title1")); // NOI18N

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel1)
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
    am.setVisible(true);
    this.setVisible(false);
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here:
    hp.setVisible(true);
    this.setVisible(false);
}//GEN-LAST:event_jButton2ActionPerformed
public void InitializeAdminMenuButton(AdminMenu a)
{
    am=a;
}

public void InitializeHomePageButton(HomePage h)
{
    hp=h;
}

public void tableField1(String X)
{
    jTable1.setValueAt(X, 2, 0);
}
public void tableField2(String Y)
{
    jTable1.setValueAt(Y, 2, 1);
}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
AdminMenu am;
HomePage hp;
Preference2 p2;
}
