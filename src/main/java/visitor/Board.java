package visitor;

public class Board extends ComputerPart {
    @Override
    void accept(Visitor visitor) {
        visitor.visitBoard(this);
    }

    @Override
    double getPrice() {
        return 200;
    }
}
