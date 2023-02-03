package java_basics.day5;

public class TestPerson {

	public static void main(String[] args) {
		// upcasting(Widening)
		// Student s1 = new Student("sai","sai@gmail",9892839,122,"ECE");
		// Person p1 = s1;//optional
		// p1.print(); //Now Person class class can access inherited but student class
		// defined methods(common methods).
		// p1.getCourse(); //(Not possible) Now Person object reference cannot point to
		// subclass methods.

		// Downcasting(Narrowing)
		// Person p = new Student("sandeep","sandeep@gmail.com",12314324,889,"CSE");
		// Student s1 = (Student)p;
		// s1.print();
		// System.out.println(s1.getCourse());

		// stuent object
		// Student s1 = new Student("sandeep", "sandeep@gmail.com", 92314324, 889,
		// "CSE");
		// s1.print();

		ForeignStudent fs1 = new ForeignStudent("max", "max@mail", 41432645, 445, "CSE");
		fs1.setCountry("USA");
		fs1.print();
	}

}
