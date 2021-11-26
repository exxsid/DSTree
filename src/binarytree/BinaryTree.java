package binarytree;

public class BinaryTree<E> implements Tree<E>{
    private int size;
    private Node<E> left;
    private Node<E> right;

    BinaryTree(){}

    BinaryTree(Node<E> l, Node<E> r){
        left = l;
        right = r;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public E preOrderTraversal(E root) {
        return null;
    }

    @Override
    public E inOrderTraversal(E root) {
        return null;
    }

    @Override
    public E postOrderTraversal(E root) {
        return null;
    }


    private static class Node<E>{

        private E element;
        private Node<E> right;
        private Node<E> left;

        Node(){}

        Node(E e){
            element = e;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getRight() {
            return right;
        }

        public void setRight(Node<E> right) {
            this.right = right;
        }

        public Node<E> getLeft() {
            return left;
        }

        public void setLeft(Node<E> left) {
            this.left = left;
        }
    }   // end of Node class

}   // end of BinaryTree class
