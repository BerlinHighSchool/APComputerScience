import java.awt.Dimension;
import java.util.*;
import javax.swing.*;

public class DeckofCards {
	int[] deck = new int[13];
	static JLabel s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, sj, sq, sk;
	static JFrame frame = new JFrame("Deck of Cards");
	
	//Ace of Spades
	static java.net.URL spades1 = DeckofCards.class.getResource("resources/s1.gif");
	static ImageIcon sof1 = new ImageIcon(spades1);

	//Two of spades
	static java.net.URL spades2 = DeckofCards.class.getResource("resources/s2.gif");
	static ImageIcon sof2 = new ImageIcon(spades2);

	//Three of Spades
	static java.net.URL spades3 = DeckofCards.class.getResource("resources/s3.gif");
	static ImageIcon sof3 = new ImageIcon(spades3);

	//Four of Spades
	static java.net.URL spades4 = DeckofCards.class.getResource("resources/s4.gif");
	static ImageIcon sof4 = new ImageIcon(spades4);

	//Five of Spades
	static java.net.URL spades5 = DeckofCards.class.getResource("resources/s5.gif");
	static ImageIcon sof5 = new ImageIcon(spades5);

	//Six of Spades
	static java.net.URL spades6 = DeckofCards.class.getResource("resources/s6.gif");
	static ImageIcon sof6 = new ImageIcon(spades6);

	//Seven of Spades
	static java.net.URL spades7 = DeckofCards.class.getResource("resources/s7.gif");
	static ImageIcon sof7 = new ImageIcon(spades7);

	//Eight of Spades
	static java.net.URL spades8 = DeckofCards.class.getResource("resources/s8.gif");
	static ImageIcon sof8 = new ImageIcon(spades8);

	//Nine of Spades
	static java.net.URL spades9 = DeckofCards.class.getResource("resources/s9.gif");
	static ImageIcon sof9 = new ImageIcon(spades9);

	//Ten of Spades
	static java.net.URL spades10 = DeckofCards.class.getResource("resources/s10.gif");
	static ImageIcon sof10 = new ImageIcon(spades10);

	//Jack of Spades
	static java.net.URL spadesJ = DeckofCards.class.getResource("resources/sj.gif");
	static ImageIcon sofJ = new ImageIcon(spadesJ);

	//Queen of Spades
	static java.net.URL spadesQ = DeckofCards.class.getResource("resources/sq.gif");
	static ImageIcon sofQ = new ImageIcon(spadesQ);

	//King of Spades
	static java.net.URL spadesK = DeckofCards.class.getResource("resources/sk.gif");
	static ImageIcon sofK = new ImageIcon(spadesK);

	public DeckofCards() {
		// Fill the array with values 1-13 representing our cards
		// 1 is Ace --> 13 for King
		for(int i = 0; i <deck.length; i++)
			deck[i] = i+1;

		// Shuffle the deck
		Collections.shuffle(Arrays.asList(deck));

		// Set up the labels for each image.
		s1 = new JLabel(sof1);
		s2 = new JLabel(sof2);
		s3 = new JLabel(sof3);
		s4 = new JLabel(sof4);
		s5 = new JLabel(sof5);
		s6 = new JLabel(sof6);
		s7 = new JLabel(sof7);
		s8 = new JLabel(sof8);
		s9 = new JLabel(sof9);
		s10 = new JLabel(sof10);
		sj = new JLabel(sofJ);
		sq = new JLabel(sofQ);
		sk = new JLabel(sofK);
	}
	
	public void display() {
		// Sets up frame with absolute layout and initial size of 800x600
		frame.setLayout(null);
		frame.setPreferredSize(new Dimension(800, 600));
		
		sk.setBounds(20, 20, 71, 96);
		frame.add(sk);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}








