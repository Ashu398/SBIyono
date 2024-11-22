import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year");
        int year = sc.nextInt();
        System.out.println(isleap(year));
    }
    public static boolean isleap(int n ){
        if(n%4==0){
            if(n%400==0 && n%100 !=0)
            return true;
        }
        return false;
    }

}
