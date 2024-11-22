import java.util.Scanner;

public class NoOFdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the digit");
        int d = sc.nextInt();
        int c = count(d);
        System.out.println(c);
    }
    public static int count(int d){
        int a =0;
        while(d>0){
           d /= 10;
           a++;
        }
        return a;
    }
}
