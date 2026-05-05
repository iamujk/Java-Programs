import java.util.Arrays;

public class zerosToTheend {
    public static void main(String[] args) {
        int arr[]={3,0,0,9,0,2,0,1};
       // int i=0;
       // int j=arr.length-1;
        /*while(i<j){
            if(arr[i]==0 && arr[j]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            else if(arr[i]!=0 && arr[j]==0){
                i++;
                j--;
            }
            else if(arr[i]==0 && arr[j]==0){
                j--;
            }
            else if(arr[j]!=0 && arr[j]!=0){
                i++;
            }
        }*/
        Integer k=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i] !=0){
//                arr[k]=arr[i];
//                k++;
//            }
//        }
//        while(k<arr.length){
//            arr[k]=0;
//            k++;
//        }
        System.out.println(k instanceof Integer);
        System.out.println(Arrays.toString(arr));
    }
}
