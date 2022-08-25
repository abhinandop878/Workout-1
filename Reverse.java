import java.util.*;
public class Reverse {
    public static void main(String[] args){
        long n,s=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        n=input.nextLong();
        while (n!=0)
        {
            s=n%10+s*10;
            n=n/10;
        }
        System.out.println("Reverse:"+s);
    }
}
