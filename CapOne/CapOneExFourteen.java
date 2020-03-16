public class CapOneExFourteen {

    public static void main(String[] args) {

        DataStructure lista = new DataStructure(5);

        Listing bob = new Listing();
        bob.input();
        lista.addListing(bob);

        Listing mary = new Listing();
        mary.input();
        lista.addListing(mary);

        lista.showAllListings();

    }

}