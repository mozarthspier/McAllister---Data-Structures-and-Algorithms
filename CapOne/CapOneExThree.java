import java.util.Scanner;
import java.util.Locale;
import javax.swing.JOptionPane;

public class CapOneExThree {
    
    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale( Locale.US );
        String[] namesPrices = new String[6];
        float sum = 0;

        for (int i = 0; i < 6; i += 2) {

            System.out.println("Type the name of the product: ");
            namesPrices[i] = sc.next();

            System.out.println("Type the price of the product: ");
            float price = sc.nextFloat();
            sum += price;
            namesPrices[i + 1] = String.format(Locale.US, "%.2f", price);

        }

        String message = "";

        for (int i = 0; i < 6; i += 2) {
            message = message + namesPrices[i] + " costs U$ " + namesPrices[i + 1] + " Dollars.\n";
        }

        message = message + "The average price is: U$ " + String.format(Locale.US, "%.2f", sum / 3) + " Dollars.";

        CapOneExThree.infoBox(message, "Names and prices");

    }

}