package templateMethod;

public abstract class F {
    void m() {
        op1();
        op2();
    }

    abstract void op1();

    abstract void op2();
}
