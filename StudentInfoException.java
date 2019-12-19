package homework3a;

public class StudentInfoException extends Exception {
	public Student student;

	public StudentInfoException(String message, Student student) {
		super(message);
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "StudentInfoException [student=" + student + "]";
	}
	
	
	

}
