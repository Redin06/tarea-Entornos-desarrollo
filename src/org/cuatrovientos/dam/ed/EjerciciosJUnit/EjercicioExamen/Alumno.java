package org.cuatrovientos.dam.ed.EjerciciosJUnit.EjercicioExamen;
import java.util.List;
import java.util.regex.Pattern;

public class Alumno {

    private String nombre;
    private String email;
    private List<Modulo> modulos;

    public Alumno(String nombre, String email, List<Modulo> modulos) {
        if (email == null || !Pattern.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$", email)) {
            throw new IllegalArgumentException("Email inválido");
        }
        this.nombre = nombre;
        this.email = email;
        this.modulos = modulos;
    }

    public boolean apruebaCurso() {
        if (modulos == null || modulos.isEmpty()) return true;

        for (Modulo modulo : modulos) {
            if (modulo.notaModulo() <= 5.0) return false;
        }
        return true;
    }
}

