public class CapOneExThirteen {

    public static void main(String[] args) {

        Listing[] notary = new Listing[3];
        Listing person;
        
        for (int i = 0; i < 3; i++) {
            person = new Listing();
            person.input();
            notary[i] = person;
        }

        for (int i = 3; i > 0; i--) {
            System.out.println(notary[i - 1].toString());
        }

    }

}