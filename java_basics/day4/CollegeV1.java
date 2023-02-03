package java_basics.day4;

public class CollegeV1 {
    public static int java_fee = 10_000;
    public static int python_fee = 7_400;
    private int admission_no;
    private int course_id;
    private int total_fee;
    private int fee_paid;
    private String name;
    private String course_name;

    public CollegeV1(int admission_no, String name) {
        this.admission_no = admission_no;
        this.name = name;
        course_id = 1;
        course_name = "java";
        this.total_fee = 10_000;
    }

    public CollegeV1(int admission_no, String name, int course_id) {
        this(admission_no, name);
        if (course_id == 2) {
            total_fee = 7_500;
            course_name = "Python";
            this.course_id = course_id;
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
        System.out
                .println("Name of student: " + name + "\nAdmission number: " + admission_no + "\nCourseId: " + course_id
                        + "\nCourse name: " + course_name + "\nTotal Fee: " + total_fee + "\nFee paid: " + fee_paid);
        System.out.println(this.total_fee - this.fee_paid);
    }

}
