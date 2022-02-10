package tests;

import exceptions.FormeException;
import formes.Rectangle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Cette classe permet de tester la classe Rectangle
 */
public class RectangleTest {
    private Rectangle rectangle1, rectangle2, rectangle3, rectangle4, rectangle5, rectangle6;

    /**
     * Cette methode permet de configurer les tests de classe Rectangle
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {

        rectangle1 = new Rectangle(1, 1);
        rectangle2 = new Rectangle(2, 2);
        rectangle3 = new Rectangle(5, 10);
        rectangle4 = new Rectangle(10, 5);
        rectangle5 = new Rectangle(30, 11);
        rectangle6 = new Rectangle(12, 30);
    }

    /**
     * Cette methode permet de tester les scenarios invalides de la classe Rectangle
     */
    @Test
    public void testInvalides() {
        try {
            new Rectangle(0, 0);
            fail("Rectangle invalide");

        } catch (FormeException e) {
        }

        try {
            new Rectangle(0, 30);
            fail("Rectangle invalide");

        } catch (FormeException e) {
        }

        try {
            new Rectangle(30, 0);
            fail("Rectangle invalide");

        } catch (FormeException e) {
        }

        try {
            new Rectangle(31, 31);
            fail("Rectangle invalide");

        } catch (FormeException e) {
        }

        try {
            new Rectangle(1, 31);
            fail("Rectangle invalide");

        } catch (FormeException e) {
        }

        try {
            new Rectangle(31, 1);
            fail("Rectangle invalide");

        } catch (FormeException e) {
        }

    }

    /**
     * Cette methode permet de tester le calcul de perimetre d'un rectangle
     */
    @Test
    public void calculerPerimetre() {
        assertEquals(rectangle1.calculerPerimetre(), 4);
        assertEquals(rectangle2.calculerPerimetre(), 8);
        assertEquals(rectangle3.calculerPerimetre(), 30);
        assertEquals(rectangle4.calculerPerimetre(), 30);
        assertEquals(rectangle5.calculerPerimetre(), 82);
        assertEquals(rectangle6.calculerPerimetre(), 84);
    }

    /**
     * Cette methode permet de tester le calcul de surface d'un rectangle
     */
    @Test
    public void calculerSurface() {
        assertEquals(rectangle1.calculerSurface(), 1);
        assertEquals(rectangle2.calculerSurface(), 4);
        assertEquals(rectangle3.calculerSurface(), 50);
        assertEquals(rectangle4.calculerSurface(), 50);
        assertEquals(rectangle5.calculerSurface(), 330);
        assertEquals(rectangle6.calculerSurface(), 360);
    }

    /**
     * Cette methode permet de tester la personnalisation de la comparaison d'un rectangle avec le rectangle courant
     */
    @Test
    public void testEquals() {
        assertTrue(rectangle3.equals(rectangle4));
    }

    /**
     * Cette methode permet de tester la personnalisation des informations d'un rectangle
     */
    @Test
    public void testToString() {
        assertEquals(rectangle1.toString(), "Rectangle rouge 1, 1");
        assertEquals(rectangle2.toString(), "Rectangle rouge 2, 2");
        assertEquals(rectangle3.toString(), "Rectangle rouge 5, 10");
        assertEquals(rectangle4.toString(), "Rectangle rouge 10, 5");
        assertEquals(rectangle5.toString(), "Rectangle rouge 30, 11");
        assertEquals(rectangle6.toString(), "Rectangle rouge 12, 30");
    }

    /**
     * Cette methode permet de tester l'obtention de la couleur d'un rectangle
     */
    @Test
    public void getCouleur() {
        assertEquals(rectangle1.getCouleur(), Rectangle.COULEUR_DEFAUT);
        assertEquals(rectangle2.getCouleur(), Rectangle.COULEUR_DEFAUT);
        assertEquals(rectangle3.getCouleur(), Rectangle.COULEUR_DEFAUT);
        assertEquals(rectangle4.getCouleur(), Rectangle.COULEUR_DEFAUT);
        assertEquals(rectangle5.getCouleur(), Rectangle.COULEUR_DEFAUT);
        assertEquals(rectangle6.getCouleur(), Rectangle.COULEUR_DEFAUT);
    }

    /**
     * Cette methode permet de tester l'obtention de la hauteur d'un rectangle
     */
    @Test
    public void getHauteur() {
        assertEquals(rectangle1.getHauteur(), 1);
        assertEquals(rectangle2.getHauteur(), 2);
        assertEquals(rectangle3.getHauteur(), 5);
        assertEquals(rectangle4.getHauteur(), 10);
        assertEquals(rectangle5.getHauteur(), 30);
        assertEquals(rectangle6.getHauteur(), 12);
    }

    /**
     * Cette methode permet de tester l'obtention de la largeur d'un rectangle
     */
    @Test
    public void getLargeur() {
        assertEquals(rectangle1.getLargeur(), 1);
        assertEquals(rectangle2.getLargeur(), 2);
        assertEquals(rectangle3.getLargeur(), 10);
        assertEquals(rectangle4.getLargeur(), 5);
        assertEquals(rectangle5.getLargeur(), 11);
        assertEquals(rectangle6.getLargeur(), 30);
    }

    /**
     * Cette methode permet de tester l'obtention du nom d'un rectangle
     */
    @Test
    public void getNom() {
        assertEquals(rectangle1.getNom(), "Rectangle");
        assertEquals(rectangle2.getNom(), "Rectangle");
        assertEquals(rectangle3.getNom(), "Rectangle");
        assertEquals(rectangle4.getNom(), "Rectangle");
        assertEquals(rectangle5.getNom(), "Rectangle");
        assertEquals(rectangle6.getNom(), "Rectangle");
    }

    /**
     * Cette methode permet de tester l'assignation des couleurs valides d'un rectangle
     */
    @Test
    public void setCouleur() {
        // Couleur vide
        rectangle1.setCouleur("");
        assertEquals(rectangle1.getCouleur(), Rectangle.COULEUR_DEFAUT);

        // Autre couleur
        rectangle2.setCouleur("violet");
        assertEquals(rectangle2.getCouleur(), Rectangle.COULEUR_DEFAUT);

        // Pour toutes les couleurs disponibles
        for (String c : Rectangle.LES_COULEURS) {
            rectangle3.setCouleur(c);
            assertEquals(rectangle3.getCouleur(), c);
        }

        rectangle4.setCouleur(null);
        assertEquals(rectangle4.getCouleur(), Rectangle.COULEUR_DEFAUT);
    }

    /**
     * Cette methode permet de tester l'assignation des hauteurs valides d'un rectangle
     */
    @Test
    public void setHauteur() {
        for (int x = 1; x <= 30; x++) {
            rectangle1.setHauteur(x);
            assertEquals(rectangle1.getHauteur(), x);
        }
    }

    /**
     * Cette methode permet de tester l'assignation des largeurs valides d'un rectangle
     */
    @Test
    public void setLargeur() {
        for (int x = 1; x <= 30; x++) {
            rectangle1.setLargeur(x);
            assertEquals(rectangle1.getLargeur(), x);
        }
    }
}