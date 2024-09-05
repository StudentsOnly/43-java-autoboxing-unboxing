public class IntegerOperations {

    public static void add(int a1, int a2) {
        Integer result = a1 + a2; // Autoboxing
        System.out.println(result);
    }

    public static void substruct(Integer a1, Integer a2) {
        int result = a1 - a2; // Unboxing
        System.out.println(result);
    }

    public static void multiply(int a1, int a2) {
        Integer result = a1 * a2; // Autoboxing
        System.out.println(result);
    }

    public static void divide(Integer a1, Integer a2) {
        int result = a1 / a2; // Unboxing
        System.out.println(result);
    }

}
