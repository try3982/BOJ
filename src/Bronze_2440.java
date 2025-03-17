import java.util.Scanner;

//별찍기 -3 : https://www.acmicpc.net/problem/2440
public class Bronze_2440 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for(int i=0; i<num; i++) {

            for(int j=i+1; j<=num; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
