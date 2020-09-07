/********************************************************
 *
 *  Project :  MinCoinsGUI Java 
 *  File    :  MinCoinsGUI.java
 *  Name    :  Nathan Nieman
 *  Date    :  04/08/2018
 *
 *  Description : 
 *
 *    1) Calculates the minimum number of coins for making any amount of change less than a dollar.
 *
 *    2) While, and if structures implemented.
 *
 *    3) Checking if the variable entered by user is greater than 0 in a while and if structure.
 *      While structures used to see if variable entered by user is greater or equal to values of currency.
 *
 *  Assumptions :
 * 
 *  - The user must enter one number between 1-99 or ZERO to exit.
 * 
 *  - The user will not input any special characters.
 * 
 *  - The user is only calculating U.S. currency.
 * 
 *  - The user must understand values of quarters, dimes, nickels, and pennies.
 * 
 *  - The  user must enter a whole number
 * 
 ********************************************************/
package mincoinsgui;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;  // Needed for ActionListener


class MinCoinsGUI extends JFrame
{
    // Instanciate variables
    private JTextField changeTF = new JTextField(3);
    private JLabel quartersLBL = new JLabel("");
    private JLabel dimesLBL = new JLabel("");
    private JLabel nickelsLBL = new JLabel("");
    private JLabel penniesLBL = new JLabel("");

    // Constructor
    public MinCoinsGUI()
    {                                        
        // Create/initialize components
        JButton calcBtn = new JButton("Calculate");  
        JButton clearBtn = new JButton("Clear");  
        
        // Connect listeners to buttons
        calcBtn.addActionListener(new CalculateBtnListener()); 
        clearBtn.addActionListener(new ClearBtnListener()); 

        changeTF.addActionListener(new CalculateBtnListener());

        // Creates content panel, and sets layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6,2,2,2));
        

        // Adds the components to the content panel.
        panel.add(new JLabel("Enter Change (1-99)"));
        panel.add(changeTF);  
        panel.add(new JLabel("Quarter"));
        panel.add(quartersLBL);
        panel.add(new JLabel("Dimes"));
        panel.add(dimesLBL);
        panel.add(new JLabel("Nickels"));
        panel.add(nickelsLBL);
        panel.add(new JLabel("Pennies"));
        panel.add(penniesLBL);
        panel.add(calcBtn);
        panel.add(clearBtn);

        // Set the attributes and pack it.
        setContentPane(panel);
        pack();                               // Layout components
        setTitle("Minimum Coins");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);          // Center window
    }

    // Creating button to calculate coins
    class CalculateBtnListener implements ActionListener
    {        

        public void actionPerformed(ActionEvent e)
        {
            try // Used so if code won't run in TRY it runs in the CATCH
            {
                
            // Initialization
            int coins = 0;
            String changeSTR = changeTF.getText();
            int changeINT = Integer.parseInt(changeSTR);
            
            // Calculate all coins
            while (changeINT >= 25)
            {
                changeINT = changeINT - 25;
                coins++;
            }

            quartersLBL.setText("" + coins);  
            
            coins = 0;
            
            while (changeINT >= 10)
            {
                changeINT = changeINT - 10;
                coins++;
            }

            dimesLBL.setText("" + coins);
            
            coins = 0;
            
            if (changeINT >= 5)
            {
                changeINT = changeINT - 5;
                coins = 1;
            }

            nickelsLBL.setText("" + coins);

            penniesLBL.setText("" + changeINT);
            
            // sets focus and highlighting for user interface
            changeTF.requestFocus();
            changeTF.selectAll();
            }// Try
        
            // Catch for if they enter invalid characters
            catch(NumberFormatException f)
           {
            changeTF.setText("Invalid"); // Tells user there characters are invalid
            changeTF.requestFocus();
            changeTF.selectAll();
           }  
        } // Action
    }// Listener
        
    // Creating button to clear out all variables
    class ClearBtnListener implements ActionListener
    {        
        public void actionPerformed(ActionEvent e)
        {
            changeTF.setText("");           
            quartersLBL.setText("");           
            dimesLBL.setText("");           
            nickelsLBL.setText("");           
            penniesLBL.setText(""); 
            
            changeTF.requestFocus(); // Sets focus for user interface
        }
    }//Listener

    // Main Method
    public static void main(String[] args)
    {
        MinCoinsGUI window = new MinCoinsGUI(); 
        window.setVisible(true); // Setting window to user
    }
}
