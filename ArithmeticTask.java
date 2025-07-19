public class ArithmeticTask {

    public static void main(String[] args) {

        int result = 1 + 2;  
        System.out.println("After addition: " + result);

        result -= 1;         
        System.out.println("After subtraction: " + result);

        result *= 2;         
        System.out.println("After multiplication: " + result);

        result /= 2;         
        System.out.println("After division: " + result);

        result += 8;         
        result %= 6;         
        System.out.println("After modulo: " + result);
    }
}
