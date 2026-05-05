import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int n;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        /*
        for(int i=0;i<n;i++){
            sum+=a[i];
        }*/
        for(int i:a){
            sum+=i;
        }
        System.out.println(sum);
    }
}
