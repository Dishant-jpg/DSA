import java.util.*;
public class sub_array {
    public static void printArray(int number[]){
        int tp = 0;
        for(int i=0; i<number.length; i++){
            int start = i;
            for(int j=i; j<number.length; j++){
            int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(number[k] + ", ");
                    tp++;
            }
            System.out.println("");
            }
            System.out.println();
        }
        System.out.print(tp);
    }
    public static void main(String args[]){
        int number[] = {2,4,6,8,10,12};
        printArray(number);
    }
}
