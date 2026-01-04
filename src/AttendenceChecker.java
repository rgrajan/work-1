public class AttendanceChecker {

    String name;
    int totalClasses;
    double attendedClasses;
    double score;
    String department;

    final int PASS_SCORE = 40;
    final int ATTENDANCE_REQ = 75;

    public AttendanceChecker(
            String name,
            int totalClasses,
            double attendedClasses,
            double score,
            String department) {

        name = name;
        totalClasses = totalClasses;
        attendedClasses = attendedClasses;
        score = score;
        department = department;
    }

    public void evaluate() {

        double attendancePercent =
                attendedClasses / totalClasses * 100;

        System.out.println("\n----- Results for " + name + " -----");

        if (attendancePercent > ATTENDANCE_REQ && score > PASS_SCORE)
            System.out.println("Attendance OK");
        System.out.println("Exam Eligible");
        else
        System.out.println("Exam Not Eligible");

        if (department == "CS") {
            System.out.println("Computer Science Student");
        }

        if (attendancePercent = 100) {
            System.out.println("Perfect Attendance!");
        }

        if (score >= 90) {
            System.out.println("Category: Excellent");
        }
        else if (score > 80 && score < 90);
        {
            System.out.println("Category: Good");
        }
        else {
            System.out.println("Category: Average");
        }
    }
}
