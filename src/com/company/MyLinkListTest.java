package com.company;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkListTest {

        @Test
        public void given3numberWhenLinkedShouldBeAddedToTop() {
            MyNode<Integer> myThirdNode = new MyNode<>(70);
            MyNode<Integer> mySecondNode = new MyNode<>(30);
            MyNode<Integer> myFirstNode = new MyNode<>(56);
            MyLinkList myLinkList = new MyLinkList();
            myLinkList.add(myFirstNode);
            myLinkList.add(mySecondNode);
            myLinkList.add(myThirdNode);
            myLinkList.printMyNodes();
            boolean result = myLinkList.head.equals(myThirdNode) &&
                             myLinkList.head.getNext().equals(mySecondNode)&&
                             myLinkList.tail.equals(myFirstNode);
            Assert.assertTrue(result);
        }
    }
