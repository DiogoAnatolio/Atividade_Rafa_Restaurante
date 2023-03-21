package br.newtonpaiva.restaurante;

public class Hamburguer {
    public String nome;

    private Double valor;

    private Integer artesanal;

    public Hamburguer(String nome, Double valor, Integer artesanal) {
        this.nome = nome;
        this.valor = valor;
        this.artesanal = artesanal;
    }

    public Double calculaValor(Integer artesanal, Double valor) {
        if (artesanal == 1) {
            valor += 8;
        }
        return valor;
    }

    public String retornaNome(String nome) {
        System.out.println("O nome do hamburgues é: " + nome + ".");
        return nome;
    }


    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getArtesanal() {
        return artesanal;
    }

    public void setArtesanal(Integer artesanal) {
        this.artesanal = artesanal;
    }
}

