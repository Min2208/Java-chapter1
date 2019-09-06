import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter amount");
        double amount=scanner.nextDouble();
        System.out.println("Enter interest");
        double interestRate=scanner.nextDouble();
        System.out.println("Enter period");
        int period=scanner.nextInt();

        double totalAmount=amount+ amount*interestRate*period/100;
        System.out.println("Total Amount : " + totalAmount);

    }
}
