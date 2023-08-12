import java.util.*;

public class BT_LevelOrder_Traversal {
        static class Node
        {
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
        public static void levelOrder(Node root){
            if(root==null) {
                System.out.println("Tree Doesn't exists..!");
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty())
            {
               Node currNode = q.remove();
               if(currNode == null){
                   System.out.println();
                   if(q.isEmpty()) break;
                   else q.add(null);
               }
               else
               {
                   System.out.print(currNode.data+" ");
                   if(currNode.left != null){
                       q.add(currNode.left);
                   }
                   if(currNode.right != null){
                       q.add(currNode.right);
                   }
               }
            }
        }
        public static void main(String[] args) {
            // Note :- This is a preOrder Traversal and -1 represents null
            int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
            BinaryTree tree = new BinaryTree();
            Node root = BinaryTree.buildTree(nodes);
            System.out.println("Breadth First Search: ");
            levelOrder(root);
            List<Integer> list = new ArrayList<>();
            list.add(5);
            list.add(4);
            list.add(3);
            list.add(2);
            list.add(1);
            Collections.sort(list);
            System.out.println(list.get(list.size()-2));
    }
}
