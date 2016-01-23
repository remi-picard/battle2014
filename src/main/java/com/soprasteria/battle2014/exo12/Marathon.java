package com.soprasteria.battle2014.exo12;

import java.util.Arrays;

import com.soprasteria.battle2014.Exo;

public class Marathon extends Exo {

	private static float distancePiste = 1;// km

	/**
	 * 
	 * @param vCoureur1
	 *            km/h
	 * @param vCoureur2
	 *            km/h
	 * @param vCoureur3
	 *            km/h
	 * @return min
	 */
	public static float calculerTemps(float vCoureur1, float vCoureur2, float vCoureur3) {

		float[] vitesses = { vCoureur1, vCoureur2, vCoureur3 };
		Arrays.sort(vitesses);

		vCoureur1 = vitesses[0];
		vCoureur2 = vitesses[1];
		vCoureur3 = vitesses[2];

		// v = d / t
		float tempsCoureurTour1 = distancePiste / vCoureur1;

		int i = 1;
		while (true) {

			float tempsTour = tempsCoureurTour1 * i++;

			float distanceCoureur2 = tempsTour * vCoureur2;
			float distanceCoureur3 = tempsTour * vCoureur3;

			if (distanceCoureur2 % distancePiste == 0 && distanceCoureur3 % distancePiste == 0) {
				return tempsTour * 60;
			}
		}

	}
}
