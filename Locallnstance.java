public class LocalInstance {

    int x = 10; // Instance Variable

    void display() {
        int y = 20; // Local Variable

        System.out.println("Instance = " + x);
        System.out.println("Local = " + y);
    }

    public static void main(String[] args) {
        LocalInstance obj = new LocalInstance();

        obj.display();
    }
}
