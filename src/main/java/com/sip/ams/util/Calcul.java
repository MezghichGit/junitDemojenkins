package com.sip.ams.util;

public class Calcul {

	public int somme(int a, int b) {
		return a + b;
	}

	public int produit(int a, int b) {
		return a * b;
	}

	public double division(int a, int b) {
		if (b == 0)
			return -999;
		else
			return (double)a / b;
	}

}
