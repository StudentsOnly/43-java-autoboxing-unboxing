public class IntegerOperations {

    public Integer add(int a, int b) {
        return a + b;
    }

    public Integer subtract(Integer a, Integer b) {
        return a - b;
    }

    public Integer multiply(int a, int b) {
        return a * b;
    }

    public Integer divide(Integer a, Integer b) {
        if (b == 0) throw new ArithmeticException("Divide by zero");
        return a / b;
    }
}
