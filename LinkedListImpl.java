package linkedList;

public class LinkedListImpl implements LIST_Interface {
	Node root;

	int counter = 0;

	public LinkedListImpl() {
		root = new Node(0);
	}

	public Node getRoot() {
		return root;
	}

	@Override
	public boolean insert(Node current, int index) {

		Node temp = null;

		if (check(index) == false) {
			return false;
		} else if (index == 0) {

			if (isEmpty() != true) {
				temp = get(0);
				set(current, temp);
			}

			set(root, current);

		} else if (index == counter) {

			set(get(index - 1), current);

		} else {

			temp = get(index);

			set(current, temp);
			set(get(index - 1), current);

		}

		counter++;
		return true;

	}

	@Override
	public boolean remove(int index) {

		Node prev = null;
		Node next = null;

		if (check(index) == false) {
			return false;
		} else if (index == 0) {

			if (get(0).next != null) {
				next = get(0).next;

				erase(0);

				set(root, next);

			} else {
				erase(index);
				root.next = null;

			}
		} else if (index == counter - 1) {

			erase(index);

			get(index - 1).next = null;

		} else {

			prev = get(index).prev;
			next = get(index).next;

			erase(index);

			set(prev, next);

		}
		this.counter--;
		return true;

	}

	@Override
	public Node get(int index) {

		Node current = root;

		if (check(index) == false) {
			return null;
		} else {
			for (int i = 0; i <= index; i++) {
				current = current.next;
			}
			return current;
		}
	}

	@Override
	public int size() {
		return counter;
	}

	@Override
	public boolean isEmpty() {
		if (counter != 0) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public void clear() {
		while (counter != 0) {
			remove(0);
		}
	}

	//Checks to see if the index is in bounds
	public boolean check(int index) {

		if (index < 0 || index > counter) {
			return false;
		}
		return true;
	}

	public void set(Node prev, Node current) {
		prev.next = current;
		current.prev = prev;
	}

	public void erase(int index) {
		get(index).next = null;
		get(index).prev = null;
	}

}