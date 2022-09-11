// block 3, task 5
import java.util.Scanner;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Enter size of matrix: ");
        int size = scanner.nextInt();
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = rd.nextInt(20);
                System.out.print(arr[i][j] + "\t");
            }

            System.out.print("\n");
        }
        System.out.println("Enter the number of the row: ");
        int k = scanner.nextInt();
        int n = k - 1;
        int elem = arr[k- 1][k - 1];
        for (int i = 0; i < size; i++) {
            arr[i][n] = arr[i][n] - elem;
        }
        System.out.println("Matrix after calculations:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + "\t");
            }

            System.out.print("\n");
        }
        scanner.close();
    }
}
