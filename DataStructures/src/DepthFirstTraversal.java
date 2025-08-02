public class DepthFirstTraversal<T> {
    public static <T> void preOrderTraverse(TreeNode<T> root) {
        if (root == null) {
            return;
        }
        System.out.println(root.getData());
        preOrderTraverse(root.getLeftChild());
        preOrderTraverse(root.getRightChild());
    }

    public static <T> void inOrderTraverse(TreeNode<T> root) {
        if (root == null) {
            return;
        }
        inOrderTraverse(root.getLeftChild());
        System.out.println(root.getData());
        inOrderTraverse(root.getRightChild());
    }

    public static <T> void postOrderTraverse(TreeNode<T> root) {
        if (root == null) {
            return;
        }
        postOrderTraverse(root.getLeftChild());
        postOrderTraverse(root.getRightChild());
        System.out.println(root.getData());
    }
}
