package DialogBoxAndScanner;

import javax.swing.JOptionPane;

public class UserMath {
    public static void main(String[] args) {
        // Prompt the user for the first number
        String firstNumberInput = JOptionPane.showInputDialog("Enter the first number:");
        double firstNumber = Double.parseDouble(firstNumberInput);

        // Prompt the user for the second number
        String secondNumberInput = JOptionPane.showInputDialog("Enter the second number:");
        double secondNumber = Double.parseDouble(secondNumberInput);

        // Perform mathematical operations
        double addition = firstNumber + secondNumber;
        double subtraction = firstNumber - secondNumber;
        double multiplication = firstNumber * secondNumber;
        double division = firstNumber / secondNumber;
        double squareRoot = Math.sqrt(firstNumber);
        double power = Math.pow(firstNumber, secondNumber);
        double logarithm = Math.log(firstNumber);

        // Display the results
        String resultMessage = "Results:\n" +
                "1. Addition: " + addition + "\n" +
                "2. Subtraction: " + subtraction + "\n" +
                "3. Multiplication: " + multiplication + "\n" +
                "4. Division: " + division + "\n" +
                "5. Square Root (of the first number): " + squareRoot + "\n" +
                "6. Power (first number raised to the second number): " + power + "\n" +
                "7. Logarithm (natural logarithm of the first number): " + logarithm;

        JOptionPane.showMessageDialog(null, resultMessage, "Mathematical Operations", JOptionPane.INFORMATION_MESSAGE);
    }
}