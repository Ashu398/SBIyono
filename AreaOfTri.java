import java.util.Scanner;

public class AreaOfTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the base and heigth");
        int base = sc.nextInt();
        int heigth = sc.nextInt();
        System.out.println("Area of triangle is"+(base*heigth)/2);
    }
}
