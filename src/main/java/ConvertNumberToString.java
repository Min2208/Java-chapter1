import java.util.Scanner;

public class ConvertNumberToString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();

        convert(number);
    }
    static void convert(int number){
        switch (number){
            case 1:
                System.out.println("One");
                break;
        }
    }
}


