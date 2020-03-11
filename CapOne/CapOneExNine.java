import java.util.Scanner;
import java.util.Locale;

public class CapOneExNine {

    public static void welcomeMessage() {
        System.out.println("Welcome To St. Joseph's College\n");
    }

    public static float averageCalculator(float dividend, float divisor) {
        return dividend / divisor;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int listSize;
        float sumOfPrices = 0;
        boolean averageCheck = false;
        String[] names, prices;

        System.out.println("Define size of product list: ");
        listSize = sc.nextInt();
        names = new String[listSize];
        prices = new String[listSize];

        for (int i = 0; i < listSize; i++) {

            System.out.println("Type the name of the product: ");
            names[i] = sc.next();
            averageCheck = names[i].toLowerCase().equals("peas") ? true : averageCheck;

            System.out.println("Type the price of the product: ");
            float price = sc.nextFloat();
            sumOfPrices += price;
            prices[i] = String.format(Locale.US, "%.2f", price);

        }

        sc.close();
        System.out.println();
        welcomeMessage();

        for (int i = listSize - 1; i >= 0; i--) {
            System.out.println(names[i] + " costs U$ " + prices[i] + " Dollars.\n");
        }

        System.out.println(averageCheck ? "The average price is: U$ " + 
        String.format(Locale.US, "%.2f", averageCalculator(sumOfPrices, listSize)) + " Dollars."
        : "No average output"); 

    }

}