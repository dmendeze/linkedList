package linkedList;
/*
  Interface: The LIST will provide this collection of operations:

  clear:
    in: nothing
    return: void
    effect: list is left with size 0, no elements in it,
            consists of just the original root Node
  size:
    in: nothing
    return: number of elements stored in the list
    effect: no change to list state
  isEmpty:
    in: nothing
    return: boolean, true if the list has no elements in it, true is size is 0
    effect: no change to list state
  insert
    in: a Node element, and an int index
    return: boolean, return true in insert is successful, false otherwise
    effect: the list state will be altered so that the Node element is located at the
            specified index; the list has size bigger by one; all elements that were
            at the specified index or after have been moved down one slot
    error: is index is beyond list size range return false
  remove
    in: an int, the index of the element to take out of the list
    return: boolean.. return true if the remove is successful, false otherwise
    effect: list state is altered in that the Node at the specified index is decoupled
            list size decreases by one
    errors: what if specified index is not in the list? return false
  get
    in: an int, the index of the element item to return
    return: Node, the element stored at index, or null
    effect: no change in state of the list
    error: what if index is not in the list? return null
*/

public interface LIST_Interface {
    public boolean insert(Node n, int index);
    public boolean remove(int index);
    public Node get(int index);
    public int size();
    public boolean isEmpty();
    public void clear();
}