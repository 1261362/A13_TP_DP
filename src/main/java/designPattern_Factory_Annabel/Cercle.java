package designPattern_Factory_Annabel;

import java.awt.*;

/**
 * classe Cercle responsable de la creation des objets cercle,Elle fournit les méthodes pour afficher le cercle
 *  * et effectuer des actions spécifiques associées au cercle, implemente l'interface Figure
 * A deux méthodes void.
 * affiche l'object cercle
 * cree un action pour l'objet cercle
 *
 */
public class Cercle implements Figure {

/**
 * Affiche les détails du cercle.
  * méthode qui  imprime une description du cercle.
 *
  */
    @Override
    public void afficher() {
    System.out.println("affiche le cercle dans la methode afficher du cercle");
    }
/**
 * Methode useFigure() assigne une action à l'objet cercle
 * imprime un message, le code est a implementer
 */

    @Override
    public void useFigure() {
        System.out.println("cree une action pour utiliser le cercle a l'intérieur de la methode useFigure ");
    }
}


