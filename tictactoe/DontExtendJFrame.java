
package tictactoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DontExtendJFrame implements ActionListener
{
    public DontExtendJFrame ()
    {
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
    }
    
    public static void main(String[] args)
    {
        DontExtendJFrame instance = new DontExtendJFrame();
    }
}
