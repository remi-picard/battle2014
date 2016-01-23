package com.soprasteria.battle2014.exo11;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.soprasteria.battle2014.ExoTest;

public class CourseAiguillesTest extends ExoTest {
	@Test
	public void testCalculerNbSuperposition() {
		echo("11h12 -> 18h53");
		echo(CourseAiguilles.calculerSuperposition("11h12", "18h53"));
		echo("23h12 -> 01h53");
		echo(CourseAiguilles.calculerSuperposition("23h12", "01h53"));
		echo("00h01 -> 22h24");
		echo(CourseAiguilles.calculerSuperposition("00h01", "22h24"));
	}

	@Test
	public void testCalculerAngleHeure() {
		assertEquals(CourseAiguilles.calculerAngleHeure(6, 0), 180.0, 0.0f);
		assertEquals(CourseAiguilles.calculerAngleHeure(18, 0), 180.0, 0.0f);
		assertEquals(CourseAiguilles.calculerAngleHeure(3, 0), 90.0, 0.0f);
		assertEquals(CourseAiguilles.calculerAngleHeure(9, 0), 270.0, 0.0f);

		assertEquals(195.0, CourseAiguilles.calculerAngleHeure(6, 30), 0.0f);
	}

	@Test
	public void testCalculerAngleMinute() {
		assertEquals(CourseAiguilles.calculerAngleMinute(15), 90.0, 0.0f);
		assertEquals(CourseAiguilles.calculerAngleMinute(30), 180.0, 0.0f);
		assertEquals(CourseAiguilles.calculerAngleMinute(45), 270.0, 0.0f);

		assertEquals(CourseAiguilles.calculerAngleMinute(7), 45.0, 3.0f);
		assertEquals(CourseAiguilles.calculerAngleMinute(8), 45.0, 3.0f);
	}

}
