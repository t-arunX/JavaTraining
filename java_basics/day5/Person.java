package java_basics.day5;

public class Person {
	protected String name;
	protected String email;
	protected int mobile;

	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public Person(String name, String email, int mobile) {
		this(name, email);
		this.mobile = mobile;
	}

	final public void setNumber(int mobile) {
		this.mobile = mobile;
	}

	final public void updateName(String name) {
		this.name = name;
	}

	public void print() {
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Mobile number: " + mobile);
	}
}

class Student extends Person {
	protected final int admission_no;
	protected String course;

	public Student(String name, String email, int mobile, int admission_no, String course) {
		super(name, email, mobile);
		this.admission_no = admission_no;
		this.course = course;
	}

	public String getCourse() {
		return this.course;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Admission number: " + admission_no);
		System.out.println("Course: " + course);
	}

}

class ForeignStudent extends Student {
	private String country;

	public ForeignStudent(String name, String email, int mobile, int admission_no, String course) {
		super(name, email, mobile, admission_no, course);
	}

	public ForeignStudent(String name, String email, int mobile, int admission_no, String course, String country) {
		super(name, email, mobile, admission_no, course);
		this.country = country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Country: " + country);
	}
}