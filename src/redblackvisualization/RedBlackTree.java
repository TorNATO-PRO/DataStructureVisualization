package redblackvisualization;

// Red Black Tree implementation in Java
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JTextPane;

// Author: Algorithm Tutor
// Tutorial URL: https://algorithmtutor.com/Data-Structures/Tree/Red-Black-Trees/
// class RedBlackTree implements the operations in Red Black Tree
public class RedBlackTree {

    private Node root; // the root node
    private Node NIL; // the NIL node
    private final Graphics2D canvasPanel; // the panel that we are working with
    private final JTextPane descriptPane; // the description pane
    private final int[] centerCoordinates;


    private StringBuilder preOrderHelper(Node node, StringBuilder s) {
        if (node != NIL) {
            s.append(node.data).append(" ");
            preOrderHelper(node.left, s);
            preOrderHelper(node.right, s);
        }
        return s;
    }

    private StringBuilder inOrderHelper(Node node, StringBuilder s) {
        if (node != NIL) {
            inOrderHelper(node.left, s);
            s.append(node.data).append(" ");
            inOrderHelper(node.right, s);
        }
        return s;
    }

    private StringBuilder postOrderHelper(Node node, StringBuilder s) {
        if (node != NIL) {
            postOrderHelper(node.left, s);
            postOrderHelper(node.right, s);
            s.append(node.data).append(" ");
        }
        return s;
    }

    private Node searchTreeHelper(Node node, int key) {
        if (node == NIL || key == node.data) {
            return node;
        }

        if (key < node.data) {
            return searchTreeHelper(node.left, key);
        }
        return searchTreeHelper(node.right, key);
    }

    private void deleteNodeHelper(Node node, int key) {
        Node intendedNode = searchTreeHelper(node, key);
        int color = intendedNode.color;
        if (color == 1 && intendedNode.left == NIL 
                && intendedNode.right == NIL) { // red
            node = NIL;
        } else if (intendedNode.right == NIL || intendedNode.left == NIL) {
            node = (intendedNode.left == NIL) ? intendedNode.right 
                    : intendedNode.left;
            node.color = 0;
        } else {
            Node temp = node.right;
            Node left = node.left;
            temp.right = node;
            node = temp;
            node.left = left; 
            if (temp.color == 1) {
                if (temp.left == NIL || temp.right == NIL) {
                    node = (intendedNode.left == NIL) ? intendedNode.right 
                        : intendedNode.left;
                    node.color = 0;
                } else {
                    node = NIL;
                }
            } else {
                
            }
        }
    }

    // fix the red-black tree
    private void fixInsert(Node k) {
        Node u;
        while (k.parent.color == 1) {
            if (k.parent == k.parent.parent.right) { // IF THERE IS A TRIANGLE FORMATION
                u = k.parent.parent.left; // uncle
                if (u.color == 1) { // uncle is red
                    // case 3.1
                    u.color = 0;
                    k.parent.color = 0;
                    k.parent.parent.color = 1;
                    k = k.parent.parent;
                } else {                    //u is black
                    if (k == k.parent.left) { // node is a left child
                        // case 3.2.2
                        k = k.parent;
                        rightRotate(k);
                    }
                    // case 3.2.1           // node is a right child
                    k.parent.color = 0;
                    k.parent.parent.color = 1;
                    leftRotate(k.parent.parent);
                }
            } else {
                u = k.parent.parent.right; // uncle

                if (u.color == 1) {
                    // mirror case 3.1
                    u.color = 0;
                    k.parent.color = 0;
                    k.parent.parent.color = 1;
                    k = k.parent.parent;
                } else {
                    if (k == k.parent.right) {
                        // mirror case 3.2.2
                        k = k.parent;
                        leftRotate(k);
                    }
                    // mirror case 3.2.1
                    k.parent.color = 0;
                    k.parent.parent.color = 1;
                    rightRotate(k.parent.parent);
                }
            }
            if (k == root) {
                break;
            }
        }
        root.color = 0;
    }

    //constructor
    public RedBlackTree(Graphics2D drawingPanel, JTextPane descriptPane, int[] 
            centerCoordinates) {
        NIL = new Node(drawingPanel);
        NIL.color = 0;
        NIL.left = null;
        NIL.right = null;
        root = NIL;
        this.canvasPanel = drawingPanel;
        this.descriptPane = descriptPane;
        this.centerCoordinates = centerCoordinates;
    }

    // Pre-Order traversal
    // Node.Left Subtree.Right Subtree
    public void preorder() {
        descriptPane.setText(preOrderHelper(this.root, 
                new StringBuilder()).toString());
    }

    // In-Order traversal
    // Left Subtree . Node . Right Subtree
    public void inorder() {
        descriptPane.setText(inOrderHelper(this.root, 
                new StringBuilder()).toString());    
    }

    // Post-Order traversal
    // Left Subtree . Right Subtree . Node
    public void postorder() {
        descriptPane.setText(postOrderHelper(this.root, 
                new StringBuilder()).toString());    
    }

    // search the tree for the key k
    // and return the corresponding node
    public Node searchTree(int k) {
        return searchTreeHelper(this.root, k);
    }

    // find the node with the minimum key
    public Node minimum(Node node) {
        while (node.left != NIL) {
            node = node.left;
        }
        return node;
    }

    // find the node with the maximum key
    public Node maximum(Node node) {
        while (node.right != NIL) {
            node = node.right;
        }
        return node;
    }

    // find the successor of a given node
    public Node successor(Node x) {
        // if the right subtree is not null,
        // the successor is the leftmost node in the
        // right subtree
        if (x.right != NIL) {
            return minimum(x.right);
        }

        // else it is the lowest ancestor of x whose
        // left child is also an ancestor of x.
        Node y = x.parent;
        while (y != NIL && x == y.right) {
            x = y;
            y = y.parent;
        }
        return y;
    }

    // find the predecessor of a given node
    public Node predecessor(Node x) {
        // if the left subtree is not null,
        // the predecessor is the rightmost node in the
        // left subtree
        if (x.left != NIL) {
            return maximum(x.left);
        }

        Node y = x.parent;
        while (y != NIL && x == y.left) {
            x = y;
            y = y.parent;
        }

        return y;
    }

    // rotate left at node x
    public void leftRotate(Node x) {
        Node y = x.right;
        x.right = y.left;
        if (y.left != NIL) {
            y.left.parent = x;
        }
        y.parent = x.parent;
        if (x.parent == null) {
            this.root = y;
        } else if (x == x.parent.left) {
            x.parent.left = y;
        } else {
            x.parent.right = y;
        }
        y.left = x;
        x.parent = y;
    }

    // rotate right at node x
    public void rightRotate(Node x) {
        Node y = x.left;
        x.left = y.right;
        if (y.right != NIL) {
            y.right.parent = x;
        }
        y.parent = x.parent;
        if (x.parent == null) {
            this.root = y;
        } else if (x == x.parent.right) {
            x.parent.right = y;
        } else {
            x.parent.left = y;
        }
        y.right = x;
        x.parent = y;
    }

    // insert the key to the tree in its appropriate position
    // and fix the tree
    public void insert(int key) {
        // Ordinary Binary Search Insertion
        Node node = new Node(canvasPanel);
        node.parent = null;
        node.data = key;
        node.left = NIL;
        node.right = NIL;
        node.color = 1; // new node must be red

        Node y = null;
        Node x = this.root;

        while (x != NIL) {
            y = x;
            if (node.data < x.data) {
                x = x.left;
            } else {
                x = x.right;
            }
        }

        // y is parent of x
        node.parent = y;
        if (y == null) {
            root = node;
        } else if (node.data < y.data) {
            y.left = node;
        } else {
            y.right = node;
        }

        // if new node is a root node, simply return
        if (node.parent == null) {            
            node.color = 0;
            return;
        }

        // if the grandparent is null, simply return
        if (node.parent.parent == null) {
            return;
        }

        // Fix the tree
        fixInsert(node);
    }

    public Node getRoot() {
        return this.root;
    }

    // delete the node from the tree
    public void deleteNode(int data) {
        deleteNodeHelper(this.root, data);
    }
    
    private void clearPanel() {
        canvasPanel.setColor(Color.WHITE);
        canvasPanel.fillRect(0, 0, centerCoordinates[0] * 2,
                centerCoordinates[1] * 2);
    }

}