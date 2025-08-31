import java.util.*;
public class smallestInteger{
    public static void main(String[]args){
        //Method 1 
        int arr[]= {2,5,1,3,0};
        int arr1[]={8,10,5,7,9};
        Arrays.sort(arr);
        System.out.println(arr[0]);
        int min = Integer.MAX_VALUE;
        for(int i =0;i<arr1.length;i++){
            if(min>arr1[i]){
                min=arr1[i];
            }
        }
        System.out.println(min);
    }
}