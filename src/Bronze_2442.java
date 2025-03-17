import java.util.Scanner;

// 별찍기 5 : https://www.acmicpc.net/problem/2442
public class Bronze_2442 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int star = scanner.nextInt();

        for(int i = 1; i <= star; i++) {
            for(int j = i; j < star; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < i*2-1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        scanner.close();
    }
}
