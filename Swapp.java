import java.util.*;
public class Swapp {
    public static void main(String[] agrs) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value for A:");
        a = input.nextInt();
        System.out.println("Enter value for B:");
        b = input.nextInt();
        System.out.println("A=" + a + "\nB=" + b + "\nSwapping A and B");
        b=a+b;
        System.out.println("A=" + (a=b-a) + "\nB=" + (b=b-a));
    }
    }