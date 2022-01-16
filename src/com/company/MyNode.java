package com.company;
public class MyNode<K> implements INode<K>  {
    private K key;
    private INode next;
    public MyNode(K key) {
        this.key = key;
        this.next = null;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K Key) {
      this.key = key;
    }

    public INode<K> getNext() {
        return next;
    }

    @Override
    public void setNext(INode next) {
       this.next = (MyNode<K>) next;
    }
}