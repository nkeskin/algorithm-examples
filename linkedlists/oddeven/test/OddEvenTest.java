import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OddEvenTest {

  OddEven oddEven;

  @BeforeEach
  void setUp() {
    oddEven = new OddEven();
  }

  @Test
  void case1() {
    OddEven.ListNode node = new OddEven.ListNode(1);
    node.next = new OddEven.ListNode(2);
    node.next.next = new OddEven.ListNode(3);
    node.next.next.next = new OddEven.ListNode(4);
    node.next.next.next.next = new OddEven.ListNode(5);
    node.next.next.next.next.next = new OddEven.ListNode(6);
    node.next.next.next.next.next.next = new OddEven.ListNode(7);
    node.next.next.next.next.next.next.next = new OddEven.ListNode(8);
    node.next.next.next.next.next.next.next.next = new OddEven.ListNode(9);
    node.next.next.next.next.next.next.next.next.next = new OddEven.ListNode(10);
    System.out.println(oddEven.oddEvenList(node));
  }

}