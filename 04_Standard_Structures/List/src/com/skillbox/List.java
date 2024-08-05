package com.skillbox;

public class List {
    public class Node {
        int x;
        Node next;
        public Node(int x) {
            this.x = x;
            this.next = null;
        }
    }

    // Pointer to the beginning of the list
    Node begin;

    // Adds element to the beginning of the list
    public void push_front(int x) {
        Node node = new Node(x);
        node.next = this.begin;
        this.begin = node;
        /* TODO IMPLEMENT THIS */
    }

    public List() {
        begin = null;
    }

    // This function could be useful for debugging and testing.
    public void print() {
        Node n = this.begin;
        while (n != null) {
            System.out.print(n.x + " ");
            n = n.next;
        }
        System.out.println();
    }

    // This function should return copy of the list where every second element is removed. Initial list should not be changed.
    // E.g. if we run copyEverySecond on list [1, 2, 3, 4, 5, 6, 7, 100, 120, 162, 0, 1] new list with values [1, 3, 5, 7, 120, 0] should be returned.
    public List copyEverySecond() {
        List list = new List();
        Node start = this.begin;
        int index = 0;
        if (this.begin.next != null) {
            while (this.begin.next != null) {
                if (index % 2 == 0) {
                    Node node = new Node(this.begin.x);
                    node.next = list.begin;
                    list.begin = node;
                }
                this.begin = this.begin.next;
                index++;
            }
            if(index % 2 == 0){
                Node node = new Node(this.begin.x);
                node.next = list.begin;
                list.begin = node;
            }
            this.begin = start;
        } else list.begin = this.begin;

        return revertList(list, start);
    }
    private List revertList(List list, Node start){
        List result = new List();
        Node listStart = list.begin;
        if (list.begin == null) return result;
        while(list.begin.next != null){
            Node node = new Node(list.begin.x);
            node.next = result.begin;
            result.begin = node;
            list.begin = list.begin.next;
        }
        Node node = new Node(list.begin.x);
        node.next = result.begin;
        result.begin = node;
        this.begin = start;
        return result;
    }

    // Returns number of elements in list
    public int getSize() {
        if (this.begin == null) return 0;
        int count = 1;
        Node start = this.begin;
        while(begin.next != null) {
            begin = begin.next;
            count++;
        }
        begin = start;
        /* TODO IMPLEMENT THIS */
        return count;
    }

    // This function converts our list to an array. New array is created with values the same as in list.
    public int[] toArray() {
        int[] arr = new int[getSize()];
        Node start = begin;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = begin.x;
            begin = begin.next;
        }
        return arr;
    }

    // This function removes elements x.next from the list
    // O(1) time is expected
    public void removeAfter(Node x) {
        /* TODO IMPLEMENT THIS */
    }

    // This function inserts new element with value val right after the element x.
    // O(1) time is expected
    public void insertAfter(Node x, int val) {
        Node newNode = new Node(val);
        newNode.next = x.next;
        x.next = newNode;
    }

    // This function removes all elements from the list that are divisible by x.
    // E.g. list {1, 2, 3, 4, 4, 10, 7}  after filterDivisible(2) would look like {1, 3, 7}.
    // O(N) time is expected.
    public void filterDivisible(int x) {
        Node start = this.begin;
        List divisible = new List();
        if (this.begin.next != null) {
            while (this.begin.next != null) {
                if (this.begin.x % x != 0) {
                    Node node = new Node(this.begin.x);
                    node.next = divisible.begin;
                    divisible.begin = node;
                }
                this.begin = this.begin.next;
            }
            if( this.begin.x % x != 0){
                Node node = new Node(this.begin.x);
                node.next = divisible.begin;
                divisible.begin = node;
            }
        } else divisible.begin = this.begin;
        this.begin = revertList(divisible, start).begin;
    }

    // This function returns Node from the list by index. O(N) time is expected.
    public Node getAt(int index) {
        if (index == 0) return this.begin;
        Node start = this.begin;
        int count = 1;
        while(this.begin.next != null){
            if (count == index) return this.begin.next;
            this.begin = this.begin.next;
            count++;
        }

        this.begin = start;
        return null;
    }

    // This function creates List from an array
    public static List fromArray(int[] a) {
        List l = new List();
        for (int i = a.length - 1; i >= 0; --i) {
            l.push_front(a[i]);
        }
        return l;
    }
}