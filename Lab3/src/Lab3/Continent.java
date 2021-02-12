package Lab3;

import java.util.LinkedList;
import java.awt.Graphics;

public class Continent {
    
    //Creamos la lista de countries de la clase PolygonalRegion
    private LinkedList <PolygonalRegion> countries;

    public Continent(LinkedList<PolygonalRegion> l){
        countries = l;
    }

    // <editor-fold defaultstate="collapsed" desc="getTotalArea"> 
    public int getTotalArea() {
       int areaTotal = 0;
       int max_size= this.countries.size();
       
       for (int i = 0; i < max_size; i++) {
            //Dos countries por lo tanto, entrara dos veces
            areaTotal = areaTotal + this.countries.get(i).getArea(); 
        }
       
        return areaTotal;
    }
    // </editor-fold> 
    
    public void draw(Graphics g, int x, int y) {
        
        int max_size= this.countries.size();
        
        for (int i = 0; i < max_size; i++) {
            //Entrara dos veces en el bucle
            this.countries.get(i).draw(g, x, y);
        }
    }

}
