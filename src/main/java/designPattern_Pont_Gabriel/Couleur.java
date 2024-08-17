package designPattern_Pont_Gabriel;

/**
 * Classe représentant une couleur
 *  private String nom est un attribut qui fera la couleur d'un carre
 *  public void couleur() est la méthode qui permet de dessiner le carre avec une couleur
 *
 */
public class Couleur {

    private String nom;

    /**
     * Constructeur
     * @param nom
     */
    public Couleur(String nom) {
        this.nom = nom;
    }

    //Getter
    public String getNom() {
        return nom;
    }
}
