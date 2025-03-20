import java.util.Scanner;

public class Bronze_2443 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            // 빈칸 생성
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // 별 찍기
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        in.close();

    }

}
