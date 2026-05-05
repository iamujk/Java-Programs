import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr={4,3,7,1,10};
      //  int[] originalArr=arr.clone();
        int key;
        Arrays.sort(arr);
        Scanner sc=new Scanner(System.in);
        key=sc.nextInt();
    /*    int i=0;
        boolean flag=false;
        int j=arr.length-1;
        while(i<=j){
            int m=(i+j)/2;
            if(arr[m]==key){
                flag=true;
                break;
            }
            else if(arr[m] >key){
                j=m-1;
            }
            else{
                i=m+1;
            }
        }
        if(!flag){
            System.out.println("Not found");
        }
        else{
            for(int k=0;k<arr.length;k++){
                if(originalArr[k]==key){
                    System.out.println("Found at" + k);
                }
            }
        }*/
        if(Arrays.binarySearch(arr,key)<0){
            System.out.println("Not found");
        }
        else {
            System.out.println("Found at " + Arrays.binarySearch(arr, key));
        }
    }
}
