
public class studentMain {
	public static void main(String[] args) {
		Student s1 = new Student("John", "Smith", 9, 1234);
		Student s2 = new Student("John", "Doe", 11, 7890);
		
		s1.addGrade("PS01", 30);
		s1.addGrade("PS02", 4);
		s1.addGrade("PS03", 90);
	}
}
