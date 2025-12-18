import CIE.*;
import SEE.*;
import java.util.Scanner;

public class FinalMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("USN: ");
            String usn = sc.next();

            System.out.print("Name: ");
            sc.nextLine();               // clear buffer
            String name = sc.nextLine(); // read full name


            System.out.print("Semester: ");
            int sem = sc.nextInt();

            int[] internal = new int[5];
            int[] see = new int[5];

            System.out.println("Enter Internal marks (5 subjects):");
            for (int j = 0; j < 5; j++)
                internal[j] = sc.nextInt();

            System.out.println("Enter SEE marks (5 subjects):");
            for (int j = 0; j < 5; j++)
                see[j] = sc.nextInt();

            Internals in = new Internals(internal);
            External ex = new External(usn, name, sem, see);

            System.out.println("\nFinal Marks:");
            for (int j = 0; j < 5; j++) {
                int finalMarks = in.marks[j] + ex.seeMarks[j];
                System.out.println("Course " + (j + 1) + ": " + finalMarks);
            }
        }

        sc.close();
    }
}
