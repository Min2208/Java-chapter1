import java.util.Scanner;

public class ConvertNumberToString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
         int number=scanner.nextInt();
        if (number<10){
            System.out.println(convert(number));
        }else if (number<20){
            System.out.println(convert2(number));
        }else if (number<100){
            System.out.println(convert3(number));
        }else if (number<1000){
            System.out.println(convert4(number));
        }

    }
    public static String convert(int number){
        String name=null;
        switch (number){
            case 0:
                name="";
                break;
            case 1:
                name="one";
                break;
            case 2:
                name="two";
                break;
            case 3:
                name="three";
                break;
            case 4:
                name="four";
                break;
            case 5:
                name="fine";
                break;
            case 6:
                name="six";
                break;
            case 7:
                name="seven";
                break;
            case 8:
                name="eight";
                break;
            case 9:
                name="nine";
                break;
        }
        return name;
    }
    public static String convert2(int number){
        String name=null;
        switch (number){
            case 10:
                name="ten";
                break;
            case 11:
                name="eleven";
                break;
            case 12:
                name="twelve";
                break;
            case 13:
                name="thirteen";
                break;
            case 14:
                name="fourteen";
                break;
            case 15:
                name="fifteen";
                break;
            case 16:
                name="sixteen";
                break;
            case 17:
                name="seventeen";
                break;
            case 18:
                name="eighteen";
                break;
            case 19:
                name="nineteen";
                break;
        }
        return name;
    }
    public static String convert3(int number){
        int a=number%10;
        int b= (int) Math.floor(number/10);
        String name=null;
        switch (b){
            case 2:
                name="twenty " + convert(a);
                break;
            case 3:
                name="thirty " + convert(a);
                break;
            case 4:
                name="forty " + convert(a);
                break;
            case 5:
                name="fifty " + convert(a);
                break;
            case 6:
                name="sixty " + convert(a);
                break;
            case 7:
                name="seventy " + convert(a);
                break;
            case 8:
                name="eighty " + convert(a);
                break;
            case 9:
                name="ninety " + convert(a);
                break;
        }
        return name;
    }
    public static String convert4(int number){
        String name=null;
        int a=number%100;
        int b= (int) Math.floor(number/100);

        if (a<10){
            name=convert(b)+" hundred and "+convert(a);
        }else if (a<20){
            name=convert(b)+ " hundred "+ convert2(a);

        }else {
            name=convert(b)+ " hundred "+convert3(a);
        }
        return name;
    }

}



