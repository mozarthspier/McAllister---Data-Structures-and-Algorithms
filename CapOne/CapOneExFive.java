import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CapOneExFive {
    
    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale( Locale.US );
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> prices = new ArrayList<String>();
        float sumForAVG = 0;
        boolean peasCheck = false;
        boolean repeat = true;
        int repetitions = 0;

        while (repeat) {

            System.out.println("Type the name of the product: ");
            names.add(sc.next());
            peasCheck = names.get(repetitions).toLowerCase().equals("peas") ? true : peasCheck;

            System.out.println("Type the price of the product (-1 to stop): ");
            float price = sc.nextFloat();

            if (price == -1) {
                repeat = false;
            } else {
                repetitions += 1;
                sumForAVG += price;
                prices.add(String.format(Locale.US, "%.2f", price));
            }

        }

        sc.close();

        String message = "";
            
        for (int i = 0; i < repetitions; i++) {
            message = message + names.get(i) + " costs U$ " + prices.get(i) + " Dollars.\n";
        }

        if (peasCheck == true) {
            message = message + "The average price is: U$ " + String.format(Locale.US, "%.2f", sumForAVG / repetitions) + " Dollars.";
        } else {
            message = message + "No average output"; 
        }
        
        CapOneExFive.infoBox(message, "Names and prices");

    }

}