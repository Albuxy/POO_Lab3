package Lab3;

import java.util.LinkedList;
import java.awt.Graphics;

public class World {
    
    //Creamos la lista de continentes que habran en el mundo
    private LinkedList<Continent> conts;
    private LinkedList<Ocean> oceans;
    
    public World(LinkedList<Continent> l, LinkedList<Ocean> o) {
        
        this.conts = l;
        this.oceans= o;
    }
    
    public void draw(Graphics g, int x, int y) {
        int max_size_w= this.conts.size();
        int max_size_o= this.oceans.size();
        //Lo mismo que con las regiones, en este caso entrara en el bucle para dibujar los 2 continentes
        for (int i = 0; i < max_size_w; i++) {
            
            //Solo entrara dos veces en este bucle
            this.conts.get(i).draw(g, x, y);
        }
        
        for (int i = 0; i < max_size_o; i++) {
            
            //Solo entrara dos veces en este bucle
            this.oceans.get(i).draw(g, x, y);
        }

    }

}
