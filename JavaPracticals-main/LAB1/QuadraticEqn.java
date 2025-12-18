import java.util.Scanner;

public class QuadraticEqn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read coefficients
        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        // Calculate discriminant
        double discriminant = b * b - 4 * a * c;

        // Check conditions
        if (discriminant < 0) {
            System.out.println("There are no real solutions.");
        } 
        else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("There is one real solution:");
            System.out.println("x = " + root);
        } 
        else {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("There are two real solutions:");
            System.out.println("x1 = " + root1);
            System.out.println("x2 = " + root2);
        }

        sc.close();
    }
}
