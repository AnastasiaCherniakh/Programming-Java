import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sentence");
        String sentence = scanner.nextLine();
        String replaceString = sentence.replaceAll("(?i)\\bflat\\b", "apartment");
        System.out.println(replaceString);
        scanner.close();
    }
}
