package tests;

import exceptions.FormeException;
import formes.Cercle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Cette classe permet de tester la classe Cercle
 */
public class CercleTest {
    private Cercle cercle1, cercle2, cercle3, cercle4;

    /**
     * Cette methode permet de configurer les tests de classe Cercle
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        cercle1 = new Cercle(1);
        cercle2 = new Cercle(2);
        cercle3 = new Cercle(30);
        cercle4 = new Cercle(2);

    }

    /**
     * Cette methode permet de tester les scenarios invalides de la classe Cercle
     */
    @Test
    public void testInvalides() {
        try {
            new Cercle(0);
            fail("Cercle invalide");

        } catch (FormeException e) {
        }

        try {
            new Cercle(31);
            fail("Cercle invalide");

        } catch (FormeException e) {
        }
    }

    /**
     * Cette methode permet de tester le calcul de perimetre d'un cercle
     */
    @Test
    public void calculerPerimetre() {
        assertEquals(cercle1.calculerPerimetre(), 6);
        assertEquals(cercle2.calculerPerimetre(), 12);
        assertEquals(cercle3.calculerPerimetre(), 188);
    }

    /**
     * Cette methode permet de tester le calcul de surface d'un cercle
     */
    @Test
    public void calculerSurface() {
        assertEquals(cercle1.calculerSurface(), 3);
        assertEquals(cercle2.calculerSurface(), 12);
        assertEquals(cercle3.calculerSurface(), 2827);
    }

    /**
     * Cette methode permet de tester la personnalisation de la comparaison d'un cercle avec le cercle courant
     */
    @Test
    public void testEquals() {
        assertTrue(cercle2.equals(cercle4));
    }

    /**
     * Cette methode permet de tester la personnalisation des informations d'un cercle
     */
    @Test
    public void testToString() {
        assertEquals(cercle1.toString(), "Cercle vert 1");
        assertEquals(cercle2.toString(), "Cercle vert 2");
        assertEquals(cercle3.toString(), "Cercle vert 30");
    }

    /**
     * Cette methode  permet de tester la methode Main de la classe Cercle
     */
    @Test
    public void main() {
    }

    /**
     * Cette methode permet de tester l'obtention de la couleur d'un cercle
     */
    @Test
    public void getCouleur() {
        assertEquals(cercle1.getCouleur(), Cercle.COULEUR_DEFAUT);
        assertEquals(cercle2.getCouleur(), Cercle.COULEUR_DEFAUT);
        assertEquals(cercle3.getCouleur(), Cercle.COULEUR_DEFAUT);
    }

    /**
     * Cette methode permet de tester l'obtention du rayon d'un cercle
     */
    @Test
    public void getRayon() {
        assertEquals(cercle1.getRayon(), 1);
        assertEquals(cercle2.getRayon(), 2);
        assertEquals(cercle3.getRayon(), 30);
    }

    /**
     * Cette methode permet de tester l'obtention du nom d'un cercle
     */
    @Test
    public void getNom() {
        assertEquals(cercle1.getNom(), "Cercle");
        assertEquals(cercle2.getNom(), "Cercle");
        assertEquals(cercle3.getNom(), "Cercle");
    }

    /**
     * Cette methode permet de tester l'assignation de couleurs valides d'un cercle
     */
    @Test
    public void setCouleur() {
        // Couleur vide
        cercle1.setCouleur("");
        assertEquals(cercle1.getCouleur(), Cercle.COULEUR_DEFAUT);

        // Autre couleur
        cercle2.setCouleur("violet");
        assertEquals(cercle2.getCouleur(), Cercle.COULEUR_DEFAUT);

        // Pour toutes les couleurs disponibles
        cercle3.setCouleur("rouge");
        assertEquals(cercle3.getCouleur(), "rouge");

        cercle3.setCouleur("vert");
        assertEquals(cercle3.getCouleur(), "vert");

        cercle3.setCouleur("bleu");
        assertEquals(cercle3.getCouleur(), "bleu");

        cercle3.setCouleur("jaune");
        assertEquals(cercle3.getCouleur(), "jaune");

        cercle3.setCouleur("noir");
        assertEquals(cercle3.getCouleur(), "noir");

        cercle3.setCouleur("orange");
        assertEquals(cercle3.getCouleur(), "orange");

        cercle3.setCouleur(null);
        assertEquals(cercle3.getCouleur(), Cercle.COULEUR_DEFAUT);
    }

    /**
     * Cette methode permet de tester l'assignation de rayons valides d'un cercle
     */
    @Test
    public void setRayon() {
        for (int x = 1; x <= 30; x++) {
            cercle1.setRayon(x);
            assertEquals(cercle1.getRayon(), x);
        }
    }
}