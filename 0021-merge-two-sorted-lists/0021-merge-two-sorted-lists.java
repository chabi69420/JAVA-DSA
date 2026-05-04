class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Step 1: Dummy node
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        // Step 2: Traverse both lists
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;   // attach list1 node
                list1 = list1.next;  // move list1
            } else {
                tail.next = list2;   // attach list2 node
                list2 = list2.next;  // move list2
            }
            tail = tail.next;        // move tail
        }

        // Step 3: Attach remaining
        if (list1 != null) {
            tail.next = list1;
        } else {
            tail.next = list2;
        }

        // Step 4: Return merged list
        return dummy.next;
    }
}