import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        while (true) {
            System.out.println("Enter the first number. ");

            Scanner firstNum = new Scanner(System.in);
            double num1 = firstNum.nextByte();

            System.out.println("Enter the mathematical operation :");

            Scanner operation = new Scanner(System.in);
            String mathOperator = operation.next();

            if (mathOperator.equals("+")) {
                operations.add(num1);
            } else if (mathOperator.equals("-")) {
                operations.substract(num1);
            } else if (mathOperator.equals("/")) {
                operations.divide(num1);
            } else if (mathOperator.equals("*")) {
                operations.multiply(num1);
            } else if (mathOperator.equals("Close")) {
                System.out.println("Closed application");
                break;
            } else {
                System.out.println("You can chose from + - / * or Close");
            }
        }
    }
}
