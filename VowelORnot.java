import java.util.*;;
public class VowelORnot {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the character");
       char ch = sc.next().charAt(0);
       if(ch == 'a'|| ch =='i'||ch == 'o'|| ch == 'u'|| ch =='e'){
        System.out.println("true");
       } 
       else
       System.out.println("false");
    }
}
