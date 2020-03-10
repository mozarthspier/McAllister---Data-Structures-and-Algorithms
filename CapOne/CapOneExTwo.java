import java.util.Scanner;
import java.util.Locale;

public class CapOneExTwo {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale( Locale.US );

        System.out.println("Type the name of the product: ");
        String name = sc.next();

        System.out.println("Type the price of the product: ");
        String price = String.format(Locale.US, "%.2f", sc.nextFloat());

        System.out.println(name + " costs U$ " + price + " Dollars.");

    }

}