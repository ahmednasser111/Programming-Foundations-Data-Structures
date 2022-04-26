package LinkedList;

public class MyLinkedList<E> {

	private Node<E> head;
	private Node<E> tail;
	private int size;

	public LinkedList() {
		head = tail = null;
		size = 0;
	}

	public void addFirst(E newitem) { // O(1)
		Node<E> newNode = new Node<E>(newitem, head);
		if (isEmpty())
			tail = newNode;
		head = newNode;
		size++;
	}

	public void addLast(E newitem) { // O(1)
		Node<E> newNode = new Node<E>(newitem, null);
		if (isEmpty()) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}

	public void add(int index, E newitem) { // O(n)
		if (index == 0) {
			addFirst(newitem);
			return;
		}
		if (index == size - 1) {
			addLast(newitem);
			return;
		}
		Node<E> previous = head;
		for (int i = 0; i < index - 1; i++) {
			previous = previous.next;
		}
		Node<E> current = previous.next;
		Node<E> newNode = new Node<E>(newitem, current);
		previous.next = newNode;
		size++;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public E removeFirst() { // O(1) returns first element data or returns null if the list is empty
		if (head == null) {
			System.out.println("The list is empty!");
			return null;
		}
		E res = head.data;
		if (head == tail) {
			head = tail = null;
		} else {
			head = head.next;
		}
		size--;
		return res;

	}

	public E removeLast() {// O(n) retruns last Element data or returns null if the list is empty.
		if (isEmpty()) {
			System.out.println("The list is empty!");
			return null;
		}
		E res = tail.data;
		if (head == tail)
			return removeFirst();

		Node<E> temp = head;
		while (temp.next != tail) {
			temp = temp.next;
		}
		temp.next = null;
		tail = temp;
		size--;
		return res;
	}

	public E remove(E obj) { // O(n)
		Node<E> current = head, previous = null;
		while (current != null) {
			if (((Comparable<E>) obj).compareTo(current.data) == 0) {

				if (current == head)
					return removeFirst();

				if (current == tail)
					return removeLast();

				size--;
				previous.next = current.next;
				return current.data;
			}
			previous = current;
			current = current.next;
		}
		return null;
	}

	public E remove(int index) { // O(n)
		if (index == 0)
			return removeFirst();

		if (index == size - 1)
			return removeLast();

		Node<E> previous = head;
		for (int i = 0; i < index - 1; i++) {
			previous = previous.next;
		}
		Node<E> current = previous.next;
		previous.next = current.next;
		size--;
		return current.data;
	}

	public boolean find(E obj) {
		Node<E> current = head;
		while (current != null) {
			if (((Comparable<E>) obj).compareTo(current.data) == 0) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	public E peekFirst() {
		if (isEmpty())
			return null;
		return head.data;
	}

	public E peekLast() {
		if (isEmpty())
			return null;
		return tail.data;
	}

	public int getSize() {
		return size;
	}

	public String toString() {
		if (isEmpty())
			return "The list is empty!";
		else {
			String s = "";
			Node<E> n = head;
			while (n != null) {
				s += n.data + "\n";
				n = n.next;
			}
			return s;
		}
	}
}
