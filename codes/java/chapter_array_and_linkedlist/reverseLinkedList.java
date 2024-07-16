package chapter_array_and_linkedlist;


import utils.ListNode;

import java.util.List;

//class ListNode {
//    int val;
//    ListNode next;
//
//    ListNode() {
//    }
//
//    ListNode(int val) {
//        this.val = val;
//    }
//
//    ListNode(int val, ListNode next) {
//        this.val = val;
//        this.next = next;
//    }
//}
public class reverseLinkedList {


    public ListNode reverseLinkedList(ListNode head){

        //当前结点
        ListNode cur = head ;
        //前一个节点
        ListNode pre = null;
        while (cur != null){
            //暂存当前节点的下一个节点
            ListNode temp =cur.next;
            //next指针指向前一个节点  即反转链表
            cur.next = pre;
            //移动指向前一个结点的指针
            pre =cur;
            //移动指向当前节点的指针
            cur = temp;
        }
        return pre;
    }



}
