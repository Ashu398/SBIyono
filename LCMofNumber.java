import java.util.*;
public class LCMofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers");
        int n = sc.nextInt();
        int m= sc.nextInt();
        System.out.println(lcm(n,m));
        
    }
    private static int lcm(int n,int m){
        int ans = (n<m)?n:m;
        while(true){
            if(ans %n == 0 && ans % m==0)
            break;
            ans++;
        }
        return ans;
    }
}
