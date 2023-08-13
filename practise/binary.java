package practise;

import java.util.*;

public class binary {

    /**
     * @param number
     * @param key
     * @return
     */
    public static int foodFactory(int numbers[], int key){
            int start = 0;
            int end = numbers.length-1;
            
            while(start <= end){
                int mid = (start + end) / 2;

                if(numbers[mid] == key){
                    return mid;
                }
                
                if(numbers[mid] < key){
                    start = mid+1;
                }
                else{
                    end = mid -1;
                }
            }
            return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,8,6,4,9,0,2,5,3,7,8,9,10};

        int Key = 8;

        System.out.println("Mid value is " + foodFactory(numbers, Key));
    }
}
