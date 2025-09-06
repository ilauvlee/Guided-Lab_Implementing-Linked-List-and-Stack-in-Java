public class Stack {
    private LinkedList list;

    public Stack() {
        this.list = new LinkedList();
    }
    
    public void push(int data) {
        list.addFirst(data);
        System.out.println("Pushed: " + data);
    }

    public int pop() {
        int data = list.removeFirst();
        System.out.println("Popped: " + data);
        return data;
    }

    public boolean isEmpty() {
        return (list.head == null);
    }

    public static void main(String[] args) {
        Stack myStack = new Stack();

        myStack.push(100);
        myStack.push(200);
        myStack.push(300);

        System.out.println("\nCurrent Stack State:");
        myStack.list.displayList();

        System.out.println("\nStarting to pop...");
        myStack.pop();
        myStack.list.displayList();

        myStack.pop();
        myStack.list.displayList();

        myStack.pop();
        myStack.list.displayList();
    }
}
