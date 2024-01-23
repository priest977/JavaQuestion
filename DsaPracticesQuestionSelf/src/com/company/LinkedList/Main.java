package com.company.LinkedList;

public class Main {
    public static void main(String[] args) {
         LinkedList ll = new LinkedList(0);
//         ll.addLast(1);
//         ll.addLast(2);
//         ll.addLast(3);
//         ll.addLast(4);
//         ll.addLast(5);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(8);
        ll.print();
        ll.reverseLinkedList();
        ll.print();
//        LinkedList.Node node = ll.getFirstMidNode();

//        if(node != null){
//            System.out.println(node.data);
//        }
//        System.out.println(ll.getFirstMidNode().data);
//        System.out.println(ll.getSecondMidNode().data);
//        ll.addAtAnyIndex(2,6);
//        ll.removeAnyIndex(2);
//         ll.removeFirst();
//        ll.removeFirst();
//        ll.removeFirst();
//        ll.print();

//        System.out.println(ll.removeLast().data);
//        System.out.println(ll.removeLast().data);
//        System.out.println(ll.removeLast().data);
//        ll.print();
//        LinkedList.Node node = ll.getAtIndexValue(5);
//        if(node != null){
//            System.out.println(node.data);
//        }

//        System.out.println(ll.head.data);
//        System.out.println(ll.tail.data);
//        System.out.println(ll.size);
    }
}
