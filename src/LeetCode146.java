import java.util.HashMap;

public class LeetCode146 {
    static class DLinkedNode {
        private int key;
        private int value;
        DLinkedNode next;
        DLinkedNode prev;

        public DLinkedNode() {
        }

        ;

        public DLinkedNode(int _key, int _value) {
            key = _key;
            value = _value;
        }
    }

    private int size;
    private final HashMap<Integer, DLinkedNode> LRUHash;
    private final int capacity;
    private DLinkedNode head;
    private DLinkedNode tail;

    public LeetCode146(int capacity) {
        this.head = new DLinkedNode();
        this.tail = new DLinkedNode();
        this.head.next = tail;
        this.tail.prev = head;
        this.LRUHash = new HashMap<Integer, DLinkedNode>();
        this.capacity = capacity;
        this.size = 0;
    }

    public int get(int key) {
        if (this.LRUHash.containsKey(key)) {
            DLinkedNode node = this.LRUHash.get(key);
            movetohead(node);
            return this.LRUHash.get(key).value;
        } else return -1;
    }

    public void put(int key, int value) {
        if (this.LRUHash.containsKey(key)) {
            DLinkedNode node = this.LRUHash.get(key);
            node.value = value;
            movetohead(node);
        } else {
            if (this.size < this.capacity) {
                DLinkedNode node = new DLinkedNode(key, value);
                addToHead(node);
                this.LRUHash.put(key, node);
                this.size++;
            } else {
                DLinkedNode node = new DLinkedNode(key, value);
                addToHead(node);
                int rekey = removeTail();
                this.LRUHash.put(key, node);
                this.LRUHash.remove(rekey);
            }
        }
    }

    private void addToHead(DLinkedNode node) {
        node.next = this.head.next;
        node.prev = this.head;
        this.head.next.prev = node;
        this.head.next = node;
    }

    private int removeTail() {
        DLinkedNode re = this.tail.prev;
        this.tail.prev.prev.next = this.tail;
        this.tail.prev = this.tail.prev.prev;
        return re.key;
    }

    private void movetohead(DLinkedNode node) {
        removeNode(node);
        addToHead(node);
    }

    private void removeNode(DLinkedNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}
