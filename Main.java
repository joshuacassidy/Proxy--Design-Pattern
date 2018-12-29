public class Main {

    public static void main(String[] args) {
        File file = new ProxyFile("test.file");

        file.open();

        file.open();
    }

}
