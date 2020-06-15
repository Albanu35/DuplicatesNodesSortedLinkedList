package duplicatex2;

public class RemoveDuplicate {

	ListNode head, tail = null;

	// add node to the list
	public void addNode(int val) {
		// Create a new node
		ListNode newNode = new ListNode(val);

		// condition if list is empty
		if (head == null) {
			head = newNode;
			tail = newNode;

			head.prev = null; // preview of head point to null
			tail.next = null; // next node tail point to null, as it is last node of the list
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			tail.next = null;
		}
	}

	public void removeDuplicates() {
		ListNode crtNode, index, temp;

		// check if list is empty
		if (head == null) {
			return;
		} else {
			// initial, crtNode will point to head point
			for (crtNode = head; crtNode != null; crtNode = crtNode.next) {
				for (index = crtNode.next; index != null; index = index.next) {
					if (crtNode.val == index.val) {
						// Store the duplicate node in temp
						temp = index;
						index.prev.next = index.next; // remove duplicate val of node
						if (index.next != null) {
							index.next.prev = index.prev;
							temp = null; // delete the duplicate node
						}
					}
				}
			}
		}
	}
	
	// method remove all node duplicates
	public void removeAllDuplicate() {
		ListNode crtNode, index, temp;

		// check if list is empty
		if (head == null) {
			return;
		} else {
			// initial, crtNode will point to head point
			for (crtNode = head; crtNode != null; crtNode = crtNode.next) {
				for (index = crtNode.next; index != null; index = index.next) {
					if (crtNode.val == index.val) {
						//temp = index;
						crtNode.prev = index.next.next; // remove duplicate val of node
						if (index.next != null) {
							index.next = crtNode.prev;
							//temp = null; // delete the duplicate node
						}
						
					}
				}
			}
		}
	}

	// display each node of list
	public void printList() {
		// current node will point to head
		ListNode crtNode = head;

		// check if list is empty
		if (head == null) {
			System.out.println("Doubly linked list is empty!");
			return;
		}

		// display each node by incrementing the pointer
		while (crtNode != null) {
			System.out.print(crtNode.val + " ");
			crtNode = crtNode.next;
		}
		System.out.println();
	}
}
