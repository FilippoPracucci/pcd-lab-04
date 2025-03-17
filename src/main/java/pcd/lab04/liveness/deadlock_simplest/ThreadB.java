package pcd.lab04.liveness.deadlock_simplest;

public class ThreadB extends Thread {

    private final Resource res;

    public ThreadB(final String name, final Resource lock) {
        super(name);
        this.res = lock;
    }

    @Override
    public void run() {
        while (true) {
            this.res.rightLeft();
        }
    }
}
