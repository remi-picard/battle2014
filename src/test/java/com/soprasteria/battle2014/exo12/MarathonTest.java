package com.soprasteria.battle2014.exo12;

import org.junit.Test;

import com.soprasteria.battle2014.ExoTest;

public class MarathonTest extends ExoTest {
	@Test
	public void testCalculerTemps() {
		echo(Marathon.calculerTemps(2, 4, 6));
		echo(Marathon.calculerTemps(12, 14, 5));
		echo(Marathon.calculerTemps(6, 6, 6));
	}

}
