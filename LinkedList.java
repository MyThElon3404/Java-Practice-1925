class Practice {
  Node head;
  private int size;
  Practice() {
    size = 0;
  }
  class Node {
    String data;  Node next;
    Node(String data) {
      this.data = data;
      this.next = null;
      size++;
    }
  }
  
  //  add element to first position
  public void addFirst(String data) {
    Node newNode = new Node(data);
    if(head == null) {
      head = newNode;
      return;
    } else {
      newNode.next = head;
      head = newNode;
    }
  }
  
  //  add element to last position
  public void addLast(String data) {
    Node newNode = new Node(data);
    if(head == null) {
      head = newNode;
      return;
    }
    Node lastNode = head;
    while(lastNode.next != null) {
      lastNode = lastNode.next;
    }
    lastNode.next = newNode;
  }
  
  //  add element at middle of LL
  public void addAtMiddle(int index, String data) {
    if(index > size || index < 0) {
      System.out.print("Please enter right index otherwise of BSDKMCBLMJTSMCT");
      return;
    }

    Node newNode = new Node(data);
    if(head == null || index == 0) {
      newNode.next = head;
      head = newNode;
      return;
    }
    
    Node currNode = head;
    for(int i=1; i<size; i++) {
      if(i == index) {
        Node nextNode = currNode.next;
        currNode.next = newNode;
        newNode.next = nextNode;
        break;
      }
      currNode = currNode.next;
    }
  }
  
  //  remove element from first
  public void removeFirst() {
    if(head == null) {
      System.out.print("List is Empty!!");
      return;
    }
    head = head.next;
    size--;
  }
  
  //  remove element from last
  public void removeLast() {
    if(head == null) {
      System.out.print("List is Empty!!");
      return;
    }
    size--;
    if(head.next == null) {
      head = null;
      return;
    }
    Node currNode = head;
    Node lastNode = head.next;
    while(lastNode.next != null) {
      currNode = currNode.next;
      lastNode = lastNode.next;
    }
    currNode.next = null;
  }
  
  //  Print all linked list
  public void printLL() {
    Node printNode = head;
    while(printNode != null) {
      System.out.print(printNode.data + "->");
      printNode = printNode.next;
    }
    System.out.print("0");
  }
  
  //  to get actual size of LL
  public int getSize() {
    return size;
  }
  public static void main(String[] agrs) {
    Practice list = new Practice();
    list.addFirst("a"); list.addFirst("is");  list.addFirst("Manaa");
    list.printLL();
    System.out.println();
    
    list.addLast("Good"); list.addLast("in");  list.addLast("Java");
    list.printLL();
    System.out.println();
    
    list.removeFirst();
    list.printLL();
    System.out.println();
    
    list.removeLast();
    list.printLL();
    System.out.println();
    
    System.out.println("Total size of LL is -> " + list.getSize());
    
    list.addAtMiddle(2, "very");
    list.printLL();
    System.out.println();
  }
}
