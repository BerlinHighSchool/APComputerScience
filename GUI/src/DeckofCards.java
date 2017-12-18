import java.awt.Dimension;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class DeckofCards {
	Integer[] deck = new Integer[13];
	static JLabel s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, sj, sq, sk;
	static JFrame frame = new JFrame("Deck of Cards");
	static int place = 0, cardx = 20, cardy = 126;
	static JButton exit = new JButton("Exit");

	// Deck face
	static java.net.URL deckFace = DeckofCards.class.getResource("resources/b2fv.gif");
	static ImageIcon df = new ImageIcon(deckFace);

	static JButton deal = new JButton(df);

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

	ButtonListener listener = new ButtonListener();

	public DeckofCards() {
		// Fill the array with values 1-13 representing our cards
		// 1 is Ace --> 13 for King
		for(int i = 0; i < deck.length; i++)
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

		deal.setBounds(20, 20, 71, 96);
		deal.addActionListener(listener);
		//deal.setBorder(null);
		//deal.setMargin(new Insets(0, 0, 0, 0));

		exit.setBounds(105, 20, 100, 30);
		exit.addActionListener(listener);

		frame.add(deal);
		frame.add(exit);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	public class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == exit) {
				System.exit(0);
			}
			if(e.getSource() == deal) {
				int card = deck[place];
				place++;

				switch(card) {
				case 1:
					frame.add(s1);
					s1.setBounds(cardx, cardy, 71, 96);
					break;
				case 2:
					frame.add(s2);
					s2.setBounds(cardx, cardy, 71, 96);
					break;
				case 3:
					frame.add(s3);
					s3.setBounds(cardx, cardy, 71, 96);
					break;
				case 4:
					frame.add(s4);
					s4.setBounds(cardx, cardy, 71, 96);
					break;
				case 5:
					frame.add(s5);
					s5.setBounds(cardx, cardy, 71, 96);
					break;
				case 6:
					frame.add(s6);
					s6.setBounds(cardx, cardy, 71, 96);
					break;
				case 7:
					frame.add(s7);
					s7.setBounds(cardx, cardy, 71, 96);
					break;
				case 8:
					frame.add(s8);
					s8.setBounds(cardx, cardy, 71, 96);
					break;
				case 9:
					frame.add(s9);
					s9.setBounds(cardx, cardy, 71, 96);
					break;
				case 10:
					frame.add(s10);
					s10.setBounds(cardx, cardy, 71, 96);
					break;
				case 11:
					frame.add(sj);
					sj.setBounds(cardx, cardy, 71, 96);
					break;
				case 12:
					frame.add(sq);
					sq.setBounds(cardx, cardy, 71, 96);
					break;
				case 13:
					frame.add(sk);
					sk.setBounds(cardx, cardy, 71, 96);
					break;
				}

				cardx+= 80;
				if(place % 5 == 0) {
					cardy += 120;
					cardx = 20;
				}
				if(place > deck.length-1)
					deal.setEnabled(false);
			}
		}
	}
}