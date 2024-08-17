package designPattern_Pont_Gabriel;

/**
 * Classe abstraite représentant une forme
 * protected Couleur couleur est un attribut qui sera la couleur de la forme
 * protected Surface surface est un attribut qui sera la surface total de la forme
 * public abstract void surface() est la méthode qui permet d'afficher la surface de la forme
 * public abstract void couleur() est la méthode qui permet d'afficher la couleur de la forme
 */
public abstract class Forme{

    protected Couleur couleur;
    protected Surface surface;


    /**
     * Constructeur forme qui prend en parametre la classe couleur et la surface
     * @param couleur
     * @param surface
     */
    public Forme(Couleur couleur, Surface surface) {
        this.couleur = couleur;
        this.surface = surface;
    }


    /**
     * Méthode qui permet de calculer la surface de la forme
     */
    public abstract void surface();

    /**
     * Méthode qui permet de calculer la couleur de la forme
     */
    public abstract void couleur();
}
