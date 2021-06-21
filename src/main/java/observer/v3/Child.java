package observer.v3;

public class Child {
    private boolean cry = false;
    private Dad d = new Dad();

    public boolean isCry() {
        return cry;
    }

    public void  wakeUp() {
        cry = true;
        d.feed();
    }
}
