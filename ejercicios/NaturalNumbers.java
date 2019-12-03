package com.softtek.java.academy.ejercicios;

public class NaturalNumbers {
	public static void main(String[] args) {
		int suma=0;
		for(int i = 0; i<100;i++) {
			if((i%3)==0 || (i%5) == 0) {
				suma = (suma + i);
			}
		}
		System.out.println(suma);
	}
}
