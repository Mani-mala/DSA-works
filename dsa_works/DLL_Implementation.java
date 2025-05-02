package dsa_works;

public class DLL_Implementation {
	 public static void main(String[] args) {
	        DoublyLinkedList list = new DoublyLinkedList();

	        list.insertAtEnd(10);
	        list.insertAtEnd(20);
	        list.insertAtBeginning(5);
	        list.insertAtPosition(15, 3);
	        list.printForward();
	    }
}
