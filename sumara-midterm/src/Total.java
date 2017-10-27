import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by junaidali on 1/5/15.
 */
public class Total extends JFrame
{
    public static int playnum;
    public static String[] player = new String[playnum];

    public Total()
    {
        String play = JOptionPane.showInputDialog("Enter number of players");
        playnum = Integer.parseInt(play);

        String[] player = new String[playnum];

        for(int i = 0; i < playnum; i++)
        {
            player[i] = JOptionPane.showInputDialog("Enter player " + (i+1) + "'s name");
        }

        setLayout(new GridLayout(2, playnum));

        JLabel[] label = new JLabel[playnum * 2];
        for(int i = 0; i < playnum; i++)
        {
            label[i] = new JLabel(player[i] + "'s score: ");
            add(label[i]);
        }

        int[] score = new int[playnum];

        for(int i = playnum; i < playnum*2; i++)
        {
            label[i] = new JLabel(score[i-playnum] + " points");
            add(label[i]);
        }

    }
}
