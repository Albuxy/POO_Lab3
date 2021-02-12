/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import java.awt.Color;
import java.util.LinkedList;
import java.awt.Graphics;
/**
 *
 * @author u137680
 */
public class Ocean extends EllipsoidalRegion {
    
   
    private String nombre;
    private int contaminacion;
    
    public Ocean ( String name1 ,int contaminacion1, Point centro1, int x, int y){
        super(centro1 ,x , y);
        this.nombre=name1;
        this.contaminacion=contaminacion1;
    } 
    
  
    public void draw (Graphics g, int x, int y){
        //Volem que simprimeixi de color Cyan
        g.setColor(Color.CYAN);
        super.draw(g, x, y);
        
    }
        
    
}
