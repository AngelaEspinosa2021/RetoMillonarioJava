package com.Sofka.domain.servicionivel;

import com.Sofka.domain.bancopregunta.BancoPregunta;

import java.util.Scanner;

public class PrimerNivel implements IServicioNivel{
    @Override
    public int nivel() {
        Scanner usuario = new Scanner(System.in);
        BancoPregunta bancoPreguntaUno = this.conexionAlbanco();
        int validadcion = 0;
        int comprobar = -1;
        while (comprobar != 3) {
            String respuesta = usuario.nextLine();
            String resultado = bancoPreguntaUno.evaluarRespuesta(respuesta);
            System.out.println(resultado);
            validadcion = this.validarRepuesta(resultado);
            switch (validadcion) {
                case -1:
                    comprobar = 1;
                    bancoPreguntaUno.mostraInformacion();
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
        if (resultado.equalsIgnoreCase("respuesta incorrecta")) {
            return  0;
        }
        if (resultado.equalsIgnoreCase("el usuario se retira")){
            return  2;
        }
        if (resultado.equalsIgnoreCase("respuesta correcta")) {
            return  1;
        }
        return -1;

    }

    @Override
    public BancoPregunta conexionAlbanco() {
        BancoPregunta bancoPreguntaUno = new BancoPregunta();
        bancoPreguntaUno.setPrimerNivel();
        return bancoPreguntaUno;
    }

}

}
