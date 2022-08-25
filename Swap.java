import java.util.*;
public class Swap {
    public static void main(String[] agrs){
        int a,b,c;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter value for A:");
        c=(a=input.nextInt());
        System.out.println("Enter value for B:");
        b=input.nextInt();
        System.out.println("A="+a+"\nB="+b+"\nSwapping A and B");
        System.out.println("A="+(a=b)+"\nB="+(b=c));
    }
}
