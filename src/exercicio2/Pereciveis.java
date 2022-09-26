package exercicio2;

public class Pereciveis extends Produto {
    private int diasParaVencer;

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double calcular(int quantidadeDeProdutos) {
        double total = quantidadeDeProdutos * super.getPreco();

        if(this.diasParaVencer  == 1) {
            return total/4;
        }

        if(this.diasParaVencer == 2) {
            return total/3;
        }

        if(this.diasParaVencer == 3) {
            return total/2;
        }

        return super.calcular(quantidadeDeProdutos);
    }
}
