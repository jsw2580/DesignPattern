package observer.v9.test;

public class Test {
    public static void main(String[] args) {
        Button button = new Button();
        button.addActionListener(new MyActionListener());
        button.addActionListener(new MyActionListener2());
        button.buttonPressed();
    }
}
