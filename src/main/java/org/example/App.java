package org.example;

import org.example.models.Aluno;
import org.example.persistence.AlunoPersistence;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int menu = -1;

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
                    alunoPersistence.adicionaAluno(aluno);
                    break;
                case 2:
                    alunoPersistence.exibeLista();
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
}
