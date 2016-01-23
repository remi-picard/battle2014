package com.soprasteria.battle2014.exo02;

import org.junit.Test;

import com.soprasteria.battle2014.ExoTest;

public class PythagoreTest extends ExoTest {
	// Les 4 tests : 26s
	@Test
	public void test() {
		// Séparément : 0,5s
		Pythagore.calculerABC(1000);
		// Séparément : 1,4s
		Pythagore.calculerABC(1500);
		// Séparément : 3,2s
		Pythagore.calculerABC(2000);
		// Séparément : 55s
		Pythagore.calculerABC(5000);
	}
}
