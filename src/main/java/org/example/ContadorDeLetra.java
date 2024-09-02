package org.example;

public class ContadorDeLetra {

    public static void main(String[] args) {
        String texto = "Queria ser estágiario da Target!.";

        int contador = contadorLetraA(texto);

        if (contador > 0) {
            System.out.println("A letra 'a' (maiúscula ou minúscula) aparece " + contador + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' (maiúscula ou minúscula) não aparece na string.");
        }
    }

    public static int contadorLetraA(String texto) {
        if (texto == null || texto.isEmpty()) return 0;

        int count = 0;
        for (char c : texto.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        return count;
    }
}
