import java.util.Scanner;

public class Concatenate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        String shorterString = str1.length() < str2.length() ? str1 : str2;
        String longerString = str1.length() < str2.length() ? str2 : str1;

        String newString = shorterString + longerString + shorterString;

        System.out.print("The new string is: " + newString);
    }
}
