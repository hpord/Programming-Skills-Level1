package com.sol.prob3;

import com.sol.Menu;

public class MenuEspecialidadesMedicas implements Menu {
    public void mostrarMenu() {
        System.out.println("Elija la especialidad con la que desea sacar cita: ");
        System.out.println("-----------------------------------------------------");
        System.out.println("1. Medicina General");
        System.out.println("2. Urgencias");
        System.out.println("3. Análisis Clínicos");
        System.out.println(",4. Cardiología");
        System.out.println(", 5. Neurología");
        System.out.println("6. Nutrición");
        System.out.println("7. Fisioterapia");
        System.out.println("8. Traumatología");
        System.out.println("9. Medicina Interna");
        System.out.println("10. Salir");
    }
}
