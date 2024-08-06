package designPattern_Factory_Annabel;

/**
 * Classe implemente l'interface Figure et possède deux méthodes vides
 * méthode qui implement celle de l'interface Figure et imprime le rectange dans sa sortie standard
 * méthode qui implement celle de l'interface Figure et imprime le message d'une action assigné au rectange
 * dans sa sortie standard. Implique une future action a coder pour le rectangle
 *
 */
public class Rectangle implements Figure {
    /** Affiche les détails du rectangle.
     *
     */
    @Override
    public void afficher() {
        System.out.println("affiche le rectangle dans la methode afficher du cercle");
    }

    /**  Crée une action spécifique pour le rectangle. Le code n'est pas implementé malgre le
     * message qui est un message test pour demontrer le design pattern Factory.

     */
    @Override
    public void useFigure() {
        System.out.println("cree une action pour le rectangle dans la méthode useFigure");

    }
}

