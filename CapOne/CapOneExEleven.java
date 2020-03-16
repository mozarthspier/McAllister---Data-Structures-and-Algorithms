class Listing {

    private String name;
    private int number;

    public Listing() {

        name = null;
        number = 0;

    }

    public Listing(String n, int num) {

        name = n;
        number = num;

    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String n) {
        name = n;
    }

    public void setNumber(int num) {
        number = num;
    }

    public String toString() {
        return ("Name is " + name + "\nNumber is " + number);
    }

}

public class CapOneExEleven {

    public static void main(String[] args) {

        Listing john = new Listing();
        Listing mary = new Listing("Mary Poppins", 334556778);

        System.out.println(mary.toString());
        john.setName("John Carpenter");
        john.setNumber(456234564);
        System.out.println(john.toString());
  
    }

}