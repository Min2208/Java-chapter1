import java.util.Scanner;


public class PrintPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number length prime");
        int number = scanner.nextInt();
        for (int i = 2; i < number; i++) {
            int j = 2;
            boolean check = true;
            while (j <= Math.sqrt(i)) {
                if (i % j == 0) {
                    check = false;
                }
                j++;
            }
            if (check) {
                System.out.print(i + " ");
            }

        }
    }
}
