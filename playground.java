public class playground{
  public static void main(String[] args) {
    // System.out.println("Hello, Language Java!");
    ListNode root = ListNode.makeList();
    root.print();
  }
}

class ListNode {
  public int data;
  public ListNode next;

  public ListNode(int data) {
    this.data = data;
  }

  public static ListNode makeList() {
    ListNode root = null, parent = null;
    for(int i = 0; i < 5; i++){
      ListNode node = new ListNode(i + 1);
      if(i == 0 ) {
        root = node;
        parent = root;
      } else {
        parent.next = node;
        parent = parent.next;
      }
    }
    return root;
  }

  public void print() {
    ListNode root, parent;
    root = this;
    parent = root;

    while (parent.next != null) {
      System.out.println(parent.data);
      parent = parent.next;
    }
    System.out.println(parent.data);
  }
}