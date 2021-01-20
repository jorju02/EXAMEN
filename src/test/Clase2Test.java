package test;

import app.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class Clase2Test {
    @Test
    @DisplayName("metodo 2// multiplo 3")
    void testMultiplo3() {
        //fail("Not yet implemented");
        // 1 -preparacion del test
        Calculadora cal= new Calculadora();
        // 2- Ejecutar lo que vamos ha validar
        String result = cal.ejerDos({3,5,7});
        // 3- Aserciones
        assertEquals("1 2 Face", result);

    }



    @Test
    @DisplayName("metodo 1//multiplo 5")
    void testMultiplo5() {
        //fail("Not yet implemented");
        // 1 -preparacion del test
        Calculadora cal= new Calculadora();
        // 2- Ejecutar lo que vamos ha validar
        String result = cal.ejerDos({6,10,30});
        // 3- Aserciones
        assertEquals("Face Book Facebook", result);

    }

    @Test
    @DisplayName("metodo 1// multiplo 15")
    void testMultiplo15() {
        //fail("Not yet implemented");
        // 1 -preparacion del test
        Calculadora cal= new Calculadora();
        // 2- Ejecutar lo que vamos ha validar
        String result = cal.ejerDos({4,6,8});
        // 3- Aserciones
        assertEquals("4 6 8",result);

    }

}