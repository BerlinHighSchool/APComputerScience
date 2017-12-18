/**
 * Created by mcwirka on 10/1/15.
 */
import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class Tenzi extends JPanel
{
	/* ***********************
     * Sets up initial images
     ************************* */
    static java.net.URL dice1 = Tenzi.class.getResource("resources/die1.png");
    static ImageIcon die1 = new ImageIcon(dice1);
    static java.net.URL dice2 = Tenzi.class.getResource("resources/die2.png");
    static ImageIcon die2 = new ImageIcon(dice2);
    static java.net.URL dice3 = Tenzi.class.getResource("resources/die3.png");
    static ImageIcon die3 = new ImageIcon(dice3);
    static java.net.URL dice4 = Tenzi.class.getResource("resources/die4.png");
    static ImageIcon die4 = new ImageIcon(dice4);
    static java.net.URL dice5 = Tenzi.class.getResource("resources/die5.png");
    static ImageIcon die5 = new ImageIcon(dice5);
    static java.net.URL dice6 = Tenzi.class.getResource("resources/die6.png");
    static ImageIcon die6 = new ImageIcon(dice6);

    /* **********************************************************
     * Instantiates (and assigns some) required global variables
     ************************************************************ */
    Timer timer;
    int count = 0;
    boolean over = false;
    static JLabel d1, d2, d3, d4, d5, d6, d7, d8, d9, d10;
    JLabel timerDisplay = new JLabel("Time: " + count);
    static JButton h1 = new JButton("Hold");
    static JButton h2 = new JButton("Hold");
    static JButton h3 = new JButton("Hold");
    static JButton h4 = new JButton("Hold");
    static JButton h5 = new JButton("Hold");
    static JButton h6 = new JButton("Hold");
    static JButton h7 = new JButton("Hold");
    static JButton h8 = new JButton("Hold");
    static JButton h9 = new JButton("Hold");
    static JButton h10 = new JButton("Hold");
    static JButton roll = new JButton("Roll");
    static Long StartA, EndA;
    Random g = new Random();
    ButtonListener listener = new ButtonListener();
    static JFrame frame = new JFrame("Tenzi!");
    static JPanel p1 = new JPanel();
    static int[] rolls = new int[10];

    public Tenzi()
    {
    	/* *****************************************
         * Sets up JLabels to display the die rolls
         ******************************************* */
        d1 = new JLabel();
        d2 = new JLabel();
        d3 = new JLabel();
        d4 = new JLabel();
        d5 = new JLabel();
        d6 = new JLabel();
        d7 = new JLabel();
        d8 = new JLabel();
        d9 = new JLabel();
        d10 = new JLabel();
    }
    
    public void displayScreen()
    {
        p1.setLayout(null);
        p1.setPreferredSize(new Dimension(800, 600));

        /* ***********************************
         * Adds the hold buttons to the panel
         ************************************* */
        p1.add(h1);
        p1.add(h2);
        p1.add(h3);
        p1.add(h4);
        p1.add(h5);
        p1.add(h6);
        p1.add(h7);
        p1.add(h8);
        p1.add(h9);
        p1.add(h10);
        p1.add(roll);

        /* *************************************
         * Size, location, listeners of buttons
         *************************************** */
        h1.setLocation(30, 200);
        h1.setSize(140, 20);
        h1.addActionListener(listener);
        h2.setLocation(180, 200);
        h2.setSize(140, 20);
        h2.addActionListener(listener);
        h3.setLocation(330, 200);
        h3.setSize(140, 20);
        h3.addActionListener(listener);
        h4.setLocation(480, 200);
        h4.setSize(140, 20);
        h4.addActionListener(listener);
        h5.setLocation(630, 200);
        h5.setSize(140, 20);
        h5.addActionListener(listener);
        h6.setLocation(30, 400);
        h6.setSize(140, 20);
        h6.addActionListener(listener);
        h7.setLocation(180, 400);
        h7.setSize(140, 20);
        h7.addActionListener(listener);
        h8.setLocation(330, 400);
        h8.setSize(140, 20);
        h8.addActionListener(listener);
        h9.setLocation(480, 400);
        h9.setSize(140, 20);
        h9.addActionListener(listener);
        h10.setLocation(630, 400);
        h10.setSize(140, 20);
        h10.addActionListener(listener);
        roll.setSize(200, 60);
        roll.setLocation(300, 450);
        roll.addActionListener(listener);

        /* ***********************************
         * Adds the die labels to the panel
         ************************************* */
        p1.add(d1);
        p1.add(d2);
        p1.add(d3);
        p1.add(d4);
        p1.add(d5);
        p1.add(d6);
        p1.add(d7);
        p1.add(d8);
        p1.add(d9);
        p1.add(d10);
        p1.add(timerDisplay);

        /* ***********************************
         * Size, location of die labels
         ************************************* */
        d1.setLocation(30, (50));
        d1.setSize(160,160);
        d2.setLocation(180, (50));
        d2.setSize(160,160);
        d3.setLocation(330, (50));
        d3.setSize(160,160);
        d4.setLocation(480, (50));
        d4.setSize(160,160);
        d5.setLocation(630, (50));
        d5.setSize(160,160);
        d6.setLocation(30, (250));
        d6.setSize(160,160);
        d7.setLocation(180, (250));
        d7.setSize(160,160);
        d8.setLocation(330, (250));
        d8.setSize(160,160);
        d9.setLocation(480, (250));
        d9.setSize(160,160);
        d10.setLocation(630, (250));
        d10.setSize(160,160);
        timerDisplay.setLocation(350, 530);
        timerDisplay.setSize(100, 50);

        frame.getContentPane().add(p1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        /* ******************************************************************
         * Timer tracking how long it takes user to complete game objective.
         ******************************************************************** */
        StartA = System.currentTimeMillis();
        timer = new Timer(1000, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                if (over) timer.stop();
                timerDisplay.setText("Time: " + count);
            }
        });
        timer.start();

        /* **********************
         * Rolls dice first time
         ************************ */
        rollDice();
    }

    /* *************************************************
     * Stores all 10 rolled values to the array 'rolls'
     *************************************************** */
    public void rollDice()
    {

        for(int i = 0; i < rolls.length; i++)
            rolls[i] = g.nextInt(6)+1;

        /* **********************************************
         * Calls method to display appropriate die image
         ************************************************ */
        displayDieRoll();
    }

    /* ***********************************
     * Displays the appropriate die image
     ************************************* */
    public void displayDieRoll()
    {
        for(int i = 0; i < rolls.length; i++)
        {
            /* **************
             * First die
             **************** */
            if (i == 0 && rolls[i] == 1)
                d1.setIcon(die1);
            if (i == 0 && rolls[i] == 2)
                d1.setIcon(die2);
            if (i == 0 && rolls[i] == 3)
                d1.setIcon(die3);
            if (i == 0 && rolls[i] == 4)
                d1.setIcon(die4);
            if (i == 0 && rolls[i] == 5)
                d1.setIcon(die5);
            if (i == 0 && rolls[i] == 6)
                d1.setIcon(die6);

           /* **************
            * Second die
            **************** */
            if (i == 1 && rolls[i] == 1)
                d2.setIcon(die1);
            if (i == 1 && rolls[i] == 2)
                d2.setIcon(die2);
            if (i == 1 && rolls[i] == 3)
                d2.setIcon(die3);
            if (i == 1 && rolls[i] == 4)
                d2.setIcon(die4);
            if (i == 1 && rolls[i] == 5)
                d2.setIcon(die5);
            if (i == 1 && rolls[i] == 6)
                d2.setIcon(die6);

           /* **************
            * Third die
            **************** */
            if (i == 2 && rolls[i] == 1)
                d3.setIcon(die1);
            if (i == 2 && rolls[i] == 2)
                d3.setIcon(die2);
            if (i == 2 && rolls[i] == 3)
                d3.setIcon(die3);
            if (i == 2 && rolls[i] == 4)
                d3.setIcon(die4);
            if (i == 2 && rolls[i] == 5)
                d3.setIcon(die5);
            if (i == 2 && rolls[i] == 6)
                d3.setIcon(die6);

            /* **************
             * Fourth die
             **************** */
            if (i == 3 && rolls[i] == 1)
                d4.setIcon(die1);
            if (i == 3 && rolls[i] == 2)
                d4.setIcon(die2);
            if (i == 3 && rolls[i] == 3)
                d4.setIcon(die3);
            if (i == 3 && rolls[i] == 4)
                d4.setIcon(die4);
            if (i == 3 && rolls[i] == 5)
                d4.setIcon(die5);
            if (i == 3 && rolls[i] == 6)
                d4.setIcon(die6);

            /* **************
             * Fifth die
             **************** */
            if (i == 4 && rolls[i] == 1)
                d5.setIcon(die1);
            if (i == 4 && rolls[i] == 2)
                d5.setIcon(die2);
            if (i == 4 && rolls[i] == 3)
                d5.setIcon(die3);
            if (i == 4 && rolls[i] == 4)
                d5.setIcon(die4);
            if (i == 4 && rolls[i] == 5)
                d5.setIcon(die5);
            if (i == 4 && rolls[i] == 6)
                d5.setIcon(die6);

            /* **************
             * Sixth die
             **************** */
            if (i == 5 && rolls[i] == 1)
                d6.setIcon(die1);
            if (i == 5 && rolls[i] == 2)
                d6.setIcon(die2);
            if (i == 5 && rolls[i] == 3)
                d6.setIcon(die3);
            if (i == 5 && rolls[i] == 4)
                d6.setIcon(die4);
            if (i == 5 && rolls[i] == 5)
                d6.setIcon(die5);
            if (i == 5 && rolls[i] == 6)
                d6.setIcon(die6);

            /* **************
             * Seventh die
             **************** */
            if (i == 6 && rolls[i] == 1)
                d7.setIcon(die1);
            if (i == 6 && rolls[i] == 2)
                d7.setIcon(die2);
            if (i == 6 && rolls[i] == 3)
                d7.setIcon(die3);
            if (i == 6 && rolls[i] == 4)
                d7.setIcon(die4);
            if (i == 6 && rolls[i] == 5)
                d7.setIcon(die5);
            if (i == 6 && rolls[i] == 6)
                d7.setIcon(die6);

            /* **************
             * Eighth die
             **************** */
            if (i == 7 && rolls[i] == 1)
                d8.setIcon(die1);
            if (i == 7 && rolls[i] == 2)
                d8.setIcon(die2);
            if (i == 7 && rolls[i] == 3)
                d8.setIcon(die3);
            if (i == 7 && rolls[i] == 4)
                d8.setIcon(die4);
            if (i == 7 && rolls[i] == 5)
                d8.setIcon(die5);
            if (i == 7 && rolls[i] == 6)
                d8.setIcon(die6);

            /* **************
             * Ninth die
             **************** */
            if (i == 8 && rolls[i] == 1)
                d9.setIcon(die1);
            if (i == 8 && rolls[i] == 2)
                d9.setIcon(die2);
            if (i == 8 && rolls[i] == 3)
                d9.setIcon(die3);
            if (i == 8 && rolls[i] == 4)
                d9.setIcon(die4);
            if (i == 8 && rolls[i] == 5)
                d9.setIcon(die5);
            if (i == 8 && rolls[i] == 6)
                d9.setIcon(die6);

            /* **************
             * Tenth die
             **************** */
            if (i == 9 && rolls[i] == 1)
                d10.setIcon(die1);
            if (i == 9 && rolls[i] == 2)
                d10.setIcon(die2);
            if (i == 9 && rolls[i] == 3)
                d10.setIcon(die3);
            if (i == 9 && rolls[i] == 4)
                d10.setIcon(die4);
            if (i == 9 && rolls[i] == 5)
                d10.setIcon(die5);
            if (i == 9 && rolls[i] == 6)
                d10.setIcon(die6);
        }
        checkWin();
    }

    /* ***********************************
     * Checks to see if all die are equal
     ************************************* */
    public void checkWin()
    {
        boolean wincon = false;

        for(int i = 1; i < rolls.length; i++) {
            if (rolls[i] == rolls[i - 1])
                wincon = true;
            else {
                wincon = false;
                break;
            }
        }

        if (wincon) {
            System.out.println("Game over");
            gameOver();
        }
    }

    public void gameOver()
    {
        EndA = System.currentTimeMillis();
        System.out.println("Total time: " + (EndA-StartA)/1000 + " seconds.");
        over = true;
        roll.setEnabled(false);
    }

    public class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {

            /* ********************
             * Hold 1
             ********************** */
            if(event.getSource() == h1 && h1.getText().equals("Hold"))
            {
                h1.setText("Unhold");
                return;
            }
            if(event.getSource() == h1 && h1.getText().equals("Unhold"))
            {
                h1.setText("Hold");
                return;
            }

            /* ********************
             * Hold 2
             ********************** */
            if(event.getSource() == h2 && h2.getText().equals("Hold"))
            {
                h2.setText("Unhold");
                return;
            }
            if(event.getSource() == h2 && h2.getText().equals("Unhold"))
            {
                h2.setText("Hold");
                return;
            }

            /* ********************
             * Hold 3
             ********************** */
            if(event.getSource() == h3 && h3.getText().equals("Hold"))
            {
                h3.setText("Unhold");
                return;
            }
            if(event.getSource() == h3 && h3.getText().equals("Unhold"))
            {
                h3.setText("Hold");
                return;
            }

            /* ********************
             * Hold 4
             ********************** */
            if(event.getSource() == h4 && h4.getText().equals("Hold"))
            {
                h4.setText("Unhold");
                return;
            }
            if(event.getSource() == h4 && h4.getText().equals("Unhold"))
            {
                h4.setText("Hold");
                return;
            }

            /* ********************
             * Hold 5
             ********************** */
            if(event.getSource() == h5 && h5.getText().equals("Hold"))
            {
                h5.setText("Unhold");
                return;
            }
            if(event.getSource() == h5 && h5.getText().equals("Unhold"))
            {
                h5.setText("Hold");
                return;
            }

            /* ********************
             * Hold 6
             ********************** */
            if(event.getSource() == h6 && h6.getText().equals("Hold"))
            {
                h6.setText("Unhold");
                return;
            }
            if(event.getSource() == h6 && h6.getText().equals("Unhold"))
            {
                h6.setText("Hold");
                return;
            }

            /* ********************
             * Hold 7
             ********************** */
            if(event.getSource() == h7 && h7.getText().equals("Hold"))
            {
                h7.setText("Unhold");
                return;
            }
            if(event.getSource() == h7 && h7.getText().equals("Unhold"))
            {
                h7.setText("Hold");
                return;
            }

            /* ********************
             * Hold 8
             ********************** */
            if(event.getSource() == h8 && h8.getText().equals("Hold"))
            {
                h8.setText("Unhold");
                return;
            }
            if(event.getSource() == h8 && h8.getText().equals("Unhold"))
            {
                h8.setText("Hold");
                return;
            }

            /* ********************
             * Hold 9
             ********************** */
            if(event.getSource() == h9 && h9.getText().equals("Hold"))
            {
                h9.setText("Unhold");
                return;
            }
            if(event.getSource() == h9 && h9.getText().equals("Unhold"))
            {
                h9.setText("Hold");
                return;
            }

            /* ********************
             * Hold 10
             ********************** */
            if(event.getSource() == h10 && h10.getText().equals("Hold"))
            {
                h10.setText("Unhold");
                return;
            }
            if(event.getSource() == h10 && h10.getText().equals("Unhold"))
            {
                h10.setText("Hold");
                return;
            }

            /* ********************
             * Roll Button
             ********************** */
            if(event.getSource() == roll)
            {
                if(h1.getText().equals("Hold"))
                    rolls[0] = g.nextInt(6)+1;
                if(h2.getText().equals("Hold"))
                    rolls[1] = g.nextInt(6)+1;
                if(h3.getText().equals("Hold"))
                    rolls[2] = g.nextInt(6)+1;
                if(h4.getText().equals("Hold"))
                    rolls[3] = g.nextInt(6)+1;
                if(h5.getText().equals("Hold"))
                    rolls[4] = g.nextInt(6)+1;
                if(h6.getText().equals("Hold"))
                    rolls[5] = g.nextInt(6)+1;
                if(h7.getText().equals("Hold"))
                    rolls[6] = g.nextInt(6)+1;
                if(h8.getText().equals("Hold"))
                    rolls[7] = g.nextInt(6)+1;
                if(h9.getText().equals("Hold"))
                    rolls[8] = g.nextInt(6)+1;
                if(h10.getText().equals("Hold"))
                    rolls[9] = g.nextInt(6)+1;

                displayDieRoll();
            }
        }
    }
}