package tests_conformites;

import static org.junit.Assert.*;

import java.lang.reflect.Modifier;

import org.junit.Test;

/**
 * Tests de conformité pour la classe Cercle Tp1 420-202-LI Hiver 2016
 *
 * @author Jocelyn.Goulet
 */
public class CercleConformeTest
{

	@Test
	public void testCercleConforme() throws ClassNotFoundException, Exception
	{
		// Package et nom de la classe
		Class c = Class.forName("formes.Cercle");

		// Constructeurs
		assertTrue(c.getConstructor(new Class[]{}).getName() == "formes.Cercle");
		assertTrue(c.getConstructor(new Class[]	{ int.class }).getName() == "formes.Cercle");

		// Attributs
		assertTrue(
				(c.getDeclaredField("MIN_VAL").getModifiers() & Modifier.STATIC
						+ Modifier.FINAL + Modifier.PRIVATE) == Modifier.STATIC
								+ Modifier.FINAL + Modifier.PRIVATE);
		assertTrue(c.getDeclaredField("MIN_VAL").getType() == int.class);

		assertTrue(
				(c.getDeclaredField("MAX_VAL").getModifiers() & Modifier.STATIC
						+ Modifier.FINAL + Modifier.PRIVATE) == Modifier.STATIC
								+ Modifier.FINAL + Modifier.PRIVATE);
		assertTrue(c.getDeclaredField("MAX_VAL").getType() == int.class);

		assertTrue((c.getDeclaredField("RAYON_DEFAUT").getModifiers()
				& Modifier.STATIC + Modifier.FINAL
						+ Modifier.PRIVATE) == Modifier.STATIC + Modifier.FINAL
								+ Modifier.PRIVATE);
		assertTrue(c.getDeclaredField("RAYON_DEFAUT").getType() == int.class);

		assertTrue((c.getDeclaredField("LES_COULEURS").getModifiers()
				& Modifier.STATIC + Modifier.FINAL
						+ Modifier.PRIVATE) == Modifier.STATIC + Modifier.FINAL
								+ Modifier.PRIVATE);
		assertTrue(
				c.getDeclaredField("LES_COULEURS").getType() == String[].class);

		assertTrue((c.getField("COULEUR_DEFAUT").getModifiers()
				& Modifier.STATIC + Modifier.FINAL) == Modifier.STATIC
						+ Modifier.FINAL);
		assertTrue((c.getField("COULEUR_DEFAUT").getType() == String.class)
				&& (formes.Cercle.COULEUR_DEFAUT.equals("vert")));

		assertTrue(c.getDeclaredField("rayon").getType() == int.class);
		assertTrue(c.getDeclaredField("nom").getType() == String.class);
		assertTrue((c.getDeclaredField("nom").getModifiers() & Modifier.STATIC) == Modifier.STATIC);
		assertTrue(c.getDeclaredField("couleur").getType() == String.class);

		// Méthodes
		assertTrue(c.getMethod("calculerPerimetre", new Class[]
		{}).getReturnType() == int.class);
		assertTrue(c.getMethod("calculerSurface", new Class[]
		{}).getReturnType() == int.class);
		assertTrue(c.getMethod("toString", new Class[]
		{}).getReturnType() == String.class);
		assertTrue(c.getMethod("getCouleur", new Class[]
		{}).getReturnType() == String.class);
		assertTrue(c.getMethod("setCouleur", new Class[]
		{ String.class }).getReturnType() == void.class);
		assertTrue(c.getMethod("getNom", new Class[]
		{}).getReturnType() == String.class);
		assertTrue((c.getDeclaredMethod("getNom", new Class[]
				{ }).getModifiers()
						& Modifier.STATIC ) == Modifier.STATIC);		
		assertTrue(c.getMethod("getRayon", new Class[]
		{}).getReturnType() == int.class);
		assertTrue(c.getMethod("setRayon", new Class[]
		{ int.class }).getReturnType() == void.class);
		assertTrue(c.getMethod("equals", new Class[]
		{ Object.class }).getReturnType() == boolean.class);

		assertTrue((c.getDeclaredMethod("validerRayon", new Class[]
		{ int.class }).getModifiers()
				& Modifier.STATIC + Modifier.PRIVATE) == Modifier.STATIC
						+ Modifier.PRIVATE);
		assertTrue(c.getDeclaredMethod("validerRayon", new Class[]
		{ int.class }).getReturnType() == boolean.class);

		assertTrue((c.getDeclaredMethod("validerCouleur", new Class[]
		{ String.class }).getModifiers()
				& Modifier.STATIC + Modifier.PRIVATE) == Modifier.STATIC
						+ Modifier.PRIVATE);
		assertTrue(c.getDeclaredMethod("validerCouleur", new Class[]
		{ String.class }).getReturnType() == boolean.class);
	}
}
