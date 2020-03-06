package org.example;

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
            System.out.println("1 cadastra, 2 vê a lista, 0 sai");
            Scanner scanner = new Scanner(System.in);
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    cadastraAluno();
                    break;
                case 2:
                    exibeLista();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    menu = -1;
                    break;
            }
        } while (menu != 0)
        System.out.println();
    }
}
