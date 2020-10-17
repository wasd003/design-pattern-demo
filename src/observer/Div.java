package observer;

public class Div implements IObserver {
    private int div = 6874156;
    @Override
    public void update(ISubject s, Object... args) {
        System.out.println(String.format("%d / %d = %d", div, args[0], div / (Integer)args[0]));
    }
}
