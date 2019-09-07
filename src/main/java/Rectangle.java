import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        int height = scanner.nextInt();
//        rectangle(width,height);
        triangle(width, height,"bot");
    }

    public static void rectangle(int width, int height) {
        for (int i = 0; i < width; i++) {
            System.out.println();
            for (int j = 0; j < height; j++) {
                System.out.print(" * ");
            }

        }


    }

    public static void triangle(int width, int height, String location) {
        if (location == "bot") {
            for (int i = 0; i < width; i++) {
                System.out.println();
                for (int j = 0; j <= i; j++) {
                    System.out.print(" * ");
                }
            }
        }
        if (location == "top") {
            for (int i = width; i >= 1; i--) {
                System.out.println("");
                for (int j = 1; j <= i; j++) {
                    System.out.print(" * ");
                }
            }
        }

    }

    public static void triangleIso(int width, int height) {
        for (int i = 1; i <= width; i++) {
            System.out.println();
            for (int j = 0; j < width - i; j++) {
                System.out.print("   ");
            }
            for (int k = 1; k < i * 2; k++) {
                System.out.print(" * ");
            }
        }
    }
}
