package org.cuatrovientos.dam.ed.EjerciciosJUnit.Ejercicio2;

public class generarIPV4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] octetos = new int[4];
		generarNumero numeros = null;
        // Aseguramos que el primer y último octeto no sean 0
        octetos[0] = numeros.generarNumeroAleatorio(1, 254); 
        for (int i = 1; i < 3; i++) {
            octetos[i] = numeros.generarNumeroAleatorio(0, 254);
        }
        octetos[3] = numeros.generarNumeroAleatorio(1, 254);

        System.out.println("%d.%d.%d.%d"+ octetos[0]+ octetos[1]+ octetos[2]+ octetos[3]);
    }
}