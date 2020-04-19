public class MergeTwoSortedLists {

  public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        if (l1.val > l2.val) {
            head = l2;
            l2 = l2.next;
        } else {
            head = l1;
            l1 = l1.next;
        }
        ListNode point = head;

        while(l1 != null || l2 != null) {
            if (l1 == null) {
                point.next = l2;
                break;
            } else if (l2 == null) {
                point.next = l1;
                break;
            } else {
                if (l1.val > l2.val) {
                    point.next = l2;
                    l2 = l2.next;
                    point = point.next;
                } else {
                    point.next = l1;
                    l1 = l1.next;
                    point = point.next;
                }
            }
        }
        return head;
    }
}
