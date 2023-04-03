package springcore;

public class Student {
	private String studentID;
	private String studentName;
	private String studentAddress;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}
	public Student(String studentID, String studentName, String studentAddress) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		System.out.println("Setting student ID");
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("Setting student name");
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		System.out.println("Setting student address");
		this.studentAddress = studentAddress;
	}
	
}
