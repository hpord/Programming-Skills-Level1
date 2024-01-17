package com.sol;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BaseDeDatosTxt implements BaseDeDatos {
    public void guardar(String clave, String valor) {
        ;
    }
    public String recuperar(String clave) {
        try {
            BufferedReader txtBD = new BufferedReader(new FileReader("src/com/sol/usuarios.txt"));
            String lineaDatosUsuario = "";
            while ((lineaDatosUsuario=txtBD.readLine()) != null) {
                String[] datosUsuario = lineaDatosUsuario.split(",");
                //System.out.println(String.format("%s -- %s", datosUsuario[0], datosUsuario[1]));
                if (clave.equals(datosUsuario[0])) return datosUsuario[1];
            }
        } catch (IOException e) {
            System.out.println("Error al conectarse a la base de datos");
        }
        return null;
    }
}
