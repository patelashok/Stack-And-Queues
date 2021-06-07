package com.stack;

import org.junit.Assert;
import org.junit.Test;


public class QueueOperationTest {
    @Test
    public void given3Numbers_WhenAddedToQueue_ShouldHaveLastAdded() {
        QueueOperation<Integer> myQueue = new QueueOperation<>();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);

        INode<Integer> MyNode = myQueue.peak();
        myQueue.printQueue();
        Assert.assertEquals(myFirstNode,MyNode);



    }
}