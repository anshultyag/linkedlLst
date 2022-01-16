package com.company;

public class MyLinkList {
    public INode head;
    public INode tail;

    public MyLinkList(){
        this.head = null;
        this.tail = null;
    }
    public void add(INode myNode){
         this.head = myNode;
         this.tail = myNode;
         }
    {
        if(this.head == null){
            this.head = mynode;
        }else{
            Node tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
            public void printMyNodes(){
                StringBuffer myNodes = new StringBuffer("MyNodes");
                INode tempNode = head;
                while (tempNode.getNext() != null){
                    myNodes.append(tempNode.getKey());
                    if(!tempNode.equals(tail)) myNodes.append("->");
                    tempNode = tempNode.getNext();
                }
                myNodes.append(tempNode.getKey());
                System.out.println(myNodes);
            }
        }
    }
}
