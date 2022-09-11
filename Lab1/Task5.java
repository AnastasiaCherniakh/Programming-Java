// block 5, task 5
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sentence");
        String sentence = scanner.nextLine();
        String replaceString=sentence.replace("and","also");
        System.out.println(replaceString);
        scanner.close();
    }
}
