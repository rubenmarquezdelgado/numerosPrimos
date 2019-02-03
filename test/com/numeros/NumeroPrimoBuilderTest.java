package com.numeros;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class NumeroPrimoBuilderTest {
	/*
	@Test
	public void test_primerNumeroPrimo(){
		NumeroPrimoBuilder numeroPrimoBuilder = new NumeroPrimoBuilder();
		List<Integer> numerosPrimos = numeroPrimoBuilder.build(1);
		assertEquals(1, numerosPrimos.size());
		assertEquals(new Integer(2), numerosPrimos.get(0));
	}
	*/
	
	private NumeroPrimoBuilder numeroPrimoBuilder = new NumeroPrimoBuilder();

	@Test
	public void test_segundoNumeroPrimo(){
		List<Integer> numerosPrimos = numeroPrimoBuilder.build(2);
		assertEquals(2, numerosPrimos.size());
		assertEquals(new Integer(3), numerosPrimos.get(1));
	}
	
	@Test
	public void test_is_1_PrimeNumber(){
		assertEquals(true, numeroPrimoBuilder.isPrime(1));	
	}
	
	@Test
	public void test_is_0_PrimeNumber(){
		assertEquals(true, numeroPrimoBuilder.isPrime(0));	
	}
	
	@Test
	public void test_is_2_PrimeNumber(){
		assertEquals(true, numeroPrimoBuilder.isPrime(2));	
	}
	
	@Test
	public void test_is_3_PrimeNumber(){
		assertEquals(true, numeroPrimoBuilder.isPrime(3));	
	}
	
	@Test
	public void test_is_not_4_PrimeNumber(){
		assertEquals(false, numeroPrimoBuilder.isPrime(4));	
	}
	
}
