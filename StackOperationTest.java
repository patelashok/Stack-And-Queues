package com.stack;
import org.junit.Assert;
import org.junit.Test;

//Using linked list to do the stack operations
public class StackOperationTest {


    public void given3Numbers_whenAddedToStack_ShouldHaveLastAddedNode() {
        StackOperation<Integer> myStack = new StackOperation<>();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        INode<Integer> peak = myStack.peak();
        myStack.printStack();
        Assert.assertEquals(myThirdNode, peak);
    }
    @Test
    public void given3Numbers_whenPoppedFromStack_ShouldMatchLastAddedNode() {
        StackOperation<Integer> myStack = new StackOperation<>();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        INode pop1 = myStack.pop();
        myStack.printStack();
        Assert.assertEquals(myThirdNode, pop1);
        INode<Integer> myNode = myStack.peak();
        myStack.printStack();
        Assert.assertEquals(mySecondNode, myNode);
        INode<Integer> popped2 = myStack.pop();
        myStack.printStack();
        Assert.assertEquals(mySecondNode, popped2);
        INode<Integer> popped3 = myStack.pop();
        Assert.assertEquals(myFirstNode, popped3);
    }
}