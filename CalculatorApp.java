import java.util.Scanner;
import java.util.ArrayList;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();
        int choice;
        
        do {
            // Display menu
            System.out.println("\n=================================");
            System.out.println("     CALCULATOR WITH HISTORY");
            System.out.println("=================================");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Show History");
            System.out.println("6. Clear History");
            System.out.println("7. Exit");
            System.out.println("=================================");
            System.out.print("Enter your choice (1-7): ");
            
            choice = scanner.nextInt();
            
            double num1, num2, result;
            
            switch(choice) {
                case 1:
                    // ADDITION
                    System.out.println("\n--- ADDITION ---");
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    
                    result = num1 + num2;
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                    
                    // Save to history
                    history.add(num1 + " + " + num2 + " = " + result);
                    break;
                    
                case 2:
                    // SUBTRACTION
                    System.out.println("\n--- SUBTRACTION ---");
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    
                    result = num1 - num2;
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                    
                    history.add(num1 + " - " + num2 + " = " + result);
                    break;
                    
                case 3:
                    // MULTIPLICATION
                    System.out.println("\n--- MULTIPLICATION ---");
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    
                    result = num1 * num2;
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                    
                    history.add(num1 + " * " + num2 + " = " + result);
                    break;
                    
                case 4:
                    // DIVISION
                    System.out.println("\n--- DIVISION ---");
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + num1 + " ÷ " + num2 + " = " + result);
                        history.add(num1 + " ÷ " + num2 + " = " + result);
                    } else {
                        System.out.println("ERROR: Cannot divide by zero!");
                    }
                    break;
                    
                case 5:
                    // SHOW HISTORY
                    System.out.println("\n=== CALCULATION HISTORY ===");
                    if (history.isEmpty()) {
                        System.out.println("No calculations yet.");
                    } else {
                        for (int i = 0; i < history.size(); i++) {
                            System.out.println((i+1) + ". " + history.get(i));
                        }
                    }
                    System.out.println("============================");
                    break;
                    
                case 6:
                    // CLEAR HISTORY
                    history.clear();
                    System.out.println(" History cleared successfully!");
                    break;
                    
                case 7:
                    // EXIT
                    System.out.println("\nThank you for using the calculator!");
                    System.out.println("Goodbye! ");
                    break;
                    
                default:
                    System.out.println(" Invalid choice! Please enter a number between 1 and 7.");
            }
            
        } while(choice != 7);
        
        scanner.close();
    }
}