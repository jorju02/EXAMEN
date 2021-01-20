package app;

public class Calculadora {

    public String ejerUno(int x) {
        String resultado = "";
        if (x % 3 == 0) {
            resultado = "Face";
            return resultado;
        } else if (x % 5 == 0) {
            resultado = "Book";
            return resultado;
        } else if (x % 15 == 0)
            resultado = "Facebook";
        return resultado;

    }

    public String ejerDos(int[] valores) {
        String s ="";
        for (int i = 0; i < 3; i++) {

            String resultado = "";
            if (valores[i] % 3 == 0) {
                resultado = "Face";
                return resultado;

            } else if (valores[i] % 5 == 0) {
                resultado = "Book";
                return resultado;

            } else if (valores[i] % 15 == 0)
                resultado = "Facebook";
            return resultado;

        }
        return s;

    }
}