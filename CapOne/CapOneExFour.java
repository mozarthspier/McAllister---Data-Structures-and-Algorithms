import java.util.Scanner;
import java.util.Locale;
import javax.swing.JOptionPane;

public class CapOneExFour {
    
    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale( Locale.US );
        String[] names = new String[3];
        String[] prices = new String[3];
        float sum = 0;
        boolean check = false;

        for (int i = 0; i < 3; i++) {

            System.out.println("Type the name of the product: ");
            names[i] = sc.next();
            check = names[i].toLowerCase().equals("peas") ? true : check;

            System.out.println("Type the price of the product: ");
            float price = sc.nextFloat();
            sum += price;
            prices[i] = String.format(Locale.US, "%.2f", price);

        }

        sc.close();

        String message;

        if (check == true) {
            
            message = "";
            
            for (int i = 0; i < 3; i++) {
                message = message + names[i] + " costs U$ " + prices[i] + " Dollars.\n";
            }

            message = message + "The average price is: U$ " + String.format(Locale.US, "%.2f", sum / 3) + " Dollars.";
        } else {
            message = "no average output"; 
        }
        
        CapOneExThree.infoBox(message, "Names and prices");

    }

}