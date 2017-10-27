/**
 * Created by junaidali on 12/21/14.
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.TargetDataLine;


public class QuestionJ

{
	String question, answer, category, questionStart;
	int point, turn = 0, buttoncounter = 0;
	int[] score = new int[5];

	public QuestionJ(String group, int level, String query, String result,
			String queStart) {
		question = query;
		answer = result;
		point = level;
		category = group;
		questionStart = queStart;

	}

	public String RandomCategory() {
		ArrayList<String> cat = new ArrayList<String>();
		cat.add("HISTORY");
		cat.add("WEATHER");
		cat.add("ALSO KNOWN AS");
		cat.add("TOP 10 ALL-TIME ATHLETES");
		cat.add("3-LETTER WORDS");
		cat.add("THE COMPANY LINE");
		cat.add("WORDS IN HARRY POTTER TITLES");
		cat.add("CELEBS");
		cat.add("OUT OF YOUR LEAGUE");
		cat.add("NAME IN COMMON");
		cat.add("AUTOBIOGRAPHERS");
		cat.add("SCIENTIFIC AMERICAN");
		cat.add("INTERNATIONAL FOOD & DRINK");
		cat.add("YEARS");
		cat.add("ENDS IN -OON");
		cat.add("WHEN YOU GET THE MONEY");
		cat.add("BOYS IN THE BAND");
		cat.add("WORLD CAPITALS");
		cat.add("MR. JOHNSON");
		cat.add("HOW SWEET IT IS");
		Random gen = new Random();

		int cate = gen.nextInt(cat.size());
		return (cat.get(cate));
	}

	public int getComplexity() {
		return point;
	}

	public String getQuestion() {
		return question;

	}

	public boolean checkAnswer(String useranswer) {
		return answer.equalsIgnoreCase(useranswer);
	}

	public String getAnswer() {
		return answer;
	}

	public String getQuestionStart() {
		return questionStart;
	}

	public void score(int i, int add) {
		// adds point value(add) to the player's score
		// i is found by playerTurn
		score[i] += add;

	}

	public void scoreSubtract(int i, int min) {

		score[i] -= min;

	}

	public int getScore(int i) {
		return score[i];
	}

	public int playerTurn(int x) {
		turn += x;
		// either x =1 for next player's turn or x = 0 to return current player
		// index
		if (turn > 4)
			turn = 0;
		return turn;
		// returns the index in the player or score array
	}

	public int button(int x) {
		buttoncounter += x;
		return buttoncounter;
	}
	/*
	public static void music(String title) {
		FileInputStream input;
		AudioInputStream audio;

		try {
			String file = title;
			input = new FileInputStream(file);
			audio = new AudioInputStream(input);

			AudioPlayer.player.start(audio);
		} catch (IOException ie) {
			ie.printStackTrace();

		}

	}*/

}
