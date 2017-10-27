import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Button;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLayeredPane;
import java.awt.Component;


public class Scrabble
{
	JFrame frame = new JFrame("Scrabble");
	JPanel panel1 = new JPanel();

	//Images here for tiles and the board
	//A Tile
	static java.net.URL tileA = Scrabble.class.getResource("resources/A.jpg");
	static ImageIcon tA = new ImageIcon(tileA);

	//B Tile
	static java.net.URL tileB = Scrabble.class.getResource("resources/B.jpg");
	static ImageIcon tB = new ImageIcon(tileB);

	//C Tile
	static java.net.URL tileC = Scrabble.class.getResource("resources/C.jpg");
	static ImageIcon tC = new ImageIcon(tileC);

	//D Tile
	static java.net.URL tileD = Scrabble.class.getResource("resources/D.jpg");
	static ImageIcon tD = new ImageIcon(tileD);

	//E Tile
	static java.net.URL tileE = Scrabble.class.getResource("resources/E.jpg");
	static ImageIcon tE = new ImageIcon(tileE);

	//F Tile
	static java.net.URL tileF = Scrabble.class.getResource("resources/F.jpg");
	static ImageIcon tF = new ImageIcon(tileF);

	//G Tile
	static java.net.URL tileG = Scrabble.class.getResource("resources/G.jpg");
	static ImageIcon tG = new ImageIcon(tileG);

	//H Tile
	static java.net.URL tileH = Scrabble.class.getResource("resources/H.jpg");
	static ImageIcon tH = new ImageIcon(tileH);

	//I Tile
	static java.net.URL tileI = Scrabble.class.getResource("resources/I.jpg");
	static ImageIcon tI = new ImageIcon(tileI);

	//J Tile
	static java.net.URL tileJ = Scrabble.class.getResource("resources/J.jpg");
	static ImageIcon tJ = new ImageIcon(tileJ);

	//K Tile
	static java.net.URL tileK = Scrabble.class.getResource("resources/K.jpg");
	static ImageIcon tK = new ImageIcon(tileK);

	//L Tile
	static java.net.URL tileL = Scrabble.class.getResource("resources/L.jpg");
	static ImageIcon tL = new ImageIcon(tileL);

	//M Tile
	static java.net.URL tileM = Scrabble.class.getResource("resources/M.jpg");
	static ImageIcon tM = new ImageIcon(tileM);

	//N Tile
	static java.net.URL tileN = Scrabble.class.getResource("resources/N.jpg");
	static ImageIcon tN = new ImageIcon(tileN);

	//O Tile
	static java.net.URL tileO = Scrabble.class.getResource("resources/O.jpg");
	static ImageIcon tO = new ImageIcon(tileO);

	//P Tile
	static java.net.URL tileP = Scrabble.class.getResource("resources/P.jpg");
	static ImageIcon tP = new ImageIcon(tileP);

	//Q Tile
	static java.net.URL tileQ = Scrabble.class.getResource("resources/Q.jpg");
	static ImageIcon tQ = new ImageIcon(tileQ);

	//R Tile
	static java.net.URL tileR = Scrabble.class.getResource("resources/R.jpg");
	static ImageIcon tR = new ImageIcon(tileR);

	//S Tile
	static java.net.URL tileS = Scrabble.class.getResource("resources/S.jpg");
	static ImageIcon tS = new ImageIcon(tileS);

	//T Tile
	static java.net.URL tileT = Scrabble.class.getResource("resources/T.jpg");
	static ImageIcon tT = new ImageIcon(tileT);

	//U Tile
	static java.net.URL tileU = Scrabble.class.getResource("resources/U.jpg");
	static ImageIcon tU = new ImageIcon(tileU);

	//V Tile
	static java.net.URL tileV = Scrabble.class.getResource("resources/V.jpg");
	static ImageIcon tV = new ImageIcon(tileV);

	//W Tile
	static java.net.URL tileW = Scrabble.class.getResource("resources/W.jpg");
	static ImageIcon tW = new ImageIcon(tileW);

	//X Tile
	static java.net.URL tileX = Scrabble.class.getResource("resources/X.jpg");
	static ImageIcon tX = new ImageIcon(tileX);

	//Y Tile
	static java.net.URL tileY = Scrabble.class.getResource("resources/Y.jpg");
	static ImageIcon tY = new ImageIcon(tileY);

	//Z Tile
	static java.net.URL tileZ = Scrabble.class.getResource("resources/Z.jpg");
	static ImageIcon tZ = new ImageIcon(tileZ);

	int y1 = 95, y2 = 138, y3= 181, y4= 224, y5= 267, y6= 310, y7= 353;
	
	static JLabel ta, tb, tc, td, te, tf, tg, th, ti, tj, tk, tl, tm, tn, to, tp, tq, tr, ts, tt, tu, tv, tw, tx, ty, tz;
	ButtonListener listener = new ButtonListener();
	private JTextField txtScrabbleSolo;
	JTextField txtCurrentScore = new JTextField();
	JButton btnShuffle = new JButton("Shuffle");
	static int squaresize=15;// l and w of board

	//declares tilebag
	static Character[] tilebag= new Character[98];

	static ArrayList<Integer>tilerack= new ArrayList<Integer>();
	static int tilearrayplace = 0, turncount=0, tilesused=0, score=0, amountoftiles, roundscore=0; 
	static String currentscore= "Current Score: ";
	JButton btnQuitGame = new JButton("Quit Game");
	JButton play = new JButton("Play");
	JButton undo = new JButton("Return Tiles");
	JButton newgame = new JButton("New Game");


	//tile rack letters
	char tileRack1char, tileRack2char, tileRack3char, tileRack4char, tileRack5char, tileRack6char,tileRack7char;

	JRadioButton Tilerack1 = new JRadioButton("--");
	JRadioButton Tilerack2 = new JRadioButton("--");
	JRadioButton Tilerack3 = new JRadioButton("--");
	JRadioButton Tilerack4 = new JRadioButton("--");
	JRadioButton Tilerack5 = new JRadioButton("--");
	JRadioButton Tilerack6 = new JRadioButton("--");
	JRadioButton Tilerack7 = new JRadioButton("--");
	ButtonGroup radiogroup= new ButtonGroup();

	char letter= '0'; //just to intilize
	int n=0; //just to intilize
	char[][] roundspots= new char [squaresize][squaresize];
	char[][] allspots= new char [squaresize][squaresize];
	String file="";

	//board words
	String word1= "";
	String word2= "";
	String word3= "";
	String word4= "";
	String word5= "";
	String word6= "";
	String word7= "";
	String word8= "";


	JButton[][] tileboard = new JButton[squaresize][squaresize];
	JLabel messagespot;
	private final JLabel lblPointsA = new JLabel("Points: |A=1| B=3|C=3|D=2|E=1|F=4|G=2|H=4|I=1|J=8|K=5|L=1|M=3|N=1|O=1|P=3|Q=10|R=1|S=1|T=1|U=1|V=1|W=4|X=8|Y=4|Z=10|");

	public Scrabble() throws IOException
	{
		/*placeImage(1);
		placeImage(2);
		placeImage(3);
		placeImage(4);
		placeImage(5);
		placeImage(6);
		placeImage(7);*/
		
		for(int i = 0; i < tileboard.length; i++)
		{
			for(int j = 0; j < tileboard[i].length; j++) {
				tileboard[i][j] = new JButton("");
				frame.getContentPane().add(tileboard[i][j]);
				tileboard[i][j].setLocation(j*40+174, i*40+15);
				tileboard[i][j].setSize(40,40);
				tileboard[i][j].setOpaque(false);
				tileboard[i][j].setContentAreaFilled(false);
				tileboard[i][j].setBorderPainted(false);
				tileboard[i][j].setEnabled(false);

			}
		}

		//Creates tile bag
		String letters= "AAAAAAAAABBCCDDDDEEEEEEEEEEEEFFGGGHHIIIIIIIIIJKLLLLMMNNNNNNOOOOOOOOPPQRRRRRRSSSSTTTTTTUUUUVVWWXYYZ";  //Add blank tiles later maybe

		for(int i=0; i<tilebag.length;i++)
		{
			tilebag[i]= letters.charAt(i);
		}

		//Shuffles tile bag
		Collections.shuffle(Arrays.asList(tilebag));


		tileRack1char=tilebag[0];
		tileRack2char=tilebag[1];
		tileRack3char=tilebag[2];
		tileRack4char=tilebag[3];
		tileRack5char=tilebag[4];
		tileRack6char=tilebag[5];
		tileRack7char=tilebag[6];



		tilearrayplace=7;
		

placeImage(1);
placeImage(2);
placeImage(3);
placeImage(4);
placeImage(5);
placeImage(6);
placeImage(7);



		radiogroup.add(Tilerack1);
		radiogroup.add(Tilerack2);
		radiogroup.add(Tilerack3);
		radiogroup.add(Tilerack4);
		radiogroup.add(Tilerack5);
		radiogroup.add(Tilerack6);
		radiogroup.add(Tilerack7);



		// Set up the image labels
		ta= new JLabel(tA);
		tb= new JLabel(tB);
		tc= new JLabel(tC);
		td= new JLabel(tD);
		te= new JLabel(tE);
		tf= new JLabel(tF);
		tg= new JLabel(tG);
		th= new JLabel(tH);
		ti= new JLabel(tI);
		tj= new JLabel(tJ);
		tk= new JLabel(tK);
		tl= new JLabel(tL);
		tm= new JLabel(tM);
		tn= new JLabel(tN);
		to= new JLabel(tO);
		tp= new JLabel(tP);
		tq= new JLabel(tQ);
		tr= new JLabel(tR);
		ts= new JLabel(tS);
		tt= new JLabel(tT);
		tu= new JLabel(tU);
		tv= new JLabel(tV);
		tw= new JLabel(tW);
		tx= new JLabel(tX);
		ty= new JLabel(tY);
		tz= new JLabel(tZ);
		txtCurrentScore.setEditable(false);
		txtCurrentScore.setBackground(Color.LIGHT_GRAY);


		txtCurrentScore.setText("Current Score: 0");
		txtCurrentScore.setBounds(11, 411, 145, 52);
		txtCurrentScore.setColumns(10);
		frame.getContentPane().setLayout(null);

		frame.getContentPane().add(txtCurrentScore);
		btnShuffle.setBounds(11, 508, 145, 23);

		frame.getContentPane().add(btnShuffle);

		btnQuitGame.setBounds(11, 610, 145, 23);

		frame.getContentPane().add(btnQuitGame);


		play.setBounds(11, 474, 145, 23);

		
		
		frame.getContentPane().add(play);
		Tilerack3.setBounds(19, y3, 53, 40);

		frame.getContentPane().add(Tilerack3);
		Tilerack4.setBounds(19, y4, 53, 40);

		frame.getContentPane().add(Tilerack4);
		Tilerack5.setBounds(19, y5, 53, 40);

		frame.getContentPane().add(Tilerack5);
		Tilerack6.setBounds(19, y6, 53, 40);

		frame.getContentPane().add(Tilerack6);
		Tilerack7.setBounds(19, y7, 53, 40);

		frame.getContentPane().add(Tilerack7);
		Tilerack1.setBounds(19, y1, 53, 40);


		frame.getContentPane().add(Tilerack1);
		
		Tilerack2.setBounds(19, y2, 53, 40);
		frame.getContentPane().add(Tilerack2);

		JLabel label = new JLabel("");
		label.setBounds(174, 0, 600, 633);
		label.setIcon(new ImageIcon(Scrabble.class.getResource("/resources/600 by 600 scrabble.jpg")));
		frame.getContentPane().add(label);

		JLabel Tileslabel = new JLabel("Tiles:");
		Tileslabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Tileslabel.setBounds(19, 62, 86, 14);
		frame.getContentPane().add(Tileslabel);


		JLabel ScrabbleSololabel = new JLabel("Scrabble Solo");
		ScrabbleSololabel.setBackground(Color.WHITE);
		ScrabbleSololabel.setFont(new Font("Verdana", Font.BOLD, 20));
		ScrabbleSololabel.setBounds(11, 11, 153, 40);
		frame.getContentPane().add(ScrabbleSololabel);


		undo.setBounds(11, 542, 145, 23);
		frame.getContentPane().add(undo);


		newgame.setBounds(11, 576, 145, 23);
		frame.getContentPane().add(newgame);

		messagespot = new JLabel();
		
		messagespot.setBounds(10, 660, 774, 23);
		frame.getContentPane().add(messagespot);
		messagespot.setText("Welcome to Scrabble Solo. This is a single player Scrabble game. Have fun playing!");

		
		lblPointsA.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 17));
		lblPointsA.setBounds(173, 608, 622, 41);
		
		frame.getContentPane().add(lblPointsA);
	}
	public void display() throws IOException
	{
		
		
		// Panel size
		frame.setPreferredSize(new Dimension(800, 720));

		// Allows putting objects at specific coordinates
		panel1.setLayout(null);

		//Button characteristics
		btnQuitGame.addActionListener(listener);
		btnShuffle.addActionListener(listener);
		Tilerack1.addActionListener(listener);
		Tilerack2.addActionListener(listener);
		Tilerack3.addActionListener(listener);
		Tilerack4.addActionListener(listener);
		Tilerack5.addActionListener(listener);
		Tilerack6.addActionListener(listener);
		Tilerack7.addActionListener(listener);
		play.addActionListener(listener);
		undo.addActionListener(listener);
		newgame.addActionListener(listener);

		for(int i = 0; i < tileboard.length; i++)
			for(int j = 0; j < tileboard[i].length; j++) 
				tileboard[i][j].addActionListener(listener);

		//ALWAYS include this to display the program
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(panel1);
		frame.pack();
		frame.setVisible(true);


	}

	public class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==newgame)
				try {
					newGame();
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}

			if(e.getSource() == undo)
				undo();

			if(e.getSource() == btnQuitGame)
				System.exit(0);

			if(e.getSource()==play)
			{
				boolean b= false;
				try {
					if(searchLegalPlay()==true)
					{
						setUpNextTurn();
						b=true;
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				if (b==false){

					String error= "That was not a valid play. Please try again.";
					messagespot.setText(error);
					word1="";
					word2="";
					word3="";
					word4="";
					word5="";
					word6="";
					word7="";
					word8="";

					for(int i = 0; i < roundspots.length; i++)
						for(int j = 0; j < roundspots[i].length; j++) 
							if(roundspots[i][j]!='\u0000')
								allspots[i][j]='\u0000';


				}

			}

			if(e.getSource()==btnShuffle)
				shuffleTiles();


			if(e.getSource()==Tilerack1)
			{
				n=1;
				letter= tileRack1char;

				for(int i = 0; i < tileboard.length; i++)
					for(int j = 0; j < tileboard[i].length; j++) 
						if(tileboard[i][j].getBackground() != Color.BLACK&&tileboard[i][j].getBackground() != Color.BLUE)
							tileboard[i][j].setEnabled(true);	
			}

			if(e.getSource()==Tilerack2)
			{
				for(int i = 0; i < tileboard.length; i++)
					for(int j = 0; j < tileboard[i].length; j++) 
						if(tileboard[i][j].getBackground() != Color.BLACK&&tileboard[i][j].getBackground() != Color.BLUE)
							tileboard[i][j].setEnabled(true);	
				n=2;
				letter= tileRack2char;
			}

			if(e.getSource()==Tilerack3)
			{
				for(int i = 0; i < tileboard.length; i++)
					for(int j = 0; j < tileboard[i].length; j++) 
						if(tileboard[i][j].getBackground() != Color.BLACK&&tileboard[i][j].getBackground() != Color.BLUE)
							tileboard[i][j].setEnabled(true);	
				n=3;
				letter= tileRack3char;
			}

			if(e.getSource()==Tilerack4)
			{
				for(int i = 0; i < tileboard.length; i++)
					for(int j = 0; j < tileboard[i].length; j++) 
						if(tileboard[i][j].getBackground() != Color.BLACK&&tileboard[i][j].getBackground() != Color.BLUE)
							tileboard[i][j].setEnabled(true);		
				n=4;
				letter= tileRack4char;
			}

			if(e.getSource()==Tilerack5)
			{
				for(int i = 0; i < tileboard.length; i++)
					for(int j = 0; j < tileboard[i].length; j++) 
						if(tileboard[i][j].getBackground() != Color.BLACK&&tileboard[i][j].getBackground() != Color.BLUE)
							tileboard[i][j].setEnabled(true);	
				n=5;
				letter= tileRack5char;
			}

			if(e.getSource()==Tilerack6)
			{
				for(int i = 0; i < tileboard.length; i++)
					for(int j = 0; j < tileboard[i].length; j++) 
						if(tileboard[i][j].getBackground() != Color.BLACK&&tileboard[i][j].getBackground() != Color.BLUE)
							tileboard[i][j].setEnabled(true);	
				n=6;
				letter= tileRack6char;
			}

			if(e.getSource()==Tilerack7)
			{
				for(int i = 0; i < tileboard.length; i++)
					for(int j = 0; j < tileboard[i].length; j++) 
						if(tileboard[i][j].getBackground() != Color.BLACK&&tileboard[i][j].getBackground() != Color.BLUE)
							tileboard[i][j].setEnabled(true);	
				n=7;
				letter= tileRack7char;
			}

			for(int i = 0; i < tileboard.length; i++)
			{
				for(int j = 0; j < tileboard[i].length; j++) 
				{
					if(e.getSource()==tileboard[i][j]&&tileboard[i][j].isEnabled()!=false)
					{

						tileboard[i][j].setOpaque(true);
						tileboard[i][j].setContentAreaFilled(true);
						roundspots[i][j]=letter;
						tileboard[i][j].setBackground(Color.BLUE);

						switch(letter){

						case 'A':
							tileboard[i][j].setIcon(tA);
							tileboard[i][j].setDisabledIcon(tA); 
							break;

						case 'B':
							tileboard[i][j].setIcon(tB);
							tileboard[i][j].setDisabledIcon(tB); 
							break;

						case 'C':
							tileboard[i][j].setIcon(tC);
							tileboard[i][j].setDisabledIcon(tC);
							break;

						case 'D':
							tileboard[i][j].setIcon(tD);
							tileboard[i][j].setDisabledIcon(tD);
							break;

						case 'E':
							tileboard[i][j].setIcon(tE);
							tileboard[i][j].setDisabledIcon(tE);
							break;

						case 'F':
							tileboard[i][j].setIcon(tF);
							tileboard[i][j].setDisabledIcon(tF);
							break;

						case 'G':
							tileboard[i][j].setIcon(tG);
							tileboard[i][j].setDisabledIcon(tG);
							break;

						case 'H':
							tileboard[i][j].setIcon(tH);
							tileboard[i][j].setDisabledIcon(tH);
							break;

						case 'I':
							tileboard[i][j].setIcon(tI);
							tileboard[i][j].setDisabledIcon(tI);
							break;

						case 'J':
							tileboard[i][j].setIcon(tJ);
							tileboard[i][j].setDisabledIcon(tJ);
							break;

						case 'K':
							tileboard[i][j].setIcon(tK);
							tileboard[i][j].setDisabledIcon(tK);
							break;

						case 'L':
							tileboard[i][j].setIcon(tL);
							tileboard[i][j].setDisabledIcon(tL);
							break;

						case 'M':
							tileboard[i][j].setIcon(tM);
							tileboard[i][j].setDisabledIcon(tM);
							break;

						case 'N':
							tileboard[i][j].setIcon(tN);
							tileboard[i][j].setDisabledIcon(tN);
							break;

						case 'O':
							tileboard[i][j].setIcon(tO);
							tileboard[i][j].setDisabledIcon(tO);
							break;

						case 'P':
							tileboard[i][j].setIcon(tP);
							tileboard[i][j].setDisabledIcon(tP);
							break;

						case 'Q':
							tileboard[i][j].setIcon(tQ);
							tileboard[i][j].setDisabledIcon(tQ);
							break;

						case 'R':
							tileboard[i][j].setIcon(tR);
							tileboard[i][j].setDisabledIcon(tR);
							break;

						case 'S':
							tileboard[i][j].setIcon(tS);
							tileboard[i][j].setDisabledIcon(tS);
							break;

						case 'T':
							tileboard[i][j].setIcon(tT);
							tileboard[i][j].setDisabledIcon(tT);
							break;

						case 'U':
							tileboard[i][j].setIcon(tU);
							tileboard[i][j].setDisabledIcon(tU); 
							break;

						case 'V':
							tileboard[i][j].setIcon(tV);
							tileboard[i][j].setDisabledIcon(tV); 
							break;

						case 'W':
							tileboard[i][j].setIcon(tW);
							tileboard[i][j].setDisabledIcon(tW);
							break;

						case 'X':
							tileboard[i][j].setIcon(tX);
							tileboard[i][j].setDisabledIcon(tX);
							break;

						case 'Y':
							tileboard[i][j].setIcon(tY);
							tileboard[i][j].setDisabledIcon(tY);
							break;

						case 'Z':
							tileboard[i][j].setIcon(tZ);	
							tileboard[i][j].setDisabledIcon(tZ);
						}
						for(int b = 0; b < tileboard.length; b++)
							for(int c = 0; c < tileboard[b].length; c++) 
								tileboard[b][c].setEnabled(false);

						switch(n){
						case 1:
							Tilerack1.setEnabled(false);
							tilesused++;
							break;

						case 2:
							Tilerack2.setEnabled(false);
							tilesused++;
							break;

						case 3:
							Tilerack3.setEnabled(false);
							tilesused++;
							break;

						case 4:
							Tilerack4.setEnabled(false);
							tilesused++;
							break;

						case 5:
							Tilerack5.setEnabled(false);
							tilesused++;
							break;

						case 6:
							Tilerack6.setEnabled(false);
							tilesused++;
							break;

						case 7:
							Tilerack7.setEnabled(false);
							tilesused++;
							break;	
						}


						break;
					}
				}
			}
		}
	}


	public void shuffleTiles()
	{
		ArrayList<JRadioButton> tilesarraylist= new ArrayList<JRadioButton>();
		tilesarraylist.add(Tilerack1);
		tilesarraylist.add(Tilerack2);
		tilesarraylist.add(Tilerack3);
		tilesarraylist.add(Tilerack4);
		tilesarraylist.add(Tilerack5);
		tilesarraylist.add(Tilerack6);
		tilesarraylist.add(Tilerack7);

		Collections.shuffle(tilesarraylist);

		tilesarraylist.get(0).setLocation(19, y1);
		tilesarraylist.get(1).setLocation(19, y2);
		tilesarraylist.get(2).setLocation(19, y3);
		tilesarraylist.get(3).setLocation(19, y4);
		tilesarraylist.get(4).setLocation(19, y5);
		tilesarraylist.get(5).setLocation(19, y6);
		tilesarraylist.get(6).setLocation(19, y7);
	}
	public boolean SearchDictionary(String a) throws IOException
	{
		file="";
		switch(a.charAt(0)){
		case 'A':
			file= "src/Adict.txt";
			break;

		case 'B':
			file= "src/Bdict.txt";
			break;

		case 'C':
			file= "src/Cdict.txt";
			break;

		case 'D':
			file= "src/Ddict.txt";
			break;

		case 'E':
			file= "src/Edict.txt";
			break;

		case 'F':
			file= "src/Fdict.txt";
			break;

		case 'G':
			file= "src/Gdict.txt";
			break;

		case 'H':
			file= "src/Hdict.txt";
			break;

		case 'I':
			file= "src/Idict.txt";
			break;

		case 'J':
			file= "src/Jdict.txt";
			break;

		case 'K':
			file= "src/Kdict.txt";
			break;

		case 'L':
			file= "src/Ldict.txt";
			break;

		case 'M':
			file= "src/Mdict.txt";
			break;

		case 'N':
			file= "src/Ndict.txt";
			break;

		case 'O':
			file= "src/Odict.txt";
			break;

		case 'P':
			file= "src/Pdict.txt";
			break;

		case 'Q':
			file= "src/Qdict.txt";
			break;

		case 'R':
			file= "src/Rdict.txt";
			break;

		case 'S':
			file= "src/Sdict.txt";
			break;

		case 'T':
			file= "src/Tdict.txt";
			break;

		case 'U':
			file= "src/Udict.txt";
			break;

		case 'V':
			file= "src/Vdict.txt";
			break;

		case 'W':
			file= "src/Wdict.txt";
			break;

		case 'X':
			file= "src/Xdict.txt";
			break;

		case 'Y':
			file= "src/Ydict.txt";
			break;

		case 'Z':
			file= "src/Zdict.txt";
			break;
		}

		Scanner fileScanner = new Scanner(new File(file));
		while(fileScanner.hasNext())
		{
			String word = fileScanner.nextLine();
			if(a.equals(word)==true)
				return true;	
		}

		return false;
	}

	public boolean Placement()
	{
		if(turncount==0&&roundspots[7][7]=='\u0000') //roundspots[7][7] is the start spot for scrabble games
			return false;

		boolean breaker= false;
		int tilesinword=0;
		boolean place= false;
		boolean downandu= false;
		for(int i = 0; i < roundspots.length; i++)
		{
			if(breaker==true)
				break;

			for(int c = 0; c < roundspots[i].length; c++) 
			{
				int a= 0;

				boolean m= false;
				boolean n= false;
				
				

				if(i+1<squaresize&&allspots[i+1][c]!='\u0000')
					m=true;

				if(i-1>=0&&allspots[i-1][c]!='\u0000')
					n=true;
				

				if((((roundspots[i][c]!='\u0000')))&&((m==true)||(n==true)))
				{
					a=1;
					for(int r=0; r<squaresize; r++)
						if(r<roundspots[i].length&&roundspots[r][c]!='\u0000')
							{tilesinword++;
							downandu= true;
							}

					if(turncount==0)
					{
						breaker=true;
						break;
					}

				}
				boolean o= false;
				boolean p= false;
				
				
				

				if(c+1<squaresize&&allspots[i][c+1]!='\u0000')
					o=true;

				if(c-1>=0&&allspots[i][c-1]!='\u0000')
					p=true;

				
			
				
				
				if((a!=1||downandu==true)&&(roundspots[i][c]!='\u0000')&&((o==true)||(p==true)))
				{	
					a=2;
					for(int s=0; s<squaresize; s++)
						if(s<roundspots[c].length&&roundspots[i][s]!='\u0000')
							tilesinword++;
					
					if(downandu==true)
						tilesinword--;
						
					
					if(turncount==0)
					{
						breaker=true;
						break;
					}
				}

				int test= c;
				if(a==2||a==1&&turncount>0)
				{
					for(int z=0; z<=7;z++)
					{
						if(i-1>=0&&(tileboard[i-1][c].getBackground()==Color.BLACK))
							place=true;

						if(i+1<squaresize&&(tileboard[i+1][c].getBackground()==Color.BLACK))
							place=true;
						c++;
						if(place==true)
							break;

						if(c>=squaresize)
							break;
					}
					breaker=true;

					if(place==true)
						break;
				}

				c=test; //test
				if((place!=true)&&(a==2||a==1&&turncount>0))
				{
					for(int z=0; z<=7;z++)
					{
						
						if(c+1<squaresize&&tileboard[i][c+1].getBackground()==Color.BLACK)
							place=true;
							
							if(c-1>=0&&tileboard[i][c-1].getBackground()==Color.BLACK)
								place=true;

						if(place==true)
							break;

						i++;

						if(i>=squaresize)
							break;
					}

					breaker=true;
					break;
				}
			}
		}

		if(tilesinword==tilesused&&place==true)
			return true;

		else if(turncount==0&&tilesinword==tilesused)
			return true;

		else return false; 
	}
	public boolean Spelling() throws IOException 
	{

		for(int i = 0; i < roundspots.length; i++)
			for(int c = 0; c < roundspots[i].length; c++) 
				if(roundspots[i][c]!='\u0000')
					allspots[i][c]= roundspots[i][c];






		for(int row = 0; row < tileboard.length; row++)
		{
			int condition = 0;
			for(int col = 0; col < tileboard[row].length; col++) 
			{
				if((allspots[row][col]!='\u0000') && (tileboard[row][col].getBackground()!=Color.BLACK))// '\u0000' is the default value for an empty char array spot
				{
					char temp;
					int r= row;
					int c= col;
					condition=1;
					int b=0;
					boolean l= false;
					boolean m= false;
					boolean n= false;
					boolean o= false;


					//next few lines prevent out of bounds exception bc ex if col=14 and 1 is added it would cause error
					if(col+1<squaresize&&allspots[row][col+1]!='\u0000')
						l=true;

					if(col-1>=0&&allspots[row][col-1]!='\u0000')
						m=true;

					if(row+1<squaresize&&allspots[row+1][col]!='\u0000')
						n=true;

					if(row-1>=0&&allspots[row-1][col]!='\u0000')
						o=true;




					if((l==true||m==true)&&(n==true||o==true)) //if both are true
					{
						if(l==true&&(roundspots[row][col+1]!='\u0000'))
							b=1;
						
						else if(m==true&&roundspots[row][col-1]!='\u0000')
							b=1;

						else if(n==true&&roundspots[row+1][col]!='\u0000')
							b=2;
						
						else if(o==true&&roundspots[row-1][col]!='\u0000')
							b=2;

						else b=1;
					}


					if((l==true||m==true)&&(b==1||b==0))
					{	



						//horizonal word	
						do{
							c--;
							if(c>=squaresize||c<0)
								break;

							temp=allspots[r][c];

						}while(temp!='\u0000');

						do{
							c++;

							if(c>=squaresize||c<0)
								break;

							temp=allspots[r][c];

							if(temp!='\u0000')
								word1= word1 + allspots[r][c];

						}while(temp!='\u0000');




						//vertical word 1
						c=col;
						r=row;
						if(roundspots[r][c]!='\u0000')
						{
							do{
								r--;

								if(r>=squaresize||r<0)
									break;

								temp=allspots[r][c];
							}while(temp!='\u0000');

							do{
								r++;

								if(r>=squaresize||r<0)
									break;

								temp=allspots[r][c];

								if(temp!='\u0000')
									word2= word2 + allspots[r][c];


							}while(temp!='\u0000');
						}



						//vertical word 2 
						c=col+1;
						r=row;
						if(c<squaresize&&roundspots[r][c]!='\u0000')
						{
							do{
								r--;

								if(r>=squaresize||r<0)
									break;

								temp=allspots[r][c];
							}while(temp!='\u0000');

							do{
								r++;

								if(r>=squaresize||r<0)
									break;

								temp=allspots[r][c];

								if(temp!='\u0000')
									word3= word3 + allspots[r][c];

							}while(temp!='\u0000');
						}

						//vertical word 3
						c=col+2;
						r=row;
						if(c<squaresize&&roundspots[r][c]!='\u0000')
						{
							do{
								r--;

								if(r>=squaresize||r<0)
									break;

								temp=allspots[r][c];
							}while(temp!='\u0000');

							do{
								r++;

								if(r>=squaresize||r<0)
									break;

								temp=allspots[r][c];

								if(temp!='\u0000')
									word4= word4 + allspots[r][c];

							}while(temp!='\u0000');
						}

						//vertical word 4
						c=col+3;
						r=row;
						if(c<squaresize&&roundspots[r][c]!='\u0000')
						{
							do{
								r--;

								if(r>=squaresize||r<0)
									break;

								temp=allspots[r][c];
							}while(temp!='\u0000');

							do{
								r++;

								if(r>=squaresize||r<0)
									break;

								temp=allspots[r][c];

								if(temp!='\u0000')
									word5= word5 + allspots[r][c];

							}while(temp!='\u0000');
						}

						//vertical word 5
						c=col+4;
						r=row;
						if(c<squaresize&&roundspots[r][c]!='\u0000')
						{
							do{
								r--;

								if(r>=squaresize||r<0)
									break;

								temp=allspots[r][c];
							}while(temp!='\u0000');

							do{
								r++;

								if(r>=squaresize||r<0)
									break;

								temp=allspots[r][c];

								if(temp!='\u0000')
									word6= word6 + allspots[r][c];

							}while(temp!='\u0000');
						}

						//vertical word 6
						c=col+5;
						r=row;
						if(c<squaresize&&roundspots[r][c]!='\u0000')
						{
							do{
								r--;

								if(r>=squaresize||r<0)
									break;


								temp=allspots[r][c];
							}while(temp!='\u0000');

							do{
								r++;

								if(r>=squaresize||r<0)
									break;


								temp=allspots[r][c];

								if(temp!='\u0000')
									word7= word7 + allspots[r][c];

							}while(temp!='\u0000');
						}

						//vertical word 7
						c=col+6;
						r=row;
						if(c<squaresize&&roundspots[r][c]!='\u0000')
						{
							do{
								r--;

								if(r>=squaresize||r<0)
									break;


								temp=allspots[r][c];
							}while(temp!='\u0000');

							do{
								r++;

								if(r>=squaresize||r<0)
									break;

								temp=allspots[r][c];

								if(temp!='\u0000')
									word8= word8 + allspots[r][c];

							}while(temp!='\u0000');
						}




					}


	
					c= col;
					r=row;
					if(((n==true)||(o==true))&&(b==2||b==0))
					{	
						//vertical word	
						do{
							r--;
							if(r>=squaresize||r<0)
								break;

							temp=allspots[r][c];

						}while(temp!='\u0000');

						do{
							r++;

							if(r>=squaresize||r<0)
								break;

							temp=allspots[r][c];

							if(temp!='\u0000')
								word1= word1 + allspots[r][c];

						}while(temp!='\u0000');




						//horizonal word 1
						r=row;
						c=col;
						if(roundspots[r][c]!='\u0000')
						{
							do{
								c--;

								if(c>=squaresize||c<0)
									break;

								temp=allspots[r][c];
							}while(temp!='\u0000');

							do{
								c++;

								if(c>=squaresize||c<0)
									break;

								temp=allspots[r][c];

								if(temp!='\u0000')
									word2= word2 + allspots[r][c];


							}while(temp!='\u0000');
						}



						//horizonal word 2 
						r=row+1;
						c=col;
						if(r<squaresize&&roundspots[r][c]!='\u0000')
						{
							do{
								c--;

								if(c>=squaresize||c<0)
									break;

								temp=allspots[r][c];
							}while(temp!='\u0000');

							do{
								c++;

								if(c>=squaresize||c<0)
									break;

								temp=allspots[r][c];

								if(temp!='\u0000')
									word3= word3 + allspots[r][c];

							}while(temp!='\u0000');
						}

						//horizonal word 3
						r=row+2;
						c=col;
						if(r<squaresize&&roundspots[r][c]!='\u0000')
						{
							do{
								c--;

								if(c>=squaresize||c<0)
									break;

								temp=allspots[r][c];
							}while(temp!='\u0000');

							do{
								c++;

								if(c>=squaresize||c<0)
									break;

								temp=allspots[r][c];

								if(temp!='\u0000')
									word4= word4 + allspots[r][c];

							}while(temp!='\u0000');
						}

						//horizonal word 4
						r=row+3;
						c=col;
						if(r<squaresize&&roundspots[r][c]!='\u0000')
						{
							do{
								c--;

								if(c>=squaresize||c<0)
									break;

								temp=allspots[r][c];
							}while(temp!='\u0000');

							do{
								c++;

								if(c>=squaresize||c<0)
									break;

								temp=allspots[r][c];

								if(temp!='\u0000')
									word5= word5 + allspots[r][c];

							}while(temp!='\u0000');
						}

						//horizonal word 5
						r=row+4;
						c=col;
						if(r<squaresize&&roundspots[r][c]!='\u0000')
						{
							do{
								c--;

								if(c>=squaresize||c<0)
									break;

								temp=allspots[r][c];
							}while(temp!='\u0000');

							do{
								c++;

								if(c>=squaresize||c<0)
									break;

								temp=allspots[r][c];

								if(temp!='\u0000')
									word6= word6 + allspots[r][c];

							}while(temp!='\u0000');
						}

						//horizonal word 6
						r=row+5;
						c=col;
						if(r<squaresize&&roundspots[r][c]!='\u0000')
						{
							do{
								c--;

								if(c>=squaresize||c<0)
									break;


								temp=allspots[r][c];
							}while(temp!='\u0000');

							do{
								c++;

								if(c>=squaresize||c<0)
									break;


								temp=allspots[r][c];

								if(temp!='\u0000')
									word7= word7 + allspots[r][c];

							}while(temp!='\u0000');
						}

						//horizonal word 7
						r=row+6;
						c=col;
						if(r<squaresize&&roundspots[r][c]!='\u0000')
						{
							do{
								c--;

								if(c>=squaresize||c<0)
									break;


								temp=allspots[r][c];
							}while(temp!='\u0000');

							do{
								c++;

								if(c>=squaresize||c<0)
									break;

								temp=allspots[r][c];

								if(temp!='\u0000')
									word8= word8 + allspots[r][c];

							}while(temp!='\u0000');
						}
					}
				}
				if(condition==1)
					break;
			}
			if(condition==1)
				break;
		}


		if(word1.length()>1&&SearchDictionary(word1)==false)
			return false;

		else if(word2.length()>1&&SearchDictionary(word2)==false)
			return false;

		else if(word3.length()>1&&SearchDictionary(word3)==false)
			return false;

		else if(word4.length()>1&&SearchDictionary(word4)==false)
			return false;

		else if(word5.length()>1&&SearchDictionary(word5)==false)
			return false;

		else if(word6.length()>1&&SearchDictionary(word6)==false)
			return false;

		else if(word7.length()>1&&SearchDictionary(word7)==false)
			return false;

		else if(word8.length()>1&&SearchDictionary(word8)==false)
			return false;

		else return true;
	}
	public boolean searchLegalPlay() throws IOException //error if throw is not added
	{
		if(Spelling()==false||Placement()==false)
			return false;


		else return true;
	}

	public void getScore(String word)
	{
		for(int i=0; i<word.length(); i++)
		{
			if(word.charAt(i)=='A'||word.charAt(i)=='E'||word.charAt(i)=='I'||word.charAt(i)=='L'||word.charAt(i)=='N'||word.charAt(i)=='O'||word.charAt(i)=='R'||word.charAt(i)=='S'||word.charAt(i)=='T'||word.charAt(i)=='U'||word.charAt(i)=='V')
			{
				score++;
				roundscore++;
			}

			if(word.charAt(i)=='D'||word.charAt(i)=='G')
			{
				score+=2;
				roundscore+=2;
			}

			if(word.charAt(i)=='B'||word.charAt(i)=='C'||word.charAt(i)=='M'||word.charAt(i)=='P')
			{
				score+=3;
				roundscore+=3;
			}

			if(word.charAt(i)=='F'||word.charAt(i)=='H'||word.charAt(i)=='W'||word.charAt(i)=='Y')
			{	
				score+=4;
				roundscore+=4;
			}

			if(word.charAt(i)=='K')
			{
				score+=5;
				roundscore+=5;
			}


			if(word.charAt(i)=='J'||word.charAt(i)=='X')
			{
				score+=8;
				roundscore+=8;
			}


			if(word.charAt(i)=='Q'||word.charAt(i)=='Z')
			{
				score+=10;
				roundscore+=10;
			}
		}
	}

	public void getTiles() throws IOException
	{
		if(Tilerack1.isEnabled()==false&&tilearrayplace<tilebag.length)
		{
			tileRack1char=tilebag[tilearrayplace];
			placeImage(1);
			tilearrayplace++;
			Tilerack1.setEnabled(true);
		}

		if(Tilerack2.isEnabled()==false&&tilearrayplace<tilebag.length)
		{
			tileRack2char=tilebag[tilearrayplace];
			placeImage(2);
			tilearrayplace++;
			Tilerack2.setEnabled(true);
		}


		if(Tilerack3.isEnabled()==false&&tilearrayplace<tilebag.length)
		{
			tileRack3char=tilebag[tilearrayplace];
			placeImage(3);
			tilearrayplace++;
			Tilerack3.setEnabled(true);
		}

		if(Tilerack4.isEnabled()==false&&tilearrayplace<tilebag.length)
		{
			tileRack4char=tilebag[tilearrayplace];
			placeImage(4);
			tilearrayplace++;
			Tilerack4.setEnabled(true);
		}

		if(Tilerack5.isEnabled()==false&&tilearrayplace<tilebag.length)
		{
			tileRack5char=tilebag[tilearrayplace];
			placeImage(5);
			tilearrayplace++;
			Tilerack5.setEnabled(true);
		}


		if(Tilerack6.isEnabled()==false&&tilearrayplace<tilebag.length)
		{
			tileRack6char=tilebag[tilearrayplace];
			placeImage(6);
			tilearrayplace++;
			Tilerack6.setEnabled(true);
		}

		if(Tilerack7.isEnabled()==false&&tilearrayplace<tilebag.length)
		{
			tileRack7char=tilebag[tilearrayplace];
			placeImage(7);
			tilearrayplace++;
			Tilerack7.setEnabled(true);
		}




		if(Tilerack1.isEnabled()==false&&tilearrayplace>=tilebag.length)
		{
			Tilerack1.setText("");
			tileRack1char='0';
			tilearrayplace++;
		}

		if(Tilerack2.isEnabled()==false&&tilearrayplace>=tilebag.length)
		{
			Tilerack2.setText("");
			tileRack2char='0';
			tilearrayplace++;
		}


		if(Tilerack3.isEnabled()==false&&tilearrayplace>=tilebag.length)
		{
			Tilerack3.setText("");
			tileRack3char='0';
			tilearrayplace++;
		}

		if(Tilerack4.isEnabled()==false&&tilearrayplace>=tilebag.length)
		{
			Tilerack4.setText("");
			tileRack4char='0';
			tilearrayplace++;
		}

		if(Tilerack5.isEnabled()==false&&tilearrayplace>=tilebag.length)
		{
			Tilerack5.setText("");
			tileRack5char='0';
			tilearrayplace++;
		}


		if(Tilerack6.isEnabled()==false&&tilearrayplace>=tilebag.length)
		{
			Tilerack6.setText("");
			tileRack6char='0';
			tilearrayplace++;
		}

		if(Tilerack7.isEnabled()==false&&tilearrayplace>=tilebag.length)
		{
			Tilerack7.setText("");
			tileRack7char='0';
			tilearrayplace++;
		}

		if(Tilerack1.getText()== ""&&Tilerack2.getText()== ""&&Tilerack3.getText()== ""&&Tilerack4.getText()== ""&&Tilerack5.getText()== ""&&Tilerack6.getText()== ""&&Tilerack7.getText()== "")	
			messagespot.setText("You finished the game. Click the New Game option if you want to play again. Click Quit Qame if you want to quit.");

	}

	public void setUpNextTurn() throws IOException
	{

		for(int i = 0; i < roundspots.length; i++)
			for(int j = 0; j < roundspots[i].length; j++)
				if(roundspots[i][j]!='\u0000')
				{
					tileboard[i][j].setEnabled(false);
					tileboard[i][j].setBackground(Color.BLACK);
					roundspots[i][j]='\u0000';
				}

		
		

		tilesused=0;
		turncount++;

		if(word1.length()>1)
			getScore(word1);

		if(word2.length()>1)
			getScore(word2);

		if(word3.length()>1)
			getScore(word3);

		if(word4.length()>1)
			getScore(word4);

		if(word5.length()>1)
			getScore(word5);

		if(word6.length()>1)
			getScore(word6);

		if(word7.length()>1)
			getScore(word7);

		if(word8.length()>1)
			getScore(word8);

		txtCurrentScore.setText(currentscore + score);

		String b= "";

		if(word1.length()>1)
			b= b + " -" +word1;

		if(word2.length()>1)
			b= b + " -" +word2;

		if(word3.length()>1)
			b= b + " -" +word3;

		if(word4.length()>1)
			b= b + " -" +word4;

		if(word5.length()>1)
			b= b + " -" +word5;

		if(word6.length()>1)
			b= b + " -" +word6;

		if(word7.length()>1)
			b= b + " -" +word7;

		if(word8.length()>1)
			b= b + " -" +word8;
		
		b=b + "-";
		messagespot.setText("Nice Play! You played the word(s)" + b +" for " + roundscore + " points!");
		b="";

		roundscore=0;


		getTiles();
		word1="";
		word2="";
		word3="";
		word4="";
		word5="";
		word6="";
		word7="";
		word8="";
		roundspots= new char [squaresize][squaresize]; //this may not work check later
		radiogroup.clearSelection();
	}

	
	public void undo()
	{
		word1="";
		word2="";
		word3="";
		word4="";
		word5="";
		word6="";
		word7="";
		word8="";
		tilesused=0;
		roundscore=0;

		messagespot.setText("");

		for(int i = 0; i < tileboard.length; i++)
			for(int j = 0; j < tileboard[i].length; j++) 
			{
				tileboard[i][j].setEnabled(false);
				if(tileboard[i][j].getBackground() != Color.BLACK)
				{
					tileboard[i][j].setIcon(null);
					tileboard[i][j].setOpaque(false);
					tileboard[i][j].setContentAreaFilled(false);
			
					
					if(tileboard[i][j].getBackground() == Color.BLUE)
						tileboard[i][j].setBackground(new JButton().getBackground()); //check later try Color.RED if it does not work

				}
			}
		
		
				

		for(int i = 0; i < roundspots.length; i++)
			for(int j = 0; j < roundspots[i].length; j++) 
				if(roundspots[i][j]!='\u0000')
				{
					allspots[i][j]='\u0000';
					roundspots[i][j]='\u0000';
				}

		if(Tilerack1.getText()!= "")		
			Tilerack1.setEnabled(true);

		if(Tilerack2.getText()!= "")
			Tilerack2.setEnabled(true);

		if(Tilerack3.getText()!= "")
			Tilerack3.setEnabled(true);

		if(Tilerack4.getText()!= "")
			Tilerack4.setEnabled(true);

		if(Tilerack5.getText()!= "")
			Tilerack5.setEnabled(true);

		if(Tilerack6.getText()!= "")
			Tilerack6.setEnabled(true);

		if(Tilerack7.getText()!= "")
			Tilerack7.setEnabled(true);

		radiogroup.clearSelection();	
	}

	public void newGame() throws IOException
	{
		Tilerack1.setEnabled(true);
		Tilerack2.setEnabled(true);
		Tilerack3.setEnabled(true);
		Tilerack4.setEnabled(true);
		Tilerack5.setEnabled(true);
		Tilerack6.setEnabled(true);
		Tilerack7.setEnabled(true);

		radiogroup.clearSelection();

		messagespot.setText("You clicked the New Game option. This starts your game over.");
		for(int i = 0; i < roundspots.length; i++)
			for(int j = 0; j < roundspots[i].length; j++) 
			{
				allspots[i][j]='\u0000';
				roundspots[i][j]='\u0000';
			}


		for(int i = 0; i < tileboard.length; i++)
			for(int j = 0; j < tileboard[i].length; j++) 
			{
				tileboard[i][j].setIcon(null);
				tileboard[i][j].setOpaque(false);
				tileboard[i][j].setContentAreaFilled(false);
				tileboard[i][j].setEnabled(false);
				

				tileboard[i][j].setBackground(new JButton().getBackground());
			}
		score=0;
		roundscore=0;

		txtCurrentScore.setText(currentscore + score);

		word1="";
		word2="";
		word3="";
		word4="";
		word5="";
		word6="";
		word7="";
		word8="";

		tilesused=0;
		turncount=0;

		Collections.shuffle(Arrays.asList(tilebag));

		tileRack1char=tilebag[0];
		tileRack2char=tilebag[1];
		tileRack3char=tilebag[2];
		tileRack4char=tilebag[3];
		tileRack5char=tilebag[4];
		tileRack6char=tilebag[5];
		tileRack7char=tilebag[6];


		placeImage(1);
		placeImage(2);
		placeImage(3);
		placeImage(4);
		placeImage(5);
		placeImage(6);
		placeImage(7);
		

		tilearrayplace=7;
	}



	public void placeImage(int a) throws IOException
	{
		String url, html="";
		if(a == 1){
			switch(tileRack1char)
			{
			case 'A':
				url = "" + tileA;
				html = "<html><body><img src='" + tileA +"' width=29 height=29>";
				break;
			case 'B':
				url = "" + tileB;
				html = "<html><body><img src='" + tileB+"' width=29 height=29>";
				break;
			case 'C':
				url = "" + tileC;
				html = "<html><body><img src='" + tileC+"' width=29 height=29>";
				break;
			case 'D':
				url = "" + tileD;
				html = "<html><body><img src='" + tileD+"' width=29 height=29>";
				break;
			case 'E':
				url = "" + tileE;
				html = "<html><body><img src='" + tileE+"' width=29 height=29>";
				break;
			case 'F':
				url = "" + tileF;
				html = "<html><body><img src='" + tileF+"' width=29 height=29>";
				break;
			case 'G':
				url = "" + tileG;
				html = "<html><body><img src='" + tileG+"' width=29 height=29>";
				break;
			case 'H':
				url = "" + tileH;
				html = "<html><body><img src='" + tileH+"' width=29 height=29>";
				break;
			case 'I':
				url = "" + tileI;
				html = "<html><body><img src='" + tileI+"' width=29 height=29>";
				break;
			case 'J':
				url = "" + tileJ;
				html = "<html><body><img src='" + tileJ+"' width=29 height=29>";
				break;
			case 'K':
				url = "" + tileK;
				html = "<html><body><img src='" + tileK+"' width=29 height=29>";
				break;
			case 'L':
				url = "" + tileL;
				html = "<html><body><img src='" + tileL+"' width=29 height=29>";
				break;
			case 'M':
				url = "" + tileM;
				html = "<html><body><img src='" + tileM+"' width=29 height=29>";
				break;
			case 'N':
				url = "" + tileN;
				html = "<html><body><img src='" + tileN+"' width=29 height=29>";
				break;
			case 'O':
				url = "" + tileO;
				html = "<html><body><img src='" + tileO+"' width=29 height=29>";
				break;
			case 'P':
				url = "" + tileP;
				html = "<html><body><img src='" + tileP+"' width=29 height=29>";
				break;
			case 'Q':
				url = "" + tileQ;
				html = "<html><body><img src='" + tileQ+"' width=29 height=29>";
				break;
			case 'R':
				url = "" + tileR;
				html = "<html><body><img src='" + tileR+"' width=29 height=29>";
				break;
			case 'S':
				url = "" + tileS;
				html = "<html><body><img src='" + tileS+"' width=29 height=29>";
				break;
			case 'T':
				url = "" + tileT;
				html = "<html><body><img src='" + tileT+"' width=29 height=29>";
				break;
			case 'U':
				url = "" + tileU;
				html = "<html><body><img src='" + tileU+"' width=29 height=29>";
				break;
			case 'V':
				url = "" + tileV;
				html = "<html><body><img src='" + tileV+"' width=29 height=29>";
				break;
			case 'W':
				url = "" + tileW;
				html = "<html><body><img src='" + tileW+"' width=29 height=29>";
				break;
			case 'X':
				url = "" + tileX;
				html = "<html><body><img src='" + tileX+"' width=29 height=29>";
				break;
			case 'Y':
				url = "" + tileY;
				html = "<html><body><img src='" + tileY+"' width=29 height=29>";
				break;
			case 'Z':
				url = "" + tileZ;
				html = "<html><body><img src='" + tileZ+"' width=29 height=29>";
				break;
				
			}
			Tilerack1.setText(html);
		}


if(a == 2){
			switch(tileRack2char)
			{
			case 'A':
				url = "" + tileA;
				html = "<html><body><img src='" + tileA +"' width=29 height=29>";
				break;
			case 'B':
				url = "" + tileB;
				html = "<html><body><img src='" + tileB+"' width=29 height=29>";
				break;
			case 'C':
				url = "" + tileC;
				html = "<html><body><img src='" + tileC+"' width=29 height=29>";
				break;
			case 'D':
				url = "" + tileD;
				html = "<html><body><img src='" + tileD+"' width=29 height=29>";
				break;
			case 'E':
				url = "" + tileE;
				html = "<html><body><img src='" + tileE+"' width=29 height=29>";
				break;
			case 'F':
				url = "" + tileF;
				html = "<html><body><img src='" + tileF+"' width=29 height=29>";
				break;
			case 'G':
				url = "" + tileG;
				html = "<html><body><img src='" + tileG+"' width=29 height=29>";
				break;
			case 'H':
				url = "" + tileH;
				html = "<html><body><img src='" + tileH+"' width=29 height=29>";
				break;
			case 'I':
				url = "" + tileI;
				html = "<html><body><img src='" + tileI+"' width=29 height=29>";
				break;
			case 'J':
				url = "" + tileJ;
				html = "<html><body><img src='" + tileJ+"' width=29 height=29>";
				break;
			case 'K':
				url = "" + tileK;
				html = "<html><body><img src='" + tileK+"' width=29 height=29>";
				break;
			case 'L':
				url = "" + tileL;
				html = "<html><body><img src='" + tileL+"' width=29 height=29>";
				break;
			case 'M':
				url = "" + tileM;
				html = "<html><body><img src='" + tileM+"' width=29 height=29>";
				break;
			case 'N':
				url = "" + tileN;
				html = "<html><body><img src='" + tileN+"' width=29 height=29>";
				break;
			case 'O':
				url = "" + tileO;
				html = "<html><body><img src='" + tileO+"' width=29 height=29>";
				break;
			case 'P':
				url = "" + tileP;
				html = "<html><body><img src='" + tileP+"' width=29 height=29>";
				break;
			case 'Q':
				url = "" + tileQ;
				html = "<html><body><img src='" + tileQ+"' width=29 height=29>";
				break;
			case 'R':
				url = "" + tileR;
				html = "<html><body><img src='" + tileR+"' width=29 height=29>";
				break;
			case 'S':
				url = "" + tileS;
				html = "<html><body><img src='" + tileS+"' width=29 height=29>";
				break;
			case 'T':
				url = "" + tileT;
				html = "<html><body><img src='" + tileT+"' width=29 height=29>";
				break;
			case 'U':
				url = "" + tileU;
				html = "<html><body><img src='" + tileU+"' width=29 height=29>";
				break;
			case 'V':
				url = "" + tileV;
				html = "<html><body><img src='" + tileV+"' width=29 height=29>";
				break;
			case 'W':
				url = "" + tileW;
				html = "<html><body><img src='" + tileW+"' width=29 height=29>";
				break;
			case 'X':
				url = "" + tileX;
				html = "<html><body><img src='" + tileX+"' width=29 height=29>";
				break;
			case 'Y':
				url = "" + tileY;
				html = "<html><body><img src='" + tileY+"' width=29 height=29>";
				break;
			case 'Z':
				url = "" + tileZ;
				html = "<html><body><img src='" + tileZ+"' width=29 height=29>";
				break;
				
			}
			Tilerack2.setText(html);
		}

if(a == 3){
			switch(tileRack3char)
			{
			case 'A':
				url = "" + tileA;
				html = "<html><body><img src='" + tileA +"' width=29 height=29>";
				break;
			case 'B':
				url = "" + tileB;
				html = "<html><body><img src='" + tileB+"' width=29 height=29>";
				break;
			case 'C':
				url = "" + tileC;
				html = "<html><body><img src='" + tileC+"' width=29 height=29>";
				break;
			case 'D':
				url = "" + tileD;
				html = "<html><body><img src='" + tileD+"' width=29 height=29>";
				break;
			case 'E':
				url = "" + tileE;
				html = "<html><body><img src='" + tileE+"' width=29 height=29>";
				break;
			case 'F':
				url = "" + tileF;
				html = "<html><body><img src='" + tileF+"' width=29 height=29>";
				break;
			case 'G':
				url = "" + tileG;
				html = "<html><body><img src='" + tileG+"' width=29 height=29>";
				break;
			case 'H':
				url = "" + tileH;
				html = "<html><body><img src='" + tileH+"' width=29 height=29>";
				break;
			case 'I':
				url = "" + tileI;
				html = "<html><body><img src='" + tileI+"' width=29 height=29>";
				break;
			case 'J':
				url = "" + tileJ;
				html = "<html><body><img src='" + tileJ+"' width=29 height=29>";
				break;
			case 'K':
				url = "" + tileK;
				html = "<html><body><img src='" + tileK+"' width=29 height=29>";
				break;
			case 'L':
				url = "" + tileL;
				html = "<html><body><img src='" + tileL+"' width=29 height=29>";
				break;
			case 'M':
				url = "" + tileM;
				html = "<html><body><img src='" + tileM+"' width=29 height=29>";
				break;
			case 'N':
				url = "" + tileN;
				html = "<html><body><img src='" + tileN+"' width=29 height=29>";
				break;
			case 'O':
				url = "" + tileO;
				html = "<html><body><img src='" + tileO+"' width=29 height=29>";
				break;
			case 'P':
				url = "" + tileP;
				html = "<html><body><img src='" + tileP+"' width=29 height=29>";
				break;
			case 'Q':
				url = "" + tileQ;
				html = "<html><body><img src='" + tileQ+"' width=29 height=29>";
				break;
			case 'R':
				url = "" + tileR;
				html = "<html><body><img src='" + tileR+"' width=29 height=29>";
				break;
			case 'S':
				url = "" + tileS;
				html = "<html><body><img src='" + tileS+"' width=29 height=29>";
				break;
			case 'T':
				url = "" + tileT;
				html = "<html><body><img src='" + tileT+"' width=29 height=29>";
				break;
			case 'U':
				url = "" + tileU;
				html = "<html><body><img src='" + tileU+"' width=29 height=29>";
				break;
			case 'V':
				url = "" + tileV;
				html = "<html><body><img src='" + tileV+"' width=29 height=29>";
				break;
			case 'W':
				url = "" + tileW;
				html = "<html><body><img src='" + tileW+"' width=29 height=29>";
				break;
			case 'X':
				url = "" + tileX;
				html = "<html><body><img src='" + tileX+"' width=29 height=29>";
				break;
			case 'Y':
				url = "" + tileY;
				html = "<html><body><img src='" + tileY+"' width=29 height=29>";
				break;
			case 'Z':
				url = "" + tileZ;
				html = "<html><body><img src='" + tileZ+"' width=29 height=29>";
				break;
				
			}
			Tilerack3.setText(html);
		}


if(a == 4){
	switch(tileRack4char)
	{
	case 'A':
		url = "" + tileA;
		html = "<html><body><img src='" + tileA +"' width=29 height=29>";
		break;
	case 'B':
		url = "" + tileB;
		html = "<html><body><img src='" + tileB+"' width=29 height=29>";
		break;
	case 'C':
		url = "" + tileC;
		html = "<html><body><img src='" + tileC+"' width=29 height=29>";
		break;
	case 'D':
		url = "" + tileD;
		html = "<html><body><img src='" + tileD+"' width=29 height=29>";
		break;
	case 'E':
		url = "" + tileE;
		html = "<html><body><img src='" + tileE+"' width=29 height=29>";
		break;
	case 'F':
		url = "" + tileF;
		html = "<html><body><img src='" + tileF+"' width=29 height=29>";
		break;
	case 'G':
		url = "" + tileG;
		html = "<html><body><img src='" + tileG+"' width=29 height=29>";
		break;
	case 'H':
		url = "" + tileH;
		html = "<html><body><img src='" + tileH+"' width=29 height=29>";
		break;
	case 'I':
		url = "" + tileI;
		html = "<html><body><img src='" + tileI+"' width=29 height=29>";
		break;
	case 'J':
		url = "" + tileJ;
		html = "<html><body><img src='" + tileJ+"' width=29 height=29>";
		break;
	case 'K':
		url = "" + tileK;
		html = "<html><body><img src='" + tileK+"' width=29 height=29>";
		break;
	case 'L':
		url = "" + tileL;
		html = "<html><body><img src='" + tileL+"' width=29 height=29>";
		break;
	case 'M':
		url = "" + tileM;
		html = "<html><body><img src='" + tileM+"' width=29 height=29>";
		break;
	case 'N':
		url = "" + tileN;
		html = "<html><body><img src='" + tileN+"' width=29 height=29>";
		break;
	case 'O':
		url = "" + tileO;
		html = "<html><body><img src='" + tileO+"' width=29 height=29>";
		break;
	case 'P':
		url = "" + tileP;
		html = "<html><body><img src='" + tileP+"' width=29 height=29>";
		break;
	case 'Q':
		url = "" + tileQ;
		html = "<html><body><img src='" + tileQ+"' width=29 height=29>";
		break;
	case 'R':
		url = "" + tileR;
		html = "<html><body><img src='" + tileR+"' width=29 height=29>";
		break;
	case 'S':
		url = "" + tileS;
		html = "<html><body><img src='" + tileS+"' width=29 height=29>";
		break;
	case 'T':
		url = "" + tileT;
		html = "<html><body><img src='" + tileT+"' width=29 height=29>";
		break;
	case 'U':
		url = "" + tileU;
		html = "<html><body><img src='" + tileU+"' width=29 height=29>";
		break;
	case 'V':
		url = "" + tileV;
		html = "<html><body><img src='" + tileV+"' width=29 height=29>";
		break;
	case 'W':
		url = "" + tileW;
		html = "<html><body><img src='" + tileW+"' width=29 height=29>";
		break;
	case 'X':
		url = "" + tileX;
		html = "<html><body><img src='" + tileX+"' width=29 height=29>";
		break;
	case 'Y':
		url = "" + tileY;
		html = "<html><body><img src='" + tileY+"' width=29 height=29>";
		break;
	case 'Z':
		url = "" + tileZ;
		html = "<html><body><img src='" + tileZ+"' width=29 height=29>";
		break;
		
	}
	Tilerack4.setText(html);
}

if(a == 5){
	switch(tileRack5char)
	{
	case 'A':
		url = "" + tileA;
		html = "<html><body><img src='" + tileA +"' width=29 height=29>";
		break;
	case 'B':
		url = "" + tileB;
		html = "<html><body><img src='" + tileB+"' width=29 height=29>";
		break;
	case 'C':
		url = "" + tileC;
		html = "<html><body><img src='" + tileC+"' width=29 height=29>";
		break;
	case 'D':
		url = "" + tileD;
		html = "<html><body><img src='" + tileD+"' width=29 height=29>";
		break;
	case 'E':
		url = "" + tileE;
		html = "<html><body><img src='" + tileE+"' width=29 height=29>";
		break;
	case 'F':
		url = "" + tileF;
		html = "<html><body><img src='" + tileF+"' width=29 height=29>";
		break;
	case 'G':
		url = "" + tileG;
		html = "<html><body><img src='" + tileG+"' width=29 height=29>";
		break;
	case 'H':
		url = "" + tileH;
		html = "<html><body><img src='" + tileH+"' width=29 height=29>";
		break;
	case 'I':
		url = "" + tileI;
		html = "<html><body><img src='" + tileI+"' width=29 height=29>";
		break;
	case 'J':
		url = "" + tileJ;
		html = "<html><body><img src='" + tileJ+"' width=29 height=29>";
		break;
	case 'K':
		url = "" + tileK;
		html = "<html><body><img src='" + tileK+"' width=29 height=29>";
		break;
	case 'L':
		url = "" + tileL;
		html = "<html><body><img src='" + tileL+"' width=29 height=29>";
		break;
	case 'M':
		url = "" + tileM;
		html = "<html><body><img src='" + tileM+"' width=29 height=29>";
		break;
	case 'N':
		url = "" + tileN;
		html = "<html><body><img src='" + tileN+"' width=29 height=29>";
		break;
	case 'O':
		url = "" + tileO;
		html = "<html><body><img src='" + tileO+"' width=29 height=29>";
		break;
	case 'P':
		url = "" + tileP;
		html = "<html><body><img src='" + tileP+"' width=29 height=29>";
		break;
	case 'Q':
		url = "" + tileQ;
		html = "<html><body><img src='" + tileQ+"' width=29 height=29>";
		break;
	case 'R':
		url = "" + tileR;
		html = "<html><body><img src='" + tileR+"' width=29 height=29>";
		break;
	case 'S':
		url = "" + tileS;
		html = "<html><body><img src='" + tileS+"' width=29 height=29>";
		break;
	case 'T':
		url = "" + tileT;
		html = "<html><body><img src='" + tileT+"' width=29 height=29>";
		break;
	case 'U':
		url = "" + tileU;
		html = "<html><body><img src='" + tileU+"' width=29 height=29>";
		break;
	case 'V':
		url = "" + tileV;
		html = "<html><body><img src='" + tileV+"' width=29 height=29>";
		break;
	case 'W':
		url = "" + tileW;
		html = "<html><body><img src='" + tileW+"' width=29 height=29>";
		break;
	case 'X':
		url = "" + tileX;
		html = "<html><body><img src='" + tileX+"' width=29 height=29>";
		break;
	case 'Y':
		url = "" + tileY;
		html = "<html><body><img src='" + tileY+"' width=29 height=29>";
		break;
	case 'Z':
		url = "" + tileZ;
		html = "<html><body><img src='" + tileZ+"' width=29 height=29>";
		break;
		
	}
	Tilerack5.setText(html);
}

if(a == 6){
	switch(tileRack6char)
	{
	case 'A':
		url = "" + tileA;
		html = "<html><body><img src='" + tileA +"' width=29 height=29>";
		break;
	case 'B':
		url = "" + tileB;
		html = "<html><body><img src='" + tileB+"' width=29 height=29>";
		break;
	case 'C':
		url = "" + tileC;
		html = "<html><body><img src='" + tileC+"' width=29 height=29>";
		break;
	case 'D':
		url = "" + tileD;
		html = "<html><body><img src='" + tileD+"' width=29 height=29>";
		break;
	case 'E':
		url = "" + tileE;
		html = "<html><body><img src='" + tileE+"' width=29 height=29>";
		break;
	case 'F':
		url = "" + tileF;
		html = "<html><body><img src='" + tileF+"' width=29 height=29>";
		break;
	case 'G':
		url = "" + tileG;
		html = "<html><body><img src='" + tileG+"' width=29 height=29>";
		break;
	case 'H':
		url = "" + tileH;
		html = "<html><body><img src='" + tileH+"' width=29 height=29>";
		break;
	case 'I':
		url = "" + tileI;
		html = "<html><body><img src='" + tileI+"' width=29 height=29>";
		break;
	case 'J':
		url = "" + tileJ;
		html = "<html><body><img src='" + tileJ+"' width=29 height=29>";
		break;
	case 'K':
		url = "" + tileK;
		html = "<html><body><img src='" + tileK+"' width=29 height=29>";
		break;
	case 'L':
		url = "" + tileL;
		html = "<html><body><img src='" + tileL+"' width=29 height=29>";
		break;
	case 'M':
		url = "" + tileM;
		html = "<html><body><img src='" + tileM+"' width=29 height=29>";
		break;
	case 'N':
		url = "" + tileN;
		html = "<html><body><img src='" + tileN+"' width=29 height=29>";
		break;
	case 'O':
		url = "" + tileO;
		html = "<html><body><img src='" + tileO+"' width=29 height=29>";
		break;
	case 'P':
		url = "" + tileP;
		html = "<html><body><img src='" + tileP+"' width=29 height=29>";
		break;
	case 'Q':
		url = "" + tileQ;
		html = "<html><body><img src='" + tileQ+"' width=29 height=29>";
		break;
	case 'R':
		url = "" + tileR;
		html = "<html><body><img src='" + tileR+"' width=29 height=29>";
		break;
	case 'S':
		url = "" + tileS;
		html = "<html><body><img src='" + tileS+"' width=29 height=29>";
		break;
	case 'T':
		url = "" + tileT;
		html = "<html><body><img src='" + tileT+"' width=29 height=29>";
		break;
	case 'U':
		url = "" + tileU;
		html = "<html><body><img src='" + tileU+"' width=29 height=29>";
		break;
	case 'V':
		url = "" + tileV;
		html = "<html><body><img src='" + tileV+"' width=29 height=29>";
		break;
	case 'W':
		url = "" + tileW;
		html = "<html><body><img src='" + tileW+"' width=29 height=29>";
		break;
	case 'X':
		url = "" + tileX;
		html = "<html><body><img src='" + tileX+"' width=29 height=29>";
		break;
	case 'Y':
		url = "" + tileY;
		html = "<html><body><img src='" + tileY+"' width=29 height=29>";
		break;
	case 'Z':
		url = "" + tileZ;
		html = "<html><body><img src='" + tileZ+"' width=29 height=29>";
		break;
		
	}
	Tilerack6.setText(html);
}

if(a == 7){
	switch(tileRack7char)
	{
	case 'A':
		url = "" + tileA;
		html = "<html><body><img src='" + tileA +"' width=30 height=30>";
		break;
	case 'B':
		url = "" + tileB;
		html = "<html><body><img src='" + tileB+"' width=30 height=30>";
		break;
	case 'C':
		url = "" + tileC;
		html = "<html><body><img src='" + tileC+"' width=30 height=30>";
		break;
	case 'D':
		url = "" + tileD;
		html = "<html><body><img src='" + tileD+"' width=30 height=30>";
		break;
	case 'E':
		url = "" + tileE;
		html = "<html><body><img src='" + tileE+"' width=30 height=30>";
		break;
	case 'F':
		url = "" + tileF;
		html = "<html><body><img src='" + tileF+"' width=30 height=30>";
		break;
	case 'G':
		url = "" + tileG;
		html = "<html><body><img src='" + tileG+"' width=30 height=30>";
		break;
	case 'H':
		url = "" + tileH;
		html = "<html><body><img src='" + tileH+"' width=30 height=30>";
		break;
	case 'I':
		url = "" + tileI;
		html = "<html><body><img src='" + tileI+"' width=30 height=30>";
		break;
	case 'J':
		url = "" + tileJ;
		html = "<html><body><img src='" + tileJ+"' width=30 height=30>";
		break;
	case 'K':
		url = "" + tileK;
		html = "<html><body><img src='" + tileK+"' width=30 height=30>";
		break;
	case 'L':
		url = "" + tileL;
		html = "<html><body><img src='" + tileL+"' width=30 height=30>";
		break;
	case 'M':
		url = "" + tileM;
		html = "<html><body><img src='" + tileM+"' width=30 height=30>";
		break;
	case 'N':
		url = "" + tileN;
		html = "<html><body><img src='" + tileN+"' width=30 height=30>";
		break;
	case 'O':
		url = "" + tileO;
		html = "<html><body><img src='" + tileO+"' width=30 height=30>";
		break;
	case 'P':
		url = "" + tileP;
		html = "<html><body><img src='" + tileP+"' width=30 height=30>";
		break;
	case 'Q':
		url = "" + tileQ;
		html = "<html><body><img src='" + tileQ+"' width=30 height=30>";
		break;
	case 'R':
		url = "" + tileR;
		html = "<html><body><img src='" + tileR+"' width=30 height=30>";
		break;
	case 'S':
		url = "" + tileS;
		html = "<html><body><img src='" + tileS+"' width=30 height=30>";
		break;
	case 'T':
		url = "" + tileT;
		html = "<html><body><img src='" + tileT+"' width=30 height=30>";
		break;
	case 'U':
		url = "" + tileU;
		html = "<html><body><img src='" + tileU+"' width=30 height=30>";
		break;
	case 'V':
		url = "" + tileV;
		html = "<html><body><img src='" + tileV+"' width=30 height=30>";
		break;
	case 'W':
		url = "" + tileW;
		html = "<html><body><img src='" + tileW+"' width=30 height=30>";
		break;
	case 'X':
		url = "" + tileX;
		html = "<html><body><img src='" + tileX+"' width=30 height=30>";
		break;
	case 'Y':
		url = "" + tileY;
		html = "<html><body><img src='" + tileY+"' width=30 height=30>";
		break;
	case 'Z':
		url = "" + tileZ;
		html = "<html><body><img src='" + tileZ+"' width=30 height=30>";
		break;
		
	}
	Tilerack7.setText(html);
}





	
	}
}











