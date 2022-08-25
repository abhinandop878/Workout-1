import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,c,sum=0,f,i;
        System.out.println("Enter first range:");
        a=input.nextInt();
        System.out.println("Enter second range:");
        b=input.nextInt();
        System.out.println("Amstrong number between "+a+" and "+b);
        for(i=a+1;i<b;i++)
        {
            f=i;
            while (f!=0){
                c=f%10;
                sum=sum+c*c*c;
                f=f/10;
            }
            if(i==sum)
            {
                System.out.println(i+"\n");
            }
            sum=0;
        }
    }
}
