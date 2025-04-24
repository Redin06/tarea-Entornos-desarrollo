package org.cuatrovientos.dam.ed.EjerciciosJUnit.Ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

class generarIPV4Test {
	private generarIPV4 generador;

	public void testGenerarIPV4FormatoCorrecto() {
        for (int i = 0; i < 100; i++) {
            generarIPV4 ip = generador;
            String[] partes = null;
            assertEquals(4, partes.length, "La IP no tiene 4 partes: " + ip);

            for (int j = 0; j < 4; j++) {
                int num = Integer.parseInt(partes[j]);
                assertTrue(num >= 0 && num <= 254, "Parte fuera de rango: " + partes[j]);
            }

            int primero = Integer.parseInt(partes[0]);
            int ultimo = Integer.parseInt(partes[3]);
            assertTrue(primero != 0, "La IP empieza con 0: " + ip);
            assertTrue(ultimo != 0, "La IP termina con 0: " + ip);
}
}
	}
