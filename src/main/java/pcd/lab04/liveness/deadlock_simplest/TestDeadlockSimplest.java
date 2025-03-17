package pcd.lab04.liveness.deadlock_simplest;

public class TestDeadlockSimplest {

    public static void main(String[] args) {
        Resource lock = new Resource();
        new ThreadA("Thread-0", lock).start();
        new ThreadB("Thread-1", lock).start();
    }

}
