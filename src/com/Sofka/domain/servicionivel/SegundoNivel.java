package com.Sofka.domain.servicionivel;

import com.Sofka.domain.bancopregunta.BancoPregunta;

import java.util.Scanner;

public class SegundoNivel implements IServicioNivel{

    @Override
    public int nivel() {

        Scanner usuario = new Scanner(System.in);
        BancoPregunta bancoPreguntaDos = this.conexionAlbanco();

        int validadcion = -1;
        int comprobar = -1;
        while (comprobar != 3) {
            String respuesta = usuario.nextLine();
            String resultado = bancoPreguntaDos.evaluarRespuesta(respuesta);
            System.out.println(resultado);
            validadcion = this.validarRepuesta(resultado);
            switch (validadcion) {
                case -1:
                    comprobar = 1;
                    bancoPreguntaDos.mostraInformacion();
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
        bancoPreguntaUno.setSegundoNivel();
        return bancoPreguntaUno;
    }

}
