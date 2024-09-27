/public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        // If l1 is null, simply return a copy of l2
        if (l1 == null) {
            return copyList(l2);
        }
        
        // Traverse to the end of l1
        ListNode current = l1;
        while (current.next != null) {
            current = current.next;
        }
        
        // Create new nodes for l2 and append them to l1
        current.next = copyList(l2);
        
        return l1; // Return the modified l1
    }
    
    private static ListNode copyList(ListNode l2) {
        if (l2 == null) {
            return null;
        }
        
        ListNode dummy = new ListNode(0); // Dummy node to help with the creation of the new list
        ListNode currentNew = dummy;
        
        // Traverse through l2 and create new nodes
        while (l2 != null) {
            currentNew.next = new ListNode(l2.val); // Create a new node with the value of l2
            currentNew = currentNew.next; // Move to the new node
            l2 = l2.next; // Move to the next node in l2
        }
        
        return dummy.next; // Return the new list, skipping the dummy node
    }
}
