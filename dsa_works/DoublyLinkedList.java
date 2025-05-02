package dsa_works;

//class Node
//{
//    int data;
//    Node prev, next;
//
//    Node(int data) 
//    {
//        this.data = data;
//        this.prev = null;
//        this.next = null;
//    }
//}
public class DoublyLinkedList {
	Node head = null;

	 public void insertAtBeginning(int data) 
	 {
	        Node newNode = new Node(data);

	        if (head == null) 
	        {
	            head = newNode;
	        } 
	        else {
	            newNode.next = head;
	            head.prev = newNode;
	            head = newNode;
	        }
	    }
    public void insertAtEnd(int data)
    {
        Node newNode = new Node(data);

        if (head == null)
        {
            head = newNode;
        }
        else {
            Node temp = head;
            while (temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }   

    public void insertAtPosition(int data, int position) 
    {
        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            insertAtBeginning(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }

        newNode.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        newNode.prev = temp;
        temp.next = newNode;
    }
    public void printForward() 
    {
        Node temp = head;
        System.out.print("Forward: ");
        while (temp != null) 
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
