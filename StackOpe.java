import java.util.Scanner;
import java.util.Stack;

public class StackOpe {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Stack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Check if the stack is empty");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter an integer to push onto the stack: ");
                    int value = scanner.nextInt();
                    push(stack, value);
                    break;
                case 2:
                    pop(stack);
                    break;
                case 3:
                    isEmpty(stack);
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void push(Stack<Integer> stack, int value) {
        stack.push(value);
        System.out.println(value + " has been pushed onto the stack.");
    }

    private static void pop(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int poppedValue = stack.pop();
            System.out.println(poppedValue + " has been popped from the stack.");
        } else {
            System.out.println("The stack is empty. Cannot pop.");
        }
    }

    private static void isEmpty(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("The stack is not empty.");
        }
    }
}
