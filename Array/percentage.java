import java.util.*;
public class percentage {
    public static void main(String arsg[]) {
        int marks[] = new int[100];
    Scanner sc = new Scanner(System.in);

    marks[0] = sc.nextInt(); //hindi
    marks[1] = sc.nextInt(); //english
    marks[2] = sc.nextInt(); //maths

    int percentages = (marks[0] + marks[1] + marks[2] ) / 3;
    System.out.print("percentage =" + percentages + "%");
    }
}
