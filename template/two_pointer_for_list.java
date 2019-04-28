/**
 * Definition for singly-linked list.
 * public class ListNode {
 *      int val;
 *      ListNode next;
 *      ListNode(int x) { val = x; }
 * }
 **/
public ListNode findMiddlePoint(ListNode head) {
  ListNode fast = head;
  ListNode slow = head;
  while (fast != null && fast.next != null) {
    fast = fast.next.next;
    slow = slow.next;
  }
  // odd nodes: let right half shorter
  if (fast != null) {
    slow = slow.next;
  }

  return slow;
}
