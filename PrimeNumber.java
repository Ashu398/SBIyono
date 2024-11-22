import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers");
        int n = sc.nextInt();
        System.out.println(isPrime(n));
}
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
}
