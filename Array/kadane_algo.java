public class kadane_algo {
    public static void kadane(int number[]){
        int curr = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i=0; i<number.length; i++){
            curr = curr + number[i];
            if(curr < 0){
                curr = 0;
            }
            maxsum = Math.max(curr, maxsum);

        }
        System.out.println(maxsum);
    }
    public static void main(String args[]){
        int number[] = {-2, -2, -4, -1, -2, -1, -5, -3};
        kadane(number);

    }
}
