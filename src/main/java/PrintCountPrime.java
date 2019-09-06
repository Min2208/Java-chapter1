import java.util.Scanner;

public class PrintCountPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total number prime");
        int total = scanner.nextInt();
        int count = 0;
        int n = 2;

        while (count < total) {

            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(n)) {
                if (n % i == 0) {
                    check = false;

                }
                i++;
            }
            if (check) {
                System.out.print(n + " ");
                count++;
            }
            n++;
        }

    }
}
