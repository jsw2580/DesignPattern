package observer.v8;

public class Dog implements Observer {

    public void wang() {
        System.out.println("dog wang...");
    }

    @Override
    public void actionOnWakeUp(WakeUpEvent wakeUpEvent) {
        wang();
    }
}
