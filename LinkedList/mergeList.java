public class mergeList {
	public static ListNode mergeListSol(ListNode list1,ListNode list2) {
	ListNode dummy = new ListNode(0);
    ListNode curr = dummy;  // Track the TAIL of merged list
    
    while(list1 != null && list2 != null) {
        if(list1.val <= list2.val) {
            curr.next = list1;      // LINK the node
            list1 = list1.next;     // ADVANCE list1
        } else {
            curr.next = list2;      // LINK the node
            list2 = list2.next;     // ADVANCE list2
        }
        curr = curr.next;           // ADVANCE the tail pointer
    }
    
    // Attach remaining nodes
    if(list1 != null) curr.next = list1;
    if(list2 != null) curr.next = list2;
    
    return dummy.next; 
	}
	public static void printList(ListNode head) {
		ListNode curr = head;
		while(curr != null) {
			System.out.println(curr.val + "--->");
			curr = curr.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(4);

		//ListNode 2
		ListNode head1 = new ListNode(1);
		head1.next = new ListNode(3);
		head1.next.next = new ListNode(4);

		printList(head);
		printList(head1);
		mergeListSol(head,head1);
		printList(head);
	}
}