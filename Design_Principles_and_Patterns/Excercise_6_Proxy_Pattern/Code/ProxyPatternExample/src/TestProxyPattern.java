public class TestProxyPattern {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("cat.jpg");

        System.out.println("\n>> First call to display()");
        image1.display();  // Loads and displays

        System.out.println("\n>> Second call to display()");
        image1.display();  // Uses cache
    }
}