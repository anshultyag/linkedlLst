package com.company;

import org.w3c.dom.Node;

public class MyLinkList {
    public INode head;
    public INode tail;

    public MyLinkList(){
        this.head = null;
        this.tail = null;
    }
    public void append(INode myNode){
         this.head = null;
         this.tail = myNode;
         }

    {
        if (this.tail == null) {
            this.tail = mynode;
        } else {
            this.tail.setNext(myNode);
            this.tail = myNode;
        }
    }
    public void Insert(INode myNode,INode newNode){
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }
    
    public INode popLast(){
        INode tempNode = head;
        while (!tempNode.getNext().equals(tail)){
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode = tempNode.getNext();
        return tempNode;
    }
}
