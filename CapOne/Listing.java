import javax.swing.JOptionPane;

public class Listing {

    private String name;
    private int age;

    public Listing() {

        name = " ";
        age = 0;

    }

    public Listing(String n, int a) {

        name = n;
        age = a;

    }

    public String toString() {
        return ("Name is " + name + "\nAge is " + age);
    }

    public void input() {
        name = JOptionPane.showInputDialog("Enter a name");
        age = Integer.parseInt(JOptionPane.showInputDialog("Enter an age"));
    }

    public void setName(String n) {
        name = n;
    }

    public void setAge(String a) {
        age = Integer.parseInt(a);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}