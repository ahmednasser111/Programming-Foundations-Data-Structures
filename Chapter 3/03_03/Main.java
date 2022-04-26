package LinkedList;

public class Main {

	public static void main(String[] args) {
		MyLinkedList<String> ls = new MyLinkedList<String>();
		ls.addFirst("Second");
		ls.addFirst("First");
		ls.addLast("Third");
		ls.addLast("Last");
//		System.out.println(ls.removeLast());
//		System.out.println(ls.removeFirst());
//		System.out.println(ls.remove("Last"));
//		System.out.println(ls.remove("Second"));
//		System.out.println(ls.remove("First"));
//		System.out.println(ls.find("Last"));
		System.out.println(ls);
		ls.add(0, "f");
		ls.add(4, "l");
		ls.add(2, "s");
		System.out.println(ls.getSize());
		System.out.println(ls);
	}

}
