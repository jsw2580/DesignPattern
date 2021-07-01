package state.v2;

public class MMNervousStatus extends MMState {
    @Override
    void smile() {
        System.out.println("nervous smile");
    }

    @Override
    void cry() {
        System.out.println("nervous cry");
    }

    @Override
    void say() {
        System.out.println("nervous say");
    }
}
