package org.cuatrovientos.dam.ed.EjerciciosJUnit.Ejercicio2;
import java.util.Random;

public class generarNumero {
	Random random;
	public generarNumero() {
        this.random = new Random();
    }

    public int generarNumeroAleatorio(int min, int max) {
        return random.nextInt((max - min) + 1) + min;
    }
}