package templateMethod;



public class MyDoc extends CDocument {
    @Override
    public void serailize() {
        System.out.println("seralize");
    }

    public static void main(String[] args) {
        MyDoc instance = new MyDoc();
        instance.FileOpen();
    }
}
