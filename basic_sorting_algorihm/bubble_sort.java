package basic_sorting_algorihm;
import java.util.*;
public class bubble_sort {
    public static void bubble(int arr[]){
        for(int i=0; i<arr.length; i++){
            int Swap =0;
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    Swap++;
 
                }
                }
            }
        }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print(" ");
    }
    public static void main(String args[]){
        int arr[] =  {7,5,4,8,10};
        bubble(arr);
        printArr(arr);
    }
    
}

