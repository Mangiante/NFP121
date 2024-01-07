package TP3;

import static org.junit.Assert.*;
import org.junit.Test;

public class CercleTest {

    @Test
    public void testCreerDepuisPointsDiametralementOpposes() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(2, 0);
        Cercle c = new Cercle(p1, p2);
        assertEquals("couleur = bleue", "bleu", c.getCouleur());
        // J'ai eu un bug ici voir LISEZMOI.txt
        assertEquals("centre X doit être 1", 1.0, c.getCentre().getX(), 0.001);
        assertEquals("centre Y doit être 0", 0.0, c.getCentre().getY(), 0.001);
        assertEquals("rayon = 1", 1.0, c.getRayon(), 0.001);
    }

    @Test
    public void testCreerDepuisPoints() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(2, 0);
        String couleur = "rouge";
        Cercle c = new Cercle(p1, p2, couleur);
        assertEquals("La couleur doit etre celle spécifié", couleur, c.getCouleur());
        // Bug pas réglé ici
        assertEquals("Le centre doit etre correct", new Point(1,0), c.getCentre());
        assertEquals("Le rayon doit etre correct", 1.0, c.getRayon(), 0.001);

    }

    @Test
    public void testCreerCercle() {
        Point centre = new Point(1, 0);
        Point circonference = new Point(2, 0);
        Cercle c = Cercle.creerCercle(centre, circonference);
        assertEquals("couleur = bleue", "bleu", c.getCouleur());
        assertEquals("Le rayon doit etre correct", 1.0, c.getRayon(), 0.001);
        assertEquals("Le centre doit etre correct", centre, c.getCentre());
    }
}

