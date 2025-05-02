package dsa_works;

public class SLL_Implementation {
	   public static void main(String[] args) {
	        SinglyLinkedList list = new SinglyLinkedList();
	        
	        list.insertAtEnd(10);
	        list.insertAtEnd(20);
	        list.insertAtBeginning(5);
	        list.insertAtPosition(15, 3);
	        list.printList(); 
	    }
}
