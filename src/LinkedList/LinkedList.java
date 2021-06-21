package LinkedList;

class LinkedList {

	Node head;  

	class Node {
		int key;
		Node next;
		public Node(int data) {
			key = data;
			next = null;
		}
		public String toString() {
			return "Node: " + key;
		}
	}

	public LinkedList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void insertAtBeginning(int newKey) {
		Node newNode = new Node(newKey);
		newNode.next = head;
		head = newNode;
	}

	public void insertAtEnd(int newKey) {

		Node newNode = new Node(newKey);

		if (head == null) {
			head = newNode; // attention
			return;
		}

		Node lastNode = head;
		while (lastNode.next != null) lastNode = lastNode.next;

		lastNode.next = newNode;
		return;
	}
	
	public void insertAfter(Node previousNode, int newKey) {
		if(previousNode == null) {
			System.out.println("The given previousNode cannot be null");
			return;
		}
		Node newNode = new Node(newKey);
		newNode.next = previousNode.next;
		previousNode.next = newNode;
	}
	
	public void deleteNodeByIndex(int index) {
		if(isEmpty()) {
			System.out.println("The LinkedList is empty");
			return;
		}
		
		if(index == 0) {
			head = head.next;
			return;
		}
		
		Node temp = head;
		for (int i = 0; i < index - 1 && temp != null; i++) {
			temp = temp.next;
		}
		
		if(temp == null || temp.next == null) {
			System.out.println("Index out of bounds");
			return;
		}
		
		temp.next = temp.next.next;
	}
	
	public Node searchNode(int key) {
		Node temp = head;
		while(temp != null) {
			if(temp.key == key) {
				return temp;
			}
			temp = temp.next;
		}
		return null;
	}
	
	public String toString() {
		String str = "";
		Node temp = head;
		while(temp != null) {
			str = str + temp.key + " -> ";
			temp = temp.next;
		}
		return str + "null";
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		System.out.println(list.isEmpty());
		System.out.println(list);
		list.insertAtEnd(1);
		System.out.println(list);
		list.insertAtEnd(2);
		System.out.println(list);
		list.insertAtEnd(3);
		System.out.println(list);
		list.insertAtEnd(5);
		System.out.println(list);
		list.insertAtBeginning(0);
		System.out.println(list);
		list.insertAfter(list.searchNode(3), 4);
		System.out.println(list);
		list.deleteNodeByIndex(10);
		System.out.println(list);
		list.deleteNodeByIndex(5);
		System.out.println(list);
		list.deleteNodeByIndex(3);
		System.out.println(list);
		list.deleteNodeByIndex(0);
		System.out.println(list);
	}
}
