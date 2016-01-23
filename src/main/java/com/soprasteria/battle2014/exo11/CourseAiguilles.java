package com.soprasteria.battle2014.exo11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.soprasteria.battle2014.Exo;

public class CourseAiguilles extends Exo {

	public static int calculerSuperposition(String hDebut, String hFin) {

		Pattern p = Pattern.compile("([0-9]{2})h([0-9]{2})");
		Matcher mHDebut = p.matcher(hDebut);
		Matcher mHFin = p.matcher(hFin);
		boolean b = mHDebut.matches() && mHFin.matches();
		if (!b) {
			echo("Heures incorrectes");
		}
		int heureDebut = Integer.parseInt(mHDebut.group(1));
		int minDebut = Integer.parseInt(mHDebut.group(2));
		int heureFin = Integer.parseInt(mHFin.group(1));
		int minFin = Integer.parseInt(mHFin.group(2));
		echo("Heures correctes");
		echo("Début : " + heureDebut + "h" + minDebut);

		int nb = 0;

		if (heureDebut < heureFin || (heureDebut == heureFin && minDebut < minFin)) {

			for (int h = heureDebut; h <= heureFin; h++) {
				nb = calculerNbSuperpositionDansLHeure(heureDebut, minDebut, heureFin, minFin, nb, h);
			}

		} else {
			for (int h = heureDebut; h < 24; h++) {
				nb = calculerNbSuperpositionDansLHeure(heureDebut, minDebut, heureFin, minFin, nb, h);
			}
			for (int h = 0; h <= heureFin; h++) {
				nb = calculerNbSuperpositionDansLHeure(heureDebut, minDebut, heureFin, minFin, nb, h);
			}
		}

		return nb;
	}

	private static int calculerNbSuperpositionDansLHeure(int heureDebut, int minDebut, int heureFin, int minFin, int nb,
			int h) {
		if (h == heureDebut) {
			for (int m = minDebut; m < 60; m++) {
				nb = calculerNbSuperposition(nb, h, m);
			}
		} else if (h == heureFin) {
			for (int m = 0; m <= minFin; m++) {
				nb = calculerNbSuperposition(nb, h, m);
			}
		} else {
			for (int m = 0; m < 60; m++) {
				nb = calculerNbSuperposition(nb, h, m);
			}
		}
		return nb;
	}

	private static int calculerNbSuperposition(int nb, int h, int m) {
		float angleHeure = calculerAngleHeure(h, 0);
		float angleMinute = calculerAngleMinute(m);

		if (Math.abs(angleHeure - angleMinute) == 0.0f) {
			echo("Superposition -> Heure : " + h + ":" + m);
			nb++;
		}
		return nb;
	}

	protected static float calculerAngleHeure(int heure, int minute) {
		// h -> 12
		// angle -> 360
		return (float) ((heure % 12) * 360.0 / 12.0) + (float) (minute / 60.0 * 30.0);
	}

	protected static float calculerAngleMinute(int minute) {
		// h -> 12
		// angle -> 360
		return (float) (minute * 360.0 / 60.0);
	}
}
