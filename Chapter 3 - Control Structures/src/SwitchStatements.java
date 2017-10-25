import java.util.*;
public class SwitchStatements {
	public static void main(String[] args)
	{
		Random gen = new Random();
		int month = gen.nextInt(12)+1;
		String m="";
		switch(month)
		{
		case 1: 
			m = "January";
			// You can have multiple lines blah.....
			break;
		case 2:
			m = "February";
			break;
		case 3:
			m = "March";
			break;
		case 4:
			m = "April";
			break;
		case 5: 
			m = "May";
			// You can have multiple lines blah.....
			break;
		case 6:
			m = "June";
			break;
		case 7:
			m = "July";
			break;
		case 8:
			m = "August";
			break;
		case 9: 
			m = "September";
			// You can have multiple lines blah.....
			break;
		case 10:
			m = "October";
			break;
		case 11:
			m = "November";
			break;
		case 12:
			m = "December";
			break;
		/*default:
			// This runs if none of the cases are true;
			m = "Month doesn't exist yet.";
			break;*/
		}
		System.out.println(m);
		
		if(m.equals("firetruck"))
			System.out.print("Elmo drives a firetruck.");
	}
}
