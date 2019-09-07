import java.util.Scanner;

public class VndUsd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input USD: ");
        int usd=scanner.nextInt();
        int rate=23000;
        int vnd=usd*rate;
        System.out.println("Output VND: "+ usd +" USD = "+ vnd+" VND");
    }
}
