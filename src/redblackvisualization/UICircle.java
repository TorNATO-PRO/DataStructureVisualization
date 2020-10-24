/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redblackvisualization;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Stroke;


// Well, my tests worked, now we need to mesh this with our data structure
// Maybe we could turn this into and interface and implement it in our
// node class? Maybe we could also transfer UILine's code to here

/**
 *
 * @author nathan
 */
public final class UICircle {
    public int radius;
    public int xCoord;
    public int yCoord;
    private final int data;
    private final Graphics gfx;
    private final Color WSUred;
    private final Color WSUdarkGray;
    private final Color blank;
    
    public UICircle(int xCoord, int yCoord,
            int data, Graphics gfx) {
        this.radius = 20;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.data = data;
        this.WSUred = new Color(152, 30, 50); // WSU red
        this.WSUdarkGray = new Color(83, 86, 90); // WSU red
        this.blank = Color.WHITE;
        this.gfx = gfx;
        setRed();
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
        gfx.setColor(Color.BLUE);
        drawCircle();
    }
    
    public void unHighlight() {
        gfx.setColor(blank);
        drawCircle();
    }
    
    public int getRadius() {
        return radius;
    }
    
    public void setRadius(int newRadius) {
        this.radius = newRadius;
    }
    
    private void drawCircle() {
        gfx.fillOval(xCoord, yCoord, radius * 2, radius * 2);
        drawData();
    }
    
    private void drawData() {
        gfx.setColor(blank);
        gfx.drawString("" + data, xCoord + radius - numLength() * 3, 
                yCoord + radius + numLength());
    }
    
    public void deleteCircle() {
        gfx.setColor(blank);
        drawCircle();
    }
    
    private int numLength() {
        int i = 0;
        int tempData = data;
        while (tempData != 0) {
            tempData /= 10;
            i++;
        }
        return i;
    } // reeeeee
    
}