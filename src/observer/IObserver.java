package observer;

public interface IObserver {
    /**
     * update方法需要包含信息，否则观察者只是知道subject状态变化了，具体有哪些数据变化也不知道
     */
    void update(ISubject s, Object... args);
}
