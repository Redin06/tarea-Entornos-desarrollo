package org.cuatrovientos.dam.ed.EjerciciosJUnit.EjercicioExamen;
import java.util.List;
public class Modulo {
	private String nombre;
    private List<Double> entregables;
    private List<Double> examenes;

    public Modulo(String nombre, List<Double> entregables, List<Double> examenes) {
        this.nombre = nombre;
        this.entregables = entregables;
        this.examenes = examenes;
    }

    public double notaModulo() {
        if (entregables.contains(-1.0)) return 0.0;
        if (examenes.size() == 0 || entregables.size() == 0) return 0.0;
        if (examenes.contains(-1.0)) return 0.0;

        for (Double nota : examenes) {
            if (nota < 4.0) return nota;
        }

        double mediaEntregables = entregables.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        double mediaExamenes = examenes.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        return (mediaEntregables * 0.6) + (mediaExamenes * 0.4);
    }
}