package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RutTest {

    Rut rut1;
    Rut rut2;
    Rut rut3;
    @BeforeEach
    void setUp() {
        rut1 = new Rut("12.346.567-k");
        rut2 = new Rut("12346567-K");
        rut3 = new Rut("12346567k");
    }

    @AfterEach
    void tearDown() {
        rut1 = null;
        rut2 = null;
        rut3 = null;
    }

    @Test
    void extraerDV() {
        //Assert - valor esperado/ valor obtenido
        assertEquals( '9',rut1.extraerDV() );
        assertEquals( '9',rut2.extraerDV() );
        assertEquals( '9',rut3.extraerDV() );
    }

    @Test
    void extraerNumero() {
        Rut rut = new Rut();
        //Assert - valor esperado/ valor obtenido
        assertEquals( 12345678,rut.extraerNumero() );
    }


    @Test
    void formatRut() {
    }

    @Test
    void isValid() {
    }
}