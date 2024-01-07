package TP3;
import java.lang.Math;

public class Cercle {
    private Point pointCirconference;
    private Point centre;
    private String couleur;

    public Cercle(Point centre, double rayon) {
        this.centre = centre;
        this.pointCirconference = new Point(centre.getX() + rayon, centre.getY());
        this.couleur = "bleu";
    }

    public Cercle(Point centre, Point pointCirconference, String couleur) {
        this.centre = centre;
        this.pointCirconference = pointCirconference;
        this.couleur = couleur;
    }

    public Cercle(Point unPoint, Point pointDiametralementOppose) {
        this.centre = new Point((unPoint.getX() + pointDiametralementOppose.getX()) / 2, (unPoint.getY() + pointDiametralementOppose.getY()) / 2);
        this.pointCirconference = unPoint;
        this.couleur = "bleu";
    }

    public static Cercle creerCercle(Point centre, Point pointCirconference) {
        return new Cercle(centre, pointCirconference, "bleu");
    }

    public double getRayon() {
        return centre.distance(pointCirconference);
    }

    public void setRayon(double rayon) {
        this.pointCirconference = new Point(centre.getX() + rayon, centre.getY());
    }

    public double getDiametre() {
        return 2 * getRayon();
    }

    public void setDiametre(double diametre) {
        setRayon(diametre / 2);
    }

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void translate(double x, double y) {
        centre.translater(x, y);
        pointCirconference.translater(x, y);
    }

    public boolean contient(Point p) {
        return centre.distance(p) <= getRayon();
    }

    public double Mesurable2D() {
        return 2 * Math.PI * getRayon();
    }

    @Override
    public String toString() {
        return "C" + getRayon() + "@(" + centre.getX() + ", " + centre.getY() + ")";
    }
}
