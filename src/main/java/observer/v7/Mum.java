package observer.v7;

public class Mum implements Observer {

    public void hug() {
        System.out.println("mum hugging...");
    }

    @Override
    public void actionOnWakeUp(WakeUpEvent wakeUpEvent) {
        hug();
    }
}
