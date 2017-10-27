import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * Created by junaidali on 12/25/14.
 */
public class Grid extends JFrame {

	public Grid() {

		setLayout(new GridLayout(7, 5));
		final ArrayList<QuestionJ> cat = new ArrayList<QuestionJ>();
		// questions 0-4
		final QuestionJ q1 = new QuestionJ(
				"History",
				200,
				"Built in 312 B.C. to link Rome & the South of Italy, it's still in use today",
				"Appian Way", "What is the...");
		//q1.music("/Users/mcwirka/IdeaProjects/Midterms 2014-2015/Sumara A./resources/Jeopardy-theme-song.wav");
		cat.add(new QuestionJ(
				"History",
				100,
				"For the last 8 years of his life, Galileo was under house arrest for espousing this man's theory",
				"Copernicus", "Who is..."));
		cat.add(q1);
		cat.add(new QuestionJ(
				"History",
				300,
				"In 1000 Rajaraja I of the Cholas battled to take this Indian Ocean island now known for its tea",
				"Sri Lanka", "What is..."));
		cat.add(new QuestionJ(
				"History",
				400,
				"Karl led the first of these Marxist organizational efforts; the second one began in 1889",
				"International", "What is the..."));
		cat.add(new QuestionJ(
				"History",
				500,
				"This Asian political party was founded in 1885 with Indian National as part of its name",
				"Congress Party", "What is the..."));
		// questions 5-9
		cat.add(new QuestionJ(
				"Weather",
				100,
				"The city of Yuma in this state has a record average of 4,055 hours of sunshine each year",
				"Arizona", "What is..."));
		cat.add(new QuestionJ(
				"Weather",
				200,
				"In the winter of 1971-72, a record 1,122 inches of snow fell at Rainier Paradise Ranger Station in this state",
				"Washington", "What is..."));
		cat.add(new QuestionJ(
				"Weather",
				300,
				"On June 28, 1994 the nat'l weather service began issuing this index that rates the intensity of the sun's radiation",
				"UV index", "What is the..."));
		cat.add(new QuestionJ(
				"Weather",
				400,
				"Africa's lowest temperature was 11 degrees below zero in 1935 at Ifrane, just south of Fez in this country",
				"Morocco", "What is..."));
		cat.add(new QuestionJ(
				"Weather",
				500,
				"It's the only U.S. state whose recorded temperature has never dropped below 0 degrees Fahrenheit",
				"Hawaii", "What is..."));
		// questions 10-14
		cat.add(new QuestionJ("Also Known As", 100,
				"Author Mark Twain’s real name", "Samuel Clemens", "Who is..."));
		cat.add(new QuestionJ(
				"Also Known As",
				200,
				"Born as a prince, Siddhartha Gautama changed his name to this",
				"Buddha", "Who is..."));
		cat.add(new QuestionJ("Also Known As", 300,
				"Famous rapper's Curtis James Jackson III stage name",
				"50 Cent", "Who is..."));
		cat.add(new QuestionJ("Also Known As", 400,
				"It's Babe Ruth's birth name", "George Herman Ruth, Jr.",
				"Who is..."));
		cat.add(new QuestionJ("Also Known As", 500,
				"The name that Agnes Gonxhua Bojaxhui is better known as",
				"Mother Theresa", "Who is..."));
		// questions 15-19
		cat.add(new QuestionJ(
				"TOP 10 ALL-TIME ATHLETES",
				100,
				"No. 2: 1912 Olympian; football star at Carlisle Indian School; 6 MLB seasons with the Reds, Giants & Braves'",
				"Jim Thorpe", "Who is..."));
		cat.add(new QuestionJ(
				"TOP 10 ALL-TIME ATHLETES",
				200,
				"No. 8: 30 steals for the Birmingham Barons; 2,306 steals for the Bulls",
				"Michael Jordan", "Who is..."));
		cat.add(new QuestionJ(
				"TOP 10 ALL-TIME ATHLETES",
				300,
				"No. 1: Lettered in hoops, football & lacrosse at Syracuse & if you think he couldn't act, ask his 11 \"unclean\" buddies",
				"Jim Brown", "Who is..."));
		cat.add(new QuestionJ(
				"TOP 10 ALL-TIME ATHLETES",
				400,
				"No. 10: FB/LB for Columbia U. in the 1920s; MVP for the Yankees in '27 & '36; \"Gibraltar in Cleats\"",
				"Lou Gehrig", "Who is..."));
		cat.add(new QuestionJ(
				"TOP 10 ALL-TIME ATHLETES",
				500,
				"No. 5: Only center to lead the NBA in assists; track scholarship to Kansas U.; marathoner; volleyballer",
				"Wilt Chamberlain", "Who is..."));
		// question 20-24
		cat.add(new QuestionJ(
				"3-LETTER WORDS",
				100,
				"In the title of an Aesop fable, this insect shared billing with a grasshopper",
				"ant", "What is the..."));
		cat.add(new QuestionJ(
				"3-LETTER WORDS",
				200,
				"Cows regurgitate this from the first stomach to the mouth & chew it again",
				"cud", "What is..."));
		cat.add(new QuestionJ(
				"3-LETTER WORDS",
				300,
				"A small demon, or a mischievous child (who might be a little demon!)",
				"imp", "What is the..."));
		cat.add(new QuestionJ(
				"3-LETTER WORDS",
				400,
				"In geologic time one of these, shorter than an eon, is divided into periods & subdivided into epochs",
				"era", "What is an..."));
		cat.add(new QuestionJ(
				"3-LETTER WORDS",
				500,
				"A single layer of paper, or to perform one's craft diligently",
				"ply", "What is..."));
		// question 25-29
		cat.add(new QuestionJ(
				"THE COMPANY LINE",
				100,
				"In 1963, live on \"The Art Linkletter Show\", this company served its billionth burger'",
				"McDonald\'s", "What is..."));
		cat.add(new QuestionJ(
				"THE COMPANY LINE",
				200,
				"This housewares store was named for the packaging its merchandise came in & was first displayed on",
				"Crate & Barrel", "What is..."));
		cat.add(new QuestionJ(
				"THE COMPANY LINE",
				300,
				"This company's Accutron watch, introduced in 1960, had a guarantee of accuracy to within one minute a  month",
				"Bulova", "What is..."));
		cat.add(new QuestionJ(
				"THE COMPANY LINE",
				400,
				"'Edward Teller & this man partnered in 1898 to sell high fashions to women",
				"Paul Bonwit", "What is..."));
		cat.add(new QuestionJ(
				"THE COMPANY LINE",
				500,
				"'The Kirschner brothers, Don & Bill, named this ski company for themselves & the second-highest mountain",
				"K2", "What is..."));
		// questions 30-34
		cat.add(new QuestionJ(
				"WORDS IN HARRY POTTER TITLES",
				100,
				"A non-reigning male member of a royal family who may prefer to drive a \"little red corvette\"",
				"prince", "What is a..."));
		cat.add(new QuestionJ("WORDS IN HARRY POTTER TITLES", 200,
				"A person deprived of liberty", "prisoner", "What is a..."));
		cat.add(new QuestionJ("WORDS IN HARRY POTTER TITLES", 300,
				"A southwest city founded in 1870", "Phoenix", "What is a..."));
		cat.add(new QuestionJ(
				"WORDS IN HARRY POTTER TITLES",
				400,
				"A private room in a house, or a John Grisham novel about a death row prisoner",
				"chamber", "What is a..."));
		cat.add(new QuestionJ("WORDS IN HARRY POTTER TITLES", 500,
				"Last name of U.S. Chief Justice Harlan or biographer Irving",
				"stone", "What is a..."));
		// questions 35-39
		cat.add(new QuestionJ("CELEBS", 100,
				"On Sept. 14, 2005 she gave birth to Sean Preston Federline'",
				"Britney Spears", "Who is..."));
		cat.add(new QuestionJ(
				"CELEBS",
				200,
				"The TV show \"Everybody Hates Chris\" is based on the childhood of this comic",
				"Chris Rock", "Who is..."));
		cat.add(new QuestionJ(
				"CELEBS",
				300,
				"He auditioned for & won the part of Ron Weasley with a rap that he wrote",
				"Rupert Grint", "Who is..."));
		cat.add(new QuestionJ(
				"CELEBS",
				400,
				"Her 18th birthday party was \"A Cinderella Story\" with 300 guests & red velvet cake",
				"Hilary Duff", "Who is..."));
		cat.add(new QuestionJ("CELEBS", 500,
				"\"You Stand Watching\" this \"Shine On\" singer",
				"Ryan Cabrera", "Who is..."));
		// questions 40-44
		cat.add(new QuestionJ("OUT OF YOUR LEAGUE", 100,
				"It includes Princeton & the University of Pennsylvania",
				"Ivy League", "What is the..."));
		cat.add(new QuestionJ(
				"OUT OF YOUR LEAGUE",
				200,
				"\"Happy Mothers, Breastfed Babies\" is the motto of this league whose name includes the Spanish for \"milk\"",
				"La Leche", "What is the..."));
		cat.add(new QuestionJ(
				"OUT OF YOUR LEAGUE",
				300,
				"It's what the \"AD\" stands for in the ADL, a league that's been fighting bigotry since 1913",
				"Anti-Defamation League", "What is the..."));
		cat.add(new QuestionJ(
				"OUT OF YOUR LEAGUE",
				400,
				"Celebrating its 90th anniversary in 2010, this nonpartisan political org. is open to men as well",
				"League of Women Voters", "What is the..."));
		cat.add(new QuestionJ(
				"OUT OF YOUR LEAGUE",
				500,
				"The name of this Northern European trade league comes from the medieval German for \"guild\"",
				"Hanseatic League", "What is the..."));
		// qusetions 45-49
		cat.add(new QuestionJ(
				"NAME IN COMMON",
				100,
				"Name in common to a mother of a 20th century U.S. president & a WWII propaganda broadcaster",
				"Rose", "Who is..."));
		cat.add(new QuestionJ(
				"NAME IN COMMON",
				200,
				"...to the big screen's \"Scorpion King\" & the little screen's \"McMillan\"",
				"Rock", "Who is the..."));
		cat.add(new QuestionJ(
				"NAME IN COMMON",
				300,
				"..to a \"Lethal\" Mel Gibson movie character & a famous loser to Billie Jean King",
				"Riggs", "Who is..."));
		cat.add(new QuestionJ(
				"NAME IN COMMON",
				400,
				"...to the band that sang 1984's \"Hold Me Now\" & the 1920s man who invented a machine gun",
				"Thompson", "Who is..."));
		cat.add(new QuestionJ(
				"NAME IN COMMON",
				500,
				"...to the first lead singer of Genesis & a leader of art's Pre-Raphaelites",
				"Gabriel", "Who is..."));
		// questions 50-54
		cat.add(new QuestionJ("AUTOBIOGRAPHERS", 100,
				"A German master: \"From My Life: Poetry and Truth\" (1813)",
				"Goethe", "Who is..."));
		cat.add(new QuestionJ("AUTOBIOGRAPHERS", 200,
				"A 4th century A.D. Catholic Patriarch:\"Confessions\"",
				"St. Augustine", "Who is..."));
		cat.add(new QuestionJ("AUTOBIOGRAPHERS", 300,
				"A psychologist: 1962's \"Memories, Dreams, Reflections\"",
				"Carl Jung", "Who is..."));
		cat.add(new QuestionJ(
				"AUTOBIOGRAPHERS",
				400,
				"An American Trappist monk & religious writer: \"The Seven Storey Mountain\"",
				"Thomas Merton", "Who is..."));
		cat.add(new QuestionJ(
				"AUTOBIOGRAPHERS",
				500,
				"A 19th century essayist: \"Confessions of an English Opium-Eater\"",
				"Thomas DeQuincy", "Who is..."));
		// questions 55-59
		cat.add(new QuestionJ(
				"SCIENTIFIC AMERICAN",
				100,
				"The spring 1998 issue covered the first of these stellar explosions seen in both birth & death",
				"Supernovas", "What are..."));
		cat.add(new QuestionJ(
				"SCIENTIFIC AMERICAN",
				200,
				"The second word in the acronym AIDS points to this medical specialty that studies the disease",
				"Immunology", "What is..."));
		cat.add(new QuestionJ(
				"SCIENTIFIC AMERICAN",
				300,
				"His uncertainty principle says a particle's position & momentum can't be known simultaneously",
				"Werner Heisenberg", "Who is..."));
		cat.add(new QuestionJ(
				"SCIENTIFIC AMERICAN",
				400,
				"Unselfishly, carbon generally forms these bonds in which atoms share their electrons",
				"Covalent Bonds", "What are..."));
		cat.add(new QuestionJ(
				"SCIENTIFIC AMERICAN",
				500,
				"General term for cells that translate stimuli, like those of drugs, into nerve impulses",
				"Receptors", "What are..."));
		// questions 60-64
		cat.add(new QuestionJ(
				"INTERNATIONAL FOOD & DRINK",
				100,
				"Austrian schlosserbuben are these wrinkled fruits baked in dough & rolled in sugar & chocolate",
				"Prunes", "What are..."));
		cat.add(new QuestionJ(
				"INTERNATIONAL FOOD & DRINK",
				200,
				"In this largest South American country, Romeu e Julieta is a slice of fresh cheese topped with guava jelly",
				"Brazil", "What is..."));
		cat.add(new QuestionJ(
				"INTERNATIONAL FOOD & DRINK",
				300,
				"Many Russians love to pick these fungi, known as griby, & cook them in sour cream",
				"Mushrooms", "What are..."));
		cat.add(new QuestionJ(
				"INTERNATIONAL FOOD & DRINK",
				400,
				"Eaten in the British Isles, the \"black\" or \"blood\" type of this is really a sausage, not a dessert",
				"Pudding", "What is..."));
		cat.add(new QuestionJ(
				"INTERNATIONAL FOOD & DRINK",
				500,
				"Egri Bikaver, or \"Bull's Blood From Eger\", is a red wine from this country, also known for its white tokay",
				"Hungary", "What is..."));
		// questions 65-69
		cat.add(new QuestionJ("YEARS", 100, "Buzz Aldrin walks on the moon",
				"1969", "What is..."));
		cat.add(new QuestionJ("YEARS", 200, "Bill Clinton reelected president",
				"1996", "What is..."));
		cat.add(new QuestionJ("YEARS", 300,
				"Jimi Hendrix performs at Woodstock", "1969", "What is..."));
		cat.add(new QuestionJ("YEARS", 400,
				"'Richard Nixon moves into the White House", "1969",
				"What is..."));
		cat.add(new QuestionJ("YEARS", 500, "Atlanta hosts the Olympics",
				"1996", "What is..."));
		// questions 70-74
		cat.add(new QuestionJ("ENDS IN -OON", 100,
				"The name of this type of storm means \"great wind\"",
				"typhoon", "What is a..."));
		cat.add(new QuestionJ("ENDS IN -OON", 200,
				"This 1947 musical is set in the highlands of Scotland",
				"Brigadoon", "What is the..."));
		cat.add(new QuestionJ("ENDS IN -OON", 300,
				"This gold coin of Spain was once worth 8 escudos", "doubloon",
				"What is a..."));
		cat.add(new QuestionJ("ENDS IN -OON", 400,
				"This Saskatchewan city was named for a local red berry",
				"Saskatoon", "What is..."));
		cat.add(new QuestionJ(
				"ENDS IN -OON",
				500,
				"It's the French dialect spoken in the southern part of Belgium",
				"Walloon", "What is..."));
		// questions 75-79
		cat.add(new QuestionJ(
				"WHEN YOU GET THE MONEY",
				100,
				"His NYC holdings alone have included the Plaza Hotel, a \"World Tower\" & 40 Wall Street",
				"Donald Trump", "Who is..."));
		cat.add(new QuestionJ(
				"WHEN YOU GET THE MONEY",
				200,
				"In the '30s he used some of his fortune to finance movies like \"Hell's Angels\" &, yes, \"Scarface\"",
				"Howard Hughes", "Who is..."));
		cat.add(new QuestionJ(
				"WHEN YOU GET THE MONEY",
				300,
				"No doubt he had a comfortable retirement after selling his steel company in 1901 for $250 million",
				"Carnegie", "Who is..."));
		cat.add(new QuestionJ(
				"WHEN YOU GET THE MONEY",
				400,
				"After her first husband, a senator, died in a 1991 plane crash, she inherited an estimated $500 million",
				"Teresa Heinz-Kerry", "Who is..."));
		cat.add(new QuestionJ(
				"WHEN YOU GET THE MONEY",
				500,
				"He hit the jackpot when he built the Mirage & Bellagio hotels on the Las Vegas Strip",
				"Steve Wynn", "Who is..."));
		// questions 80-84
		cat.add(new QuestionJ("BOYS IN THE BAND", 100,
				"Larry Mullen, Jr., Adam Clayton, The Edge, Bono", "U2",
				"What is..."));
		cat.add(new QuestionJ("BOYS IN THE BAND", 200,
				"Nick Rhodes, Andy, John & Roger Taylor, Simon Le Bon",
				"Duran Duran", "What is..."));
		cat.add(new QuestionJ("BOYS IN THE BAND", 300,
				"John Paul Jones, John Bonham, Jimmy Page, Robert Plant",
				"Led Zeppelin", "What is..."));
		cat.add(new QuestionJ("BOYS IN THE BAND", 400,
				"Peter Buck, Mike Mills, Bill Berry, Michael Stipe", "R.E.M.",
				"What is..."));
		cat.add(new QuestionJ(
				"BOYS IN THE BAND",
				500,
				"Zayn Malik, Nial Horan, Liam Payne, Louis Tomlinson, Harry Styles",
				"One Direction", "What is..."));
		// questions 85-89
		cat.add(new QuestionJ("WORLD CAPITALS", 100,
				"It's served by Keflavik airport", "Reykjavik", "What is..."));
		cat.add(new QuestionJ("WORLD CAPITALS", 200,
				"It has a museum devoted to composer Zoltan Kodaly",
				"Budapest", "What is..."));
		cat.add(new QuestionJ("WORLD CAPITALS", 300,
				"It's home to the Holmenkollen ski jump", "Oslo", "What is..."));
		cat.add(new QuestionJ("WORLD CAPITALS", 400,
				"Guyanese capital named for a Hanoverian monarch",
				"Georgetown", "What is..."));
		cat.add(new QuestionJ("WORLD CAPITALS", 500,
				"It's on the Suriname River", "Paramaribo", "What is..."));
		// questions 90-94
		cat.add(new QuestionJ(
				"MR. JOHNSON",
				100,
				"You'll find this man's presidential library at the University of Texas in Austin",
				"Lyndon Johnson", "Who is..."));
		cat.add(new QuestionJ(
				"MR. JOHNSON",
				200,
				"An attempt on this man's life was part of the Lincoln assassination plot",
				"Andrew Johnson", "Who is..."));
		cat.add(new QuestionJ(
				"MR. JOHNSON",
				300,
				"Pietro Mennea's record of 19.72 seconds in the 200-m. dash stood from 1979 until this American broke it in 1996'",
				"Michael Johnson", "Who is..."));
		cat.add(new QuestionJ(
				"MR. JOHNSON",
				400,
				"In 1908 he became the first black heavyweight boxing champ when he KO'd Tommy Burns",
				"Jack Johnson", "Who is..."));
		cat.add(new QuestionJ(
				"MR. JOHNSON",
				500,
				"This founder & publisher of Ebony received a 1996 Presidential Medal of Freedom",
				"John H. Johnson", "Who is..."));
		// questions 95-99
		cat.add(new QuestionJ(
				"HOW SWEET IT IS",
				100,
				"You might find these boxed chocolates from Hershey's at the end of the rainbow",
				"Pot of Gold", "What is..."));
		cat.add(new QuestionJ("HOW SWEET IT IS", 200,
				"Until 1932 this candy was known as the \"Papa Sucker\"",
				"Sugar Daddy", "What is..."));
		cat.add(new QuestionJ(
				"HOW SWEET IT IS",
				300,
				"Relax -- this Charlotte ingredient is made from sponge cake, not a woman's hand",
				"ladyfingers", "What are..."));
		cat.add(new QuestionJ(
				"HOW SWEET IT IS",
				400,
				"(Cheryl of the Clue Crew reports from the Orange County Fair)  This cake, a Pennsylvania Dutch specialty, is named for the device used to pour the batter",
				"funnel cake", "What is..."));
		cat.add(new QuestionJ(
				"HOW SWEET IT IS",
				500,
				"America's first sandwich cookie, it was introduced in 1910; Oreos came along 2 years later",
				"Hydrox", "What is..."));

		// Randomizes category Strings without repetition
		String group1 = q1.RandomCategory();
		String group2 = q1.RandomCategory();
		while (group1 == group2)
			group2 = q1.RandomCategory();
		String group3 = q1.RandomCategory();
		while (group3 == group2 || group3 == group1)
			group3 = q1.RandomCategory();
		String group4 = q1.RandomCategory();
		while (group4 == group2 || group4 == group1 || group4 == group3)
			group4 = q1.RandomCategory();
		String group5 = q1.RandomCategory();
		while (group5 == group2 || group5 == group1 || group5 == group3
				|| group5 == group4)
			group5 = q1.RandomCategory();
		int que1 = 1, que2 = 1, que3 = 1, que4 = 1, que5 = 1;
		int[] que = { que1, que2, que3, que4, que5 };
		String[] group = { group1, group2, group3, group4, group5 };

		// Checks to see if any of the above categories is equal to the category
		// name
		// tells where the first question of category is located in the array (
		// if que[0] = 2, then question worth 100 is at index 2*5 of array)
		for (int i = 0; i < group.length; i++)
			if (group[i].equals("HISTORY"))
				que[i] = 0;
		for (int i = 0; i < group.length; i++)
			if (group[i].equals("WEATHER"))
				que[i] = 1;
		for (int i = 0; i < group.length; i++)
			if (group[i].equals("ALSO KNOWN AS"))
				que[i] = 2;
		for (int i = 0; i < group.length; i++)
			if (group[i].equals("TOP 10 ALL-TIME ATHLETES"))
				que[i] = 3;
		for (int i = 0; i < group.length; i++)
			if (group[i].equals("3-LETTER WORDS"))
				que[i] = 4;
		for (int i = 0; i < group.length; i++)
			if (group[i].equals("THE COMPANY LINE"))
				que[i] = 5;
		for (int i = 0; i < group.length; i++)
			if (group[i].equals("WORDS IN HARRY POTTER TITLES"))
				que[i] = 6;
		for (int i = 0; i < group.length; i++)
			if (group[i].equals("CELEBS"))
				que[i] = 7;
		for (int i = 0; i < group.length; i++)
			if (group[i].equals("OUT OF YOUR LEAGUE"))
				que[i] = 8;
		for (int i = 0; i < group.length; i++)
			if (group[i].equals("NAME IN COMMON"))
				que[i] = 9;
		for (int i = 0; i < group.length; i++)
			if (group[i].equals("AUTOBIOGRAPHERS"))
				que[i] = 10;
		for (int i = 0; i < group.length; i++)
			if (group[i].equals("SCIENTIFIC AMERICAN"))
				que[i] = 11;
		for (int i = 0; i < group.length; i++)
			if (group[i].equals("INTERNATIONAL FOOD & DRINK"))
				que[i] = 12;
		for (int i = 0; i < group.length; i++)
			if (group[i].equals("YEARS"))
				que[i] = 13;
		for (int i = 0; i < group.length; i++)
			if (group[i].equals("ENDS IN -OON"))
				que[i] = 14;
		for (int i = 0; i < group.length; i++)
			if (group[i].equals("WHEN YOU GET THE MONEY"))
				que[i] = 15;
		for (int i = 0; i < group.length; i++)
			if (group[i].equals("BOYS IN THE BAND"))
				que[i] = 16;
		for (int i = 0; i < group.length; i++)
			if (group[i].equals("WORLD CAPITALS"))
				que[i] = 17;
		for (int i = 0; i < group.length; i++)
			if (group[i].equals("MR. JOHNSON"))
				que[i] = 18;
		for (int i = 0; i < group.length; i++)
			if (group[i].equals("HOW SWEET IT IS"))
				que[i] = 19;

		// sets up catgory headings
		final JLabel[] label = new JLabel[10];
		label[0] = new JLabel(group1, JLabel.CENTER);
		add(label[0]);
		label[1] = new JLabel(group2, JLabel.CENTER);
		add(label[1]);
		label[2] = new JLabel(group3, JLabel.CENTER);
		add(label[2]);
		label[3] = new JLabel(group4, JLabel.CENTER);
		add(label[3]);
		label[4] = new JLabel(group5, JLabel.CENTER);
		add(label[4]);

		// sets up buttons
		final JButton[] buttons = new JButton[25];
		for (int i = 0; i < buttons.length; i++) {
			if (i < 5)
				buttons[i] = new JButton("100");
			else if (i < 10)
				buttons[i] = new JButton("200");
			else if (i < 15)
				buttons[i] = new JButton("300");
			else if (i < 20)
				buttons[i] = new JButton("400");
			else if (i < 25)
				buttons[i] = new JButton("500");
			buttons[i].setBackground(Color.blue);
			buttons[i].setOpaque(true);
			add(buttons[i]);

		}

		// sets up score keeper JLabels
		final String[] player = new String[5];
		for (int i = 0; i < 5; i++) {
			String input;
			do {
				player[i] = JOptionPane.showInputDialog("Enter player "
						+ (i + 1) + "'s name");
				input = player[i];
			} while (player[i] == null || input.length() == 0);
		}

		for (int i = 5; i < label.length; i++) {
			label[i] = new JLabel(player[i - 5] + "'s score: "
					+ q1.getScore(i - 5));
			add(label[i]);
		}
		for (int i = 0; i < label.length; i++) {
			label[i].setBackground(Color.blue);
			label[i].setOpaque(true);
			label[i].setFont(new Font(null, Font.PLAIN, 16));
			label[i].setForeground(Color.white);
			if (i < 5)
				label[i].setFont(label[i].getFont().deriveFont(Font.BOLD, 14));
		}

		// creates the array of questions, first instantiates the 100 question
		// for category 1, then 2, etc..then the 200's, etc.
		// counter loops it 25 times, z * 5 is the index value of the all of the
		// 100 pt questions in the original array for the 5 categories
		// y moves the index of the original array by the value of the question
		// from the 100 pt question ( 1 for 200, 4 for 500, etc)
		// For example the index of cateogry History for 500 is equal to 0*5 + 4
		int counter = 0;
		final ArrayList<QuestionJ> index = new ArrayList<QuestionJ>();
		for (int y = 0; counter < 25; y++)
			for (int z = 0; z < 5; z++) {
				index.add(cat.get(que[z] * 5 + y));
				counter++;
			}
		final Random gen = new Random();

		// prompts user of their turn
		final int x = 0;
		final JFrame frame = new JFrame();
		JOptionPane.showMessageDialog(frame, "It is " + player[x] + "'s turn");

		// sets player's label yellow and bolded
		label[x + 5].setForeground(Color.yellow);
		label[x + 5].setFont(label[x + 5].getFont().deriveFont(Font.BOLD, 16));

		// generates the daily double button
		final int rancat = gen.nextInt(25);
		System.out.print(rancat);

		for (int i = 0; i < buttons.length; i++)
			buttons[i].addActionListener(new ActionListener() // adds
																// actionlistener
																// to all of the
																// buttons
					{
						public void actionPerformed(ActionEvent e) {
							for (int i = 0; i < buttons.length; i++)

								if (e.getSource() == buttons[i]) // if button is
																	// clicked
																	// then
																	// return
																	// appropriate
																	// question
								{
									q1.button(1); // increments button counter
													// by one

									if (rancat == i) // dailydouble
									{
										// intitialize the values, they have no
										// meaning
										String wager = "Hi";
										int wage = 2;
										int max = 0;
										if (q1.getScore(q1.playerTurn(0)) > 5
												&& q1.getScore(q1.playerTurn(0)) != 0) // if
																						// player's
																						// score
																						// is
																						// positive,
																						// then
																						// set
																						// the
																						// max
																						// amount
																						// of
																						// points
																						// wager
																						// to
																						// player
																						// score
											max = q1.getScore(q1.playerTurn(0)); // it
																					// can
																					// bring
																					// them
																					// to
																					// zero
																					// or
																					// double
																					// their
																					// score
										else if (q1.getScore(q1.playerTurn(0)) <= 5
												&& q1.getScore(q1.playerTurn(0)) != 0) // if
																						// player
																						// score
																						// is
																						// negative,
																						// then
																						// set
																						// max
																						// amount
																						// to
																						// the
																						// absolute
																						// value
																						// of
																						// the
																						// player
																						// score
											max = (q1.getScore(q1.playerTurn(0)) * -1); // it
																						// can
																						// bring
																						// them
																						// up
																						// to
																						// zero
																						// or
																						// make
																						// their
																						// score
																						// twice
																						// as
																						// bad
										else if (q1.getScore(q1.playerTurn(0)) == 0) // if
																						// score
																						// is
																						// zero,
																						// make
																						// max
																						// amount
																						// 100
											max = 100;

										// makes button colors random
										for (int y = 0; y < buttons.length; y++) {

											if (y % 2 == 0)
												buttons[y]
														.setBackground(Color.yellow);
											else
												buttons[y]
														.setBackground(Color.red);

											if (y < 5) {
												if (y % 2 == 0)
													label[y].setBackground(Color.red);
												else
													label[y].setBackground(Color.yellow);
											} else if (y < label.length) {
												if (y % 2 == 0)
													label[y].setBackground(Color.yellow);
												else
													label[y].setBackground(Color.red);
											}
										}

										// q1.music("/Users/mcwirka/IdeaProjects/Midterms 2014-2015/Sumara A./resources/Jeopardy-daily2x.wav");

										boolean num = true;
										do // make sure converting from String
											// to int doesn't crash program
										{
											try {
												wager = JOptionPane
														.showInputDialog("Congrats, you picked the Daily Double! Enter amount of points to wager from 5 to: "
																+ max);
												wage = Integer.parseInt(wager);
												num = true;
											} catch (Exception ex) {
												num = false;
											}

										} while (num != true);

										// sets background colors back to blue
										for (int y = 0; y < buttons.length; y++)
											buttons[y]
													.setBackground(Color.blue);
										for (int y = 0; y < label.length; y++)
											label[y].setBackground(Color.blue);

										// make sure player enter's number
										// within the given range
										while (wage < 5 || wage > max
												|| num != true) {
											try {
												wager = JOptionPane
														.showInputDialog("Invalid Entry. Please enter amount of points to wager from 5 to "
																+ max);
												wage = Integer.parseInt(wager);
												num = true;
											} catch (Exception ex) {
												num = false;
											}

										}

										String input = JOptionPane
												.showInputDialog(index.get(i)
														.getQuestion()
														+ "\n "
														+ index.get(i)
																.getQuestionStart());

										if (index.get(i).checkAnswer(input) == false) {

											// q1.music("/Users/mcwirka/IdeaProjects/Midterms 2014-2015/Sumara A./resources/fail-trombone-03.wav");
											JOptionPane
													.showMessageDialog(
															frame,
															"Your answer was wrong. The correct answer was: "
																	+ index.get(
																			i)
																			.getAnswer());

											q1.scoreSubtract(q1.playerTurn(0),
													wage); // subtract the
															// points to the
															// player's score

											// updates JLabel
											label[q1.playerTurn(0) + 5].setText(player[q1
													.playerTurn(0)]
													+ "'s score: "
													+ q1.getScore(q1
															.playerTurn(0)));

											// sets plaayer font and color back
											// to normal
											label[q1.playerTurn(0) + 5]
													.setForeground(Color.white);
											label[q1.playerTurn(0) + 5]
													.setFont(label[q1
															.playerTurn(0) + 5]
															.getFont()
															.deriveFont(
																	Font.PLAIN,
																	16));

											if (q1.button(0) == 25)
												JOptionPane.showMessageDialog(
														frame, "Game End!");
											else {
												q1.playerTurn(1); // makes it
																	// next
																	// players
																	// turn
												JOptionPane.showMessageDialog(
														frame,
														player[q1.playerTurn(0)]
																+ "'s turn");

												// sets player's font and color
												label[q1.playerTurn(0) + 5]
														.setForeground(Color.yellow);
												label[q1.playerTurn(0) + 5].setFont(label[q1
														.playerTurn(0) + 5]
														.getFont().deriveFont(
																Font.BOLD, 16));
											}
										}

										if (index.get(i).checkAnswer(input) == true) {
											// q1.music("/Users/mcwirka/IdeaProjects/Midterms 2014-2015/Sumara A./resources/Ding.wav");
											JOptionPane.showMessageDialog(
													frame,
													"Your answer was right.");

											q1.score(q1.playerTurn(0), wage); // adds
																				// the
																				// points
																				// to
																				// the
																				// player's
																				// score
											if (q1.button(0) == 25)
												JOptionPane.showMessageDialog(
														frame, "Game End!");
											else {
												label[q1.playerTurn(0) + 5].setText(player[q1
														.playerTurn(0)]
														+ "'s score: "
														+ q1.getScore(q1
																.playerTurn(0))); // updates
																					// JLabel
											}
										}
									}

									else {
										String inputValue = JOptionPane
												.showInputDialog(index.get(i)
														.getQuestion()
														+ "\n"
														+ index.get(i)
																.getQuestionStart());

										if (index.get(i)
												.checkAnswer(inputValue) == false) {
											// q1.music("/Users/mcwirka/IdeaProjects/Midterms 2014-2015/Sumara A./resources/fail-trombone-03.wav");
											JOptionPane
													.showMessageDialog(
															frame,
															"Your answer was wrong. The correct answer was: "
																	+ index.get(
																			i)
																			.getAnswer());

											q1.scoreSubtract(q1.playerTurn(0),
													index.get(i)
															.getComplexity()); // subtracts
																				// the
																				// points
																				// to
																				// the
																				// player's
																				// score

											// updates JLabel
											label[q1.playerTurn(0) + 5].setText(player[q1
													.playerTurn(0)]
													+ "'s score: "
													+ q1.getScore(q1
															.playerTurn(0)));

											// makes player's label normal
											label[q1.playerTurn(0) + 5]
													.setForeground(Color.white);
											label[q1.playerTurn(0) + 5]
													.setFont(label[q1
															.playerTurn(0) + 5]
															.getFont()
															.deriveFont(
																	Font.PLAIN,
																	16));
											if (q1.button(0) == 25)
												JOptionPane.showMessageDialog(
														frame, "Game End!");
											else {
												q1.playerTurn(1); // makes it
																	// next
																	// players
																	// turn
												JOptionPane.showMessageDialog(
														frame,
														player[q1.playerTurn(0)]
																+ "'s turn");

												// makes players label bold and
												// yellow
												label[q1.playerTurn(0) + 5]
														.setForeground(Color.yellow);
												label[q1.playerTurn(0) + 5].setFont(label[q1
														.playerTurn(0) + 5]
														.getFont().deriveFont(
																Font.BOLD, 16));
											}
										}

										if (index.get(i)
												.checkAnswer(inputValue) == true) {
											// q1.music("/Users/mcwirka/IdeaProjects/Midterms 2014-2015/Sumara A./resources/Ding.wav");
											JOptionPane.showMessageDialog(
													frame,
													"Your answer was right.");
											q1.score(q1.playerTurn(0), index
													.get(i).getComplexity());
											if (q1.button(0) == 25)
												JOptionPane.showMessageDialog(
														frame, "Game End!");
											else {
												label[q1.playerTurn(0) + 5].setText(player[q1
														.playerTurn(0)]
														+ "'s score: "
														+ q1.getScore(q1
																.playerTurn(0))); // updates
																					// JLabel
											}
										}

									}

									buttons[i].setEnabled(false); // button
																	// becomes
																	// unusable
																	// after one
																	// click

								}

						}
					});

	}

}
