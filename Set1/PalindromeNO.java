import java.util.Scanner;

public class PalindromeNO {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers");
        int n = sc.nextInt();
        System.out.println(reverse(n));
}
public static boolean reverse(int n) {
    int rev =0;
    int m=n;
    while(n>0){
        int a =n%10;
        rev = rev *10 + a;
        n/=10;
    }
    return rev==m;
}
}
