/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redblackvisualization;

/**
 *
 * @author Nathan Waltz, Allison Stansberry, Hunter McClure
 */
public class UILine {
    public int x1Coord;
    public int y1Coord;
    public int x2Coord;
    public int y2Coord;

    public UILine(int x1Coord, int y1Coord, int x2Coord, int y2Coord) {
        this.x1Coord = x1Coord;
        this.y1Coord = y1Coord;
        this.x2Coord = x2Coord;
        this.y2Coord = y2Coord;
    }
    
    public UILine() {
        
    }
    
    // halves the line
    public void setRemoveState() {
        this.x2Coord = (x1Coord + x2Coord) / 2;
        this.y2Coord = (y1Coord + y2Coord) / 2;
    }
    
    // unHalves the line
    public void setNormalState() {
        this.x2Coord = 2 * x2Coord - x1Coord;
        this.y2Coord = 2 * x2Coord - y1Coord;
    }
    
}
