package homework3a;

public class Main {

	public static void main(String[] args) {
		Group group1 = new Group();
		Student stud1 = new Student(17, "boy", "Anton", "P", 13, "Kn");
		Student stud2 = new Student(19, "boy", "Vasa", "G", 12, "Kn");
		Student stud3 = new Student(16, "boy", "Gena", "F", 14, "Kn");
		Student stud4 = new Student(18, "boy", "Vitya", "J", 16, "Kn");
		Student stud5 = new Student(18, "boy", "Sasha", "K", 15, "Kn");
		Student stud6 = new Student(19, "boy", "Vlad", "D", 17, "Kn");
		Student stud7 = new Student(18, "boy", "Gleb", "A", 18, "Kn");
		Student stud8 = new Student(17, "boy", "Max", "S", 19, "Kn");
		Student stud9 = new Student(16, "boy", "Max", "T", 20, "Kn");
		Student stud10 = new Student(17, "boy", "Aleksey", "P", 21, "Kn");
		
		 Student stud11 = new Student(17, "boy", "David", "S", 22, "Kn");
	        Student stud12 = new Student(17, "boy", "Petro", "P", 23, "Kn");
	        Student stud13 = new Student(17, "boy", "Alex", "H", 24, "Kn");
	
	try {
		group1.addStudent(stud1);
		group1.addStudent(stud2);
		group1.addStudent(stud3);
		group1.addStudent(stud4);
		group1.addStudent(stud5);
		group1.addStudent(stud6);
		group1.addStudent(stud7);
		group1.addStudent(stud8);
		group1.addStudent(stud9);
		group1.addStudent(stud10);
		System.out.println(group1);
	
		group1.deleteStudent(stud2);
		System.out.println(group1);
		
		group1.deleteStudent(stud12);
		System.out.println(group1);
		
		group1.deleteStudent(stud3);
        System.out.println(group1);

      
        System.out.println("Search student: " + group1.searchStudent(stud6));

        /* search student12 which is not from this group */
        System.out.println("Search student: " + group1.searchStudent(stud12));

        /* add student11 */
        group1.addStudent(stud11);
        System.out.println(group1);

        /* add student12 */
        group1.addStudent(stud12);
        System.out.println(group1);

        /* add more students then size of group */
        group1.addStudent(stud13);
        System.out.println(group1);

    } catch (SizeException e) {
        System.out.println(e.getMessage() + e.getSize());
    } catch (StudentInfoException e) {
        System.out.println(e.getMessage() + e.getStudent());
    }

    /* view student after attempt to add student, when group size = 10 */
    System.out.println("MistakeList: " + group1.viewMistakeList());
}
}
