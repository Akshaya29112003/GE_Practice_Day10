package test;

import test.MyBinaryNode;

public class MyBinarySearchTree<K extends Comparable<K>> {
    private MyBinaryNode<K> root;

    public void add(K key){
        this.root = this.addRecursively(root, key);
    }

    public boolean search(K key){
        return this.searchRecursively(root, key);
    }

    private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key){
        if(current == null)
            return new MyBinaryNode<>(key);
        int compareResult = key.compareTo(current.key);
        if(compareResult == 0)  return current;
        if(compareResult < 0){
            current.left = addRecursively(current.left, key);
        }
        else{
            current.right = addRecursively(current.right, key);
        }
            return current;
    }

    public int getSize(){
        return this.getSizeRecursive(root);
    }

    public int getSizeRecursive(MyBinaryNode<K> current){
        return current == null ? 0 : 1 +this.getSizeRecursive(current.left) + this.getSizeRecursive(current.right);
    }

    public boolean searchRecursively(MyBinaryNode<K> current, K key){
        if(current == null)     return false;

        int compareResult = key.compareTo(current.key);
        if(compareResult == 0)  return true;
        if(compareResult < 0){
            return searchRecursively(current.left, key);
        }
        else{
            return searchRecursively(current.right, key);
        }
    }
}
