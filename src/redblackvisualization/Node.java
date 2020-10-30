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
    public int xCoord;
    public int yCoord;
    private final Color WSUred;
    private final Color WSUdarkGray;
    private final Graphics gfx;
    private int circleWidth;
    public int nodeOffset;
    private Color nodeCurrentColor;

    public Node(Graphics graphicsPanel) {
        this.WSUred = new Color(152, 30, 50);
        this.WSUdarkGray = new Color(83, 86, 90);
        this.gfx = graphicsPanel;
        this.circleWidth = 50;
        this.nodeCurrentColor = WSUdarkGray;
    }

    // TODO: Make the UICircle and UILine interfaces part and this class
    // One in the same, 
    // TODO: Some form of scaling
    // TODO: Adding description to actions (Can be done in RedBlackTree)
    // with passed gfx field :)

    @Override
    public void setRed() {
        gfx.setColor(WSUred);
        nodeCurrentColor = WSUred;
        gfx.fillOval(xCoord, yCoord, circleWidth, circleWidth);
        drawData();
    }

    @Override
    public void setBlack() {
        gfx.setColor(WSUdarkGray);
        nodeCurrentColor = WSUdarkGray;
        gfx.fillOval(xCoord, yCoord, circleWidth, circleWidth);
        drawData();
    }

    @Override
    public void highlight() {
        gfx.setColor(Color.BLUE);
        gfx.drawOval(xCoord, yCoord, circleWidth, circleWidth);
    }

    @Override
    public void unHighlight() {
        gfx.setColor(nodeCurrentColor);
        gfx.fillOval(xCoord, yCoord, circleWidth, circleWidth);
        drawData();
    }

    @Override
    public int getRadius() {
        return circleWidth;
    }

    @Override
    public void setRadius(int newRadius) {
        this.circleWidth = newRadius;
    }

    @Override
    public void drawCircle() {
        setBlack();
        drawData();
    }

    @Override
    public void drawData() {
        gfx.setColor(Color.WHITE);
        gfx.drawString("" + data, xCoord + circleWidth / 4, yCoord + circleWidth / 2);
    }

    @Override
    public void deleteCircle() {
        gfx.setColor(Color.WHITE);
        gfx.fillOval(xCoord, yCoord, circleWidth, circleWidth);
    }

    @Override
    public void drawLeftLine() {
        drawLine(xCoord, yCoord + circleWidth, xCoord - nodeOffset, yCoord 
                + circleWidth + nodeOffset); // tbh this shit needs to be worked on more
    }

    @Override
    public void drawRightLine() {
        drawLine(xCoord + circleWidth, yCoord + circleWidth, xCoord + circleWidth 
                + nodeOffset, yCoord + circleWidth + nodeOffset); // same with all the line things, fuck
    }

    @Override
    public void deleteRightLine() {
        deleteLine(xCoord + circleWidth, yCoord + circleWidth, xCoord + circleWidth 
                + nodeOffset, yCoord + circleWidth + nodeOffset); // same with all the line things, fuck
    }
    
        @Override
    public void deleteLeftLine() {
        deleteLine(xCoord, yCoord + circleWidth, xCoord - nodeOffset, yCoord 
                + circleWidth + nodeOffset); 
    }
    
    private void drawLine(int x1, int y1, int x2, int y2) {
        gfx.setColor(Color.BLACK);
        gfx.drawLine(x1, y1, x2, y2);
    }
    
    private void deleteLine(int x1, int y1, int x2, int y2) {
        gfx.setColor(Color.WHITE);
        gfx.drawLine(x1, y1, x2, y2);
    }
}
