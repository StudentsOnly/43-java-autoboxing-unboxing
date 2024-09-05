public class IntegerOperations {

    public void add(Integer a, Integer b){
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println("Integer + Integer = int"); //autoboxing
    }

    public void subtract(int a, int b){
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println("int - int = int"); //unboxing
    }
    public void multiply(Integer a, Integer b){
        System.out.println(a + " * " + b + " = " + (a + b));
        System.out.println("Integer * Integer = int"); //autoboxing
    }

    public void divide(int a, int b){
        try{
            System.out.println(a + " / " + b + " = " + (a / b));
            System.out.println("int / int = int"); //unboxing
        }catch(ArithmeticException ex){
            System.out.println("Error: dividing by '0'");
        }

    }
}
