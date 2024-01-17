package com.sol.prob3;

import java.util.Scanner;

import com.sol.SolicitadorDatos;
import com.sol.ValidadorDatos;

public class LectorNumeroOpcion implements SolicitadorDatos, ValidadorDatos {
    private int numero;

    public void solicitarDatos() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese su usuario: ");
            this.numero = sc.nextInt();
        } catch (Exception e) {
            System.out.println("\nEntrada inválida");
        }
    }

    public boolean validarDatos() {
        if (this.numero < 1 || numero > 10) return false;
        return true;
    }

    public int retornarDatoElegido() {
        return this.numero;
    }
}
