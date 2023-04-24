public class prefix_max_sum {
    public static void printArray(int number[]){
        int currvalue =0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];
        for(int i=1; i<number.length; i++){
            prefix[i] = prefix[i-1] + number[i];
        }


        for(int i=0; i<number.length; i++){
            int start = i;
            for(int j=i; j<number.length; j++){
            int end = j;

                    currvalue = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

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
