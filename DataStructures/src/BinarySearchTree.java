public class BinarySearchTree<T extends Comparable<T>> {
    public static <T extends Comparable<T>> TreeNode<T> insert(TreeNode<T> head, TreeNode<T> node) {
        if (head == null) {
            return node;
        }
        if (node.getData().compareTo(head.getData()) <= 0) {
            head.setLeftChild(insert(head.getLeftChild(), node));
        }
        else {
            head.setRightChild(insert(head.getRightChild(), node));
        }
        return head;
    }

    public static <T extends Comparable<T>> TreeNode<T> lookup(TreeNode<T> head, int data) {
        if (head == null) {
            return null;
        }
        if (data == (Integer)head.getData()) {
            return head;
        }
        if (data < (Integer)head.getData()) {
            return lookup(head.getLeftChild(), data);
        }
        else {
            return lookup(head.getRightChild(), data);
        }
    }
    
    public static <T> T minValue(TreeNode<T> head) {
        if (head == null) {
            return null;
        }
        if (head.getLeftChild() != null) {
            return minValue(head.getLeftChild());
        }
        return head.getData();
    }

    public static <T> int maxDepth(TreeNode<T> root) {
        if (root == null || (root.getLeftChild() == null && root.getRightChild() == null)) {
            return 0;
        }
        int maxLeftDepth = 1 + maxDepth(root.getLeftChild());
        int maxRightDepth = 1 + maxDepth(root.getRightChild());
        if (maxLeftDepth > maxRightDepth) {
            return maxLeftDepth;
        }
        return maxRightDepth;
    }

    public static <T> void mirror(TreeNode<T> root) {
        if (root == null) {
            return;
        }
        mirror(root.getLeftChild());
        mirror(root.getRightChild());
        TreeNode<T> temp = root.getLeftChild();
        root.setLeftChild(root.getRightChild());
        root.setRightChild(temp);
    }
}
