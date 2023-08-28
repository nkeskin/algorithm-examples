package linkedlists;

public class AddTwoNumbers {


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

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode head = null;
    ListNode tail = null;
    int carry = 0;
    while (l1 != null && l2 != null) {
      int temp = l1.val + l2.val + carry;
      carry = temp / 10;
      ListNode node = new ListNode(temp%10);
      if(head == null) {
        head = node;
      } else {
        tail.next = node;
      }
      tail = node;
      l1 = l1.next;
      l2 = l2.next;
    }
    if (l1 == null) {
      while (l2 != null) {
        int temp = l2.val + carry;
        carry = temp / 10;
        ListNode node = new ListNode(temp%10);
        if(head == null) {
          head = node;
        } else {
          tail.next = node;
        }
        tail = node;
        l2 = l2.next;
      }
    } else {
      while (l1 != null) {
        int temp = l1.val + carry;
        carry = temp / 10;
        ListNode node = new ListNode(temp%10);
        if(head == null) {
          head = node;
        } else {
          tail.next = node;
        }
        tail = node;
        l1 = l1.next;
      }
    }
    if(carry == 1) {
      tail.next = new ListNode(carry);
    }
    return head;
  }


}