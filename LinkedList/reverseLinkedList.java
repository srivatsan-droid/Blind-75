class ListNode {
	int val;
	ListNode next;
	public ListNode() {

	}
	public ListNode(int val) {
		this.val = val;
	}
	public ListNode(int val,ListNode next) {
		this.val = val;
		this.next = next;
	}
}
public class reverseLinkedList {
	public static ListNode reverseList(ListNode head) {
		ListNode curr = head,prev = null,next;
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
	public static void main(String[] args) {
		// Create nodes
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        // Link nodes
        node1.next = node2;
        node2.next = node3;

        // Head of the list
        ListNode head = node1;
        ListNode ans = reverseList(head);
        System.out.println(ans);
	}
}