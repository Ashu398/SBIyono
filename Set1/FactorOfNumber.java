import java.util.*;
import java.util.Scanner;

public class FactorOfNumber {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the number");
       int n = sc.nextInt();
       List <Integer> l  = new ArrayList<>();
       for(int i=1;i<=n;i++){
        if(n%i==0)
        l.add(i);
       }
       System.out.println(l);
}
}
