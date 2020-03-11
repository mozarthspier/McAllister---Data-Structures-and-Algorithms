import java.util.Scanner;
import java.util.Locale;

public class CapOneExSix {

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

        for (int i = listSize - 1; i >= 0; i--) {

            System.out.println(names[i] + " costs U$ " + prices[i] + " Dollars.\n");

        }

        if (averageCheck == true) {
            System.out.println("The average price is: U$ " + String.format(Locale.US, "%.2f", sumOfPrices / listSize) + " Dollars.");
        } else {
            System.out.println("No average output"); 
        }

    }

}