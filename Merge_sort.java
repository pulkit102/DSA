import java.util.Arrays;

public class Merge_sort {
    public static void main(String[] args) {
       int[] arr={45,23,5,56,7,4,43,6,7,46363,6,2,56,3,7};
        System.out.println(Arrays.toString(mergeSort(arr)) );
    }

    static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    static int[] merge(int[] frst,int[] second){
        int[] mix=new int[frst.length+second.length];
        int i=0,j=0,k=0;
        while(i<frst.length && j<second.length){
            if(frst[i]<second[j]){
                mix[k]=frst[i];
                i++;
            }
            else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        while(i<frst.length){
            mix[k]=frst[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
}
