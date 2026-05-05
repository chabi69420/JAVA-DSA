class Solution {
    public ListNode swapPairs(ListNode head) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;

        while (temp.next != null && temp.next.next != null) {
            
            ListNode first = temp.next;
            ListNode second = temp.next.next;

            // swap
            first.next = second.next;
            second.next = first;
            temp.next = second;

            // move forward
            temp = first;
        }

        return dummy.next;
    }
}