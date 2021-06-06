package com.stack;
import org.junit.Assert;
import org.junit.Test;

//Using linked list to do the stack operations
public class StackOperationTest {
    @Test
    public void given3Numbers_whenAddedToStack_ShouldHaveLastAddedNode() {
        StackOperation<Integer> myStack = new StackOperation<>();
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        INode<Integer> peak = myStack.peak();
        myStack.printStack();
        Assert.assertEquals(myThirdNode, peak);
    }
}
