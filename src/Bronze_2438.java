import java.util.Scanner;

//별찍기-1 : https://www.acmicpc.net/problem/2438
public class Bronze_2438 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=1;j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}