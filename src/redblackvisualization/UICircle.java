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
 * @author nathan
 */
public class UICircle {
    public int radius;
    public int xCoord;
    public int yCoord;
    private final int data;
    private Graphics gfx;
    private Color WSUred;
    private Color WSUdarkGray;
    private Color blank;
    private Color WSUlightGray;
    
    public UICircle(int xCoord, int yCoord,
            int data, Graphics gfx) {
        this.radius = 20;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.data = data;
        this.WSUred = new Color(152, 30, 50); // WSU red
        this.WSUdarkGray = new Color(83, 86, 90); // WSU red
        this.WSUlightGray = new Color(167, 169, 172);
        this.blank = Color.WHITE;
        this.gfx = gfx;
        setRed();
        drawData();
    }
    
    // red = 1, black = 0
    public void setRed() {
        gfx.setColor(WSUred);
        drawCircle();
    }
    
    public void setBlack() {
        gfx.setColor(WSUdarkGray);
        drawCircle();
    }
    
    public void highlight() {
        gfx.setColor(WSUlightGray);
        drawOutline();
    }
    
    public void unHighlight() {
        gfx.setColor(blank);
        drawOutline();
    }
    
    public int getRadius() {
        return radius;
    }
    
    public void setRadius(int newRadius) {
        this.radius = newRadius;
    }
    
    private void drawCircle() {
        gfx.fillOval(xCoord, yCoord, radius * 2, radius * 2);
    }
    
    private void drawOutline() {
        gfx.drawOval(xCoord, yCoord, radius * 2, radius * 2);
    }
    
    private void drawData() {
        gfx.setColor(blank);
        gfx.drawString("" + data, xCoord + radius - numLength() * 2, 
                yCoord + radius);
    }
    
    private int numLength() {
        int i = 0;
        int tempData = data;
        while (tempData != 0) {
            tempData /= 10;
            i++;
        }
        return i;
    }
    
}
