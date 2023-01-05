package com.sip.ams;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sip.ams.util.Calcul;

class TestCalcul {

	@Test
	void testSomme() {
		Calcul c = new Calcul();
		int res = c.somme(10, 20);
		assertEquals(res, 31);
		
	}
	
	@Test
	void testProduit() {
		Calcul c = new Calcul();
		int res = c.produit(10, 20);
		assertEquals(res, 200);
		
	}
	
	@Test
	void testDivision() {
		Calcul c = new Calcul();
		double res = c.division(10, 20);
		assertEquals(res, 0.5);
		
	}

}
