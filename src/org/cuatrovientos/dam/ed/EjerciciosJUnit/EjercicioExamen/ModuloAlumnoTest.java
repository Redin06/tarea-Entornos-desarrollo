package org.cuatrovientos.dam.ed.EjerciciosJUnit.EjercicioExamen;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;

class ModuloAlumnoTest {

	@Test
	public void testNotaModulo_CasoExito() {
        Modulo m = new Modulo("Programación", Arrays.asList(8.0, 9.0), Arrays.asList(7.0, 6.0));
        double nota = m.notaModulo();
        assertTrue(nota > 0);
    }

    @Test
    public void testNotaModulo_EntregableIncompleto() {
        Modulo m = new Modulo("Bases", Arrays.asList(8.0, -1.0), Arrays.asList(7.0, 6.0));
        assertEquals(0.0, m.notaModulo());
    }

    @Test
    public void testNotaModulo_ExamenFaltante() {
        Modulo m = new Modulo("Sistemas", Arrays.asList(8.0, 9.0), Arrays.asList(-1.0, 6.0));
        assertEquals(0.0, m.notaModulo());
    }

    @Test
    public void testNotaModulo_NotaInferiorA4() {
        Modulo m = new Modulo("Redes", Arrays.asList(8.0, 9.0), Arrays.asList(3.0, 6.0));
        assertEquals(3.0, m.notaModulo());
    }

    @Test
    public void testAlumnoApruebaCurso_TodoAprobado() {
        Modulo m1 = new Modulo("Programación", Arrays.asList(8.0, 9.0), Arrays.asList(7.0, 6.0));
        Modulo m2 = new Modulo("Sistemas", Arrays.asList(7.0, 7.5), Arrays.asList(8.0, 7.0));
        Alumno a = new Alumno("Carlos", "carlos@4v.com", Arrays.asList(m1, m2));
        assertTrue(a.apruebaCurso());
    }

    @Test
    public void testAlumnoNoApruebaCurso_ModuloSuspendido() {
        Modulo m1 = new Modulo("Programación", Arrays.asList(8.0, -1.0), Arrays.asList(7.0, 6.0)); // dará 0
        Alumno a = new Alumno("Laura", "laura@4v.com", Collections.singletonList(m1));
        assertFalse(a.apruebaCurso());
    }

    @Test
    public void testAlumnoApruebaCurso_SinModulos() {
        Alumno a = new Alumno("Ana", "ana@4v.com", Collections.emptyList());
        assertTrue(a.apruebaCurso());
    }

    @Test
    public void testAlumnoEmailInvalido_LanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Alumno("Pepe", "email_invalido", Collections.emptyList());
        });
    }

}
