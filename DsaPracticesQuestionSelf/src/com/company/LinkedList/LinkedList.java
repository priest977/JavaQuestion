package com.company.LinkedList;

public class LinkedList {
    Node head;
    Node tail;
    int size;
    public LinkedList(int size){
        this.size = 0;
    }
    class Node{
        int data;
        Node next;
        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data,null);
        if(this.head == null){
            this.head = this.tail = newNode;
        }
        else
        {
            newNode.next = this.head;
            this.head = newNode;
        }
        this.size++;
    }

    public Node removeFirst() {
        if (this.size == 0) {
            System.out.println("Invalid Operation");
            return null;
        }
        else
        {
            Node node = this.head;
            this.head = this.head.next;
            node.next = null;
            this.size--;
            return node;
        }
    }
    public void addLast(int data){
        Node newNode = new Node(data,null);
        if(this.tail == null){
            this.tail = this.head = newNode;
        }
        else
        {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.size++;
    }

    public Node getAtIndexValue(int idx){
        if(idx < 0 || idx>=this.size){
            System.out.println("Invalid Input");
            return null;
        }
        Node n = this.head;
        int i = 0;
        while (i< idx){
            i++;
            n = n.next;
        }
        return n;
    }

    public Node removeLast() {
        if (this.size == 0) {
            System.out.println("Invalid Operation");
            return null;
        } else {
            Node node = getAtIndexValue(this.size - 2);
            Node res = this.tail;
            node.next = null;
            this.tail = node;
            this.size--;
            return res;
        }
    }

    public void addAtAnyIndex(int idx, int data) {
        Node newNode = new Node(data, null);
        if (this.size == 0) {
            this.head = this.tail = newNode;
        }
        if (idx == 0) {
            addFirst(data);
        }
        if (idx == size) {
            addLast(data);
        } else {
            Node prevNode = getAtIndexValue(idx - 1);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
            this.size++;
        }
    }

    public Node removeAnyIndex(int idx) {
        if (idx < 0 || idx >= this.size) {
            System.out.println("Invalid Operation");
            return null;
        }
        else if (idx == 0) {
            return
            removeFirst();
        }
        else if (idx == this.size) {
            return
            removeLast();
        }
        else
        {
            Node prevNode = getAtIndexValue(idx-1);
            Node res = prevNode.next;
            prevNode.next = prevNode.next.next;
            res.next = null;
            this.size--;
            return res;
        }
    }

    public Node getFirstMidNode(){
        if(this.size == 0){
            System.out.println("Invalid Operation");
            return null;
        }
        Node nodeSmall = this.head;
        Node nodeTall = this.head;
        if(nodeSmall.next == null || nodeTall == null){
            return nodeSmall;
        }
        while (nodeTall.next != null && nodeTall.next.next != null){
            nodeSmall = nodeSmall.next;
            nodeTall = nodeTall.next.next;
        }
        return nodeSmall;
    }

    public Node getSecondMidNode(){
        Node nodeSmall = this.head;
        Node nodeTall = this.head;
        if(nodeSmall.next == null || nodeTall.next == null){
            return nodeSmall;
        }
        while (nodeTall != null && nodeTall.next != null){
            nodeSmall = nodeSmall.next;
            nodeTall = nodeTall.next.next;
        }
        return nodeSmall;
    }

    public void reverseLinkedList(){
         int i = 0;
         int j = this.size-1;
         while (i <= j){
             Node iNode = getAtIndexValue(i);
             Node jNode = getAtIndexValue(j);
             int temp = iNode.data;
             iNode.data = jNode.data;
             jNode.data = temp;
             i++;
             j--;
         }
    }

    public void print(){
        Node node = this.head;
        while (node != null){
            System.out.print(node.data + " , ");
            node = node.next;
        }
        System.out.println();
    }
}
