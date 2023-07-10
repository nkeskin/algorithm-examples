package main;

public class OddEven {


  public static class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  public ListNode oddEvenList(ListNode head) {
    if (head == null) {
      return null;
    }
    if (head.next == null) {
      printNodes(head);
      return head;
    }
    if (head.next.next == null) {
      printNodes(head);
      return head;
    }

    boolean even = false;
    ListNode headTemp2 = head;
    int index = 0;
    while (headTemp2 != null) {
      headTemp2 = headTemp2.next;
      index++;
    }

    if(index % 2 == 0) {
      even = true;
    }

    ListNode firstNode = head;
    ListNode secondNode = head.next;
    ListNode tempNode = secondNode;
    while (firstNode.next != null && secondNode.next != null) {
      ListNode temp1 = firstNode.next.next;
      ListNode temp2 = secondNode.next.next;
      firstNode.next = temp1;
      secondNode.next = temp2;
      printNodes(head);
      firstNode = temp1;
      secondNode = temp2;
      printNodes(head);
    }

    ListNode headTemp = head;

    while (headTemp.next.next != null) {
      headTemp = headTemp.next;
    }

    if (even) {
      headTemp.next = tempNode;

    } else {
      headTemp.next.next = tempNode;
    }

    printNodes(head);

    return head;
  }

  private void printNodes(ListNode node) {
    while (node != null) {
      System.out.println(node.val);
      node = node.next;
    }
    System.out.println("==============");
  }

}