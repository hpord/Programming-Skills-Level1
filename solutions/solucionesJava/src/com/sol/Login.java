package com.sol;

import java.util.Scanner;

public class Login implements SolicitadorDatos, ValidadorDatos {

    private String usIngresado;
    private String contrIngresada;
    private BaseDeDatos bd;

    public Login (BaseDeDatos bd) {
        this.usIngresado = null;
        this.contrIngresada = null;
        this.bd = bd;
    }

    public void solicitarDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su usuario: ");
        this.usIngresado = sc.nextLine();
        System.out.print("Ingrese su contrasenha: ");
        this.contrIngresada = sc.nextLine();
        System.out.println();
    }
    public boolean validarDatos() {
        return this.contrIngresada.equals(bd.recuperar(this.usIngresado));
    }
}
