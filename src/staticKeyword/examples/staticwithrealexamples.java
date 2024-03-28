package staticKeyword.examples;

public class staticwithrealexamples {

	static String collegeName = "RV";
	private String studentName;
	private int rollno;
	private String deprt;

	public String getStudentName() {
		return studentName;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getDeprt() {
		return deprt;
	}

	public void setDeprt(String deprt) {
		this.deprt = deprt;
	}

	@Override
	public String toString() {
		return "staticwithrealexamples [collegeName=" + collegeName + ", studentName=" + studentName + ", rollno="
				+ rollno + ", deprt=" + deprt + "]";
	}

	void getStudentDetails() {
		System.out.println("I'm from " + collegeName + "college");
	}

	static void getStudentDeprt() {
		System.out.println("I'm from  CS department ");
	}
}
