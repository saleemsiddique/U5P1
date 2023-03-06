package es.iesmz;

public class EmpleadoBR {
    static float salarioBruto = 0;
    static float prima = 0;
    public static float calculaSalarioBruto(TipoEmpleado tipo, float ventasMes, float horasExtra){
        if (tipo == TipoEmpleado.vendedor){
            salarioBruto = 1000;
        } else if (tipo == TipoEmpleado.encargado){
            salarioBruto = 1500;
        }
            if (ventasMes >= 1500) {
                prima = 200;
            } else if (ventasMes >= 1000) {
                prima = 100;
            } else if (ventasMes < 1000){
                prima = 0;
            }
        salarioBruto += prima;
        for (int i = 0; i < horasExtra; i++) {
            salarioBruto += 20;
        }
        if (tipo == null || ventasMes < 0 || horasExtra < 0){
            return -1;
        }
        return salarioBruto;
    }

    public static float calculaSalarioNeto(float salarioBruto){
        float salarioNeto = 0;
        if (salarioBruto < 1000){
            salarioNeto = salarioBruto;
        } else if (salarioBruto >= 1000 && salarioBruto < 1500){
            salarioNeto = salarioBruto * (1 - 0.16f);
        } else {
            salarioNeto = salarioBruto * (1 - 0.18f);
        }
        if (salarioNeto < 0){
            return -1;
        }
        return salarioNeto;
    }
}
