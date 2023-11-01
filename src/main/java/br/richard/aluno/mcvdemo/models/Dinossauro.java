package br.richard.aluno.mcvdemo.models;

public class Dinossauro {

    private String nome;

    private String categoria;

    private int peso;

    private double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura= altura;
    }

    public Dinossauro(String nome, String categoria, int peso, double altura) {
        this.nome = nome;
        this.categoria = categoria;
        this.peso = peso;
        this.altura = altura;
    }
}
