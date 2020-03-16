public class CapOneExSixteen {

    public static void main(String[] args) {

        Listing bob = new Listing();
        DataStructure2 test = new DataStructure2();

        test.insert(bob);
        test.fetch(5);
        test.delete(4);
        test.update(3, bob);

    }

}