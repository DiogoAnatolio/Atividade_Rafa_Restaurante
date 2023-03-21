package br.newtonpaiva.restaurante;

public class Pizza {

    public String nome;

    private Double valor;

    public Integer borda;

    public Pizza(String nome, Double valor, Integer borda){
        this.nome = nome;
        this.valor = valor;
        this.borda = borda;
    }

    public Double calculaBorda(Integer borda, Double valor) {
        if (borda == 1) {
            valor += 5;
        }
        return valor;
    }
    public String retornaNome(String nome){
        System.out.println("O nome da pizza é: " + nome + ".");
        return nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

}
