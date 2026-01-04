import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter total classes: ");
        int total = sc.nextInt();

        System.out.print("Enter classes attended: ");
        double attended = sc.nextDouble();

        System.out.print("Enter test score: ");
        double score = sc.nextDouble();

        System.out.print("Enter department: ");
        String dept = sc.nextLine();

        AttendanceChecker checker =
                new AttendanceChecker(
                        name,
                        total,
                        attended,
                        score,
                        dept
                );

        checker.evaluate();

        sc.close();
    }
}
