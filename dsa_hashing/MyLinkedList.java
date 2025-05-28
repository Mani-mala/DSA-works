package dsa_hashing;

class MyLinkedList {
    Node head;
    public void insert(int key, String value) {
        Node current = head;

        while (current != null) {
            if (current.key == key) {
                current.value = value;
                return;
            }
            current = current.next;
        }
        Node newNode = new Node(key, value);
        newNode.next = head;
        head = newNode;
    }
    public String get(int key) {
        Node current = head;
        while (current != null) {
            if (current.key == key) return current.value;
            current = current.next;
        }
        return null;
    }
    public void delete(int key) {
        Node current = head, prev = null;

        while (current != null) {
            if (current.key == key) {
                if (prev == null) head = current.next; // head node
                else prev.next = current.next;
                return;
            }
            prev = current;
            current = current.next;
        }
    }
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print("[" + current.key + "=>" + current.value + "] ");
            current = current.next;
        }
    }
}

