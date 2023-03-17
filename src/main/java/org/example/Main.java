package org.example;

public class Main {

    public static void main(String[] args) {
        int numeroFila = 50;
        String letraColumna = convertirNumeroALetra(numeroFila);
        System.out.println(letraColumna);
    }

    private static String convertirNumeroALetra(int numero) {
        String letra = "";
        while (numero > 0) {
            int modulo = (numero - 1) % 26;
            letra = (char) (modulo + 'A') + letra;
            numero = (numero - 1) / 26;
        }
        return letra;
    }

}