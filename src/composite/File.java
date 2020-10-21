package composite;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class File extends Entry{

    public File(String name) {
        super(name);
    }

    @Override
    public void add(Entry e) {

    }

    @Override
    public int getSize() {
        return new Random().nextInt(100);
    }

    @Override
    public List<String> printList() {
        return Arrays.asList("/" + getName());
    }
}
