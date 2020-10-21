package composite;

import java.util.ArrayList;
import java.util.List;

public class Dir extends Entry{
    List<Entry> entries = new ArrayList<>();

    public Dir(String name) {
        super(name);
    }

    @Override
    public void add(Entry e) {
       entries.add(e);
    }

    @Override
    public int getSize() {
        int res = 0;
        for(Entry e : entries) res += e.getSize();
        return res;
    }

    @Override
    public List<String> printList() {
        String cur = "/" + getName();
        List<String> res = new ArrayList<>();
        for(Entry e : entries){
            List<String> nxt = e.printList();
            for(String n : nxt) res.add(cur + n);
        }
        return res;
    }
}
