public class twopointerarray {

    public static void main(String[] args) {
int[] a={0,1,1,1,0,0,1,0,1,0};
int i=0;
int j=a.length-1;
while(j>i){
    if(a[i]==0 && a[j]==0){
        i++;
    }
    else if(a[i]==1 && a[j]==0){
        a[i]=0;
        a[j]=1;
        i++;
        j--;
    }
    else if(a[i]==0 && a[j]==1){
        j--;
        i++;
    }
    else if(a[i]==1 && a[j]==1){
        j--;
    }
}
        for(int x : a){
            System.out.print(x + " ");
        }
    }
}