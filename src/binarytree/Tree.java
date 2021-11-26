package binarytree;

public interface Tree<E> {
    boolean isEmpty();
    int size();
    E preOrderTraversal(E root);
    E inOrderTraversal(E root);
    E postOrderTraversal(E root);
}
