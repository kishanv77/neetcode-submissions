class Solution {
public ListNode reverseList(ListNode head) {
    ListNode pre = null;
    ListNode temp = head;

    while (temp != null) {
        ListNode next = temp.next;
        temp.next = pre;
        pre = temp;
        temp = next;
    }

    return pre;
}
}