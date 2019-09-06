import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your Weight");
        double weight=scanner.nextDouble();
        System.out.println("Enter your Height");
        double height=scanner.nextDouble();

        double bmi=weight/(height*height);

        if (bmi<18.5){
            System.out.println("Interpretation: Underweight");
        }else if (bmi<25.0){
            System.out.println("Interpretation: Nornal");
        }else if (bmi<30.0){
            System.out.println("Interpretation: Overweight");
        }else {
            System.out.println("Interpretation: Obese");
        }
    }
}
