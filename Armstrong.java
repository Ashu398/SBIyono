import java.util.Scanner;
public class Armstrong {
    public static int count(int d){
        int a =0;
        while(d>0){
           d /= 10;
           a++;
        }
        return a;
    }
    public static int pow(int n,int p){
        int s=1;
        for (int i = 0; i < p; i++) {
            s *= n;
        }
       return s; 
    }
    public static boolean strong(int n){
        int sum =0;
        int p = count(n);
        int m=n;
        while(n>0){
            int a = n%10;
            sum += pow(a,p);
            n/=10;
        }
       return sum == m;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers");
        int n = sc.nextInt();
        System.out.println(strong(n));
}
}