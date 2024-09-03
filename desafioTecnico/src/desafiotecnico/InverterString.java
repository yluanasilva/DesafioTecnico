/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafiotecnico;

/**
 *
 * @author luana
 */
public class InverterString {
    public static String inverter(String s) {
        char[] caracteres = s.toCharArray();
        String invertida = "";
        for (int i = caracteres.length - 1; i >= 0; i--) {
            invertida += caracteres[i];
        }
        return invertida;
    }

    public static void main(String[] args) {
        String original = "Exemplo";
        String invertida = inverter(original);

        System.out.println("Original: " + original);
        System.out.println("Invertida: " + invertida);
    }
}
