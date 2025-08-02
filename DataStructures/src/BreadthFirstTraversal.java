public class BreadthFirstTraversal<T> {
    public static <T> void traverse(TreeNode<T> root) throws Exception {
        if (root == null) {
            return;
        }
        Queue<TreeNode<T>> queue = new Queue<TreeNode<T>>();
        queue.enqueue(root);
        while (!queue.isEmpty()) {
            TreeNode<T> node = queue.dequeue();
            System.out.println(node.getData());
            if (node.getLeftChild() != null) {
                queue.enqueue(node.getLeftChild());
            }
            if (node.getRightChild() != null) {
                queue.enqueue(node.getRightChild());
            }
        }
    }
}
