import java.util.*;
public class linear_search {
    public static int linear_array(int number[], int Key ){
        for(int i=0; i<number.length; i++){
            if(number[i] == Key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int number[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your key :");
        int Key = sc.nextInt();
        int index = linear_array(number, Key);
        if(index == 1){
            System.out.print("Not Found");
        }else{
            System.out.println("Key is at index :" + index);
        }


    }
}
