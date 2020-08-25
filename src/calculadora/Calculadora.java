package calculadora;

public class Calculadora {
    public static void main(String[] args) {
        if(args.length != 2){
            System.err.println("Por favor insira dois numeros.");
        } else {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            int soma = num1 + num2;
            int produto = num1 * num1;
            int diferenca = num1 - num2;
            double divisao = (double)num1 / (double)num2;
            int maior = 0;

            if(num1 > num2) {
                maior = num1;
            } else {
                maior = num2;
            }

            System.out.println("Soma: " + soma);
            System.out.println("Produto: " + produto);
            System.out.println("Diferenca: " + diferenca);
            System.out.println("Divisao: " + divisao);
            System.out.println(maior + " e maior");

        }
    }
}
