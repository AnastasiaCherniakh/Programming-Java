import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Enter size of an array: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter value of x: ");
        double x = scanner.nextDouble();
        for (int i = 0; i < size; i++) {
            arr[i] = rd.nextInt(10) + 1;
        }
        System.out.println(Arrays.toString(arr));
        if(size > 1) {
            double diff = (arr[0] + arr[1]) / 2 - x;
            double chl1 = arr[0];
            double chl2 = arr[1];
            double temp;
            for(int i=0; i<size; i++) {
                for (int j = i + 1; j < size; j++) {
                    temp = (arr[i] + arr[j]) / 2 - x;
                    if (Math.abs(temp) < Math.abs(diff)) {
                        diff = temp;
                        chl1 = arr[i];
                        chl2 = arr[j];
                    }
                }
            }
            System.out.println(chl1 + " " + chl2);
        }
        scanner.close();
    }
}
