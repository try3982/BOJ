import java.util.Scanner;

// 별찍기 -4 :https://www.acmicpc.net/problem/2441
public class Bronze_2441 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for(int i=0; i<num; i++) {
            for(int j=num-i; j<num; j++) {

                System.out.print(" ");
            }
            for(int k=i; k<num; k++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
