package produto;

public class Bebida {
    private String nome;
    private double ml;
    private double preço;

    public Bebida() {
    }

    public Bebida(String nome, double ml, double preço) {
        this.nome = nome;
        this.ml = ml;
        this.preço = preço;
    }

    public String getNome() {
        return nome;
    }

    public double getMl() {
        return ml;
    }

    public double getPreço() {
        return preço;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMl(double ml) {
        this.ml = ml;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }
    
    
}
