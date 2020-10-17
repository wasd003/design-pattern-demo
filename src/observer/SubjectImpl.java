package observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements ISubject {
    private List<IObserver> observers = new ArrayList<>();
    private int val;
    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(IObserver observer : observers) observer.update(this, val);
    }

    public void setVal(int val){
        this.val = val;
        notifyObservers();
    }

    public static void main(String[] args) {
        Div div = new Div();
        Mod mod = new Mod();
        SubjectImpl s = new SubjectImpl();
        s.addObserver(div);
        s.addObserver(mod);
        s.setVal(18);
    }
}
