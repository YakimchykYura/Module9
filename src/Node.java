class Node<L> {
    L value;
    Node next;

    public Node(L data) {
        this.value = data;
        this.next = null;
    }
    public Node first = null;
    public Node last = null;

    public void addNode(L data) {
        Node newNode = new Node(data);

        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
    }
}