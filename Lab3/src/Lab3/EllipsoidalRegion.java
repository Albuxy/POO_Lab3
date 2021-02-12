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
 * @author u150431
 */
public class EllipsoidalRegion extends Region{
    
    private Point centro;
    private int radio1;
    private int radio2;
    
    
    public EllipsoidalRegion(Point centro1, int radio3, int radio4){
        
        super();
        this.centro=centro1;
        this.radio1=radio3;
        this.radio2=radio4;
        
    } 
    
    public int getArea(){
        int area=0;
        return area;
    }
    
    public void draw (Graphics g, int xi, int yi){
        
        //Imprimimos el oceano
        g.fillOval((int)this.centro.x + xi,(int)this.centro.y + yi, this.radio1, this.radio2);

    }
    
}


