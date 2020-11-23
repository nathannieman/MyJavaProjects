package tictactoe;

// Class for player object
public class Player
{
    // Instanciating Class Fields, about the object
    private String playerName = ""; // Player Name
    private char playerMarker; // Character used to mark the board
    private int playerScore = 0; // Score of player for that round
    private int playerTotal = 0; // Total wins by player
    
    
    // Recieves player name as attribute
    public Player (String name)
    {
        this.playerName = name;
    }

    // Gets player name and returns it to the variable.
    public String getPlayerName()
    {
        return playerName;
    }
    
    public void setPlayerName(String playerName)
    {
        this.playerName = playerName;
    }

    // Gets marker for player and returns it to the variable
    public char getPlayerMarker()
    {
        return playerMarker;
    }

    // Sets player marker to a specific character
    public void setPlayerMarker(char marker)
    {
        this.playerMarker = marker;
    }
    
    public int getPlayerScore() // Games won
    {
        return playerScore;
    }
  
    // Adds 1 to player score after win
    public void addPlayerScore()
    {
        this.playerScore++;
    }

    // Gets players total and returns it to the variable
    public int getPlayerTotal()
    {
        return playerTotal;
    }

   // Adds players total points during the game
    public void addPlayerTotal(int playerTotal)
    {
        this.playerTotal = this.playerTotal + playerTotal;
    }
    
    // Resets player total
    public void resetPlayerTotal()
    {
        playerTotal = 0;
    }
    
    
} // End of Class
