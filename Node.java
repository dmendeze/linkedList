package linkedList;

public class Node { // This is your Node object, these are the Objects in the list
	public double data;
	public Node next; // Links this node to the next Node in the List
	public Node prev; // Links this node to the preceding Node in the List

	public Node(double data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}

	public String toString() {
		return "data: " + data + "\thasNext: " + (next != null) + "\t\thasPrev: " + (prev != null);
	}

	//Getters and setters
	public boolean isNode() {
		return true;
	}

	public double getData() {
		return data;
	}

	public Node getNext() {
		return next;
	}

	public Node getPrev() {
		return prev;
	}
}