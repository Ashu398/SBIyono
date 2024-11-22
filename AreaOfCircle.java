import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        final double pi = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius");
        int r = sc.nextInt();
        System.out.println("area of circle "+(r*r*pi));
    }
}
