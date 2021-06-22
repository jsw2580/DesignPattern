package composite;

public class Main {
    public static void main(String[] args) {
        BranchNode root = new BranchNode("root");
        BranchNode chapter1 = new BranchNode("chapter1");
        BranchNode chapter2 = new BranchNode("chapter2");
        Node cl1 = new LeafNode("cl1");
        Node cl2 = new LeafNode("cl2");
        BranchNode b21 = new BranchNode("section21");
        Node c211 = new LeafNode("c211");
        Node c212 = new LeafNode("c212");

        root.add(chapter1);
        root.add(chapter2);
        chapter1.add(cl1);
        chapter1.add(cl2);
        chapter2.add(b21);
        b21.add(c211);
        b21.add(c212);

        tree(root, 0);
    }

    static void tree(Node node, int depth) {
        for(int i = 0; i < depth; i ++) {
            System.out.print("--");
        }
        node.p();
        if(node instanceof BranchNode) {
            for(Node node1 : ((BranchNode) node).nodes) {
                tree(node1, depth + 1);
            }
        }
    }
}
