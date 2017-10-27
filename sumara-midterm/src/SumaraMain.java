/**
 * Created by junaidali on 12/21/14.
 */
import javax.swing.*;

public class SumaraMain extends JFrame {


    public static void main(String[] args)
    {
        //sets up grid object
        Grid game = new Grid();
        //game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setVisible(true);
        game.pack();
        game.setTitle("Jeopardy");
        game.setSize(1365, 800);
    }


}

