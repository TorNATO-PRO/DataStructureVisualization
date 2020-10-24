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
 * @author Nathan Waltz, Allison Stansberry, Hunter McClure
 */
public final class UILine {

    public int x1Coord;
    public int y1Coord;
    public int x2Coord;
    public int y2Coord;
    private Graphics gfx;

    public UILine(int x1Coord, int y1Coord, int x2Coord, int y2Coord,
            Graphics gfx) {
        this.x1Coord = x1Coord;
        this.y1Coord = y1Coord;
        this.x2Coord = x2Coord;
        this.y2Coord = y2Coord;
    }

    private void deleteLine() {
        gfx.setColor(Color.WHITE);
        gfx.drawLine(x1Coord, y1Coord, x2Coord, y2Coord);
    }

    private void drawLine() {
        gfx.setColor(Color.BLACK);
        gfx.drawLine(x1Coord, y1Coord, x2Coord, y2Coord);
    }

}
