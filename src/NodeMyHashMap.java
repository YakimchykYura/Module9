public class NodeMyHashMap<H, M> {
    H key;
    M value;
    NodeMyHashMap next;

    public NodeMyHashMap(H key, M value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}
