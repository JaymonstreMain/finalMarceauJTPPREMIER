package tests_conformites;

import static org.junit.Assert.*;

import java.lang.reflect.Modifier;

import org.junit.Test;

/**
 * Tests de conformité pour la classe Rectangle Tp1 420-202-LI Hiver 2016
 *
 * @author Jocelyn.Goulet
 */
public class RectangleConformeTest {

	@Test
	public void testRectangleConforme() throws ClassNotFoundException, Exception {
		// Package et nom de la classe
		Class c = Class.forName("formes.Rectangle");

		// Constructeurs
		assertTrue(c.getConstructor(new Class[] { int.class, int.class }).getName() == "formes.Rectangle");

		// Attributs
		assertTrue((c.getField("MIN_VAL").getModifiers() & Modifier.STATIC + Modifier.FINAL + Modifier.PUBLIC) == Modifier.STATIC
				+ Modifier.FINAL + Modifier.PUBLIC);
		assertTrue((c.getField("MIN_VAL").getType() == int.class) && (formes.Rectangle.MIN_VAL == 1));

		assertTrue((c.getField("MAX_VAL").getModifiers() & Modifier.STATIC + Modifier.FINAL + Modifier.PUBLIC) == Modifier.STATIC
				+ Modifier.FINAL + Modifier.PUBLIC);
		assertTrue((c.getField("MAX_VAL").getType() == int.class) && (formes.Rectangle.MAX_VAL == 30));

		assertTrue((c.getField("LES_COULEURS").getModifiers() & Modifier.STATIC + Modifier.FINAL + Modifier.PUBLIC) == Modifier.STATIC
				+ Modifier.FINAL + Modifier.PUBLIC);
		assertTrue(c.getField("LES_COULEURS").getType() == String[].class);

		assertTrue((c.getField("COULEUR_DEFAUT").getModifiers() & Modifier.STATIC + Modifier.FINAL + Modifier.PUBLIC) == Modifier.STATIC
				+ Modifier.FINAL + Modifier.PUBLIC);
		assertTrue((c.getField("COULEUR_DEFAUT").getType() == String.class)
				&& (formes.Rectangle.COULEUR_DEFAUT.equals("rouge")));

		assertTrue(c.getDeclaredField("hauteur").getType() == int.class);
		assertTrue(c.getDeclaredField("largeur").getType() == int.class);
		assertTrue(c.getDeclaredField("nom").getType() == String.class);
		assertTrue((c.getDeclaredField("nom").getModifiers() & Modifier.STATIC) == Modifier.STATIC);
		assertTrue(c.getDeclaredField("couleur").getType() == String.class);

		// Méthodes
		assertTrue(c.getMethod("calculerPerimetre", new Class[] {}).getReturnType() == int.class);
		assertTrue(c.getMethod("calculerSurface", new Class[] {}).getReturnType() == int.class);
		assertTrue(c.getMethod("toString", new Class[] {}).getReturnType() == String.class);
		assertTrue(c.getMethod("getCouleur", new Class[] {}).getReturnType() == String.class);
		assertTrue(c.getMethod("setCouleur", new Class[] { String.class }).getReturnType() == void.class);
		assertTrue(c.getMethod("getHauteur", new Class[] {}).getReturnType() == int.class);
		assertTrue(c.getMethod("setHauteur", new Class[] { int.class }).getReturnType() == void.class);
		assertTrue(c.getMethod("getLargeur", new Class[] {}).getReturnType() == int.class);
		assertTrue(c.getMethod("setLargeur", new Class[] { int.class }).getReturnType() == void.class);
		assertTrue(c.getMethod("getNom", new Class[] {}).getReturnType() == String.class);
		assertTrue(c.getMethod("equals", new Class[] { Object.class }).getReturnType() == boolean.class);

		assertTrue((c.getDeclaredMethod("validerHauteur", new Class[] { int.class }).getModifiers()
				& Modifier.STATIC + Modifier.PRIVATE) == Modifier.STATIC + Modifier.PRIVATE);
		assertTrue(c.getDeclaredMethod("validerHauteur", new Class[] { int.class }).getReturnType() == boolean.class);

		assertTrue((c.getDeclaredMethod("validerLargeur", new Class[] { int.class }).getModifiers()
				& Modifier.STATIC + Modifier.PRIVATE) == Modifier.STATIC + Modifier.PRIVATE);
		assertTrue(c.getDeclaredMethod("validerLargeur", new Class[] { int.class }).getReturnType() == boolean.class);

		assertTrue((c.getDeclaredMethod("validerCouleur", new Class[] { String.class }).getModifiers()
				& Modifier.STATIC + Modifier.PRIVATE) == Modifier.STATIC + Modifier.PRIVATE);
		assertTrue(
				c.getDeclaredMethod("validerCouleur", new Class[] { String.class }).getReturnType() == boolean.class);
	}
}
