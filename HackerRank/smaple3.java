package hackerrank;
import java.util.*;
public class smaple3 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        String line;
        int i =1;
        
        while(input.hasNext()){
            line = input.nextLine();
            System.out.println(i + " " + line);
            i++;
        }
    
    }
}
