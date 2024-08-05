package designPattern_Pont_Gabriel;

/**
 * Classe principale qui instancie des objets couleur et forme
 * Création des objets couleur et forme
 * Méthode run qui appelle les methodes couleur et surface
 * Création d'un objet main et qui appel la methode run pour faire rouler le programme
 */

public class Main {

    //Créaton des objets couleur
    Couleur rouge = new Couleur("Rouge");
    Couleur bleu = new Couleur("Bleu");
    //Créaton des objets surface
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

        System.out.println("-------------------------");

        carreBleu.couleur();
        carreBleu.surface();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
}
