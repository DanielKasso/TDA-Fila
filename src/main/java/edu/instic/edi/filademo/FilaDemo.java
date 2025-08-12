/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.instic.edi.filademo;

/**
 *
 * @author D.N.Kasso
 */
public class FilaDemo {

    public static void main(String[] args) {
        
        Fila<Integer> f = new Fila();
        f.adicionar(1);
        f.adicionar(2);
        f.adicionar(3);
        f.adicionar(4);
        System.out.println(f.maisNegativosQuePositivos()); 

//        Fila<String> fila = new Fila();
//        
//        fila.adicionar("Daniel");
//        fila.adicionar("Kasso");
//        fila.adicionar("Neves");
//        fila.adicionar("Elisa");
//        
//        System.out.println(fila.toString());
//        System.out.println("Extraido: " +fila.extrair());
//        System.out.println(fila.toString());
//        
//        System.out.println("Fundo: " +fila.fundo());
//        System.out.println("Frente: " +fila.frente());
        


    }
}
