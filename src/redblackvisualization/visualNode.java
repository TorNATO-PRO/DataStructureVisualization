/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redblackvisualization;

import java.awt.Color;
import java.awt.Graphics;

// Well, my tests worked, now we need to mesh this with our data structure
// Maybe we could turn this into and interface and implement it in our
// node class? Maybe we could also transfer UILine's code to here

/**
 *
 * @author nathan
 */
public interface visualNode {
    
    // red = 1, black = 0
    public void setRed();
    
    public void setBlack();
    
    public void highlight();
    
    public void unHighlight();
    
    public int getRadius();
    
    public void setRadius(int newRadius);
    
    public void drawCircle();
    
    public void drawData();
    
    public void deleteCircle();
   
    public void drawLeftLine();
    
    public void drawRightLine();
    
    public void deleteLeftLine();
    
    public void deleteRightLine();
    
}