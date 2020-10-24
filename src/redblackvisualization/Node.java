/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redblackvisualization;

/**
 *
 * @author Nathan Waltz (Adapted from Algorithm's Tutor)
 */
public class Node {
    // data structure that represents a node in the tree
  public int data; // holds the key
  public Node parent; // pointer to the parent
  public Node left; // pointer to left child
  public Node right; // pointer to right child
  public int color; // 1 . Red, 0 . Black
  public UICircle nodeCircle;
  public UILine nodeLineLeft;
  public UILine nodeLineRight;
  
  public Node() {
      
  }
  
  // TODO: Make the UICircle and UILine interfaces part and this class
  // One in the same, 
  
  // TODO: Some form of scaling
  
  // TODO: Adding description to actions (Can be done in RedBlackTree)
  // with passed gfx field :)

}
