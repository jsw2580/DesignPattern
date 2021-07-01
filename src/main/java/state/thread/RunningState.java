package state.thread;

public class RunningState extends ThreadState_ {

    private Thread_ thread;

    public RunningState(Thread_ thread) {
        this.thread = thread;
    }

    @Override
    void move(Action input) {

    }

    @Override
    void run() {

    }
}
