public class ReverseLinkedList {
	
	private Node head;

	public void insert( int v) {
		Node node = new Node(v);

		if (head == null) {
			this.head = node;	
		} else {
			Node temp = this.head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;	
		}
	}

	public void print() {
		Node temp = this.head;
		while (temp != null) {
			System.out.printf("%d ", temp.data);
			temp = temp.next;
		}
		System.out.print("\n");
	}

	public void reverse() {

		Node current = this.head;
		Node next = null;
		Node prev = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		this.head = prev;
	}
	public void reverseRecursion() {
		this.head = reverseRecursion(this.head, null);
	}
	public Node reverseRecursion(Node current, Node prev) {

		if (current == null) {
			return prev;
		}
		Node next = current.next;
		current.next = prev;
		return reverseRecursion(next, current);
	}

	public static void main(String args[]) {
		
		ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
		
		reverseLinkedList.insert(2);
		reverseLinkedList.insert(3);
		reverseLinkedList.insert(4);
		reverseLinkedList.insert(5);
		reverseLinkedList.insert(6);
		reverseLinkedList.insert(7);
		reverseLinkedList.insert(8);
		reverseLinkedList.insert(9);
		
		reverseLinkedList.print();
		reverseLinkedList.reverse();
		reverseLinkedList.print();
		reverseLinkedList.reverseRecursion();
		reverseLinkedList.print();
		
	}

}

class Node {
	public int data;
	public Node next;

	public Node(int v) {
		this.data = v;
	}

	public String toString() {
		return String.valueOf(this.data);
	} 
}