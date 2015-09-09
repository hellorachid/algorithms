public class Stack {

	private Node head ;
	
	public void print() {
		Node temp = this.head;
		while (temp != null) {
			System.out.printf("%d ", temp.data);
			temp = temp.next;
		}
		System.out.print("\n");
	}

	public  void push(int v) {
		Node s = new Node(v);
		s.next = this.head;
		this.head = s;
	}
	public  Node pop() {
		if (head == null ) {
			return null;
		}
		Node temp = head;
		this.head = this.head.next;
		temp.next = null;
		return temp;
	}

	public  Node top(Node head) {
		return this.head;
	}

	public static void main(String args[]) {
		Stack s = new Stack();
		s.push(2);
		s.push(3);
		s.push(4);
		
		s.print();
		
		s.pop();
		s.pop();
		s.pop();
		
		s.print();
		
		s.pop();
		s.push(4);
		
		s.print();
	}

}
class Node {
	public  int data;
	public  Node next;

	public Node(){}
	public Node(int data){
		this.data = data;
	}
}