package myCodes.chapter_array_and_linkedlist;


/**
 * 自制简易列表
 */
public class MyList {

    private int[] arr;//存放元素的数组
    private int size=0;//列表元素个数
    private int capacity=10;//列表的初始容量

    private int resizeMultiple =2 ;//扩容的倍数



    //构造函数
    public MyList(){
        arr=new int[capacity];
    }


    //返回当前列表的容量
    public int getCapacity(){
        return this.capacity;
    }

    //返回当前列表的长度
    public int getLength(){
        return this.size;
    }

    //获取指定下标的元素
    public int get(int index){
        if (index <0 || index >= this.getCapacity()){
            return -1;
        }
        return arr[index];
    }

    //删除元素
    public void remove(int index){
        //如果删除的是尾部
        if(index == capacity-1){
            arr[index]=0;
            size --;
            return;
        }
        //从被删除的元素开始  将后一位元素覆盖前一位元素
        for (int i = index; i <size; i++) {
            arr[i]=arr[i+1];
        }
        size--;
    }

    //在尾部添加元素
    public void add(int val){
        //添加元素之前判断列表容量是否充足
        if(size+1 >capacity){
            //容量不足 需要扩容
            resize();
            add(val);
        }
        //容量充足  直接添加即可
        arr[size]=val;
        size++;
    }



    //在随机位置插入元素
    public void add(int index,int val){
        //添加元素之前判断列表容量是否充足
        if(size+1 >capacity){
            //容量不足 需要扩容
            resize();
            add(index,val);
        }
        for (int i = size ; i >index ; i--) {
            arr[i] =arr[i-1];
        }
        arr[index]=val;
        size++;
    }


    //扩容
    public void resize(){

        capacity*=resizeMultiple;
        int[] newArr = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            newArr[i]=arr[i];
        }
        this.arr=newArr;
    }


    public void printList(){
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        MyList myList = new MyList();

        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(8);
        myList.add(9);
        myList.add(10);
        myList.add(4111);
        myList.add(54444);
        myList.add(69999);
        myList.add(777777);
        System.out.println("------------------");
        myList.printList();
        System.out.println("------------------");
        System.out.println(myList.getCapacity());
        System.out.println("------------------");
        myList.remove(2);
        myList.printList();
        System.out.println("------------------");
        myList.add(3,10086);
        myList.printList();
        System.out.println("------------------");
    }

}
