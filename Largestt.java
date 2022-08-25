import java.util.Scanner;

public class Largestt {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter number 1:");
        a=input.nextInt();
        System.out.println("Enter number 2:");
        b=input.nextInt();
        System.out.println("Enter number 3:");
        c=input.nextInt();
        if(a>b&&a>c) {
            System.out.println(a+" is the largest");
        }
        else if (b>a&&b>c) {
            System.out.println(b+" is the largest");
        }
        else {
            System.out.println(c+" is the largest");
        }
    }
}
