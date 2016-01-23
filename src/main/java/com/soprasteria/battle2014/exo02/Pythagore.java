package com.soprasteria.battle2014.exo02;

import java.util.ArrayList;
import java.util.List;

import com.soprasteria.battle2014.Exo;

/**
 * A la vue des solutions, je considère que a,b,c sont des entiers positifs.
 * 
 * @author remi
 *
 */
public class Pythagore extends Exo {

	protected static void calculerABC(int x) {
		List<int[]> solutions = new ArrayList<int[]>();

		int a = 0;
		int b = 0;
		int c = 0;

		if (isSolution(a, b, c, x)) {
			solutions.add(new int[] { a, b, c });
		}
		for (int i = 0; i <= x; i++) {
			a = i;
			b = 0;
			c = 0;
			for (int j = 0; j <= x; j++) {
				b = j;
				c = 0;
				if (isBreaker(a, b, c, x)) {
					break;
				}
				for (int k = 0; k <= x; k++) {
					c = k;
					if (isBreaker(a, b, c, x)) {
						break;
					}
					if (isSolution(a, b, c, x)) {
						solutions.add(new int[] { a, b, c });
					}
				}
			}
		}
		echo("Pour x = " + x + " - " + solutions.size() + " solution(s) : ");
		for (int[] solution : solutions) {
			echo("(a,b,c) = (" + solution[0] + "," + solution[1] + "," + solution[2] + ")");
		}
	}

	/**
	 * Optimisation pour éviter calculs inutils
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @param x
	 * @return
	 */
	protected static boolean isBreaker(int a, int b, int c, int x) {
		if (a + b + c > x) {
			return true;
		}
		return false;
	}

	protected static boolean isSolution(int a, int b, int c, int x) {
		if (a + b + c == x && ((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2))) {
			return true;
		}
		return false;
	}

}
