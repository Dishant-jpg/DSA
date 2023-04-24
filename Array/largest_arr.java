import java.util.*;
public class largest_arr {
    public static int getlargest(int number[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<number.length; i++){
            if(largest < number[i]){
                largest = number[i];
            }
            if(smallest > number[i]){
                smallest = number[i];
                System.out.println("Smallest value is : " + smallest);
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int number[] = {1, 3, 4, 5, 6, 7, 8, 23, 43, 43, 23, 23, 45, 47};
        System.out.println("largest value is :" + getlargest(number));

    }
}
