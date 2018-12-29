public class RealFile implements File {

    private String fileName;

    public RealFile(String fileName) {
        this.fileName = fileName;
        loadFile(fileName);
    }

    @Override
    public void open() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFile(String fileName) {
        System.out.println("Loading " + fileName);
    }

}
