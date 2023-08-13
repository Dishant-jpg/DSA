package practise;

import java.util.*;

public class linear {

    public static int linear_search(int number[], int Key){
            for(int i = 0; i<number.length; i++){
                if(number[i] == Key){
                    return i;
                }
            }
            return -1; 
    }
    public static void main(String[] args) {
        int number[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

        Scanner scan = new Scanner(System.in);
        int Key = scan.nextInt();

        int index  =linear_search(number, Key);
        if(index == -1){
            System.out.println("Not found");
        } else{
            System.out.println("Your Key is at :" + index);
        }


    }
}
