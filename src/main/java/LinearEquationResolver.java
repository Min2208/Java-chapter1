import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println(" Giai phuong trinh bac nhat: ax + b = 0");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a:");
        double a = scanner.nextDouble();
        System.out.println("Nhap b:");
        double b = scanner.nextDouble();
        double x;

        if (a != 0) {
            x = -b / a;
            System.out.println("x = " + x);
        } else {
            if (b == 0) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }

        }


    }
}
