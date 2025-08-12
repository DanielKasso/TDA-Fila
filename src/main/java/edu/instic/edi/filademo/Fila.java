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
public class Fila<T> {
    
    private No<T> frente;
    private No<T> fundo;
    
    public void adicionar(T elemento){
        No<T> novoNo = new No<>(elemento);
        
        if(empty())
            frente = fundo = novoNo;
        else{
            fundo.setSeguinte(novoNo);
            fundo = novoNo;
        }
    }
    
    public boolean empty(){
        return frente == null;       
    }
    public T frente(){
        T dado = null;
        if(!empty())
            dado = frente.getElemento();
        return dado;
    }
    public T fundo(){
        T dado = null;
        if(!empty())
            dado = fundo.getElemento();
        return dado;
    }
    
    public T extrair(){
        T result = null;
        
        if(!empty())
        {
            result = frente.getElemento();
            if(frente == fundo)
                frente = fundo = null;
            else
                frente = frente.getSeguinte();
        }
        return result;
    }

    public boolean maisNegativosQuePositivos(){
        No<T> ponteiro = this.frente;
        int negativos = 0;
        int positivos = 0;
        while( ponteiro != null ){
            if( (int)ponteiro.getElemento() > 0 )
                positivos++;
            else
                negativos++;
        }
        return negativos > positivos;
    }
    public boolean maisNegativosQuePositivosB(){
        return this.negativos() > this.positivos();
    }
    private int negativos(){
        No<T> ponteiro = this.frente;
        int negativos = 0;
        while( ponteiro != null ){
            if( (int)ponteiro.getElemento() < 0 )
                negativos++;
        }
        return negativos;
    }
    private int positivos(){
        No<T> ponteiro = this.frente;
        int positivos = 0;
        while( ponteiro != null ){
            if( (int)ponteiro.getElemento() > 0 )
                positivos++;
        }
        return positivos;
    }
    
    @Override
    public String toString() {
        return "Fila{" + "frente=" + frente + ", fundo=" + fundo + '}';
    }
    
}
