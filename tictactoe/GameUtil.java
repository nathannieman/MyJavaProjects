
package tictactoe;

import javax.swing.JOptionPane;

public class GameUtil
{
    
    public static String getPlayersName(String prompt)
    {
        String name = "";
        
        while (name.length() < 1)
        {
            name = JOptionPane.showInputDialog(prompt);
        }
        return name;
    }
    
}
