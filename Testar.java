package exercicios;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marcos    bean dao view
 */
public class Testar {
    public static void main(String[] args) {
        Aluno aluno;
        aluno = new Aluno("marcos", 52, 1845);
//        aluno.setNome("marcos");
//        aluno.setIdade(52);
//        aluno.setRa(1845);
        aluno.adicionaIdade();
        aluno.mostrarDados();
    }
  
}
