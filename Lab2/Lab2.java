package Lab2;
import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float minNumber = Float.MAX_VALUE;
        System.out.println("Enter size of an array: ");
        int size = 0;
        while (true) {
            try {
                size = Integer.parseInt(scanner.next());
                break;
            } catch (NumberFormatException exception) {
                System.out.print("Error, try again! ");
                continue;
            }
        }
        float[][] matrix = new float[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Enter element of matrix:");
                while (true) {
                    try {
                        float matrixElement = Float.parseFloat(scanner.next());
                        matrix[i][j] = matrixElement;
                        break;
                    } catch (NumberFormatException exception) {
                        System.out.print("Error, try again! ");
                        continue;
                    }
                }

            }
        }
        for (int i = 0; i < size; i++) {
            if (matrix[i][i] < minNumber && matrix[i][i] < 0) {
                minNumber = matrix[i][i];
            }
        }
        if (minNumber == Float.MAX_VALUE) {
            System.out.println("No negative number in matrix");
        } else {
            System.out.println("Min negative number: " + minNumber);
        }
        scanner.close();
    }
}