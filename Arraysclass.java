import java.util.Arrays;

public class Arraysclass {
    public static void main(String[] args) {
       /* int[] arr1={1,2,34};
        int[] arr2={1,2,34};
        boolean isEqual= Arrays.equals(arr1,arr2);
        if(isEqual){
            System.out.println("Arrays are identical");
        }
        else{
            System.out.println("Arrays are not identical");
        }*/
        int[] arr = {4, 3, 2, 78, 2, 1, 67};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
