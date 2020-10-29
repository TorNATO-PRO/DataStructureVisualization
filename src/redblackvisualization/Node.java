/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redblackvisualization;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Nathan Waltz (Adapted from Algorithm's Tutor)
 */
public class Node implements visualNode {

    // data structure that represents a node in the tree
    public int data; // holds the key
    public Node parent; // pointer to the parent
    public Node left; // pointer to left child
    public Node right; // pointer to right child
    public int color; // 1 . Red, 0 . Black
    private final Color WSUred;
    private final Color WSUdarkGray;
    private final Graphics gfx;

    public Node(Graphics graphicsPanel) {
        this.WSUred = new Color(152, 30, 50);
        this.WSUdarkGray = new Color(83, 86, 90);
        this.gfx = graphicsPanel;
    }

    // TODO: Make the UICircle and UILine interfaces part and this class
    // One in the same, 
    // TODO: Some form of scaling
    // TODO: Adding description to actions (Can be done in RedBlackTree)
    // with passed gfx field :)

    @Override
    public void setRed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setBlack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void highlight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void unHighlight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getRadius() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRadius(int newRadius) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void drawCircle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void drawData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteCircle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void drawLine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteLine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
