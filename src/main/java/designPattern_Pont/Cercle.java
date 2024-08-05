package designPattern_Pont;

/**
 * Classe représentant un cercle et qui hérite de la classe abstraite Forme
 * rayon sont des attributs qui feront le cercle
 * public void couleur() est la méthode qui permet de dessiner le cercle
 * public void surface() est la méthode qui permet de calculer la surface du cercle
 */

public class Cercle extends Forme {


    public Cercle (Couleur couleur,Surface surface) {
        super(couleur,surface);
    }



    @Override
    public void couleur() {
        System.out.println("Dessiner un cercle de couleur " + couleur.getNom());
    }


    @Override
    public void surface() {
        System.out.println("Avec une surface de : " + Math.round(surface.getSurface()));
    }
}
