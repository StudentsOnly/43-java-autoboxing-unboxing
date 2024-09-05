public class IntegerOperations {

    public static void main(String[] args) {

        int num1 = 15;
        int num2 = 5;

        // Addition using Integer wrapper class (autoboxing happens here)
        Integer additionResult = num1 + num2;
        System.out.println("Addition using Integer wrapper class: " + additionResult + " (Data type: " + ((Object)additionResult).getClass().getSimpleName() + ")");

        Integer num3 = 23; // autoboxing
        Integer num4 = 56; // autoboxing

        // Subtraction using Integer wrapper class (unboxing happens here)
        int subtractionResult = num4 - num3;  // Unboxing: Integer to int
        System.out.println("Subtraction using Integer wrapper class: " + subtractionResult + " (Data type: int)");

        // Multiplication using Integer wrapper class (autoboxing)
        Integer multiplicationResult = num1 * num2;
        System.out.println("Multiplication using Integer wrapper class: " + multiplicationResult + " (Data type: " + ((Object)multiplicationResult).getClass().getSimpleName() + ")");

        // Division using Integer wrapper class (unboxing)
        int divisionResult = num4 / num3;  // Unboxing: Integer to int
        System.out.println("Division using Integer wrapper class: " + divisionResult + " (Data type: int)");
    }
}
