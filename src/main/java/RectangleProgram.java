import java.util.Scanner;

public class RectangleProgram {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap chieu rong");
        width=scanner.nextFloat();
        System.out.println("nhap chieu cao");
        height=scanner.nextFloat();
        float area= width*height;
        System.out.println("S hinh chu nhat la: " + area);
    }
}
