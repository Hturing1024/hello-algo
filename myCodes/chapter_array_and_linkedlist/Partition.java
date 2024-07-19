package myCodes.chapter_array_and_linkedlist;

public class Partition {

    public ListNode partition(ListNode head, int x) {

        ListNode smallDum =new ListNode(0);
        ListNode bigDum =new ListNode(0);

        ListNode sml=smallDum,big =bigDum;
        while (head !=null){
            if(head.val < x){
                sml.next=head;
                sml=sml.next;
            }
            else {
                big.next=head;
                big=big.next;
            }
            head =head.next;
        }
        //拼接两个链表
        sml.next=bigDum.next;
        big.next=null;
        return sml;
    }
}
