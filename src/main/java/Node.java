public class Node extends LinearNode<Integer> {
    private final int tailSize;
    private final int loopSize;
    private Node next;

    private Node(int tailSize, int loopSize) {
        this.tailSize = tailSize;
        this.loopSize = loopSize;
    }

    public static Node createChain(int tailSize, int loopSize) {
        return new Node(tailSize, loopSize);
    }

    private void setNext(Node node)
    {
        next = node;
    }

    @Override
    public Node getNext()
    {
        return next;
    }
}
