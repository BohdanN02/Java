package homework3a;

public class Student extends Human {
	private int group;
	private String specialty;
	public Student(int age, String sex, String name, String surname, int group, String specialty) {
		super(age, sex, name, surname);
		this.group = group;
		this.specialty = specialty;
	}
	public Student() {
		super();
	}
	public int getGroup() {
		return group;
	}
	public void setGroup(int group) {
		this.group = group;
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	@Override
	public String toString() {
		return "Student [group=" + group + ", specialty=" + specialty + "]";
	}
	
	
	
	
	
	

	
}
