package visitor;

public class CPU extends ComputerPart {
    @Override
    void accept(Visitor visitor) {
        visitor.visitCpu(this);
    }

    @Override
    double getPrice() {
        return 500;
    }
}
