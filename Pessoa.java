package exercicios;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marcos
 */
public class Pessoa {

    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void adicionaIdade() {
        this.idade = this.idade + 1;
    }
    
    public void adicionaIdade(int valor) {
         this.idade = this.idade + valor;
    }
    
    public void adicionaIdade(int valor, int valor1) {
        
    }
    
    public void adicionaIdade(double valor) {
        
    }
    public void mostrarDados() {
        System.out.println("Nome:" + getNome());
        System.out.println("Idade:" + getIdade());
    }

}
