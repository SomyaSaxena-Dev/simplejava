public class MyLinkedList {

	Node headNode;
	
	@SuppressWarnings("null")
	public void insert(int data) {
		
		Node node = new Node();
		node.data = data;
		
		if(headNode == null) {
			headNode = node;
		}
		else {
			Node pointer = new Node();
			pointer=headNode;
			while(pointer.next!=null) {
				pointer = pointer.next;
			}
			pointer.next=node;
		}
	}
	
	public void displayList() {
		Node pointer = headNode;
		while(pointer.next!=null) {
			System.out.println(pointer.data);
			pointer = pointer.next;
		}
	}
	
	public void insertStart(int data) {
		Node newHead = new Node();
		newHead.data = data;
		newHead.next = headNode;
		headNode = newHead;
		
	}
}
