package designPattern_Pont_Gabriel;

/**
 * Classe représentant un carre et qui hérite de la classe abstraite Forme
 *  private int coter est un attribut qui fera la forme d'un carre
 *  public void couleur() est la méthode qui permet de dessiner le carre avec une couleur
 *  public void surface() esr la méthode qui permet de calculer la surface du carrer
 */
public class Carre extends Forme {

    // Constructeur
    public Carre (Couleur couleur,Surface surface) {
        super(couleur,surface);
    }


    /**
     * méthode qui permet de dessiner le carre et indique la couleur demander
     *
     */
    @Override
    public void couleur() {
        System.out.println("Dessiner un carre de couleur: " + couleur.getNom());
    }


    /**
     * Méthodo qui permet de calculer la surface du carre
     *
     */
    @Override
    public void surface() {
        System.out.println("Avec une surface de : "+(surface.getSurface()));
    }
}
//