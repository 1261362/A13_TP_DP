package designPattern_Factory_Annabel;

// Interface abstraite pour la Figure

/**
 * Interface abstraite pour représenter une figure géométrique.
 * Cette interface définit les méthodes que toutes les classes concrètes représentant des figures géométriques
 * doivent implémenter. Les méthodes permettent d'afficher les détails de la figure et d'exécuter des actions spécifiques
 * associées à la figure
 * Les méthodes afficheny les détails de la figure et assignent des action aux objets crees
 */
public interface Figure {

     void  afficher();

      void  useFigure();
}

