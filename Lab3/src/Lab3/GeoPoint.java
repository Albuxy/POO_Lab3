/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import java.util.LinkedList;
import java.awt.Graphics;
/**
 *
 * @author u137680
 */
public class GeoPoint extends Point{
    
    private String name;

    
    public GeoPoint(String s, int x, int y){
        super (x, y);
        name = s;
        
    }  
    
    public void draw(Graphics g, int x, int y) {
        x=5;
        y=5;
        
        g.fillOval((int)super.x - 10, (int)super.y - 7, (int)x, (int)y);
        g.drawString(this.name, (int)super.x , (int)super.y );

    }
}
