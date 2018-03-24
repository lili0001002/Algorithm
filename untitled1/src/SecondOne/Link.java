package SecondOne;

public class Link {
    public static void quickSort(ListNode begin, ListNode end) {
        if (begin == null || end == null || begin == end)
            return;
        ListNode first = begin;
        ListNode second = begin.next;

        int nMidValue = begin.val;
        while (second != end.next && second != null) {
            if (second.val < nMidValue) {
                first = first.next;
                if (first != second) {
                    int temp = first.val;
                    first.val = second.val;
                    second.val = temp;
                }
            }
            second = second.next;
        }
        if (begin != first) {
            int temp = begin.val;
            begin.val = first.val;
            first.val = temp;
        }
        quickSort(begin, first);
        quickSort(first.next, end);
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(5);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(8);
        ListNode l5 = new ListNode(4);
        ListNode l6 = new ListNode(2);
        ListNode l7 = new ListNode(1);

        head.next = l1;
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        l7.next = null;

        ListNode p = head;
        while (p.next != null) {
            System.out.print(p.val);
            p = p.next;
        }
        System.out.print(p.val);
        System.out.println();

        ListNode begin = head, end = p;
        quickSort(begin, end);

        p = head;
        while (p != null) {
            System.out.print(p.val);
            p = p.next;
        }
}
}
