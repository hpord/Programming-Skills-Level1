package com.sol.prob3;

import com.sol.*;

public class App {
    private static Cabecera cabecera = new CabeceraHospital();
    private static LimpiadorConsola limpiadorConsola = new LimpiadorConsolaPowerShell();
    private static boolean sistemaActivo = true;
    private static BaseDeDatos bd = new BaseDeDatosTxt();
    private static Menu menuEspecialidadesMedicas = new MenuEspecialidadesMedicas();
    private static Login login = new Login(bd);
    private static LectorNumeroOpcion lectorNumeroOpcion = new LectorNumeroOpcion();
    
    public static void main(String[] args) throws Exception {
        limpiarPantalla();
        if (!estaHabilitado()) {
            System.out.println("SISTEMA BLOQUEADO");
            return;
        }
        while (true) {
            limpiarPantalla();
            int numEsp = leerEspecialidad();
            if (numEsp == 10) {
                System.out.println("Gracias por su preferencia\n");
                break;
            }
        }
        //System.out.println("HABILITADO");
        //;
    }

    public static boolean estaHabilitado() {
        int intentos = 0;
        while (intentos < 3) {
            System.out.println("Login\n");
            login.solicitarDatos();
            limpiarPantalla();
            if (login.validarDatos()) return true;
            intentos++;
            System.out.println("Usuario o contrasenha no validos");
            System.out.println(String.format("Le quedan %d intentos", 3-intentos));
            System.out.println();
        }
        return false;
    }

    public static int leerEspecialidad() {
        do {
            limpiarPantalla();
            menuEspecialidadesMedicas.mostrarMenu();
            lectorNumeroOpcion.solicitarDatos();
        } while (!lectorNumeroOpcion.validarDatos());
        return lectorNumeroOpcion.retornarDatoElegido();
    }

    public static void limpiarPantalla() {
        limpiadorConsola.limpiarConsola();
        cabecera.mostrarCabecera();
        System.out.println();
    }
}
