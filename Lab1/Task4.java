//block 4, task 5
import java.util.Scanner;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        int m = 5;
        int n = 4;
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = rd.nextInt(20)+ 1;
                System.out.print(arr[i][j] + "\t");
            }

            System.out.print("\n");
        }
        System.out.println("--------------------------");

        System.out.println("Enter k value: ");
        int k = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++){
                if(i % 2 ==0 && j % 2 != 0) {
                    arr[i][j]*=k;
                }
            }
        }
        System.out.println("--------------------------");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }

            System.out.print("\n");
        }
        scanner.close();
    }
}
