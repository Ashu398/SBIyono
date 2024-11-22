import java.util.Scanner;

public class Fibonacci {
     static int a =0;
     static int b = 1;
    static int c =0;
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the number");
       int n = sc.nextInt();
       System.out.println(a+"/n"+b);

       fibo(n-2);

    }
    public static void fibo (int n) {
        if(n>0){
            c = a+b;
            a = b;
            b = c;
            System.out.println(" "+c);
            fibo(n-1);
        }
    }
}
