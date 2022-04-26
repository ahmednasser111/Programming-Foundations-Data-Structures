package LinkedList;

public class Node<E> {
	E data;
	Node next;

	public Node() {

	}

	public Node(E data, Node next) {
		this.data = data;
		this.next = next;
	}

	public Node(E data) {
		this.data = data;
		next = null;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}

}
