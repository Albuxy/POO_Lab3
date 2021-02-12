package Lab3;

import java.util.LinkedList;

    
public class MyMap extends javax.swing.JPanel {
    
    //8 Ciudades
    private City ciudad1;
    private City ciudad2;
    private City ciudad3;
    private City ciudad4;
    private City ciudad5;
    private City ciudad6;
    private City ciudad7;
    private City ciudad8;
   
    //4 Paises
    private Country pais1;
    private Country pais2;
    private Country pais3;
    private Country pais4;
    
    //Oceano
    private Ocean oceano;
    
     //4 Regiones
    private PolygonalRegion region1;
    private PolygonalRegion region2;
    private PolygonalRegion region3;
    private PolygonalRegion region4;
    private EllipsoidalRegion region5;
    //2 Continentes
    private Continent continente1;
    private Continent continente2;
    //1 Mundo
    private World mundo;
    
    // <editor-fold defaultstate="collapsed" desc="MyMap"> 
    public MyMap() {
        
      
        initComponents();
        //Tamaño maximo sera de 600 ya que tenemos un punto en 500
        setSize(600, 600);
        
        //Listas de ciudades para cada pais
        LinkedList<City> ciudades1 = new LinkedList <City>();
        LinkedList<City> ciudades2 = new LinkedList <City>();
        LinkedList<City> ciudades3 = new LinkedList <City>();
        LinkedList<City> ciudades4 = new LinkedList <City>();
        //Listas de puntos para cada poligono
        LinkedList<Point> poligono1 = new LinkedList <Point>();   
        LinkedList<Point> poligono2 = new LinkedList <Point>(); 
        LinkedList<Point> poligono3 = new LinkedList <Point>();   
        LinkedList<Point> poligono4 = new LinkedList <Point>();
        //Lista Oceano
        LinkedList<Ocean> oceano= new LinkedList <Ocean>();
        //Listas de regiones para los dos continentes
        LinkedList<PolygonalRegion> zona1 = new LinkedList <PolygonalRegion>();
        LinkedList<PolygonalRegion> zona2 = new LinkedList <PolygonalRegion>();
        //Creamos la lista de continentes
        LinkedList<Continent> mundo1 = new LinkedList<Continent>(); 
 
        //Ciudades
        ciudad1= new City("Barcelona", 50, 100, 3400) ;
        ciudad2= new City("Madrid", 100, 50, 3400) ;
        ciudad3= new City("Roma", 50, 300, 3400) ;
        ciudad4= new City("Pisa", 150, 250, 3400) ;
        ciudad5= new City("Paris", 350, 100, 3400);
        ciudad6= new City("Lyon", 450, 50, 3400);
        ciudad7= new City("Sinaloa", 350, 250, 3400);
        ciudad8= new City("Guadalajara", 425, 275, 3400);

        ciudades1.add(ciudad1);
        ciudades1.add(ciudad2);
        ciudades2.add(ciudad3);
        ciudades2.add(ciudad4);
        ciudades3.add(ciudad5);
        ciudades3.add(ciudad6);
        ciudades4.add(ciudad7);
        ciudades4.add(ciudad8);

        //Añadimos los puntos de la primera región
        poligono1.add(new Point(0, 10));
        poligono1.add(new Point(0, 110));
        poligono1.add(new Point(200, 110));
        poligono1.add(new Point(200, 10)); 
        //Añadimos los puntos de la segunda región
        poligono2.add(new Point(0, 200));
        poligono2.add(new Point(0, 300));
        poligono2.add(new Point(200, 300));
        poligono2.add(new Point(200, 200)); 
        //Añadimos los puntos de la tercera región
        poligono3.add(new Point(300, 10));
        poligono3.add(new Point(300, 110));
        poligono3.add(new Point(500, 110));
        poligono3.add(new Point(500, 10)); 
        //Añadimos los puntos de la cuarta región
        poligono4.add(new Point(300, 200));
        poligono4.add(new Point(300, 300));
        poligono4.add(new Point(500, 300));
        poligono4.add(new Point(500, 200)); 
        
        //Añadimos las ciudades a cada uno de los paises
        pais1= new Country (poligono1 ,ciudades1, "ESPAÑA", ciudades1.get(0), 80, 15);
        pais2= new Country (poligono2 ,ciudades2, "ITALIA", ciudades2.get(0), 80, 200);
        pais3= new Country (poligono3 ,ciudades3, "FRANCIA", ciudades3.get(0), 380, 15);
        pais4= new Country (poligono4 ,ciudades4, "MÉXICO", ciudades4.get(0), 380, 200);
        
        //Establecemos que cada poligono sera una region de la clase PolygonalRegion
        region1 = new PolygonalRegion(poligono1);
        region2 = new PolygonalRegion(poligono2);
        region3 = new PolygonalRegion(poligono3);
        region4 = new PolygonalRegion(poligono4);

        //Añadimos el oceando
        oceano.add(new Ocean("Pacífico",50,new Point (225,100) ,50, 100))  ;
        
        //Añadimos al primer continent las dos primeras regiones
        zona1.add(pais1);
        zona1.add(region1);
       
        zona1.add(pais2);
        zona1.add(region2);
        //Añadimos al segundo continent las dos primeras regiones
        zona2.add(pais3);
        zona2.add(region3);
        zona2.add(pais4);
        zona2.add(region4);
        
        //Establecemos que cada zona sera un conntienente
        continente1 = new Continent (zona1);
        continente2 = new Continent (zona2);

        //Añadimos al mundo los dos continentes
        mundo1.add(continente1);
        mundo1.add(continente2);
        
        //Establecemos el mundo como el tipo de clase de World
        mundo = new World (mundo1, oceano);
        
        //Imprimimos las areas de los poligonos y continentes
        System.out.printf("----Areas poligonos----\n");
        System.out.printf("Poligono 1: %d\n",region1.getArea());
        System.out.printf("Poligono 2: %d\n",region2.getArea());
        System.out.printf("Poligono 3: %d\n",region3.getArea());
        System.out.printf("Poligono 4: %d\n",region4.getArea());
        System.out.printf("-----------------------\n\n");
        System.out.printf("----Areas total continentes----\n");
        System.out.printf("Continente 1: %d\n",continente1.getTotalArea());
        System.out.printf("Continente 2: %d\n",continente2.getTotalArea());
        System.out.printf("-----------------------------\n");

    }
    // </editor-fold> 
    

    public void paint(java.awt.Graphics g) {
        
        super.paint(g);
        mundo.draw(g, 10, 10);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
