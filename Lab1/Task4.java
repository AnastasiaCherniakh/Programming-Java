//block 4, task 5
import java.util.Scanner;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        int m = 5;
        int n = 4;
        int iEl = 0;
        int jEl = 0;
        int max = 0;
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = rd.nextInt(20)+ 1;
                if(arr[i][j]>max) {
                    max = arr[i][j];
                    iEl = i;
                    jEl = j;
                }
                System.out.print(arr[i][j] + "\t");
            }

            System.out.print("\n");
        }
        System.out.println("--------------------------");

        System.out.println("Enter k value: ");
        int k = scanner.nextInt();
        for (int i = 0; i < iEl; i+=2) {
            for (int j = 1; j < jEl; j+=2){
                arr[i][j]*=k;
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
