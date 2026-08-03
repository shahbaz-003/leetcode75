class Solution {
    public ListNode oddEvenList(ListNode head) {

        // If the list is empty or has only one node
        if (head == null || head.next == null) {
            return head;
        }

        // odd points to the first node
        ListNode odd = head;

        // even points to the second node
        ListNode even = head.next;

        // Save the head of the even list
        ListNode evenHead = even;

        // Rearrange the links
        while (even != null && even.next != null) {

            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        // Connect odd list with even list
        odd.next = evenHead;

        return head;
    }
}