package exercicio2;

public class Distribuidora {

    public static void main(String[] args) {
        Produto[] produtos = new Produto[5];

        produtos[0] = new Pereciveis("Arroz", 5.0F,2 );
        produtos[1] = new Pereciveis("Batata", 2.2F,1 );
        produtos[2] = new Pereciveis("Pao", 0.5F,20 );
        produtos[3] = new NaoPereciveis("Detergente", 1.5F,"Limpeza" );


        System.out.println(produtos[1].calcular(5));
        System.out.println(produtos[3].calcular(5));

    }
}
