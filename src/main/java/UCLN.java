import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=Math.abs(scanner.nextInt());
        System.out.println("Enter second number");
        int b=Math.abs(scanner.nextInt());

        if (a==0 && b==0){
            System.out.println("Number is not UCLN");
        }
        if (a==0 || b==0){
            if (a==0 && b!=0){
                System.out.println(b + " is UCLN ");
            }else if (b==0 && a!=0){
                System.out.println(a + " is UCLN ");
            }

        }else {
            while (a!=b){
               if (a>b){
                   a=a-b;
               }else {
                   b=b-a;
               }
            }
            System.out.println(a + " is UCLN");
        }
    }
}
