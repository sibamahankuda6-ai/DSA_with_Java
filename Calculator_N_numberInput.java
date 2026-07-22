import java.util.Scanner;
import java.util.Stack;

public class Calculator_N_numberInput {
    


    static int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }

    static double calculate(double a, double b, char op) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of inputs: ");
        int n = sc.nextInt();

        double[] num = new double[n];
        char[] op = new char[n - 1];

        // Input numbers
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextDouble();
        }

        // Input operators
        System.out.println("Enter " + (n - 1) + " operators:");
        for (int i = 0; i < n - 1; i++) {
            op[i] = sc.next().charAt(0);
        }

        Stack<Double> values = new Stack<>();
        Stack<Character> operators = new Stack<>();

        values.push(num[0]);

        for (int i = 0; i < n - 1; i++) {

            while (!operators.isEmpty() &&
                    precedence(operators.peek()) >= precedence(op[i])) {

                double b = values.pop();
                double a = values.pop();
                values.push(calculate(a, b, operators.pop()));
            }

            operators.push(op[i]);
            values.push(num[i + 1]);
        }

        while (!operators.isEmpty()) {
            double b = values.pop();
            double a = values.pop();
            values.push(calculate(a, b, operators.pop()));
        }

        System.out.println("Result = " + values.pop());

        sc.close();
    }
}

