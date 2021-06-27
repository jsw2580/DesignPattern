package visitor;

public abstract class ComputerPart {
    abstract void accept(Visitor visitor);

    abstract double getPrice();
}
