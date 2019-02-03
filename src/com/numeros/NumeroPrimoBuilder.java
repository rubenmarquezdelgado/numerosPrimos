package com.numeros;

import java.util.ArrayList;
import java.util.List;

public class NumeroPrimoBuilder {
	
	public List<Integer> build(int numberOfPrimes){
		List<Integer> primes = new ArrayList<>();
		
		int lastNumberChecked = 2;
		
		while(!isSizeEqualsOrBigger(numberOfPrimes, primes)){
			addIfPrime(primes, lastNumberChecked);
			lastNumberChecked++;
		}
		return primes;
	}

	private boolean isSizeEqualsOrBigger(int numberOfPrimes, List<Integer> primes) {
		return primes.size() >= numberOfPrimes;
	}

	private void addIfPrime(List<Integer> primes, int lastNumberChecked) {
		if(isPrime(lastNumberChecked)){
			primes.add(lastNumberChecked);
		}
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
