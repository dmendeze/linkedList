package linkedList;

public class LinkedListPlayground {

  public static void main(String[] args) { 
	  
	  //Here you can instantiate your LinkedList and play around with it to check correctness

	//test1();
    test2();
    //testGet();
	//test3();

  }
  
  public static void test1(){
	  
	LinkedListImpl L= new LinkedListImpl();
    	System.out.println(L.isEmpty());
    printList(L);
    L.clear();
    	System.out.println(L.isEmpty());
    printList(L);
    System.out.println(L.root.toString());
    L.insert(new Node(3.3),0);
    	System.out.println(L.isEmpty());
    printList(L);
    System.out.println(L.root.next.toString());
    L.insert(new Node(3.4),0);
    L.insert(new Node(3.5),0);
    L.insert(new Node(3.67),1);
    L.insert(new Node(3.357),0);
    L.insert(new Node(3.333),4);
    L.remove(3);
    System.out.println(L.size());
    printList(L);
    L.clear();
    L.insert(new Node(3.4),0);
    L.insert(new Node(3.5),0);
    L.insert(new Node(3.67),1);
    L.insert(new Node(3.357),0);
    L.insert(new Node(3.333),3);
    L.remove(0);
    System.out.println(L.size());
    printList(L);
  }
  public static void test2(){
	  
	  //size(insert(3,0),insert(2.0,1),insert(1.0,2),remove(0),clear(),insert(3,0),insert(2,1),insert(1,0),remove(2)) --> 2
	  
    LinkedListImpl L= new LinkedListImpl();
    L.insert(new Node(35),0);
    L.insert(new Node(63),1);
    L.insert(new Node(5),2);
    L.remove(0);
    
    //System.out.println("Inserted [4,5,6]. remove(1). Output:");
    printList(L);
    System.out.println("");
    
    L.clear();
    printList(L);
    System.out.println("");
    
    L.insert(new Node(345),0);
    L.insert(new Node(3),1);
    L.insert(new Node(6432),2);
    L.insert(new Node(2432), 3);
    L.remove(1);

    printList(L);
    System.out.println("");
    
    L.clear();
    printList(L);
    System.out.println("");
    
    L.insert(new Node(1),0);
    L.insert(new Node(2),1);
    L.insert(new Node(3),2);
    L.remove(2);
    
    //System.out.println("Inserted [3,2,1]. remove(0). Output:");
    printList(L);
  }
  
  public static void testGet(){
      LinkedListImpl L = new LinkedListImpl();
      L.insert(new Node(4), 0);
      L.insert(new Node (5) , 1);
      printList(L);
      System.out.println(L.get(1));
  }
  
  public static void test3() {
	  LinkedListImpl L = new LinkedListImpl();
	  L.insert(new Node(45.0),0);
	  System.out.println(L.size());
  }
  
  //Iterator for linkedList
  public static void printList(LinkedListImpl L){ 
    Node curr=L.root;
    //-1 b/c the 0th node in list is the one after root. Root is just the entry point!
    for(int i=-1; i<L.size(); i++) {
      System.out.print(curr.data+" --> ");
      curr=curr.next;
    }
    System.out.println();
  }
}