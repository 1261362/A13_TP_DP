package designPattern_Pont_Gabriel;

/**
 * Classe représentant un cercle et qui hérite de la classe abstraite Forme
 * rayon sont des attributs qui feront le cercle
 * public void couleur() est la méthode qui permet de dessiner le cercle
 * public void surface() est la méthode qui permet de calculer la surface du cercle
 */

public class Cercle extends Forme {


    /**
     * Constructeur qui appele la classe Couleur et la classe Surface
     * @param couleur
     * @param surface
     */
    public Cercle (Couleur couleur,Surface surface) {
        super(couleur,surface);
    }


    /**
     * Méthode qui permet de dessiner le cercle et qui indique la couleur demander
     */
    @Override
    public void couleur() {
        System.out.println("Dessiner un cercle de couleur " + couleur.getNom());
    }


    /**
     * Méthode qui permet de calculer la surface du cercle
     */
    @Override
    public void surface() {
        System.out.println("Avec une surface de : " + Math.round(surface.getSurface()));
    }
}
