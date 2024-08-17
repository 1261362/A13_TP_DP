package designPattern_Pont_Gabriel;

/**
 * Classe principale qui instancie des objets couleur et forme
 * Création des objets couleur et forme
 * Méthode run qui appelle les methodes couleur et surface
 * Création d'un objet main et qui appel la methode run pour faire rouler le programme
 */

public class Main {

    //Créaton des objets couleur et indique les couleurs indiquées
    Couleur rouge = new Couleur("Rouge");
    Couleur bleu = new Couleur("Bleu");

    //Créaton des objets surface et indique les surfaces indiquées
    Surface surfaceCercle = new Surface(30);
    Surface surfaceCarre = new Surface(50);

    //Créaton des objets forme qui appelle les objets couleur et surface
   Forme cercleRouge = new Cercle(rouge,surfaceCercle);
   Forme carreBleu = new Carre(bleu,surfaceCarre);


    //Appel de la methode couleur
    public void run() {
        //Appel de la methode couleur et surface d'un cercle et d'un carre
        cercleRouge.couleur();
        cercleRouge.surface();

        //Laisser un espace entre les deux
        System.out.println("-------------------------");

        //Appel de la methode couleur et surface d'un carre
        carreBleu.couleur();
        carreBleu.surface();
    }

    public static void main(String[] args) {
        /**
         * Appel de la methode run qui exécutera tout le programme
         */
        Main main = new Main();
        main.run();
    }
}
