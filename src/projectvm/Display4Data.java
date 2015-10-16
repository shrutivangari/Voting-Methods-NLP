/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Display4Data.java
 *
 * Created on Nov 18, 2011, 2:38:57 PM
 */
package projectvm;

/**
 *
 * @author Shruti Vangari
 */
public class Display4Data extends javax.swing.JFrame {
public int value1,value2,value3,value4,value5,value6,value7,value8,value9,value10,value11,value12;
public int cw4value1,cw4value2,cw4value3,cw4value4,cw4value5,cw4value6;
public int cw4value7,cw4value8,cw4value9,cw4value10,cw4value11,cw4value12;


    /** Creates new form Display4Data */
    public Display4Data() {
        initComponents();
    }
    
    public void Set4Names(String S1, String S2, String S3, String S4)
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

     public int Borda4Name1First(String S1)
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
    public int Borda4Name1Second(String S1)
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
    
     public int Borda4Name1Third(String S1)
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
     
         public int Borda4Name1Fourth(String S1)
    {
        int i = jTable1.getRowCount()-1;
        int j = jTable1.getColumnCount()-1;
                 //System.out.print("i="+i);
                  //System.out.print("j="+j);
                  int row=3;
                      for(int n=0;n<=j;++n)
                      {
    
                       if(S1 == (jTable1.getValueAt(row,n)))
                           value10 += (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                       //System.out.println("Name1 comes first total \n"+value2);
                      }
                      System.out.println("Name1 comes second total \n"+value10);
                      return value10;
                    
    }
    
     public int Borda4Name2First(String S2)
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
    
     public int Borda4Name2Second(String S2)
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
    
     public int Borda4Name2Third(String S2)
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
     
        public int Borda4Name2Fourth(String S2)
    {
        int i = jTable1.getRowCount()-1;
        int j = jTable1.getColumnCount()-1;
                 //System.out.print("i="+i);
                  //System.out.print("j="+j);
                  int row = 3;
                      for(int n=0;n<=j;++n)
                      {
    
                       if(S2 == (jTable1.getValueAt(2,n)))
                           value11 += (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                       //System.out.println("Name1 comes first total \n"+value2);
                      }
                      System.out.println("Name2 comes second total \n"+value11);
                      return value11;
                    
    }
    
     public int Borda4Name3First(String S3)
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
     
     public int Borda4Name3Second(String S3)
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
    public int Borda4Name3Third(String S3)
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
    
      public int Borda4Name3Fourth(String S3)
    {
        int i = jTable1.getRowCount()-1;
        int j = jTable1.getColumnCount()-1;
                 //System.out.print("i="+i);
                  //System.out.print("j="+j);
                  int row = 3;
                      for(int n=0;n<=j;++n)
                      {
    
                       if(S3 == (jTable1.getValueAt(2,n)))
                           value12 += (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                       //System.out.println("Name1 comes first total \n"+value2);
                      }
                      System.out.println("Name3 comes second total \n"+value12);
                      return value12;
                    
    }
    
      public int Condorcet4Name1Name2(String S1, String S2)
    {
        int c1 = 0,c2 = 0,c3 = 0,c4 = 0,c5 = 0,c6 = 0;
        int i = jTable1.getRowCount()-1;
        int j = jTable1.getColumnCount()-1;
        for(int n=0;n<=j;++n)
        {
        if(((jTable1.getValueAt(0,n)) == S1) && ((jTable1.getValueAt(1,n))==S2))
                {
                 c1 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(0,n)) == S1) && ((jTable1.getValueAt(2,n))==S2))
                {
                 c2 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(0,n)) == S1) && ((jTable1.getValueAt(3,n))==S2))
                {
                 c3 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(1,n)) == S1) && ((jTable1.getValueAt(2,n))==S2))
                {
                 c4 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(1,n)) == S1) && ((jTable1.getValueAt(3,n))==S2))
                {
                 c5 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(2,n)) == S1) && ((jTable1.getValueAt(3,n))==S2))
                {
                 c6 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        }
        cw4value1 = c1 + c2 + c3 + c4 + c5 + c6;
        return cw4value1;
    }
     
       public int Condorcet4Name2Name1(String S1, String S2)
    {
        int c1 = 0,c2 = 0,c3 = 0,c4 = 0,c5 = 0,c6 = 0;
        int i = jTable1.getRowCount()-1;
        int j = jTable1.getColumnCount()-1;
        for(int n=0;n<=j;++n)
        {
        if(((jTable1.getValueAt(0,n)) == S2) && ((jTable1.getValueAt(1,n))==S1))
                {
                 c1 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(0,n)) == S2) && ((jTable1.getValueAt(2,n))==S1))
                {
                 c2 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(0,n)) == S2) && ((jTable1.getValueAt(3,n))==S1))
                {
                 c3 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(1,n)) == S2) && ((jTable1.getValueAt(2,n))==S1))
                {
                 c4 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(1,n)) == S2) && ((jTable1.getValueAt(3,n))==S1))
                {
                 c5 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(2,n)) == S2) && ((jTable1.getValueAt(3,n))==S1))
                {
                 c6 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        }
        cw4value2 = c1 + c2 + c3 + c4 + c5 + c6;
        return cw4value2;
    }
        public int Condorcet4Name1Name3(String S1, String S3)
    {
        int c1 = 0,c2 = 0,c3 = 0,c4 = 0,c5 = 0,c6 = 0;
        int i = jTable1.getRowCount()-1;
        int j = jTable1.getColumnCount()-1;
        for(int n=0;n<=j;++n)
        {
        if(((jTable1.getValueAt(0,n)) == S1) && ((jTable1.getValueAt(1,n))==S3))
                {
                 c1 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(0,n)) == S1) && ((jTable1.getValueAt(2,n))==S3))
                {
                 c2 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(0,n)) == S1) && ((jTable1.getValueAt(3,n))==S3))
                {
                 c3 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(1,n)) == S1) && ((jTable1.getValueAt(2,n))==S3))
                {
                 c4 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(1,n)) == S1) && ((jTable1.getValueAt(3,n))==S3))
                {
                 c5 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(2,n)) == S1) && ((jTable1.getValueAt(3,n))==S3))
                {
                 c6 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        }
        cw4value3 = c1 + c2 + c3 + c4 + c5 + c6;
        return cw4value3;
    }
         public int Condorcet4Name3Name1(String S1, String S3)
    {
        int c1 = 0,c2 = 0,c3 = 0,c4 = 0,c5 = 0,c6 = 0;
        int i = jTable1.getRowCount()-1;
        int j = jTable1.getColumnCount()-1;
        for(int n=0;n<=j;++n)
        {
        if(((jTable1.getValueAt(0,n)) == S3) && ((jTable1.getValueAt(1,n))==S1))
                {
                 c1 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(0,n)) == S3) && ((jTable1.getValueAt(2,n))==S1))
                {
                 c2 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(0,n)) == S3) && ((jTable1.getValueAt(3,n))==S1))
                {
                 c3 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(1,n)) == S3) && ((jTable1.getValueAt(2,n))==S1))
                {
                 c4 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(1,n)) == S3) && ((jTable1.getValueAt(3,n))==S1))
                {
                 c5 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(2,n)) == S3) && ((jTable1.getValueAt(3,n))==S1))
                {
                 c6 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        }
        cw4value4 = c1 + c2 + c3 + c4 + c5 + c6;
        return cw4value4;
    }
          public int Condorcet4Name1Name4(String S1, String S4)
    {
        int c1 = 0,c2 = 0,c3 = 0,c4 = 0,c5 = 0,c6 = 0;
        int i = jTable1.getRowCount()-1;
        int j = jTable1.getColumnCount()-1;
        for(int n=0;n<=j;++n)
        {
        if(((jTable1.getValueAt(0,n)) == S1) && ((jTable1.getValueAt(1,n))==S4))
                {
                 c1 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(0,n)) == S1) && ((jTable1.getValueAt(2,n))==S4))
                {
                 c2 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(0,n)) == S1) && ((jTable1.getValueAt(3,n))==S4))
                {
                 c3 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(1,n)) == S1) && ((jTable1.getValueAt(2,n))==S4))
                {
                 c4 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(1,n)) == S1) && ((jTable1.getValueAt(3,n))==S4))
                {
                 c5 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(2,n)) == S1) && ((jTable1.getValueAt(3,n))==S4))
                {
                 c6 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        }
        cw4value5 = c1 + c2 + c3 + c4 + c5 + c6;
        return cw4value5;
    }
           public int Condorcet4Name4Name1(String S1, String S4)
    {
        int c1 = 0,c2 = 0,c3 = 0,c4 = 0,c5 = 0,c6 = 0;
        int i = jTable1.getRowCount()-1;
        int j = jTable1.getColumnCount()-1;
        for(int n=0;n<=j;++n)
        {
        if(((jTable1.getValueAt(0,n)) == S4) && ((jTable1.getValueAt(1,n))==S1))
                {
                 c1 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(0,n)) == S4) && ((jTable1.getValueAt(2,n))==S1))
                {
                 c2 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(0,n)) == S4) && ((jTable1.getValueAt(3,n))==S1))
                {
                 c3 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(1,n)) == S4) && ((jTable1.getValueAt(2,n))==S1))
                {
                 c4 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(1,n)) == S4) && ((jTable1.getValueAt(3,n))==S1))
                {
                 c5 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(2,n)) == S4) && ((jTable1.getValueAt(3,n))==S1))
                {
                 c6 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        }
        cw4value6 = c1 + c2 + c3 + c4 + c5 + c6;
        return cw4value6;
    }
            public int Condorcet4Name2Name3(String S2, String S3)
    {
        int c1 = 0,c2 = 0,c3 = 0,c4 = 0,c5 = 0,c6 = 0;
        int i = jTable1.getRowCount()-1;
        int j = jTable1.getColumnCount()-1;
        for(int n=0;n<=j;++n)
        {
        if(((jTable1.getValueAt(0,n)) == S2) && ((jTable1.getValueAt(1,n))==S3))
                {
                 c1 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(0,n)) == S2) && ((jTable1.getValueAt(2,n))==S3))
                {
                 c2 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(0,n)) == S2) && ((jTable1.getValueAt(3,n))==S3))
                {
                 c3 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(1,n)) == S2) && ((jTable1.getValueAt(2,n))==S3))
                {
                 c4 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(1,n)) == S2) && ((jTable1.getValueAt(3,n))==S3))
                {
                 c5 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(2,n)) == S2) && ((jTable1.getValueAt(3,n))==S3))
                {
                 c6 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        }
        cw4value7 = c1 + c2 + c3 + c4 + c5 + c6;
        return cw4value7;
    }
        public int Condorcet4Name3Name2(String S2, String S3)
    {
        int c1 = 0,c2 = 0,c3 = 0,c4 = 0,c5 = 0,c6 = 0;
        int i = jTable1.getRowCount()-1;
        int j = jTable1.getColumnCount()-1;
        for(int n=0;n<=j;++n)
        {
        if(((jTable1.getValueAt(0,n)) == S3) && ((jTable1.getValueAt(1,n))==S2))
                {
                 c1 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(0,n)) == S3) && ((jTable1.getValueAt(2,n))==S2))
                {
                 c2 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(0,n)) == S3) && ((jTable1.getValueAt(3,n))==S2))
                {
                 c3 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(1,n)) == S3) && ((jTable1.getValueAt(2,n))==S2))
                {
                 c4 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(1,n)) == S3) && ((jTable1.getValueAt(3,n))==S2))
                {
                 c5 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(2,n)) == S3) && ((jTable1.getValueAt(3,n))==S2))
                {
                 c6 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        }
        cw4value8 = c1 + c2 + c3 + c4 + c5 + c6;
        return cw4value8;
    }
         public int Condorcet4Name2Name4(String S2, String S4)
    {
        int c1 = 0,c2 = 0,c3 = 0,c4 = 0,c5 = 0,c6 = 0;
        int i = jTable1.getRowCount()-1;
        int j = jTable1.getColumnCount()-1;
        for(int n=0;n<=j;++n)
        {
        if(((jTable1.getValueAt(0,n)) == S2) && ((jTable1.getValueAt(1,n))==S4))
                {
                 c1 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(0,n)) == S2) && ((jTable1.getValueAt(2,n))==S4))
                {
                 c2 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(0,n)) == S2) && ((jTable1.getValueAt(3,n))==S4))
                {
                 c3 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(1,n)) == S2) && ((jTable1.getValueAt(2,n))==S4))
                {
                 c4 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(1,n)) == S2) && ((jTable1.getValueAt(3,n))==S4))
                {
                 c5 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(2,n)) == S2) && ((jTable1.getValueAt(3,n))==S4))
                {
                 c6 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        }
        cw4value9 = c1 + c2 + c3 + c4 + c5 + c6;
        return cw4value9;
    }
          public int Condorcet4Name4Name2(String S2, String S4)
    {
        int c1 = 0,c2 = 0,c3 = 0,c4 = 0,c5 = 0,c6 = 0;
        int i = jTable1.getRowCount()-1;
        int j = jTable1.getColumnCount()-1;
        for(int n=0;n<=j;++n)
        {
        if(((jTable1.getValueAt(0,n)) == S4) && ((jTable1.getValueAt(1,n))==S2))
                {
                 c1 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(0,n)) == S4) && ((jTable1.getValueAt(2,n))==S2))
                {
                 c2 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(0,n)) == S4) && ((jTable1.getValueAt(3,n))==S2))
                {
                 c3 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(1,n)) == S4) && ((jTable1.getValueAt(2,n))==S2))
                {
                 c4 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(1,n)) == S4) && ((jTable1.getValueAt(3,n))==S2))
                {
                 c5 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(2,n)) == S4) && ((jTable1.getValueAt(3,n))==S2))
                {
                 c6 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        }
        cw4value10 = c1 + c2 + c3 + c4 + c5 + c6;
        return cw4value10;
    }
           public int Condorcet4Name3Name4(String S3, String S4)
    {
        int c1 = 0,c2 = 0,c3 = 0,c4 = 0,c5 = 0,c6 = 0;
        int i = jTable1.getRowCount()-1;
        int j = jTable1.getColumnCount()-1;
        for(int n=0;n<=j;++n)
        {
        if(((jTable1.getValueAt(0,n)) == S3) && ((jTable1.getValueAt(1,n))==S4))
                {
                 c1 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(0,n)) == S3) && ((jTable1.getValueAt(2,n))==S4))
                {
                 c2 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(0,n)) == S3) && ((jTable1.getValueAt(3,n))==S4))
                {
                 c3 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(1,n)) == S3) && ((jTable1.getValueAt(2,n))==S4))
                {
                 c4 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(1,n)) == S3) && ((jTable1.getValueAt(3,n))==S4))
                {
                 c5 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(2,n)) == S3) && ((jTable1.getValueAt(3,n))==S4))
                {
                 c6 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        }
        cw4value11 = c1 + c2 + c3 + c4 + c5 + c6;
        return cw4value11;
    }
            public int Condorcet4Name4Name3(String S3, String S4)
    {
        int c1 = 0,c2 = 0,c3 = 0,c4 = 0,c5 = 0,c6 = 0;
        int i = jTable1.getRowCount()-1;
        int j = jTable1.getColumnCount()-1;
        for(int n=0;n<=j;++n)
        {
        if(((jTable1.getValueAt(0,n)) == S4) && ((jTable1.getValueAt(1,n))==S3))
                {
                 c1 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(0,n)) == S4) && ((jTable1.getValueAt(2,n))==S3))
                {
                 c2 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(0,n)) == S4) && ((jTable1.getValueAt(3,n))==S3))
                {
                 c3 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(1,n)) == S4) && ((jTable1.getValueAt(2,n))==S3))
                {
                 c4 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(1,n)) == S4) && ((jTable1.getValueAt(3,n))==S3))
                {
                 c5 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        if(((jTable1.getValueAt(2,n)) == S4) && ((jTable1.getValueAt(3,n))==S3))
                {
                 c6 = (Integer.parseInt(jTable1.getValueAt(i,n).toString()));
                }
        }
        cw4value12 = c1 + c2 + c3 + c4 + c5 + c6;
        return cw4value12;
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

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(projectvm.ProjectvmApp.class).getContext().getResourceMap(Display4Data.class);
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"}
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
                .addContainerGap(345, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(411, 411, 411))
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 557, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(92, 92, 92))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(77, 77, 77))
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

public void tableContent1(String S)
{
    jTable1.setValueAt(S, 4, 0);
}
public void tableContent2(String S)
{
    jTable1.setValueAt(S, 4, 1);
}
public void tableContent3(String S)
{
    jTable1.setValueAt(S, 4, 2);
}
public void tableContent4(String S)
{
    jTable1.setValueAt(S, 4, 3);
}
public void tableContent5(String S)
{
    jTable1.setValueAt(S, 4, 4);
}
public void tableContent6(String S)
{
    jTable1.setValueAt(S, 4, 5);
}

public void tableContent7(String S)
{
    jTable1.setValueAt(S, 4, 6);
}
public void tableContent8(String S)
{
    jTable1.setValueAt(S, 4, 7);
}
public void tableContent9(String S)
{
    jTable1.setValueAt(S, 4, 8);
}
public void tableContent10(String S)
{
    jTable1.setValueAt(S, 4, 9);
}
public void tableContent11(String S)
{
    jTable1.setValueAt(S, 4, 10);
}
public void tableContent12(String S)
{
    jTable1.setValueAt(S, 4, 11);
}
public void tableContent13(String S)
{
    jTable1.setValueAt(S, 4, 12);
}
public void tableContent14(String S)
{
    jTable1.setValueAt(S, 4, 13);
}
public void tableContent15(String S)
{
    jTable1.setValueAt(S, 4, 14);
}
public void tableContent16(String S)
{
    jTable1.setValueAt(S, 4, 15);
}
public void tableContent17(String S)
{
    jTable1.setValueAt(S, 4, 16);
}
public void tableContent18(String S)
{
    jTable1.setValueAt(S, 4, 17);
}
public void tableContent19(String S)
{
    jTable1.setValueAt(S, 4, 18);
}
public void tableContent20(String S)
{
    jTable1.setValueAt(S, 4, 19);
}
public void tableContent21(String S)
{
    jTable1.setValueAt(S, 4, 20);
}
public void tableContent22(String S)
{
    jTable1.setValueAt(S, 4, 21);
}
public void tableContent23(String S)
{
    jTable1.setValueAt(S, 4, 22);
}
public void tableContent24(String S)
{
    jTable1.setValueAt(S, 4, 23);
}

public void InitializeAdminMenuButton(AdminMenu a)
{
    am=a;
}

public void InitializeHomePageButton(HomePage h)
{
    hp=h;
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
}
