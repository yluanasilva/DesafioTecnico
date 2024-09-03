/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafiotecnico;

/**
 *
 * @author luana
 */
public class Fibonacci {
    public static boolean pertenceFibonacci(int n) {
        int a = 0, b = 1;
        while (b <= n) {
            if (b == n) {
                return true;
            }
            int temp = b;
            b = a + b;
            a = temp;
        }
        return false;
    }
    
    public static void main(String[] args) {
        int numero = 21; 
        
        if (pertenceFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }
}

