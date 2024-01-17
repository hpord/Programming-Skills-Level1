package com.sol;

public class LimpiadorConsolaPowerShell implements LimpiadorConsola {
    public void limpiarConsola () {
        try {
            // Ejecuta el comando de PowerShell para limpiar la consola en Windows
            new ProcessBuilder("powershell", "Clear-Host").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println("Error al intentar limpiar la consola en PowerShell: " + e.getMessage());
        }
    }
}
