import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the number");
       int n = sc.nextInt();

       System.out.println(strong(n));
    }
    public static boolean strong(int n){
        int sum =0;
        int m=n;
        while(n>0){
            int a = n%10;
            sum += fact(a);
            n/=10;
        }
       return sum == m;
    }
    public static int fact(int a){
        if(a == 1 || a==0)
        return 1;
        return  a*fact(a-1);
        
    }
}
