package myCodes.chapter_array_and_linkedlist;





class ListNode{

    public int val;
    public ListNode next;

    ListNode(int val){
        this.val =val;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

}


public class Linked_List {


    /**
     * 初始化链表
     * @return 链表头节点
     */
    static ListNode initLinkedList(){


        //创建结点
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        //建立连接
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);

        return n1;

    }


    /**
     * 简单实现  在n1和n2中插入一个结点
     * @return
     */
    static ListNode insertListNode(){

        ListNode head = initLinkedList();

        ListNode newNode = new ListNode(999);

        newNode.next=head.next;
        head.next =newNode;

        return head;
    }

    /**
     * 简单实现 删除n2结点
     * @return
     */
    static ListNode deleteNode(){

        ListNode head =initLinkedList();

        head.next = head.next.next;

        return head;
    }

    /**
     * 随机访问链表的结点
     * @param head
     * @param index
     * @return
     */
    static ListNode access(ListNode head , int index){

        for (int i = 0; i < index; i++) {
            if (head == null){
                return null;
            }
            head = head.next;

        }
        return head;
    }


    /**
     * 查找链表中值为target的首个结点的下标
     * @param head
     * @param target
     * @return
     */
    static int find(ListNode head ,int target){

        for (int i = 0; head != null ; i++) {
            if (head.val == target){

                return i;
            }
            head=head.next;
        }
        return -1;
    }



    public static void main(String[] args) {


/*
        System.out.println(initLinkedList().val);


        System.out.println(insertListNode().next.val);

        System.out.println(deleteNode().next.val);
*/


        ListNode node = access(initLinkedList(), 0);

        System.out.println(node.val);

        int res = find(initLinkedList(), 4);
        System.out.println("res="+res);

    }
}
