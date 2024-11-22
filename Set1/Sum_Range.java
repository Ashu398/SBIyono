import java.util.Scanner;

public class Sum_Range {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
       System.out.println("enter the range");
       int n = sc.nextInt();
       int m = sc.nextInt();
       if(n>m){
        System.out.println("enter is wrong");
       }
       System.out.println(sumof(n,m));
    }
    public static int sumof(int n,int m){
        int a=0;
        for(int i=n;i<=m;i++){
            a +=i;
        }
        return a;
    }
}
