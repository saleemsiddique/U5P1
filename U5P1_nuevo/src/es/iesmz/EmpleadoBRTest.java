package es.iesmz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpleadoBRTest {

    @Test
    public void testCalculaSalarioNeto1() {
            float resultadoReal = EmpleadoBR.calculaSalarioNeto(2000);
        float resultadoEsperado = 1640.0f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }
    @Test
    public void testCalculaSalarioNeto2() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(1500);
        float resultadoEsperado = 1230.0f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }


    @Test
    public void testCalculaSalarioNeto3() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(1499.99f);
        float resultadoEsperado = 1259.9916f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalculaSalarioNeto4() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(1250f);
        float resultadoEsperado = 1050f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalculaSalarioNeto5() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(1000f);
        float resultadoEsperado = 840f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalculaSalarioNeto6() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(999.99f);
        float resultadoEsperado = 999.99f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalculaSalarioNeto7() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(500f);
        float resultadoEsperado = 500f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalculaSalarioNeto8() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(0f);
        float resultadoEsperado = 0f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalculaSalarioNeto9() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(-1f);
        float resultadoEsperado = -1f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalculaSalarioBruto1() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.vendedor, 2000, 8);
        float resultadoEsperado = 1360f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalculaSalarioBruto2() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.vendedor, 1500, 3);
        float resultadoEsperado = 1260f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalculaSalarioBruto3() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.vendedor, 1499.99f, 0);
        float resultadoEsperado = 1100f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalculaSalarioBruto4() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encargado, 1250, 8);
        float resultadoEsperado = 1760f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalculaSalarioBruto5() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encargado, 1000, 0);
        float resultadoEsperado = 1600f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalculaSalarioBruto6() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encargado, 999.99f, 3);
        float resultadoEsperado = 1560;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalculaSalarioBruto7() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encargado, 500, 0);
        float resultadoEsperado = 1500;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalculaSalarioBruto8() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encargado, 0, 8);
        float resultadoEsperado = 1660;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalculaSalarioBruto9() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.vendedor, -1, 8);
        float resultadoEsperado = -1f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalculaSalarioBruto10() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.vendedor, 1500, -1);
        float resultadoEsperado = -1;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalculaSalarioBruto11() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(null, 1500, 8);
        float resultadoEsperado = -1;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }
}