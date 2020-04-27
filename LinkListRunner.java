public class LinkListRunner {

	public static void main(String args[]) {
		MyLinkedList list = new MyLinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insertStart(0);
		list.displayList();
	}
}
