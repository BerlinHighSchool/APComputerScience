import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

public class objectTest {
	public static void main(String[] args) {
		String name1 = new String("Paul");
		String name2 = new String("Paul");
		System.out.println(name1.equals(name2));
		name1 = name2;
		System.out.println(name1 == name2);	
	}
	
	public static void updateTimer() {
		long StartA = System.currentTimeMillis();
		Timer timer = new Timer();	
	}
}