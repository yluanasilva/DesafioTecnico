/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafiotecnico;

/**
 *
 * @author luana
 */
public class SomaIndice {
    public static void main(String[] args) {
        int INDICE = 13, SOMA = 0, K = 0;
        
        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }
        
        System.out.println("Valor da variável SOMA: " + SOMA);
    }

 }
 