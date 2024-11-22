import java.util.Scanner;
public class PowerofNumber {
    static int s=1;
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the number");
       int n = sc.nextInt();
       System.out.println("enter the power");
       int p = sc.nextInt();
       System.out.println("power of the number is :::"+pow(n,p));
}
public static int pow(int n,int p){
    if(p>0){
     s *= n;
     p--; 
     pow(n,p);
    }
   return s; 
}
}
