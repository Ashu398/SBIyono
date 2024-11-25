package Set2;

import java.util.Scanner;

public class SericeOfPrime {
    public static boolean isPrime(int n) {
   
        if (n <= 1) {
            return false;
        }
    
        // Check divisors from 2 to √n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; 
            }
        }
    
        return true; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Range");
        int n = sc.nextInt();
        for(int i=2;i<=n;i++){
          if(isPrime(i))
          System.out.println(i);
        }
    }
}
