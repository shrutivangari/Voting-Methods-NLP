/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Display3Data.java
 *
 * Created on Nov 18, 2011, 2:38:46 PM
 */
package projectvm;
import java.io.*;

/**
 *
 * @author Shruti Vangari
 */
public class Display3Data extends javax.swing.JFrame {
public int value1,value2,value3,value4,value5,value6,value7,value8,value9;
int cwval1,cwval2,cwval3,cwvalue1;
int cwval4,cwval5,cwval6,cwvalue2;
int cwval7,cwval8,cwval9,cwvalue3;
int cwval10,cwval11,cwval12,cwvalue4;
int cwval13,cwval14,cwval15,cwvalue5;
int cwval16,cwval17,cwval18,cwvalue6;
    /** Creates new form Display3Data */
    public Display3Data() {
        initComponents();
    }
    
    public void Set3Names(String S1,String S2, String S3)
    {
        //1 column
        //jTable1.setValueAt("P1", 0, 0);
        jTable1.setValueAt(S1, 0, 0);
        jTable1.setValueAt(S2, 1, 0);
        jTable1.setValueAt(S3, 2, 0);
        //2 column
        //jTable1.setValueAt("P2", 0, 1);
        jTable1.setValueAt(S1, 0, 1);
        jTable1.setValueAt(S3, 1, 1);
        jTable1.setValueAt(S2, 2, 1);
        //3 column
        //jTable1.setValueAt("P3", 0, 2);
        jTable1.setValueAt(S2, 0, 2);
        jTable1.setValueAt(S1, 1, 2);
        jTable1.setValueAt(S3, 2, 2);
        //4 column
        //jTable1.setValueAt("P4",  0,3);
        jTable1.setValueAt(S2, 0, 3);
        jTable1.setValueAt(S3, 1, 3);
        jTable1.setValueAt(S1, 2, 3);
        //5 column
        //jTable1.setValueAt("P5", 0, 4);
        jTable1.setValueAt(S3, 0, 4);
        jTable1.setValueAt(S1, 1, 4);
        jTable1.setValueAt(S2, 2, 4);
        //6 column
        //jTable1.setValueAt("P6", 0, 5);
        jTable1.setValueAt(S3, 0, 5);
        jTable1.setValueAt(S2, 1, 5);
        jTable1.setValueAt(S1, 2, 5);
    }
    
    public int Borda3Name1First(String S1)
    {
        int i = jTable1.getRowCount()-1;
        int j = jTable1.getColumnCount()-1;
                 //System.out.print("i="+i);
                 //System.out.print("j="+j);
                  int row=0;
                    for(int n=0;n<=j;++n)
                      {
                      //jTable1.toString();
                       if ((jTable1.getValueAt(row,n).toString()) == S1)
                       {
                            value1 +=(Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                            
                        }
                      }
        System.out.println("Name1 comes first total \n"+value1);
                    return value1;
    }
    public int Borda3Name1Second(String S1)
    {
        int i = jTable1.getRowCount()-1;
        int j = jTable1.getColumnCount()-1;
                 //System.out.print("i="+i);
                  //System.out.print("j="+j);
                  int row = 1;
                      for(int n=0;n<=j;++n)
                      {
    
                       if(S1 == (jTable1.getValueAt(row,n)))
                           value2 += (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                       //System.out.println("Name1 comes first total \n"+value2);
                      }
                      System.out.println("Name1 comes second total \n"+value2);
                      return value2;
                    
    }
    
     public int Borda3Name1Third(String S1)
    {
        int i = jTable1.getRowCount()-1;
        int j = jTable1.getColumnCount()-1;
                 //System.out.print("i="+i);
                  //System.out.print("j="+j);
                  int row=2;
                      for(int n=0;n<=j;++n)
                      {
    
                       if(S1 == (jTable1.getValueAt(row,n)))
                           value3 += (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                       //System.out.println("Name1 comes first total \n"+value2);
                      }
                      System.out.println("Name1 comes second total \n"+value3);
                      return value3;
                    
    }
    
     public int Borda3Name2First(String S2)
    {
        int i = jTable1.getRowCount()-1;
        int j = jTable1.getColumnCount()-1;
                 //System.out.print("i="+i);
                  //System.out.print("j="+j);
                  int row = 0;
                      for(int n=0;n<=j;++n)
                      {
    
                       if(S2 == (jTable1.getValueAt(row,n)))
                           value4 += (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                       //System.out.println("Name1 comes first total \n"+value2);
                      }
                      System.out.println("Name2 comes second total \n"+value4);
                      return value4;
                    
    }
    
     public int Borda3Name2Second(String S2)
    {
        int i = jTable1.getRowCount()-1;
        int j = jTable1.getColumnCount()-1;
                 //System.out.print("i="+i);
                  //System.out.print("j="+j);
                  int row = 1;
                      for(int n=0;n<=j;++n)
                      {
    
                       if(S2 == (jTable1.getValueAt(row,n)))
                           value5 += (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                       //System.out.println("Name1 comes first total \n"+value2);
                      }
                      System.out.println("Name2 comes second total \n"+value5);
                      return value5;
                    
    }
    
     public int Borda3Name2Third(String S2)
    {
        int i = jTable1.getRowCount()-1;
        int j = jTable1.getColumnCount()-1;
                 //System.out.print("i="+i);
                  //System.out.print("j="+j);
                  int row = 2;
                      for(int n=0;n<=j;++n)
                      {
    
                       if(S2 == (jTable1.getValueAt(2,n)))
                           value6 += (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                       //System.out.println("Name1 comes first total \n"+value2);
                      }
                      System.out.println("Name2 comes second total \n"+value6);
                      return value6;
                    
    }
    
     public int Borda3Name3First(String S3)
    {
        int i = jTable1.getRowCount()-1;
        int j = jTable1.getColumnCount()-1;
                 //System.out.print("i="+i);
                  //System.out.print("j="+j);
                  int row = 0;
                      for(int n=0;n<=j;++n)
                      {
    
                       if(S3 == (jTable1.getValueAt(row,n)))
                           value7 += (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                       //System.out.println("Name1 comes first total \n"+value2);
                      }
                      System.out.println("Name3 comes second total \n"+value7);
                      return value7;
                    
    }
     
     public int Borda3Name3Second(String S3)
    {
        int i = jTable1.getRowCount()-1;
        int j = jTable1.getColumnCount()-1;
                 //System.out.print("i="+i);
                  //System.out.print("j="+j);
                  int row = 1;
                      for(int n=0;n<=j;++n)
                      {
    
                       if(S3 == (jTable1.getValueAt(row,n)))
                           value8 += (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                       //System.out.println("Name1 comes first total \n"+value2);
                      }
                      System.out.println("Name3 comes second total \n"+value8);
                      return value8;
                    
    }
    public int Borda3Name3Third(String S3)
    {
        int i = jTable1.getRowCount()-1;
        int j = jTable1.getColumnCount()-1;
                 //System.out.print("i="+i);
                  //System.out.print("j="+j);
                  int row = 2;
                      for(int n=0;n<=j;++n)
                      {
    
                       if(S3 == (jTable1.getValueAt(2,n)))
                           value9 += (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                       //System.out.println("Name1 comes first total \n"+value2);
                      }
                      System.out.println("Name3 comes second total \n"+value9);
                      return value9;
                    
    }
    
    public int Condorcet3Name1Name2(String S1, String S2)
    {
        int i = jTable1.getRowCount()-1;
        int j = jTable1.getColumnCount()-1;
        for(int n=0;n<=j;++n)
        {
        if(((jTable1.getValueAt(0,n)) == S1) && ((jTable1.getValueAt(1,n))==S2))
                {
                 cwval1 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(0,n)) == S1) && ((jTable1.getValueAt(2,n))==S2))
                {
                 cwval2 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(1,n)) == S1) && ((jTable1.getValueAt(2,n))==S2))
                {
                 cwval3 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        }
        cwvalue1 = cwval1+ cwval2 + cwval3;
        return cwvalue1;
    }
    
    public int Condorcet3Name2Name1(String S1, String S2)
    {
        int i = jTable1.getRowCount()-1;
        int j = jTable1.getColumnCount()-1;
        for(int n=0;n<=j;++n)
        {
        if(((jTable1.getValueAt(0,n)) == S2) && ((jTable1.getValueAt(1,n))==S1))
                {
                 cwval4 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(0,n)) == S2) && ((jTable1.getValueAt(2,n))==S1))
                {
                 cwval5 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(1,n)) == S2) && ((jTable1.getValueAt(2,n))==S1))
                {
                 cwval6 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        }
        cwvalue2 = cwval4+ cwval5 + cwval6;
        return cwvalue2;
    }
    
      public int Condorcet3Name1Name3(String S1, String S3)
    {
        int i = jTable1.getRowCount()-1;
        int j = jTable1.getColumnCount()-1;
        for(int n=0;n<=j;++n)
        {
        if(((jTable1.getValueAt(0,n)) == S1) && ((jTable1.getValueAt(1,n))==S3))
                {
                 cwval7 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(0,n)) == S1) && ((jTable1.getValueAt(2,n))==S3))
                {
                 cwval8 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(1,n)) == S1) && ((jTable1.getValueAt(2,n))==S3))
                {
                 cwval9 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        }
        cwvalue3 = cwval7+ cwval8 + cwval9;
        return cwvalue3;
    }
        public int Condorcet3Name3Name1(String S1, String S3)
    {
        int i = jTable1.getRowCount()-1;
        int j = jTable1.getColumnCount()-1;
        for(int n=0;n<=j;++n)
        {
        if(((jTable1.getValueAt(0,n)) == S3) && ((jTable1.getValueAt(1,n))==S1))
                {
                 cwval10 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(0,n)) == S3) && ((jTable1.getValueAt(2,n))==S1))
                {
                 cwval11 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(1,n)) == S3) && ((jTable1.getValueAt(2,n))==S1))
                {
                 cwval12 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        }
        cwvalue4 = cwval4+ cwval5 + cwval6;
        return cwvalue4;
    }
          public int Condorcet3Name2Name3(String S2, String S3)
    {
        int i = jTable1.getRowCount()-1;
        int j = jTable1.getColumnCount()-1;
        for(int n=0;n<=j;++n)
        {
        if(((jTable1.getValueAt(0,n)) == S2) && ((jTable1.getValueAt(1,n))==S3))
                {
                 cwval13 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(0,n)) == S2) && ((jTable1.getValueAt(2,n))==S3))
                {
                 cwval14 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(1,n)) == S2) && ((jTable1.getValueAt(2,n))==S3))
                {
                 cwval15 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        }
        cwvalue5 = cwval4+ cwval5 + cwval6;
        return cwvalue5;
    }
            public int Condorcet3Name3Name2(String S2, String S3)
    {
        int i = jTable1.getRowCount()-1;
        int j = jTable1.getColumnCount()-1;
        for(int n=0;n<=j;++n)
        {
        if(((jTable1.getValueAt(0,n)) == S3) && ((jTable1.getValueAt(1,n))==S2))
                {
                 cwval16 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(0,n)) == S3) && ((jTable1.getValueAt(2,n))==S2))
                {
                 cwval17 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(1,n)) == S3) && ((jTable1.getValueAt(2,n))==S2))
                {
                 cwval18 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        }
        cwvalue6 = cwval4+ cwval5 + cwval6;
        return cwvalue6;
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

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(projectvm.ProjectvmApp.class).getContext().getResourceMap(Display3Data.class);
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {"0", "0", "0", "0", "0", "0"}
            },
            new String [] {
                "P1", "P2", "P3", "P4", "P5", "P6"
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLabel1)
                .addContainerGap(249, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 352, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(45, 45, 45))
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


public void tableContent1(String P)
{
    jTable1.setValueAt(P, 3, 0);
}
public void tableContent2(String Q)
{
    jTable1.setValueAt(Q, 3, 1);
}
public void tableContent3(String R)
{
    jTable1.setValueAt(R, 3, 2);
}
public void tableContent4(String S)
{
    jTable1.setValueAt(S, 3, 3);
}
public void tableContent5(String T)
{
    jTable1.setValueAt(T, 3, 4);
}
public void tableContent6(String U)
{
    jTable1.setValueAt(U, 3, 5);
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
Preference3 p3;
}
