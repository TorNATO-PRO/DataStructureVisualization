package redblackvisualization;

import java.awt.Color;
import java.awt.Graphics;

/**
 * 
 * @author Nathan Waltz (Adapted from Algorithm's Tutor)
 * @author Allison Stansberry
 * @author Hunter McClure
 */
public class Node implements visualNode {

    // data structure that represents a node in the tree
    public int data; // holds the key
    public Node parent; // pointer to the parent
    public Node left; // pointer to left child
    public Node right; // pointer to right child
    public int color; // 1 . Red, 0 . Black
    public int xCoord; // xCoodinate of the Node
    public int yCoord; // yCoordinate of the Node
    private final Color WSUCrimson; // color object to represent WSU crimson!
    private final Color WSUdarkGray; // color object to represent WSU dark gray!
    private final Graphics gfx; // gfx object imported from the RedBlackTree class
    private int circleWidth; // width of the circle which represents the node
    public int nodeOffset; // distance from the parent node
    private Color nodeCurrentColor; // records the current color of the node

    /**
     * Node class constructor
     * 
     * @param graphicsPanel - a graphics object which allows drawing on the canvas
     * 
     * Constructs the object
     * 
     */
    public Node(Graphics graphicsPanel) {
        this.WSUCrimson = new Color(152, 30, 50);
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

    /**
     *
     * public method setRed()
     * 
     * Sets the node color to Red
     */
    @Override
    public void setRed() {
        gfx.setColor(WSUCrimson);
        nodeCurrentColor = WSUCrimson;
        gfx.fillOval(xCoord, yCoord, circleWidth, circleWidth);
        drawData();
    }

    /**
     * public method setBlack()
     * 
     * Sets the node color to Black
     */
    @Override
    public void setBlack() {
        gfx.setColor(WSUdarkGray);
        nodeCurrentColor = WSUdarkGray;
        gfx.fillOval(xCoord, yCoord, circleWidth, circleWidth);
        drawData();
    }

    /**
     * public method setBlack()
     * 
     * Highlights the node
     */
    @Override
    public void highlight() {
        gfx.setColor(Color.BLUE);
        gfx.drawOval(xCoord, yCoord, circleWidth, circleWidth);
    }

    /**
     * public method setBlack()
     * 
     * "un-Highlights the node"
     */
    @Override
    public void unHighlight() {
        gfx.setColor(nodeCurrentColor);
        gfx.fillOval(xCoord, yCoord, circleWidth, circleWidth);
        drawData();
    }

    /**
     * public method getRadius()
     * 
     * a getter method for the circle width
     * 
     * @return the circle width
     * 
     */
    @Override
    public int getWidth() {
        return circleWidth;
    }

    /**
     * public method setWidth()
     * 
     * a setter method for the circle width
     * 
     * @param newWidth - an integer representing the intended width of the circle
     */
    @Override
    public void setWidth(int newWidth) {
        this.circleWidth = newWidth;
    }

    /**
     * public method drawCircle()
     * 
     * a method to draw the circle
     * 
     */
    @Override
    public void drawCircle() {
        setRed();
        drawData();
    }

    /**
     * public method drawData()
     * 
     * a method to draw the data within the circle
     * 
     */
    @Override
    public void drawData() {
        gfx.setColor(Color.WHITE);
        gfx.drawString("" + data, xCoord + circleWidth / 4, yCoord + circleWidth / 2);
    }

    /**
     * public method deleteCircle()
     * 
     * a method to remove the circle from the canvas
     * 
     */
    @Override
    public void deleteCircle() {
        gfx.setColor(Color.WHITE);
        gfx.fillOval(xCoord, yCoord, circleWidth, circleWidth);
    }

    /**
     * public method drawLeftLine()
     * 
     * a method to draw the left line of the circle, which points to a child node
     * 
     */
    @Override
    public void drawLeftLine() {
        drawLine(xCoord, yCoord + circleWidth, xCoord - nodeOffset, 
            yCoord + circleWidth + nodeOffset); // tbh this shit needs to be worked on more
    }

    /**
     * public method drawRightLine()
     * 
     * a method to draw the right line of the circle, which points to a child node
     * 
     */
    @Override
    public void drawRightLine() {
        drawLine(xCoord + circleWidth, yCoord + circleWidth, xCoord + circleWidth + nodeOffset,
                yCoord + circleWidth + nodeOffset); // same with all the line things, fuck
    }

    /**
     * public method deleteRightLine()
     * 
     * a method to delete the right line of the circle
     * 
     */
    @Override
    public void deleteRightLine() {
        deleteLine(xCoord + circleWidth, yCoord + circleWidth, xCoord + circleWidth + nodeOffset,
                yCoord + circleWidth + nodeOffset); // same with all the line things, fuck
    }

    /**
     * public method deleteLeftLie()
     * 
     * a method to delete the left line of the circle
     * 
     */
    @Override
    public void deleteLeftLine() {
        deleteLine(xCoord, yCoord + circleWidth, xCoord - nodeOffset, yCoord + circleWidth + nodeOffset);
    }

    /**
     * public method deleteLeftLie()
     * 
     * a private helper method to draw a line
     * 
     */
    private void drawLine(int x1, int y1, int x2, int y2) {
        gfx.setColor(Color.BLACK);
        gfx.drawLine(x1, y1, x2, y2);
    }

    /**
     * public method deleteLeftLie()
     * 
     * a private helper method to delete a line
     * 
     */
    private void deleteLine(int x1, int y1, int x2, int y2) {
        gfx.setColor(Color.WHITE);
        gfx.drawLine(x1, y1, x2, y2);
    }
}
