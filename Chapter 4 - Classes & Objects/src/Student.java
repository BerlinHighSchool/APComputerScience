public class Student implements Comparable{
	String fName, lName;
	int gLevel, sID;
	static int studentCount = 0;
	int[] grades = new int[5];
	String[] assignments = new String[5];
	
	public Student(String firstName, String lastName, int gradeLevel, int studentID) {
		fName = firstName;
		lName = lastName;
		gLevel = gradeLevel;
		sID = studentID;
		studentCount++;
	}
	
	public void changeFirstName(String newName) {
		fName = newName;
	}
	
	public void changeLastName(String newName) {
		lName = newName;
	}
	
	public void changeGrade(int gLevel) {
		//this
		this.gLevel = gLevel;
	}

	public int compareTo(Object o) {
		return 0;
	}
	
	public void addGrade(String aName, int aGrade) {
		for(int i = 0; i < assignments.length; i++){
			if(assignments[i] == null) {
				grades[i] = aGrade;
				assignments[i] = aName;
				break;
			}
		}
	}
	
	public String checkGrades() {
		String grades = "";
		for(int i = 0; i < assignments.length; i++)
			grades+= assignments[i] + ": " + this.grades[i] + "\n";
		
		return grades;
	}
}














