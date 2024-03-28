package mapExamples;

public class Student {
	String StudentName;
	String grade;
	int rollNo;
	int age;

	Student(String StudentName, String grade, int rollNo, int age) {
		this.age = age;
		this.grade = grade;
		this.rollNo = rollNo;
		this.StudentName = StudentName;

	}

	@Override
	public String toString() {
		return "Student [StudentName=" + StudentName + ", grade=" + grade + ", rollNo=" + rollNo + ", age=" + age + "]";
	}
	

}
