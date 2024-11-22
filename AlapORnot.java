import java.util.Scanner;

public class AlapORnot {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the character");
       char ch = sc.next().charAt(0);
       if((ch >= 65 && ch < 91) || (ch >= 97 && ch <=122)){
        System.out.println("true");
       }
       else
       System.out.println("false");
    }
}
