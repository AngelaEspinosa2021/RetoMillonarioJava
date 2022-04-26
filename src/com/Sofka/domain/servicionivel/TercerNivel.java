package com.Sofka.domain.servicionivel;

import com.Sofka.domain.bancopregunta.BancoPregunta;

import java.util.Scanner;

public class TercerNivel implements IServicioNivel{
    @Override
    public int nivel() {

        Scanner usuario = new Scanner(System.in);
        BancoPregunta bancoPreguntaTres = this.conexionAlbanco();
        int validadcion = 0;
        int comprobar = -1;
        while (comprobar != 3) {
            String respuesta = usuario.nextLine();
            String resultado = bancoPreguntaTres.evaluarRespuesta(respuesta);
            System.out.println(resultado);
            validadcion = this.validarRepuesta(resultado);
            switch (validadcion) {
                case -1:
                    comprobar = 1;
                    bancoPreguntaTres.mostraInformacion();
                    break;
                default:
                    comprobar = 3;
                    break;
            }
        }
        return validadcion;
    }

    @Override
    public int validarRepuesta(String resultado) {
        if (resultado.equalsIgnoreCase("Respuesta incorrecta")) {
            return  0;
        }
        if (resultado.equalsIgnoreCase("El usuario se retira")) {
            return  2;
        }
        if (resultado.equalsIgnoreCase("Respuesta correcta")) {
            return  1;
        }
        return -1;

    }

    @Override
    public BancoPregunta conexionAlbanco() {
        BancoPregunta bancoPreguntaUno = new BancoPregunta();
        bancoPreguntaUno.setTercerNivel();
        return bancoPreguntaUno;
    }

}
