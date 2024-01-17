package com.sol;

public interface BaseDeDatos {
    void guardar(String clave, String valor);
    String recuperar(String clave);
}
