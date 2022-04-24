package com.Sofka.controladores;

public class InterfazPrueba {
    public static void main(String[] args) {
        dbController conex = new dbController();
        conex.conectar();
    }
}
