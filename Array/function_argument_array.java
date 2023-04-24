public class function_argument_array {
    public static void update(int marks[], int nonchangable){
        nonchangable = 10;
        for(int i=0; i<marks.length; i++){
             marks[i] = marks[i] + 1;
        }
    }
    public static void main(String args[]){
        int marks[] = {97, 78, 69};
        int nonchangable = 5;
        update(marks, nonchangable);
        // we passing array the value is change in main function.
        System.out.print(nonchangable);

        // we passing in the nonchangable value the main function valyue is not change. 
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
            System.out.println();
        

    }
}
