
public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        ListNode newNode = new ListNode(val);
        
        // If the position is 0, insert at the head
        if (position == 0) {
            newNode.next = head;
            return newNode; // New node becomes the new head
        }
        
        // Traverse the list to find the correct position
        ListNode current = head;
        int currentPosition = 0;
        
        while (current != null && currentPosition < position - 1) {
            current = current.next;
            currentPosition++;
        }
        
        // Insert at the end if current is null or position is out of bounds
        if (current == null) {
            return appendToEnd(head, newNode);
        }
        
        // Insert the new node at the correct position
        newNode.next = current.next; // Link to the next node
        current.next = newNode; // Link the current node to the new node
        
        return head; // Return the unchanged head of the list
    }
    
    private static ListNode appendToEnd(ListNode head, ListNode newNode) {
        if (head == null) {
            return newNode; // If the list is empty, return the new node as the head
        }
        
        ListNode current = head;
        while (current.next != null) {
            current = current.next; // Traverse to the end of the list
        }
        
        current.next = newNode; // Append the new node at the end
        return head; // Return the head of the list
    }
}

