package duplicatex2;

public class ListNode {
	int val;
	ListNode next;
	ListNode prev;

	ListNode() {
	}

	public ListNode(int val) {
		this.val = val;
		this.next = null;
		this.prev = null;
	}

	ListNode(int val, ListNode next, ListNode prev) {
		this.val = val;
		this.next = next;
		this.prev = prev;
	}
}
