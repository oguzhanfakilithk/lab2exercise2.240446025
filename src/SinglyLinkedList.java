public class SinglyLinkedList {
    private Node head;
    public SinglyLinkedList() {
        head = null;
    }
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("NULL");
    }
    public void deleteMiddle() {
        if (head == null) {
            return;
        }
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        if (count == 1) {
            head = null;
            return;
        }
        int middle = count / 2;
        current = head;
        for (int i = 1; i < middle; i++) {
            current = current.next;
        }
        current.next = current.next.next;
    }
    public Node getHead() {
        return head;
    }
}