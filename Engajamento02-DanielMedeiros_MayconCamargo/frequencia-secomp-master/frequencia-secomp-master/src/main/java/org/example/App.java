package org.example;

import org.example.models.Aluno;
import org.example.persistence.AlunoPersistence;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    //criando list direto na classe app
    private static List<String> alunos;
    public static void main( String[] args ){
        int menu = -1;
        //criacao arraylist
        alunos = new ArrayList<String>();

        do {
            AlunoPersistence alunoPersistence = new AlunoPersistence();
            Scanner scanner = new Scanner(System.in);

            System.out.println("1 Cadastra aluno, \n2 Exibe a lista, \n0 Encerra o aplicativo");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    Aluno aluno = new Aluno();
                    System.out.println("Nome do aluno: \n");
                    aluno.setNome(scanner.nextLine());
                    System.out.println("RA do aluno: \n");
                    aluno.setRa(scanner.nextLine());  
                    /*Utilizou a classe AlunoPersistence para validar se a String de entrada já se encontrava na lista.
                    Resolução: Pode-se utilizar o método para criar a String do aluno e realizar sua validação dentro
                    do proprio case buscando o método na mesma classe ao invés de utilizar uma outra classe. (CODIGO BEM ESTRUTURADO COM APENAS UMA CLASSE)*/
                    adicionaAluno();
                    System.out.println("Aluno Criado");
                    //alunoPersistence.adicionaAluno(aluno);
                    break;
                case 2:
                    /*O mesmo raciocinio da criação do aluno segue para imprimir os dados, utilizando apenas a chamada
                    de um método dentro do próprio case.*/
                    exibeLista();
                    //alunoPersistence.exibeLista();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    menu = -1;
                    break;
            }
        } while (menu != 0);
        System.out.println();
    }
    /*Utilização de métodos separando das funcionalidades
    - O case 1 e 2 fazem a busca dos métodos diretamente nessa mesma classe ao invés de buscar em outra classe
    - Utilizamos as funções que foram criadas na classe AlunoPersistence.java trazendo para dentro da App.java
    (UTILIZAÇÃO DE MÉTODOS PARA TORNAR O CODIGO MAIS EFICIENTE)*/
    //adicionaAluno
    public void adicionaAluno(Aluno aluno) {
        boolean exist = false;
        for(Aluno a:this.alunos){
            if(aluno.getRa().equals(a.getRa())){
               exist = true;
               System.out.println("O aluno ja existe na lista !!");
               break;
            }
        }
        this.alunos.add(aluno);
    }

    //Exibe lista de aluno
    public void exibeLista(){
        for(Aluno a:this.alunos){
            System.out.println("Nome :"+ a.getNome() + "RA :"+ a.getRa());
        }
    }
}
