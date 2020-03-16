public class DataStructure2 {

    DataStructure2() {

    }

    public boolean insert(Listing newNode) {
        System.out.println("Insert was invoked.");
        return true;
    }

    public Listing fetch(int nodeNumber) {
        System.out.println("Fetch was invoked.");
        return null;
    }

    public boolean delete(int nodeNumber) {
        System.out.println("Delete was invoked.");
        return true;
    }

    public boolean update(int nodeNumber, Listing newNode) {
        System.out.println("Update was invoked.");
        return true;
    }

}