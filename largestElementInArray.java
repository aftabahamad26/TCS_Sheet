import java.util.*;
public class largestElementInArray {

    public static void main(String[] args) {
        int arr[] = {2,5,1,3,0};
        int arr1[]={8,10,5,7,9};
        int max = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
        Arrays.sort(arr1);
        System.out.println(arr1[arr.length-1]);
    }
}