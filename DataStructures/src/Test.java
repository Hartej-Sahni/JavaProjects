import java.util.List;

public class Test {
    public static void main(String[] args) {
        /*
        LinkedList<Integer> nums = new LinkedList<Integer>();
        System.out.println(nums);
        nums.addElement(4);
        nums.addElement(83);
        nums.addElement(173);
        System.out.println(nums);
        System.out.println("Size of linked list = " + nums.getSize());
        nums.removeElement(2);
        System.out.println(nums);

        Stack<Integer> myStack = new Stack<Integer>(5);
        System.out.println(myStack);
        myStack.push(10);
        myStack.push(284);
        myStack.push(7061);
        System.out.println(myStack);
        try {
            int num = myStack.pop();
            System.out.println("Element popped: " + num);
            num = myStack.pop();
            System.out.println("Element popped: " + num);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(myStack);

        Queue<Integer> myQueue = new Queue<Integer>();
        myQueue.enqueue(5);
        myQueue.enqueue(-3);
        myQueue.enqueue(107);
        System.out.println(myQueue);
        try {
            int num = myQueue.dequeue();
            System.out.println("Dequeued " + num);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(myQueue);

        CircularQueue<Integer> myCircularQueue = new CircularQueue<Integer>(Integer.class);
        myCircularQueue.enqueue(19);
        myCircularQueue.enqueue(273);
        myCircularQueue.enqueue(-32);
        myCircularQueue.enqueue(-1097);
        myCircularQueue.enqueue(89375);
        System.out.println(myCircularQueue);
        try {
            int num = myCircularQueue.dequeue();
            System.out.println("Dequeud " + num);
            num = myCircularQueue.dequeue();
            System.out.println("Dequeud " + num);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        myCircularQueue.enqueue(698);
        System.out.println(myCircularQueue);

        QueueWithStacks<Integer> anotherQueue = new QueueWithStacks<Integer>();
        try {
            anotherQueue.enqueue(97);
            anotherQueue.enqueue(-1);
            anotherQueue.enqueue(629);
            System.out.println(anotherQueue);
            int num = anotherQueue.dequeue();
            System.out.println("Dequeued " + num);
            num = anotherQueue.dequeue();
            System.out.println("Dequeued " + num);
            System.out.println(anotherQueue);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        */
        /*
        TreeNode<Integer> node1 = new TreeNode<Integer>(63);
        TreeNode<Integer> node2 = new TreeNode<Integer>(55);
        TreeNode<Integer> node3 = new TreeNode<Integer>(70);
        TreeNode<Integer> node4 = new TreeNode<Integer>(10);
        TreeNode<Integer> node5 = new TreeNode<Integer>(65);
        TreeNode<Integer> node6 = new TreeNode<Integer>(95);
        TreeNode<Integer> node7 = new TreeNode<Integer>(100);
        node1.setLeftChild(node2);
        node1.setRightChild(node3);
        node2.setLeftChild(node4);
        node3.setLeftChild(node5);
        node3.setRightChild(node6);
        node6.setRightChild(node7);
        */
        /*
        try {
            BreadthFirstTraversal.traverse(node1);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        */
        /*
        System.out.println("Pre-order:");
        DepthFirstTraversal.preOrderTraverse(node1);
        System.out.println("In-order:");
        DepthFirstTraversal.inOrderTraverse(node1);
        System.out.println("Post-order:");
        DepthFirstTraversal.postOrderTraverse(node1);
        */
        /*
        TreeNode<Integer> head = null;
        TreeNode<Integer> myTree = BinarySearchTree.insert(head, node1);
        myTree = BinarySearchTree.insert(myTree, node2);
        myTree = BinarySearchTree.insert(myTree, node3);
        myTree = BinarySearchTree.insert(myTree, node4);
        myTree = BinarySearchTree.insert(myTree, node5);
        myTree = BinarySearchTree.insert(myTree, node6);
        myTree = BinarySearchTree.insert(myTree, node7);
        DepthFirstTraversal.inOrderTraverse(myTree);
        TreeNode<Integer> node = BinarySearchTree.lookup(myTree, 69);
        if (node == null) {
            System.out.println("Number is not in the tree");
        }
        else {
            System.out.println(node.getData() + " is in the tree");
        }
        int data = BinarySearchTree.minValue(myTree);
        System.out.println("Min value = " + data);
        int depth = BinarySearchTree.maxDepth(myTree);
        System.out.println("Depth = " + depth);
        BinarySearchTree.mirror(myTree);
        DepthFirstTraversal.inOrderTraverse(myTree);

        MinBinaryHeap<Integer> nums = new MinBinaryHeap<Integer>(Integer.class, 10);
        try {
            nums.insert(10);
            nums.insert(24);
            nums.insert(2);
            nums.insert(79);
            nums.insert(20);
            nums.insert(35);
            nums.insert(7);
            int num = nums.remove();
        }
        catch (HeapFullException e) {
            System.out.println(e.getMessage());
        }
        catch (HeapEmptyException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(nums);
        */
        /*
        AdjacencySetGraph myGraph = new AdjacencySetGraph();
        myGraph.addVertex(0);
        myGraph.addVertex(1);
        myGraph.addVertex(2);
        myGraph.addVertex(3);
        myGraph.addVertex(4);
        myGraph.addEdge(0, 1);
        myGraph.addEdge(1, 3);
        myGraph.addEdge(1, 4);
        myGraph.addEdge(3, 4);
        myGraph.addEdge(4, 2);
        myGraph.addEdge(2, 0);
        int[] visited = new int[myGraph.numVertices()];
        System.out.println("Post order traversal");
        DepthFirstTraversalGraph.postOrderTraversal(myGraph, visited, 0);
        visited = new int[myGraph.numVertices()];
        System.out.println("\nPre order traversal");
        DepthFirstTraversalGraph.preOrderTraversal(myGraph, visited, 0);
        System.out.println("\nBreadth first traversal");
        visited = new int[myGraph.numVertices()];
        try {
            BreadthFirstTraversalGraph.traverse(myGraph, visited, 0);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        */
        AdjacencySetGraph myGraph = new AdjacencySetGraph(Graph.GraphType.DIRECTED);
        myGraph.addVertex(0);
        myGraph.addVertex(1);
        myGraph.addVertex(2);
        myGraph.addVertex(3);
        myGraph.addVertex(4);
        myGraph.addEdge(0, 1);
        myGraph.addEdge(1, 3);
        myGraph.addEdge(4, 1);
        myGraph.addEdge(4, 3);
        myGraph.addEdge(2, 4);
        myGraph.addEdge(0, 2);
        try {
            List<Integer> sortedList = TopologicalSort.sort(myGraph);
            System.out.println(sortedList);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
