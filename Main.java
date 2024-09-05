public class Main {

    public static void main(String[] args) {

        IntegerOperations calculator = new IntegerOperations();

        Integer additionR = calculator.add(2, 3); // Autoboxing: int to Integer
        System.out.println("Add two integers using Integer wrapper class: " + additionR);

        int subtractionR = calculator.subtract(Integer.valueOf(2), Integer.valueOf(3)); // Unboxing: Integer to int
        System.out.println("Subtract two integers using Integer wrapper class: " + subtractionR);


        Integer multiplicationR = calculator.multiply(2, 3); // Autoboxing: int to Integer
        System.out.println("Multiply two integers using Integer wrapper class: " + multiplicationR);

        try {
            int divisionR = calculator.divide(Integer.valueOf(7), Integer.valueOf(3)); // Unboxing: Integer to int
            System.out.println("Divide two integers using Integer wrapper class: " + divisionR);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // Test edge-case: Division by zero
        try {
            calculator.divide(7, 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());  // Output: Divide by zero
        }
    }
}



