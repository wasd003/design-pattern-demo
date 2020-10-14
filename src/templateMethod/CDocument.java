package templateMethod;

public abstract class CDocument {
    public void FileOpen(){
        System.out.println("touch menu");
        System.out.println("display dialog");
        System.out.println("get user input");
        System.out.println("check filename");
        System.out.println("search file");
        System.out.println("open file");
        serailize();
    }
    protected abstract void serailize();
}
