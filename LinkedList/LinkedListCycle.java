public class LinkedListCycle {
	public static boolean hasCycle(ListNode head) {

    ListNode slow = head;
    ListNode fast = head;

    while(fast != null && fast.next != null) {

        slow = slow.next;
        fast = fast.next.next;

        if(slow == fast) {
            return true;
        }
    }

    return false;
}
	public static void main(String[] args) {
		ListNode head = new ListNode(3);
		head.next = new ListNode(2);
		head.next.next = new ListNode(0);
		head.next.next.next = new ListNode(-1);
		boolean ans = hasCycle(head);
		System.out.println(ans);
	}
}