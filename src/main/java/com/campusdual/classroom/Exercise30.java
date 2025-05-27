package com.campusdual.classroom;

// Clase con el método que lanza la excepción personalizada
public class Exercise30 {

    public static double divisionWithCustomException(double numerator, double denominator) throws DivisionByZeroException {
        if (denominator == 0) {
            throw new DivisionByZeroException("¡Error! No se puede dividir por cero.");
        }
        return numerator / denominator;
    }

    public static void main(String[] args) {
        try {
            double result = divisionWithCustomException(10, 0);
            System.out.println("Resultado: " + result);
        } catch (DivisionByZeroException e) {
            System.err.println(e.getMessage());
        }
    }
}
