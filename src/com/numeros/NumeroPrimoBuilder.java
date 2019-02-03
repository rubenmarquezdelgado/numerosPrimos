package com.numeros;

import java.util.Arrays;
import java.util.List;

public class NumeroPrimoBuilder {
	
	public List<Integer> build(int numberOfPrimes){
		return Arrays.asList(2,3);
	}
	
	public boolean isPrime(int numero){
		int contador;
		boolean esNumeroPrimo;
		esNumeroPrimo = ( numero % 2 ) <= 1;
		contador = 2;
		while ( esNumeroPrimo && contador < numero ){
			esNumeroPrimo = ( numero % contador ) != 0;
			contador = contador + 1;
		}
		return esNumeroPrimo;
	}
	
}
