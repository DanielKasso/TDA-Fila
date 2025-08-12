/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.instic.edi.filademo;

/**
 *
 * @author D.N.Kasso
 * @param <T>
 */
public class No<T> {
    
    private T elemento;
    private No<T> seguinte;

    public No(T elemento) {
        this.elemento = elemento;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public No<T> getSeguinte() {
        return seguinte;
    }

    public void setSeguinte(No<T> seguinte) {
        this.seguinte = seguinte;
    }

    @Override
    public String toString() {
        return "No{" + "elemento=" + elemento + ", seguinte=" + seguinte + '}';
    }
    
    
}
