/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;

/**
 *
 * @author u137680
 */
public class Country extends PolygonalRegion {
    
   private String name;
   private LinkedList <City> cities;
   private LinkedList <Country> neighbours;
   private City capital;
   private int x;
   private int y;
   
    public Country(LinkedList<Point> l, LinkedList<City> cities, String n, City cap, int x, int y){
        super(l);
        this.cities= new LinkedList(cities);
        this.name = n;
        this.capital= cap;
        this.x=x;
        this.y=y;
    }

    public void addNeighBour(Country c){
       neighbours.add(c);
    }
   
    public void draw(Graphics g, int x, int y) {
        
        int max_size= this.cities.size();
        
        for (int i = 0; i < max_size; i++) {
            g.setColor(Color.BLUE);
            g.drawString(this.name, this.x, this.y);
            g.setColor(Color.BLACK );
            this.cities.get(i).draw(g, x, y);
        }
    }
}
