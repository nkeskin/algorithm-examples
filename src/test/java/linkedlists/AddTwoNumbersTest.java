package linkedlists;

import linkedlists.AddTwoNumbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {

    AddTwoNumbers addTwoNumbers;

    @BeforeEach
    void setUp() {
        addTwoNumbers = new AddTwoNumbers();
    }

    @Test
    void case1() {
        AddTwoNumbers.ListNode listNode1 = new AddTwoNumbers.ListNode();
        listNode1.val = 2;
        listNode1.next = new AddTwoNumbers.ListNode();
        listNode1.next.val = 4;
        listNode1.next.next = new AddTwoNumbers.ListNode();
        listNode1.next.next.val = 3;
        AddTwoNumbers.ListNode listNode2 = new AddTwoNumbers.ListNode();
        listNode2.val = 5;
        listNode2.next = new AddTwoNumbers.ListNode();
        listNode2.next.val = 6;
        listNode2.next.next = new AddTwoNumbers.ListNode();
        listNode2.next.next.val = 4;
        AddTwoNumbers.ListNode result = addTwoNumbers.addTwoNumbers(listNode1, listNode2);

        StringBuilder stringBuilder = new StringBuilder();
        while (result != null) {
            stringBuilder.append(result.val);
            result = result.next;
        }

        Assertions.assertEquals("708", stringBuilder.toString());
    }

    @Test
    void case2() {
        AddTwoNumbers.ListNode listNode1 = new AddTwoNumbers.ListNode();
        listNode1.val = 9;
        listNode1.next = new AddTwoNumbers.ListNode();
        listNode1.next.val = 9;
        listNode1.next.next = new AddTwoNumbers.ListNode();
        listNode1.next.next.val = 9;
        listNode1.next.next.next = new AddTwoNumbers.ListNode();
        listNode1.next.next.next.val = 9;
        listNode1.next.next.next.next = new AddTwoNumbers.ListNode();
        listNode1.next.next.next.next.val = 9;
        listNode1.next.next.next.next.next = new AddTwoNumbers.ListNode();
        listNode1.next.next.next.next.next.val = 9;
        listNode1.next.next.next.next.next.next = new AddTwoNumbers.ListNode();
        listNode1.next.next.next.next.next.next.val = 9;
        AddTwoNumbers.ListNode listNode2 = new AddTwoNumbers.ListNode();
        listNode2.val = 9;
        listNode2.next = new AddTwoNumbers.ListNode();
        listNode2.next.val = 9;
        listNode2.next.next = new AddTwoNumbers.ListNode();
        listNode2.next.next.val = 9;
        listNode2.next.next.next = new AddTwoNumbers.ListNode();
        listNode2.next.next.next.val = 9;
        AddTwoNumbers.ListNode result = addTwoNumbers.addTwoNumbers(listNode1, listNode2);

        StringBuilder stringBuilder = new StringBuilder();
        while (result != null) {
            stringBuilder.append(result.val);
            result = result.next;
        }

        Assertions.assertEquals("89990001", stringBuilder.toString());

    }

}