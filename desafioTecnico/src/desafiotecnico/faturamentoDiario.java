package desafiotecnico;

/**
 *
 * @author luana
 */

public class faturamentoDiario {

    public faturamentoDiario(String json) {
    }

    public static void main(String[] args) {
        
        String json = "{ \"faturamento_diario\": [100, 200, 300, 0, 0, 500, 700, 0, 100, 150, 0, 200] }";
        faturamentoDiario faturamento;
        faturamento = new faturamentoDiario(json);
        int soma = 0;
        int contador = 0;
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int acimaDaMedia = 0;

       
        for (int i = 0; faturamento.length() >= i; i++) {
            int valor = faturamento.getInt(i);
            if (valor > 0) {
                soma += valor;
                contador++;
                if (valor < menor) {
                    menor = valor;
                }
                if (valor > maior) {
                    maior = valor;
                }
            }
        }

        double media = (double) soma / contador;

        
        for (int i = 0; faturamento.length() >= i; i++) {
            int valor = faturamento.getInt(i);
            if (valor > media) {
                acimaDaMedia++;
            }
        }

        System.out.println("Menor faturamento: " + menor);
        System.out.println("Maior faturamento: " + maior);
        System.out.println("Dias com faturamento acima da média: " + acimaDaMedia);
    }

    private int getInt(int i) {
        return 0;
    }

    private int length() {
        return 0;
    }
    

}
