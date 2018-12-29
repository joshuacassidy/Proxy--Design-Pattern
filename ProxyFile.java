public class ProxyFile implements File {

    private RealFile realFile;
    private String fileName;

    public ProxyFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void open() {
        if(realFile == null) {
            realFile = new RealFile(fileName);
        }
        realFile.open();
    }
}
