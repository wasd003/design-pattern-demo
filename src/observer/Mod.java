package observer;

public class Mod implements IObserver{
    private int mod = 1648;

    @Override
    public void update(ISubject s, Object... args) {
        System.out.println(String.format("%d %% %d = %d", mod, args[0], mod % (Integer)args[0]));
        System.gc();
    }
}
