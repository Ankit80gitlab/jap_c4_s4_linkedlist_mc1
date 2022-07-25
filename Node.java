package com.jap.textanalyzer;

public class Node {
    // declare the Word object and the recursive reference 'next' that the Node of the
    // linked list holds

    Word data;
    private Node next;

    //getter-setter

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Word getData(){
        return data;
    }

    // initialize data value

    public Node(Word data)
    {
        this.data=data;
    }

}
