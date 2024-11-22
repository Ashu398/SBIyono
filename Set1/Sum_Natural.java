import java.util.Scanner;

public class Sum_Natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("enter the natural number");
       int n = sc.nextInt(); 
       if(n<=0){
        System.out.println("Not the natural no.");
       }
       System.out.println(sumof(n));
    }
    public static int sumof(int n){
        int a=0;
        for(int i=n;i>0;i--){
            a +=i;
        }
        return a;
    }
}
