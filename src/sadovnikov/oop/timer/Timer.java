package sadovnikov.oop.timer;

public class Timer {
    public long measureTimer(Runnable runnable) {
        long startTime = System.currentTimeMillis();
        runnable.run();
        return System.currentTimeMillis() - startTime;
    }
}
