package designPattern_Factory_Annabel;

public class TestFigure {

    public static void main(String[] args) {

        Factory factory = new Factory();

        Figure figure = factory.creeFigure("cercle");
        figure.afficher();
        figure.useFigure();
        figure = factory.creeFigure("rectangle");
        figure.afficher();
        figure.useFigure();
    }
}
