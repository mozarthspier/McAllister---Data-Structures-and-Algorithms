import java.util.Scanner;

public class CapOneExEight {

    public static void singleItem(String i) {

        System.out.println(i);

    }

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Type item name: ");
        singleItem(sc.next());

    }

}