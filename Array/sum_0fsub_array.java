public class sum_0fsub_array {
    public static void printArray(int number[]){
        int currvalue =0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++){
            int start = i;
            for(int j=i; j<number.length; j++){
            int end = j;
            currvalue = 0;
                for(int k=start; k<=end; k++){
                    currvalue += number[k];
            }

            System.out.println(currvalue);
            if(maxsum < currvalue){
                maxsum = currvalue;
            }
            }
        }
        System.out.println(maxsum);
    }
    public static void main(String args[]){
        int number[] = {2,4,6,8,10,12};
        printArray(number);
    }
}