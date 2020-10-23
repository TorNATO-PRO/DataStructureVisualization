/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redblackvisualization;

import javax.sound.sampled.DataLine;

/**
 *
 * @author nathan
 */
public class UICircle {
    public int radius;
    public int xCoord;
    public int yCoord;
    public int data;
    private boolean color; // red 1, black 0 
    private boolean highlighted; // yes, no
    
    public UICircle(int radius, int xCoord, int yCoord, int data) {
        this.radius = radius;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.data = data;
        this.color = true;
        this.highlighted = false;
    }
    
    public UICircle(int data) {
        this.data = data;
    }
    
    public void highlightCircle(boolean clientInput) {
        this.highlighted = clientInput;
    }
    
    // red = 1, black = 0
    public void changeColor(boolean color) {
        this.color = color;
    }
    
}
