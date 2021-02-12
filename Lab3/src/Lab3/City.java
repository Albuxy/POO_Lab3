/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import java.util.LinkedList;
import java.awt.Graphics;

public class City extends GeoPoint{
    
    private int numHab;

    public City(String s, int x, int y, int n){
        super (s, x, y);
        numHab=n;
    }
        
}
