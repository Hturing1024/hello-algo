package myCodes.chapter_array_and_linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class testList {


    /**
     * 初始化列表 两种方式 有初始值和没初始值
     */
    static void initList(){

        ArrayList<Object> list = new ArrayList<>();

        Integer []arr =new Integer[]{1,23,44,555,2};
        ArrayList<Integer> list2= new ArrayList<>(Arrays.asList(arr));

        System.out.println(list);
        System.out.println(list2.get(2));

        list2.set(2,888888888);

        System.out.println(list2.get(2));
    }


    /**
     * 添加和移除元素
     */
    static void addAndRemove(){

        ArrayList<Object> list = new ArrayList<>();

        list.add(2);
        list.add(3);
        list.add(4);
        list.add(555);
        list.add(222);
        list.add(333);

        System.out.println("初始化后 下标为3的元素="+list.get(3));

        list.remove(3);

        System.out.println("移除后 下标为3的元素="+list.get(3));


        list.add(3,66666);
        System.out.println("插入后 下标为3的元素="+list.get(3));
    }

    /**
     * 遍历列表
     */
    static void bianli(){

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(22);
        list2.add(31);
        list2.add(44);
        list2.add(52255);
        list2.add(221112);
        list2.add(33322);

        int count =0;
        for (int i = 0; i <list2.size() ; i++) {
            count+= list2.get(i);
        }

        System.out.println("count:"+count);

        for (Integer i : list2) {
            System.out.println(i);
        }


    }

    /**
     * 拼接列表
     */
    static void pinjie(){
        ArrayList<Integer> num1 = new ArrayList<>();

        num1.add(2211);
        num1.add(3111);
        num1.add(4422);
        num1.add(52255);
        num1.add(221112);
        num1.add(33322);

        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(1, 23, 44, 555));

        num1.addAll(nums2);
        for (Integer i : num1) {
            System.out.println(i);
        }

    }


    //排序
    static void sortList(){
        ArrayList<Integer> num1 = new ArrayList<>();

        num1.add(2211);
        num1.add(31);
        num1.add(4422222);
        num1.add(5225);
        num1.add(2212);
        num1.add(3);

        Collections.sort(num1);
        for (Integer i : num1) {
            System.out.println(i);
        }
    }


    public static void main(String[] args) {
//    initList();


//        addAndRemove();

//        bianli();

//        pinjie();

        sortList();


    }
}
