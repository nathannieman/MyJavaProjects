/** ******************************************************
 *
 *  Project :  Tic Tac Toe GUI Java
 *  File    :  TicTacToeGUI.java
 *  Name    :  Nathan Nieman
 *  Date    :  04/14/2018
 *
 *  Description :
 *
 *    1) Player 1 picks a letter, X, or O. Player 2 gets the other letter. The player with letter X makes the first move by placing X on any square.
 * Then the player with letter O will place an O on any remaining square. Each player will take a turn until they are able to get 3 of there letters 
 * in the same row column or diagonal this will be a win, or until there are no remaining squares resulting in a tie.
 *
 *    2) catsArray and winsArray used as data structures
 *
 *    3) Using methods to check if player variables are equal to the data inside the arrays.0
 *
 *  Assumptions :
 *
 *  - There will be two players X and O.
 *
 *  - X always goes first.
 *
 *  - Players should take turns going first, being X.
 *
 ******************************************************* */
package tictactoe;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


// Creates class TicTacToe extends JFrame and implements ActionListener to create a GUI window progam and implement interface
public class TicTacToe extends JFrame implements ActionListener
{

    // Declaring fields
    public static boolean xTurn = true;

    // Declares player 1 and player 2
    private Player player1;
    private Player player2;
    private Player cat;

    // Declares Labels in Ram
    private JLabel playerScore1Label;
    private JLabel playerScore2Label;
    private JLabel catScoreLabel;

    // Holds 9 buttons for gameboard
    private static JButton[] button = new JButton[9];

    // Array of winning combinations. Decimal values will be compared bitwise to plays total
    private static int[] winsArray =
    {
        7, 56, 73, 84, 146, 273, 292, 448
    };
    
    // Array of CAT combination of player1 total and player2 total
    private static int[] catsArray =
    {
        511
    };

/****************************************************
 * Method     : constructor
 *
 * Purpose    : The constructor method will hold most of the information and for instantiating variables
 *
 * Parameters : none
 *
 * Returns    : This method does not return a value.
 *
 ****************************************************/  
    public TicTacToe()
    {
        // Create players 
        player1 = new Player(GameUtil.getPlayersName("Player 1 name: "));
        player2 = new Player(GameUtil.getPlayersName("Player 2 name: "));
        cat = new Player("");

        // Sets player to either X or O
        player1.setPlayerMarker('X');
        player2.setPlayerMarker('O');

        // Creates JPanel and sets grid layout
        JPanel gameBoard = new JPanel();
        gameBoard.setLayout(new GridLayout(6, 3, 2, 2));
        
        // Creates border and background color for panel
        gameBoard.setBorder(new TitledBorder(new LineBorder(Color.DARK_GRAY, 5), " TIC TAC TOE "));
        gameBoard.setBackground(Color.lightGray);

        // Loads array and panel
        int myBinary = 1; // Number that will go on each button attribute
        for (int index = 0; index < 9; index++)
        {
            // Create button and add to the array
            button[index] = new JButton("");

            // Add listener to button
            button[index].addActionListener(this);

            // Set button attribute to bitwise int
            button[index].setActionCommand("" + myBinary);
            
            // Change font of buttons
            button[index].setFont(new Font("Chalkboard", Font.BOLD, 40));

            // Set background color of buttons
            button[index].setBackground(Color.gray);

            // Creates border for buttons
            button[index].setBorder(new TitledBorder(new LineBorder(Color.black, 2)));

            // Add button to the panel
            gameBoard.add(button[index]);

            // Get ready for next button
            myBinary = myBinary * 2;

        }

        // Scoreboard Labels 
        JLabel playerOneLabel = new JLabel(" Player 1"); // Creates JLabel
        playerOneLabel.setFont(new Font("Chalkboard", Font.PLAIN, 18)); // Creates  and sets font for JLabel
        playerOneLabel.setForeground(Color.RED);  // Changes font color for JLabel
        playerOneLabel.setBorder(new BevelBorder(BevelBorder.RAISED)); // Changes border of JLabel; created pattern of RAISED and LOWERED borders
        gameBoard.add(playerOneLabel); // Adds JLabel to the gameboard

        JLabel playerName1Label = new JLabel(" " + player1.getPlayerName()); // Creates JLabel
        playerName1Label.setFont(new Font("Chalkboard", Font.PLAIN, 18)); // Creates and sets font for JLabel
        playerName1Label.setForeground(Color.RED); // Changes font color for JLabel
        playerName1Label.setBorder(new BevelBorder(BevelBorder.LOWERED)); // Changes border of JLabel
        gameBoard.add(playerName1Label); // Adds JLabel to the gameboard

        playerScore1Label = new JLabel(); // Creates JLabel
        playerScore1Label.setFont(new Font("Chalkboard", Font.PLAIN, 18)); // Creates  and sets font for JLabel
        playerScore1Label.setForeground(Color.RED); // Changes font color for JLabel
        playerScore1Label.setBorder(new BevelBorder(BevelBorder.RAISED)); // Changes border of JLabel
        gameBoard.add(playerScore1Label); // Adds JLabel to the gameboard

        JLabel playerTwoLabel = new JLabel(" Player 2"); // Creates JLabel
        playerTwoLabel.setFont(new Font("Chalkboard", Font.PLAIN, 18)); // Creates  and sets font for JLabel
        playerTwoLabel.setForeground(Color.BLUE); // Changes font color for JLabel
        playerTwoLabel.setBorder(new BevelBorder(BevelBorder.LOWERED)); // Changes border of JLabel
        gameBoard.add(playerTwoLabel); // Adds JLabel to the gameboard

        JLabel playerName2Label = new JLabel(" " + player2.getPlayerName()); // Creates JLabel
        playerName2Label.setFont(new Font("Chalkboard", Font.PLAIN, 18)); // Creates  and sets font for JLabel
        playerName2Label.setForeground(Color.BLUE); // Changes font color for JLabel
        playerName2Label.setBorder(new BevelBorder(BevelBorder.RAISED)); // Changes border of JLabel
        gameBoard.add(playerName2Label); // Adds JLabel to the gameboard

        playerScore2Label = new JLabel(); // Creates JLabel
        playerScore2Label.setFont(new Font("Chalkboard", Font.PLAIN, 18)); // Creates  and sets font for JLabel
        playerScore2Label.setForeground(Color.BLUE); // Changes font color for JLabel
        playerScore2Label.setBorder(new BevelBorder(BevelBorder.LOWERED)); // Changes border of JLabel
        gameBoard.add(playerScore2Label); // Adds JLabel to the gameboard

        JLabel tiedGameLabel = new JLabel(" Tied Game"); // Creates JLabel
        tiedGameLabel.setFont(new Font("Chalkboard", Font.PLAIN, 18)); // Creates  and sets font for JLabel
        tiedGameLabel.setForeground(Color.magenta); // Changes font color for JLabel
        tiedGameLabel.setBorder(new BevelBorder(BevelBorder.RAISED)); // Changes border of JLabel
        gameBoard.add(tiedGameLabel); // Adds JLabel to the gameboard

        JLabel catLabel = new JLabel(" CAT"); // Creates JLabel
        catLabel.setFont(new Font("Chalkboard", Font.PLAIN, 18)); // Creates  and sets font for JLabel
        catLabel.setForeground(Color.magenta); // Changes font color for JLabel
        catLabel.setBorder(new BevelBorder(BevelBorder.LOWERED)); // Changes border of JLabel
        gameBoard.add(catLabel); // Adds JLabel to the gameboard

        catScoreLabel = new JLabel(); // Creates JLabel
        catScoreLabel.setFont(new Font("Chalkboard", Font.PLAIN, 18)); // Creates  and sets font for JLabel
        catScoreLabel.setForeground(Color.magenta); // Changes font color for JLabel
        catScoreLabel.setBorder(new BevelBorder(BevelBorder.RAISED)); // Changes border of JLabel
        gameBoard.add(catScoreLabel); // Adds JLabel to the gameboard

        // Maintenance for window display
        this.setLocationRelativeTo(null);  // Center window
        this.add(gameBoard); // Adds gameBoard to class
        this.setSize(400, 400); // Sets size of window panel
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Enables close on exit 

    } // Constructor

/****************************************************
 * Method     : actionPerformed
 *
 * Purpose    : The actionPerformed method will be receiving actions (pressing the buttons),
 *              then changes the values and returns actions and values back to the program.
 *
 * Parameters : ActionEvent e             - Hooked up to each button to listen for it being pressed
 *
 * Returns    : This method does not return a value.
 *
 ****************************************************/    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        // Create object name for ActionEvent
        JButton pressedButton = (JButton) e.getSource();

        // Ignore click if button already played
        if (pressedButton.getText() == "")
        {
            if (xTurn) // X took a turn
            {
                pressedButton.setText("X");

                if (player1.getPlayerMarker() == 'X') // If player 1 is X
                {
                    // Retrieves the value of the button from ActionCommand and adds it to players score
                    player1.addPlayerTotal(Integer.parseInt(e.getActionCommand()));
                } 
                else // If player 2 is X
                {
                    // Retrieves the value of the button from ActionCommand and adds it to players score
                    player2.addPlayerTotal(Integer.parseInt(e.getActionCommand()));
                }
                xTurn = false;
            } // IF X took a turn
            
            else // O took a turn
            {
                pressedButton.setText("O");

                if (player1.getPlayerMarker() == 'O') // If player 1 is O
                {
                    // Retrieves the value of the button from ActionCommand and adds it to players score
                    player1.addPlayerTotal(Integer.parseInt(e.getActionCommand()));
                } 
                else // If player 2 is O
                {
                    // Retrieves the value of the button from ActionCommand and adds it to players score
                    player2.addPlayerTotal(Integer.parseInt(e.getActionCommand()));
                }
                xTurn = true;
            } // IF O took a turn

            // IF to check if player1 got any of the winning combinations
            if (check4winner(player1.getPlayerTotal()))
            {
                player1.addPlayerScore(); // Adds 1 to player score after they win
                playerScore1Label.setText("" + player1.getPlayerScore()); // Changes label to show score
                updateScore(player1); // Updates score after each game
                resetGame(); // Resets board and totals after each game
            }

            // IF to check if player2 got any of the winning combinations
            if (check4winner(player2.getPlayerTotal()))
            {
                player2.addPlayerScore(); // Adds 1 to player score after they win
                playerScore2Label.setText("" + player2.getPlayerScore()); // Changes label to show score
                updateScore(player2); // Updates score after each game
                resetGame(); // Resets board and totals after each game
            }
            
            // IF to check player1 total + player2 total is a match for check4cat
            if (check4cat(player1.getPlayerTotal() + player2.getPlayerTotal())) 
            {
                cat.addPlayerScore();
                catScoreLabel.setText("" + cat.getPlayerScore()); // Changes label to show score
                updateScore(cat); // Updates score after each game
                resetGame(); // Resets board and totals after each game
            }       

        } // Ignore IF

    } // Action

/****************************************************
 * Method     : check4winner
 *
 * Purpose    : The check4winner method will check the total and see if it matches any of the combinations from 
 *              winsArray and will return the value as true.
 *
 * Parameters : int             - An integer called total
 *
 * Returns    : This method returns true or false.
 *
 ****************************************************/
    public static boolean check4winner(int total)
    {
        // Loop through the wins array and checking each possible winning combination
        for (int index = 0; index < winsArray.length; index++)
        {
            // Compare the winsArray occurance bitwise to the current total
            if ((winsArray[index] & total) == winsArray[index])
            {
                return true; // Bitwise match, player won
            }
        }  
        return false;

    } // Check4winner
    
/****************************************************
 * Method     : check4cat
 *
 * Purpose    : The check4cat method will check the total and see if it matches the combination from 
 *              catsArray and will return the value as true.
 *
 * Parameters : int             - An integer called total
 *
 * Returns    : This method returns true or false.
 *
 ****************************************************/
    public static boolean check4cat (int total)
    {
        // Loop through the catsArray and checking each possible combination
        for (int index = 0; index < catsArray.length; index++)
        {
            // Compare catsArray occurance bitwise to the current total
            if ((catsArray[index] & total) == catsArray[index])
            {
                return true; // Bitwise match, CAT won
            }
        }
        return false;
        
    } // Check4cat

    
    /****************************************************
 * Method     : resetGame
 *
 * Purpose    : The resetGame method will clear the game board by updating array
 *              of buttons. Then resets players totals to zero for the next game.
 *              Then switches player markers.
 *
 * Parameters : none
 *
 * Returns    : This method does not return a value.
 *
 ****************************************************/
    public void resetGame()
    {
        // Clear the gameboard by updating the array of buttons
        for (int index = 0; index < button.length; index++)
        {
            button[index].setText("");
        }

        // Reset both players total to zero for the next game
        player1.resetPlayerTotal();
        player2.resetPlayerTotal();

        // IF-ELSE to switch player markers after each game
        if (player1.getPlayerMarker() == 'X')
        {
            player1.setPlayerMarker('O');
            player2.setPlayerMarker('X');
        }
        else
        {
            player1.setPlayerMarker('X');
            player2.setPlayerMarker('O'); 
        }
        
        xTurn = true; // Sets it so X always goes first
    }

/****************************************************
 * Method     : updateScore
 *
 * Purpose    : The updateScore method will add 1 to the players total after each game
 *
 * Parameters : player          - Variable to update either players total.
 *
 * Returns    : This method does not return a value.
 *
 ****************************************************/
    public static void updateScore(Player player)
    {
        player.addPlayerTotal(1);
    }

    /****************************************************
 * Method     : main
 *
 * Purpose    : The main method will start the program, instantiates constructor and makes window visible
 *
 * Parameters : string         - Instantiates the class into an object
 *
 * Returns    : This method does not return a value.
 *
 ****************************************************/
    public static void main(String[] args)
    {
        // Instantiates Constructor for main class
        TicTacToe window = new TicTacToe();

        // Makes window visible to user
        window.setVisible(true);

    } // Main

}
