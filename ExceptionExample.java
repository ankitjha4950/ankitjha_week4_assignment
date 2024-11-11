public class ExceptionExample {
    public static void main(String[] args) {
        try {
            // This will cause an ArithmeticException (division by zero)
            int result = 10 / 0;
            System.out.println("Result: " + result);

            // This will cause a NullPointerException (trying to use null as an object)
            //String text = null;
            //System.out.println(text.length());

        } catch (ArithmeticException e) {
            System.out.println("Error: You tried to divide by zero!");
        } catch (NullPointerException e) {
            System.out.println("Error: You tried to use something that is null!");
        } finally {
            System.out.println("End of the program.");
        }
    }
}
