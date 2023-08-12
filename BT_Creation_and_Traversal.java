public class BT_Creation_and_Traversal
{
    // Building tree using preOrder Traversal
    static class Node
    {
        static Node root;
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
        static class BinaryTree{
            static int idx = -1;
            public static Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx]==-1) {
            return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
          }

          public static void preOrder(Node root)
          {
              if(root == null){
                  return;
              }
              System.out.print(root.data+" ");
              preOrder(root.left);
              preOrder(root.right);
          }
          public static void inOrder(Node root)
          {
              if(root == null){
                  return;
              }
              preOrder(root.left);
              System.out.print(root.data+" ");
              preOrder(root.right);
          }
          public static void postOrder(Node root)
          {
              if(root == null){
                  return;
              }
              preOrder(root.left);
              preOrder(root.right);
              System.out.print(root.data+" ");
          }
        }
    public static void main(String[] args) {
        // Note :- This is a preOrder Traversal and -1 represents null
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = BinaryTree.buildTree(nodes);
        assert root != null;
        System.out.println(root.data);
        System.out.println("PreOrder Traversal Is: ");
        BinaryTree.preOrder(root);
        System.out.println("\nInOrder Traversal Is: ");
        BinaryTree.inOrder(root);
        System.out.println("\nPostOrder Traversal Is:");
        BinaryTree.postOrder(root);
    }
}
