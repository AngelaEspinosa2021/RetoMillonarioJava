package com.Sofka.domain.servicionivel;


import com.Sofka.domain.bancopregunta.BancoPregunta;

public interface IServicioNivel {

    public int nivel();

    public int validarRepuesta(String resultado);

    public BancoPregunta conexionAlbanco();


}
