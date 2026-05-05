import java.util.Arrays;
import java.util.Collections;

public class bubblesort {
    //O(N^2)
    public static void main(String[] args) {
        int[] arr={34,2,1,56,34};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        String str="200";
        int num=Integer.parseInt(str);
        System.out.println(num);


        }

}
