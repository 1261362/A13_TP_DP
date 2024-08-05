package designPattern_Pont_Gabriel;

/**
 * Classe Surface qui fera la forme d'un carre ou d'un cercle
 * private double surface est un attribut qui fera la forme d'un carre ou d'un cercle
 * public void surface() est la méthode qui permet de calculer la surface
 */
public class Surface {
    private double surface;

    public Surface(double surface) {
        this.surface = surface;
    }

    public double getSurface() {
        return surface;
    }

//    public void surface(Surface surface) {
//        System.out.println("Surface : " + surface.getSurface());
//    }
}
