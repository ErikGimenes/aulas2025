package exercicios;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marcos  JFrmTeste
 */
public class Aluno extends Pessoa{
    private int ra;

    public Aluno() {
        
    }

    public Aluno(String nome, int idade, int ra) {
        this.setNome(nome);
        this.setIdade(idade);
        this.ra = ra;
    }

    
    
    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }
    
    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Ra:"+getRa());
    }
}
