package myCodes.chapter_array_and_linkedlist;

public class deleteNode {

    /**
     * 删除链表中的结点(脑筋急转弯)
     * @param node
     */
    public void deleteNode(ListNode node) {

        node.val =node.next.val;
        node.next=node.next.next;
    }
}
