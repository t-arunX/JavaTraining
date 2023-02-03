package java_basics.day4;

public class College_V2 {
	public static String courses_provided[] = { "java", "python", "javascript", "c", "c++" };
	public static int course_cost[] = { 10_000, 7_500, 8_000, 3_000, 6_000 };
	private int admission_no;
	private int total_fee;
	private int fee_paid;
	private int total_courses;
	private String name;
	private String course_name[];

	public College_V2(int admission_no, String name) {
		this.admission_no = admission_no;
		this.name = name;
		course_name = new String[1];
		this.course_name[0] = courses_provided[0];
		this.total_fee = course_cost[0];
		this.total_courses = 1;
	}

	public College_V2(int admission_no, String name, String course) {
		this(admission_no, name);
		if (course == "python") {
			this.total_fee = course_cost[1];
			this.course_name[0] = course;
			this.total_courses = 1;
		}
	}

	public College_V2(int admission_no, String name, String... course) {
		this(admission_no, name);
		this.total_fee = 0;
		int length = course.length;
		this.total_courses = length;
		course_name = new String[length];
		for (int i = 0; i < length; i++) {
			this.course_name[i] = course[i];
			for (int j = 0; j < course_cost.length; j++) {
				if (course[i] == courses_provided[j]) {
					this.total_fee += course_cost[j];
				}
			}
		}
	}

	public int getTotalFee() {
		return this.total_fee;
	}

	public int getDue() {
		return this.total_fee - this.fee_paid;
	}

	public int getFeePaid() {
		return this.fee_paid;
	}

	public void payment(int fee_paid) {
		this.fee_paid += fee_paid;
	}

	public void printStudentDetails() {
		System.out.println("Name of student: " + name + "\nAdmission number: " + admission_no + "\nTotal Fee: " + total_fee + "\nFee paid: " + fee_paid);
		System.out.println("fee due: " + (this.total_fee - this.fee_paid));
		System.out.println("Total courses: "+total_courses);
		System.out.print("Running courses: ");
		for(String s:course_name) System.out.print("\""+s+"\" ");
	}

	public static void printAvailableCourses(){
		System.out.println("course provided - course cost");
		for(int i=0;i<course_cost.length;i++){
			System.out.println(courses_provided[i]+" - "+course_cost[i]);
		}
	}

}
