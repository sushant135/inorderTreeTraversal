class Node {
  int item;
  Node left, right;

  public Node(int key) {
  item = key;
  left = right = null;
  }
}

class Tree {
  // root of Tree
  Node root;

  Tree() {
  root = null;
  }

  void inOrder(Node node) {
    if (node == null)
      return;

    // traverse the left child
    inOrder(node.left);

    // traverse the root node
    System.out.print(node.item + "->");

    // traverse the right child
    inOrder(node.right);
  }


  public static void main(String[] args) {

    // create an object of Tree
    Tree tree = new Tree();

    ??insertcode

    System.out.println("In Order traversal");
    tree.inOrder(tree.root);
  }
}
