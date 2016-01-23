package com.soprasteria.battle2014.exo01;

import java.math.BigInteger;

import com.google.common.math.BigIntegerMath;
import com.soprasteria.battle2014.Exo;

public class PyramideTonnneaux extends Exo {

	protected int a = 1;
	protected int b = 1;

	protected static int calcC(int nbTonneaux) {
		return -2 * nbTonneaux;
	}

	protected static int calcDelta(int nbTonneaux) {
		return 1 + 8 * nbTonneaux;
	}

	protected static double calcTaillePyramideMax(int nbTonneaux) {
		return ((-1 + Math.sqrt(calcDelta(nbTonneaux))) / 2.0);
	}

	public static BigInteger calculerNbPyramides(int nbTonneaux) {
		double taillePyramideMax = calcTaillePyramideMax(nbTonneaux);
		if (calcPartieEntiere(taillePyramideMax) == taillePyramideMax) {
			echo("taillePyramideMax : " + taillePyramideMax);
			return BigIntegerMath.factorial(nbTonneaux);
		} else {
			int taillePyramide = (int) calcPartieEntiere(taillePyramideMax);
			int nbTonneauxUtilises = calcNbTonneaux(taillePyramide);
			echo("taillePyramideMax : " + taillePyramide);
			return BigIntegerMath.factorial(nbTonneauxUtilises)
					.multiply(BigIntegerMath.binomial(nbTonneaux, nbTonneauxUtilises));
		}
	}

	protected static int calcNbTonneaux(int taillePyramide) {
		return taillePyramide * (taillePyramide + 1) / 2;
	}

	public static double calcPartieEntiere(double nb) {
		return Math.floor(nb);
	}

}
