package com.Sofka.controladores;

import java.sql.*;

public class Consultas {
        dbController conn = new dbController();
        Connection conex = conn.conectar();

        public void consultarJugadores(){
            try{
                String sql = "SELECT rowid, * FROM jugadores";
                Statement nueva = conex.createStatement();

                ResultSet result = nueva.executeQuery(sql);;
                while(result.next()){
                    Integer id = result.getInt("rowid");
                    String name = result.getString("nombre");
                    String score = result.getString("puntaje");
                    System.out.println("id: "+id+ " nombre: "+name+" Puntaje: "+score);
                }
            }catch (Exception e){
                System.out.println("Error al consultar en la base de datos");
                e.printStackTrace();
            }
        }

        public void agregarJugador(String jugador){
            try{
                String ps = "INSERT INTO jugadores VALUES(?, '0')";
                PreparedStatement nueva = conex.prepareStatement(ps);
                nueva.setString(1, jugador);
                nueva.executeUpdate();

            }catch (Exception e){
                System.out.println("Error al consultar en la base de datos");
                e.printStackTrace();
            }
        }
}

