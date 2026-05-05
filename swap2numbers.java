import java.util.Scanner;

public class swap2numbers {
    public static void main(String args[]){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        a=sc.nextInt();
        System.out.println("Enter second number: ");
        b=sc.nextInt();
        //suppose a=10, b=20
        a=a+b; // a=30
        b=a-b; // b=10
        a=a-b; //a=20
        System.out.print("First number: "+a+" Second number:"+b); // a=20,b=10 [Swapped without using 3rd variable]
    }
}
