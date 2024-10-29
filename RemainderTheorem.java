public class RemainderTheorem
 {

    // Method to evaluate the polynomial at a given value of x
    public static int evaluatePolynomial(int[] coefficients, int x)
    {
        int result = 0;
        int degree = coefficients.length - 1;

        for (int i = 0; i <= degree; i++)
        {
            result += coefficients[i] * Math.pow(x, degree - i);
        }

        return result;
    }

    public static void main(String[] args)
    {
        // Example polynomial coefficients: 2x^3 - 6x^2 + 2x - 1
        int[] coefficients = {2, -6, 2, -1};
        int c = 3; // The value to substitute into the polynomial

        // Evaluate the polynomial at x = c
        int remainder = evaluatePolynomial(coefficients, c);

        // Print the result
        System.out.println("The remainder when the polynomial is divided by (x - " + c + ") is: " + remainder);
    }
}
