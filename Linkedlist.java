public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null; 
    }
    
    public int removeFirst() {
        if (head == null) {
            throw new RuntimeException("Cannot remove from an empty list.");
        }
        int data = this.head.data;
        this.head = this.head.next;
        return data;
    }


    public void addFirst(int data) {
        Node newNode = new Node(data); 
        newNode.next = this.head;      
        this.head = newNode;
    }

    public void displayList() {
        System.out.print("List (head -> tail): ");
        Node current = this.head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        System.out.println("Adding 30 to the front...");
        myList.addFirst(30);
        myList.displayList();

        System.out.println("Adding 20 to the front...");
        myList.addFirst(20);
        myList.displayList();

        System.out.println("Adding 10 to the front...");
        myList.addFirst(10);
        myList.displayList();
    }
}
