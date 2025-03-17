package pcd.lab04.monitors.ex_barrier;

public class SyncBarrier implements Barrier {

    private final int nParticipants;
    private int nArrived;

    public SyncBarrier(final int nParticipants) {
        this.nParticipants = nParticipants;
        this.nArrived = 0;
    }

    @Override
    public synchronized void hitAndWaitAll() throws InterruptedException {
        this.nArrived++;
        while (!this.isAllArrived()) {
            wait();
        }
        notifyAll();
    }

    private boolean isAllArrived() {
        return this.nArrived == this.nParticipants;
    }
}
