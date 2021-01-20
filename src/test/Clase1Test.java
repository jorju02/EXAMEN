package test;

import app.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class Clase1Test {
    @Test
    @DisplayName("metodo 1// multiplo 3")
    void testMultiplo3() {
        //fail("Not yet implemented");
        // 1 -preparacion del test
        Calculadora cal= new Calculadora();
        // 2- Ejecutar lo que vamos ha validar
        String result = cal.ejerUno(9);
        // 3- Aserciones
        assertEquals("Face", result);

    }



    @Test
    @DisplayName("metodo 1//multiplo 5")
    void testMultiplo5() {
        //fail("Not yet implemented");
        // 1 -preparacion del test
        Calculadora cal= new Calculadora();
        // 2- Ejecutar lo que vamos ha validar
        String result = cal.ejerUno(5);
        // 3- Aserciones
        assertEquals("Book", result);

    }

    @Test
    @DisplayName("metodo 1// multiplo 15")
    void testMultiplo15() {
        //fail("Not yet implemented");
        // 1 -preparacion del test
        Calculadora cal= new Calculadora();
        // 2- Ejecutar lo que vamos ha validar
        String result = cal.ejerUno(45);
        // 3- Aserciones
        assertEquals("Facebook",result);

    }

}