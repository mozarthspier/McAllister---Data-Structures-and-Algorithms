public class CapOneExOne {

    public static <T> void genericOutput(T a, T b, T c) {

        System.out.println("First: " + a);
        System.out.println("Second: " + b);
        System.out.println("Third: " + a);

    }

    public static void main(String[] args) {

        genericOutput(3, 4.7, 6);

    }

}