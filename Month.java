import java.util.*;
public class Month {
    public static void main(String[] agrs){
        Scanner input=new Scanner(System.in);
        int a;
        String array[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        System.out.println("Enter a number in month:");
        a=input.nextInt();
        System.out.println(a>12?"No month":array[a-1]);
    }
}
