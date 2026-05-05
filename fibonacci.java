import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
     /*   int a=0;
        int b=1;
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(a+"\n"+b);
        while(n>0){
            int sum=a+b;
            System.out.println(sum);
            a=b;
            b=sum;
            n--;

        }*/
        int a=0,b=1;
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(a+"\n"+b);
        while(n>0){
            int sum=a+b;
            System.out.println(sum);
            n--;
            a=b;
            b=sum;
        }
    }
}