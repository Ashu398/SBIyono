import java.util.Scanner;

public class GCDofNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers");
        int n = sc.nextInt();
        int m= sc.nextInt();
        System.out.println(gcd(n,m));
    }
    static int gcd(int a, int b) 
    { 
        if (a == 0) 
            return b; 
        return gcd(b%a, a); 
    }
}
