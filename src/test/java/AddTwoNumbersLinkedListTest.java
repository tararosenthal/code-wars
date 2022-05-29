import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddTwoNumbersLinkedListTest {
    @Test
    public void testAnswer() {
        ListNode a = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode b = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode c = new ListNode(7, new ListNode(0, new ListNode(8)));
        int x = 708;

        ListNode result = AddTwoNumbersLinkedList.addTwoNumbers(a, b);

        while(c != null && result != null) {
            assertEquals(c.val, result.val);
            c = c.next;
            result = result.next;
        }
    }
}
