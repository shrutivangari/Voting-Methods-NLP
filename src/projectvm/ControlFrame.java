/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ControlFrame.java
 *
 * Created on Nov 18, 2011, 12:27:25 AM
 */
package projectvm;

/**
 *
 * @author Shruti Vangari
 */
public class ControlFrame extends javax.swing.JFrame {
//Variables declaration
    public String Name1; 
    public String Name2; 
    /** Creates new form ControlFrame */
    public ControlFrame() {
        initComponents();
    }
    
    public void ControlMethod()
    {
        //Object initialization
        HomePage homePage = new HomePage();
        AdminHomePage adminHomePage = new AdminHomePage();
        UserHomePage userHomePage = new UserHomePage();
        AdminMenu adminMenu = new AdminMenu();
        NumberVoters numberVoters = new NumberVoters();
        NumberCandidates numberCandidates = new NumberCandidates();
        Enter2Data enter2Data = new Enter2Data();
        Enter3Data enter3Data = new Enter3Data();
        Enter4Data enter4Data = new Enter4Data();
        Display2Data twoData = new Display2Data();
        Display3Data threeData = new Display3Data();
        Display4Data fourData = new Display4Data();
        MethodSelection methodSelection = new MethodSelection();
        CordorcetMethod cordorcetMethod = new CordorcetMethod();
        BordaMethod bordaMethod = new BordaMethod();
        Results1 resultPage1 = new Results1();
        Results2 resultPage2 = new Results2();
        Results3 resultPage3 = new Results3();
        Display2Names display2n = new Display2Names();
        Display3Names display3n = new Display3Names();
        Display4Names display4n = new Display4Names();
        Preference2 pref2 = new Preference2();
        Preference3 pref3 = new Preference3();
        Preference4 pref4 = new Preference4();
        DisplayPreference dispPreference = new DisplayPreference();
        
        //Components Initialization
        homePage.InitializeAdminRadioButton(adminHomePage); //Home Page
        homePage.InitializeUserRadioButton(userHomePage);
        
        adminHomePage.initializeLoginButton(adminMenu); //Admin Home Page
        
           adminMenu.InitializeNoVotersRB(numberVoters); //First Radio Button
                                                                 //Number of Voters Page
              numberVoters.InitializeAdminMenuButton(adminMenu); 
              numberVoters.InitializeHomePageButton(homePage);
           
           adminMenu.InitializeNoCandidatesRB(numberCandidates);//Second Radio Button
                                                                        //Number of Candidates Page
              numberCandidates.Initialize2CheckBox(enter2Data);
              numberCandidates.Initialize3CheckBox(enter3Data);
              numberCandidates.Initialize4CheckBox(enter4Data);
              numberCandidates.InitializeUserHomePageButton(userHomePage);
              numberCandidates.InitializeAdminMenuButton(adminMenu);
              numberCandidates.InitializeHomePageButton(homePage);
                                                                        //Enter2,3,4 Data and Display
                   enter2Data.InitializeGenerate2tableButton(twoData);
                   enter2Data.InitializeAdminMenuButton(adminMenu);
                   enter2Data.InitializeHomePageButton(homePage);
                   
                       twoData.InitializeAdminMenuButton(adminMenu);
                       twoData.InitializeHomePageButton(homePage);
                   
                   enter3Data.InitializeGenerate3Table(threeData);
                   enter3Data.InitializeAdminMenuButton(adminMenu);
                   enter3Data.InitializeHomePageButton(homePage);
                   
                       threeData.InitializeAdminMenuButton(adminMenu);
                       threeData.InitializeHomePageButton(homePage);
                   
                   enter4Data.InitializeGenerate4tableButton(fourData);
                   enter4Data.InitializeAdminMenuButton(adminMenu);
                   enter4Data.InitializeHomePageButton(homePage);
                   
                       fourData.InitializeAdminMenuButton(adminMenu);
                       fourData.InitializeHomePageButton(homePage);
                   
              adminMenu.InitializeDisplayRB(twoData);//Third Radio Button
              adminMenu.InitializeDisplayRB(threeData);
              adminMenu.InitializeDisplayRB(fourData);
              
              adminMenu.InitializeMethodRB(methodSelection);//Fourth Radio Button
                                                                 //Method Selection
              methodSelection.InitializeCondorcetRB(cordorcetMethod);
              methodSelection.InitializeBordaRB(bordaMethod);
              methodSelection.InitializeAdminMenuButton(adminMenu);
              methodSelection.InitializeHomePageButton(homePage);
                                                                        //Condorcet and Borda
                   cordorcetMethod.InitializeAdminMenuButton(adminMenu);
                   cordorcetMethod.InitializeHomePageButton(homePage);
                   bordaMethod.InitializeAdminMenuButton(adminMenu);
                   bordaMethod.InitializeHomePageButton(homePage);
              
              adminMenu.InitializeResultsPageRB(resultPage1);
              adminMenu.InitializeResultsPageRB(resultPage2);
              adminMenu.InitializeResultsPageRB(resultPage3);
              
          //User Functionality
              enter2Data.InitializeGenerate2tableButton(display2n);
              enter2Data.InitializeGenerate2tableButton(pref2);
              enter3Data.InitializeGenerate3Table(display3n);
              enter3Data.InitializeGenerate3Table(pref3);
              enter4Data.InitializeGenerate4tableButton(display4n);
              enter4Data.InitializeGenerate4tableButton(pref4);
              
                                                            //First Radio Button
              userHomePage.InitializeNoCandidatesRB(numberCandidates);
              userHomePage.InitializeDisplayCRB(display2n);
              userHomePage.InitializeDisplayCRB(display3n);
              userHomePage.InitializeDisplayCRB(display4n);
              
                                                            //Second Radio Button
              userHomePage.InitializePreferenceRB(pref2);
              userHomePage.InitializePreferenceRB(pref3);
              userHomePage.InitializePreferenceRB(pref4);
              
                                                            //Third Radio Button
              userHomePage.InitializeDisplayPRB(dispPreference);
                                                                    //display2,3,4
                    display2n.InitializeProceed2(pref2);
                    display2n.InitializeUserMenuButton(userHomePage);
                    display2n.InitializeHomePageButton(homePage);
                    
                    display3n.InitializeProceed3(pref3);
                    display3n.InitializeUserMenuButton(userHomePage);
                    display3n.InitializeHomePageButton(homePage);
                    
                    display4n.InitializeProceed4(pref4);
                    display4n.InitializeUserMenuButton(userHomePage);
                    display4n.InitializeHomePageButton(homePage);
                    
                                                                    //Preferences 1,2,3
                    pref2.InitializeDisplayPref(dispPreference);
                    pref2.InitializeUserMenuButton(userHomePage);
                    pref2.InitializeHomePageButton(homePage);
                    
                    pref3.InitializeDisplayPref(dispPreference);
                    pref3.InitializeUserMenuButton(userHomePage);
                    pref3.InitializeHomePageButton(homePage);
                    
                    pref4.InitializeDisplayPref(dispPreference);
                    pref4.InitializeUserMenuButton(userHomePage);
                    pref4.InitializeHomePageButton(homePage);
                    
                                                                    //Display Preference
                    dispPreference.InitializeUserMenuButton(userHomePage);
                    dispPreference.InitializeHomePageButton(homePage);
              
              //Borda count
                    
              bordaMethod.BordaCalculateButton(twoData);
              bordaMethod.BordaCalculateButton(threeData);
              bordaMethod.BordaCalculateButton(fourData);
              bordaMethod.BordaCalculateButton(enter2Data);
              bordaMethod.BordaCalculateButton(enter3Data);
              bordaMethod.BordaCalculateButton(enter4Data);
              bordaMethod.BordaCalculateButton(numberCandidates);
              bordaMethod.BordaCalculateButton(resultPage1);
              bordaMethod.BordaCalculateButton(resultPage2);
              bordaMethod.BordaCalculateButton(resultPage3);
              
              //Result page 1 2 and 3 
              resultPage1.InitializeAdminMenuButton(adminMenu);
              resultPage1.InitializeHomePageButton(homePage);
              resultPage1.DeclareWinner(bordaMethod);
              resultPage1.DeclareWinner(enter2Data);
              resultPage1.DeclareWinner(cordorcetMethod);
              resultPage1.DeclareWinner(methodSelection);
              
              resultPage2.InitializeAdminMenuButton(adminMenu);
              resultPage2.InitializeHomePageButton(homePage);
              resultPage2.DeclareWinner(bordaMethod);
              resultPage2.DeclareWinner(enter3Data);
              resultPage2.DeclareWinner(cordorcetMethod);
              resultPage2.DeclareWinner(methodSelection);
              
              resultPage3.InitializeAdminMenuButton(adminMenu);
              resultPage3.InitializeHomePageButton(homePage);
              resultPage3.DeclareWinner(bordaMethod);
              resultPage3.DeclareWinner(enter4Data);
              resultPage3.DeclareWinner(methodSelection);
              resultPage3.DeclareWinner(cordorcetMethod);
              
              //Counter logic
              
              pref2.InitializeDisplayPref(twoData);
              pref2.InitializeDisplayPref(numberVoters);
              
              pref3.InitializeDisplayPref(threeData);
              pref3.InitializeDisplayPref(numberVoters);
              
              pref4.InitializeDisplayPref(fourData);
              pref4.InitializeDisplayPref(numberVoters);
              
              //Cordorcet Method
              
              cordorcetMethod.InitializeCordorcetCalculateButton(twoData);
              cordorcetMethod.InitializeCordorcetCalculateButton(threeData);
              cordorcetMethod.InitializeCordorcetCalculateButton(fourData);
              cordorcetMethod.InitializeCordorcetCalculateButton(enter2Data);
              cordorcetMethod.InitializeCordorcetCalculateButton(enter3Data);
              cordorcetMethod.InitializeCordorcetCalculateButton(enter4Data);
              cordorcetMethod.InitializeCordorcetCalculateButton(numberCandidates);
              cordorcetMethod.InitializeCordorcetCalculateButton(resultPage1);
              cordorcetMethod.InitializeCordorcetCalculateButton(resultPage2);
              cordorcetMethod.InitializeCordorcetCalculateButton(resultPage3);
              
              
        
        //First Page call
        homePage.setVisible(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
