/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author andree
 */
public class Caballo {
private int cod,disX,disY,velo,avanzar;
private long tiempo;
private String nombre;

    public Caballo(int cod, int disX, int disY, int velo, int avanzar, long tiempo, String nombre) {
        this.cod = cod;
        this.disX = disX;
        this.disY = disY;
        this.velo = velo;
        this.avanzar = avanzar;
        this.tiempo = tiempo;
        this.nombre = nombre;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getDisX() {
        return disX;
    }

    public void setDisX(int disX) {
        this.disX = disX;
    }

    public int getDisY() {
        return disY;
    }

    public void setDisY(int disY) {
        this.disY = disY;
    }

    public int getVelo() {
        return velo;
    }

    public void setVelo(int velo) {
        this.velo = velo;
    }

    public int getAvanzar() {
        return avanzar;
    }

    public void setAvanzar(int avanzar) {
        this.avanzar = avanzar;
    }

    public long getTiempo() {
        return tiempo;
    }

    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



}
