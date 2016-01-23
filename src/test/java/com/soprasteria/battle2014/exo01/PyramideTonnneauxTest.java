package com.soprasteria.battle2014.exo01;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.Test;

import com.google.common.math.BigIntegerMath;
import com.soprasteria.battle2014.ExoTest;

public class PyramideTonnneauxTest extends ExoTest {

	@Test
	public void testCalcC() throws Exception {
		assertEquals(PyramideTonnneaux.calcC(11), -22);
	}

	@Test
	public void testNombreMax10Tonneaux() throws Exception {
		assertEquals(PyramideTonnneaux.calcTaillePyramideMax(10), 4.0, 0.0);
	}

	@Test
	public void testNombreMax11Tonneaux() throws Exception {
		assertEquals(PyramideTonnneaux.calcTaillePyramideMax(11), 4.2, 0.1);
	}

	@Test
	public void testFactorial() throws Exception {
		assertEquals(BigInteger.valueOf(6), BigIntegerMath.factorial(3));
	}

	@Test
	public void testCalcNbTonneauxPyramide2niveaux() throws Exception {
		assertEquals(3, PyramideTonnneaux.calcNbTonneaux(2));
	}

	@Test
	public void testCalcNbTonneauxPyramide3niveaux() throws Exception {
		assertEquals(6, PyramideTonnneaux.calcNbTonneaux(3));
	}

	@Test
	public void testCalculerNbPyramides10tonneaux() throws Exception {
		BigInteger reponse = PyramideTonnneaux.calculerNbPyramides(10);
		echo("Réponse : " + reponse);
		assertEquals(BigIntegerMath.factorial(10), reponse);
	}

	@Test
	public void testCalculerNbPyramides11tonneaux() throws Exception {
		BigInteger reponse = PyramideTonnneaux.calculerNbPyramides(11);
		echo("Réponse : " + reponse);
		assertEquals(BigInteger.valueOf(39916800), reponse);
	}

	@Test
	public void testCalculerNbPyramides12tonneaux() throws Exception {
		BigInteger reponse = PyramideTonnneaux.calculerNbPyramides(12);
		echo("Réponse : " + reponse);
		assertEquals(BigInteger.valueOf(239500800), reponse);
	}

	@Test
	public void testCalculerNbPyramides13tonneaux() throws Exception {
		BigInteger reponse = PyramideTonnneaux.calculerNbPyramides(13);
		echo("Réponse : " + reponse);
		assertEquals(BigInteger.valueOf(1037836800), reponse);
	}

}
