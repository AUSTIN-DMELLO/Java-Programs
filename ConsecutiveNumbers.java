import java.util.Scanner;

public class ConsecutiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Input the second number: ");
        int secondNumber = sc.nextInt();
        System.out.print("Input the third number: ");
        int thirdNumber = sc.nextInt();
        boolean areConsecutive = false;
        if (firstNumber + 1 == secondNumber && secondNumber + 1 == thirdNumber) {
            areConsecutive = true;
        }
        if (areConsecutive) {
            System.out.println("True.");
        } else {
            System.out.println("False.");
        }
    }
} 
