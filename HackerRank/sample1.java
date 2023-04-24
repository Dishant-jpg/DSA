package HackerRank_Answer;

import java.util.Scanner;

public class sample1 {
    public static void main(String arsg[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(N + "x" + i + "=" + N*i);
        }
    }
}
