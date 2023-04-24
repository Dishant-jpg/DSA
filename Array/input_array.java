import java.util.*;
public class input_array {
    public static void main(String args[]){
    int marks[] = new int[100];
    Scanner sc = new Scanner(System.in);

    marks[0] = sc.nextInt(); //hindi
    marks[1] = sc.nextInt(); //english
    marks[2] = sc.nextInt(); //maths
    marks[3] = sc.nextInt(); //Computer
    marks[4] = sc.nextInt(); //Physics
    marks[5] = sc.nextInt(); //Chemistry

    System.out.println("hindi :" + marks[0]);
    System.out.println("english :" + marks[1]);
    System.out.println("maths :" + marks[2]);
    System.out.println("computer :" + marks[3]);
    System.out.println("physics :" + marks[4]);
    System.out.println("chemistry :" + marks[5]);


    // update the value in array.
    marks[2] = marks[2] + 1; 
    System.out.println("maths :" + marks[2]);

    }
}
