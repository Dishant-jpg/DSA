import java.util.*;
public class reverse_array {
    public static void reverse(int number[]){
        int first =0, last = number.length-1;

        while(first<last){
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;
            first++;
            last--;
        }
    }
    public static void main(String args[]){
        int number[] = {1, 2, 4, 6, 8, 10, 12};
        reverse(number);
        for(int i=0; i<number.length; i++){
            System.out.println(" " + number[i]);
        }
        System.out.println();
    }
}
