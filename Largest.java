import java.util.*;
public class Largest {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter number 1:");
        a=input.nextInt();
        System.out.println("Enter number 2:");
        b=input.nextInt();
        System.out.println("Enter number 3:");
        c=input.nextInt();
        System.out.println((a>b?(a>c?a:(c>b?c:(b>a?b:a))):(b>c?b:(c>a?c:a)))+" is the largest");

    }
}
