
/*
*	How it works :
*		https://en.wikipedia.org/wiki/Queue_(abstract_data_type)
*/
public class Queue {
	private Node front;
	private Node rear;
	
	public void enqueue(int a) {
		Node node = new Node();
		node.data = a;
		if (isEmpty()) {
			this.front = this.rear = node;
		} else {
			this.rear.next = node;
			this.rear = node;
		}
	}
	
	public Node dequeue() {
		if (isEmpty()) {
			return null;
		} else if (this.front == rear) {
			Node temp = this.front;
			this.front = rear = null;	
			return temp;
		} else {
			Node temp;
			temp = this.front;
			this.front = front.next;
			return temp;
		}
	}
	
	public boolean isEmpty() {
		return (this.front == this.rear) && (this.front == null);
	}

	public Node front() {
		return front;
	}


	public static void main(String args[]) {
		Queue q = new Queue();
		System.out.println(q.isEmpty());
		System.out.println(q.dequeue());
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(4);

		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}
}

class Node {
	public int data;
	public Node next;

	public String toString() {
		return String.valueOf(this.data);
	} 
}
