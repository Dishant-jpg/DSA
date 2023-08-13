package practise;

public class largest {
    public static int getLargest(int number[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<number.length; i++){
            if(largest < number[i]){
                largest = number[i];
            }
            if(smallest > number[i]){
                smallest = number[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int number[] = {1,2,8,6,4,9,0,2,5,3,7,8,9,10};

        System.out.println("Largest value is : " + getLargest(number));
        System.out.println("Smallest value is : " + getLargest(number));
    }
}
