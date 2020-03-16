public class DataStructure {

    private Listing[] data;
    private int size;
    private int next;

    public DataStructure() {
        size = 100;
        next = 0;
        data = new Listing[size];
    }

    public DataStructure(int numberOfListings) {
        size = numberOfListings;
        next = 0;
        data = new Listing[size];
    }

    public void addListing(Listing newListing) {
        data[next] = newListing;
        next++;
    }

    public void showAllListings() {
        for (int i = 0; i < next; i++) {
            System.out.println(data[i].toString());
        }
    }

}