package composite;

import java.util.List;

// Entry作为抽象类比接口更合适，因为Dir和File都is-a Entry
public abstract class Entry {
    public abstract void add(Entry e);
    public abstract int getSize();
    public abstract List<String> printList();
    private String name;

    public Entry(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public static void main(String[] args) {
        Dir root = new Dir("root");
        Dir home = new Dir("home");
        Dir mnt = new Dir("mnt");
        for(int i = 0; i < 5; i++) home.add(new File("home_file" + i));
        for(int i = 0; i < 5; i++) mnt.add(new File("mnt_file" + i));
        Dir mnt_sub = new Dir("mnt_sub");
        mnt.add(mnt_sub);
        for(int i = 0; i < 5; i++) mnt_sub.add(new File("mnt_sub_file" + i));
        root.add(home);
        root.add(mnt);
        List<String> ans = root.printList();
        for(String s : ans) System.out.println(s);
        System.out.println("total size = " + root.getSize());
    }
}
