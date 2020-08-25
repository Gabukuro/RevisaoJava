package populacaomundial;


public class PopulacaoMundial {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Por favor insira apenas um numero");
        } else {
            int anos = Integer.parseInt(args[0]);
            double growingRate = 0.0105;
            long populacao =  7807224396L;

            populacao = (long) (populacao * Math.pow((1 + growingRate), anos));

            System.out.println(populacao);

        }
    }
}
