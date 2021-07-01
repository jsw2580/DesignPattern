package state.thread;

public class TerminatedState extends ThreadState_ {
    private Thread_ thread;

    @Override
    void move(Action input) {

    }

    @Override
    void run() {

    }

    public TerminatedState(Thread_ thread) {
        this.thread = thread;
    }
}
