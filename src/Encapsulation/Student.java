package Encapsulation;

public class Student {

	private String name;
	private int rollNumber;
	private String grade;

	public Student() {
		super();
	}

	public Student(String name, int rollNumber, String grade) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void display() {
		System.out.println("Name :"+name);
		System.out.println("Roll No :"+rollNumber);
		System.out.println("Grade :"+grade);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + "]";
	}
	
	

}
