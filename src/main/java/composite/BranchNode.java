package composite;

import java.util.ArrayList;
import java.util.List;

public class BranchNode extends Node {

    List<Node> nodes = new ArrayList<>();

    String name;
    public BranchNode(String name) {
        this.name = name;
    }

    public void add(Node node) {
        nodes.add(node);
    }

    @Override
    public void p() {
        System.out.println(name);
    }
}
