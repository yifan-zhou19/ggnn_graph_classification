class Solution {
  private static class Node {
    int val;
    Node next;
    Node prev;
    Node child;

    public Node(int val) {
      this.val = val;
    }
  }
  
  private static void flatten(Node pr, Node c) {
    if (c.child != null) {
      flatten(c, c.child);
    }
    
    if (c.child == null && pr != null) {
      Node n = c.next;
      if (n != null) {
        while(n != null) {
          if (n.child != null) {
            flatten(n, n.child);
          }
          n = n.next;
        }
      }
      
      Node prN = pr.next;
      pr.child = null;
      pr.next = c;
      Node lc = last(c);
      if (prN != null) {
        prN.prev = lc;  
      }
      lc.next = prN;
    }
    
    if (c.next != null) {
      flatten(null, c.next);
      c = c.next;
    }
  }
  
  private static Node last(Node c) {
    if (c.next == null) return c;
    return last(c.next);
  }
  
  private static void flatten(Node n) {
    flatten(null, n);
  }
  
  private static void printOut(Node n) {
    while(n != null) {
      System.out.print(" " + n.val);
      n = n.next;
    }
    System.out.println();
  }
  
  public static void main(String[] args) {
    Node l1_1 = new Node(5);
    Node l1_2 = new Node(33);
    Node l1_3 = new Node(17);
    Node l1_4 = new Node(2);
    Node l1_5 = new Node(1);
    l1_1.next = l1_2;
    l1_2.next = l1_3;
    l1_3.next = l1_4;
    l1_4.next = l1_5;
    l1_5.prev = l1_4;
    l1_4.prev = l1_3;
    l1_3.prev = l1_2;
    l1_2.prev = l1_1;
    
    Node l2_1 = new Node(6);
    Node l2_2 = new Node(25);
    Node l2_3 = new Node(6);
    l2_1.next = l2_2;
    l2_2.next = l2_3;
    l2_3.prev = l2_2;
    l2_2.prev = l2_1;
    Node l2_4 = new Node(2);
    Node l2_5 = new Node(7);
    l2_4.next = l2_5;
    l2_5.prev = l2_4;
    l1_1.child = l2_1;
    l1_4.child = l2_4;
    
    Node l3_1 = new Node(8);
    Node l3_2 = new Node(9);
    Node l3_3 = new Node(12);
    Node l3_4 = new Node(5);
    l3_3.next = l3_4;
    l3_4.prev = l3_3;
    l2_2.child = l3_1;
    l2_3.child = l3_2;
    l2_4.child = l3_3;
    
    Node l4_1 = new Node(7);
    Node l4_2 = new Node(21);
    Node l4_3 = new Node(3);
    l4_2.next = l4_3;
    l4_3.prev = l4_2;
    l3_2.child = l4_1;
    l3_3.child = l4_2;
    
    printOut(l1_1);
    flatten(l1_1);
    printOut(l1_1);
  }
}
