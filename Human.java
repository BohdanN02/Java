package homework3a;

public class Human {
	private int age;
	private String sex;
	private String name;
	private String surname;
	
	public Human(int age, String sex, String name, String surname) {
		super();
		this.age = age;
		this.sex = sex;
		this.name = name;
		this.surname = surname;
	}

	public Human() {
		super();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "Human [age=" + age + ", sex=" + sex + ", name=" + name + ", surname=" + surname + "]";
	}
	
}