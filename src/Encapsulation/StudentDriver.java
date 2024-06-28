package Encapsulation;

public class StudentDriver {
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Aditi",101,"A");
		s1.display();
		System.out.println(s1.getName());
		System.out.println(s1.getRollNumber());
		System.out.println(s1.getGrade());
		
		Student s2 = new Student("Ruhhi",102,"A+");
		System.out.println(s2.getName());
		System.out.println(s2.getRollNumber());
		System.out.println(s2.getGrade());
	}

}
