import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перший відрізок [a;b]: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println("Введіть другий відрізок [m;n]: ");
        double m = scanner.nextDouble();
        double n = scanner.nextDouble();
        double p = (n - m) / (b - a);
        System.out.println("P("+ m +" <=X<= " + n + ") = " + p);
        scanner.close();
    }
}
