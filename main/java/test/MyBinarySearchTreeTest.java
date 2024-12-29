package test;

import org.junit.Assert;
import org.junit.Test;

public class MyBinarySearchTreeTest {
    @Test
    public void ReturnSizeOfBinarySearchTree(){
        MyBinarySearchTree<Integer> myBinarySearchTree = new MyBinarySearchTree<>();
        myBinarySearchTree.add(56);
        myBinarySearchTree.add(30);
        myBinarySearchTree.add(70);
        myBinarySearchTree.add(22);
        myBinarySearchTree.add(40);
        myBinarySearchTree.add(60);
        myBinarySearchTree.add(95);
        myBinarySearchTree.add(11);
        myBinarySearchTree.add(65);
        myBinarySearchTree.add(3);
        myBinarySearchTree.add(16);
        myBinarySearchTree.add(63);
        myBinarySearchTree.add(67);

        int size = myBinarySearchTree.getSize();
        System.out.println("Size Of Our BinarySearchTree is : " + size);

        boolean res = myBinarySearchTree.search(65);

        if(res)
            System.out.println("Node Found");
        else
            System.out.println("Node Not Found");

        Assert.assertEquals(13, size);
        Assert.assertTrue(res);
    }



}