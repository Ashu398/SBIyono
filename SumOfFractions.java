public class SumOfFractions {
//     static int gcd(int a, int b) 
// { 
//     if (a == 0) 
//         return b; 
//     return gcd(b%a, a); 
// } 
 // LCM * GCD = a * b 
private static int lcm(int n,int m){
    int ans = (n<m)?n:m;
    while(true){
        if(ans %n == 0 && ans % m==0)
        break;
        ans++;
    }
    return ans;
}
    static void addFraction(int num1, int den1,int num2, int den2) 
{   int cf =0;
    int den3 = lcm(den1,den2);
    int num3 = (num1)*(den3/den1) + (num2)*(den3/den2); 
    cf = num3*den3/(lcm(num3,den3));
    System.out.println((num3/cf)+"/"+(den3/cf));
}
public static void main(String[] args) 
{ 
    int num1=1, den1=500, num2=2, den2=1500; 
    System.out.print(num1+"/"+den1+" + "+num2+"/"+den2+" is equal to ");
    addFraction(num1, den1, num2, den2);
} 
}


