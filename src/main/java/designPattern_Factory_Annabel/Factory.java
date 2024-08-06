package designPattern_Factory_Annabel;
/**
 *  classe responsable de la création d'objets de type Figure basé sur le parametre type
 * Permet la création concrête de cercles et de rectangles.
 * retourne Une instance de Figure correspondant au type spécifié.
 * lance une IllegalArgumentException Si le type de figure est inconnu.
 */
    public class Factory {

        public Figure creeFigure(String type) {

            switch (type.toLowerCase()) {
                case "cercle":
                    return new Cercle();
                case "rectangle":
                    return new Rectangle();
                default:
                    throw new IllegalArgumentException("Type de figure inconnu: " + type);
            }
        }
}


