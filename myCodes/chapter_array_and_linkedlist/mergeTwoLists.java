package myCodes.chapter_array_and_linkedlist;



public class mergeTwoLists {

    static ListNode mergeTwoLists(ListNode list1,ListNode list2){

        ListNode l1 =list1,l2=list2;
        ListNode dum =new ListNode(0);
        ListNode cur =dum;

        while (l1.next!=null && l2.next!=null){

            if (l1.val <l2.val){

                cur.next =l1;
                cur=cur.next;
                l1=l1.next;
            }
            cur.next =l2;
            l2=l2.next;
            cur=cur.next;
        }
        if (l1.next == null){
            cur.next =l2;
        }else cur.next =l1;

        return dum.next;
    }
}
