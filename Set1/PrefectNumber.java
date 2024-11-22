import java.util.Scanner;

public class PrefectNumber {
    static long sum=0;
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the number");
       int n = sc.nextInt();
       if(n<=1){
        System.out.println("false");
       }
       System.out.println(n==perfect(n,1));
    }
    public static long perfect(int n,int i){
        if(i<= n/2){
            if(n % i ==0){
                sum += i;
            }
        i++;
        perfect(n, i);
    }
    return sum;
}
}
