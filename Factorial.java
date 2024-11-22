import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the number");
       int a = sc.nextInt();
       Long f = fact(a);
       System.out.println(f);
    }
    public static Long fact(int a){
        if(a == 1)
        return 1l;
        return  a*fact(a-1);
        
    }
}
