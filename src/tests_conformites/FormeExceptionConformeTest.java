package tests_conformites;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests de conformité pour la classe FormeException Tp1 420-202-LI Hiver 2016
 *
 * @author Jocelyn.Goulet
 *
 */
public class FormeExceptionConformeTest
{

	@Test
	public void testFormeExceptionConforme()
			throws ClassNotFoundException, Exception
	{
		// Package et nom de la classe
		Class c = Class.forName("exceptions.FormeException");

		// Constructeurs
		assertTrue(c.getConstructor(new Class[]
		{}).getName() == "exceptions.FormeException");
		assertTrue(c.getConstructor(new Class[]
		{ String.class }).getName() == "exceptions.FormeException");

		// Attributs

		// Méthodes

	}
}
