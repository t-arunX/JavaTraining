package java_basics.day4;

public class TestCollege_V2 {

	public static void main(String[] args) {
		// Student class test
		// College s1 = new College(12,"sandeep","python","java","html");
		College_V2 c1 = new College_V2(12, "sandeep");
		c1.payment(5500);
		c1.payment(500);
		// System.out.println(s1.getFeePaid());
		c1.printStudentDetails();
	}
}