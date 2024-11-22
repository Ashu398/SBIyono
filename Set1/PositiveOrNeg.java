import java.util.Scanner;

public class PositiveOrNeg {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       System.out.println("enter the number");
       int n = sc.nextInt();
       if(n == Math.abs(n))
       System.out.println("true");
       else
       System.out.println("false");
    }
}
