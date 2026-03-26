package Practica;

public class Calculadora {
    public void mostrarResultado(int numero1, int numero2) {
        int resultado = sumar(numero1, numero2);
        System.out.println("Resultado: " + resultado);
    }
    
    public int sumar(int numero1, int numero2) {
        int resultado = numero1 + numero2;
        return resultado;
    }
}
