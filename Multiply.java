import java.util.Scanner;
public class Multiply {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        int mult = num1*num2;
        System.out.println("Output: "+mult);
    }
}
