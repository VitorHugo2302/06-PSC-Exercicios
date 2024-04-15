/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios15.pkg04;

/**
 *
 * @author 42414189
 */
import java.util.Scanner;

public class Exercicio4 {
    
    static Scanner scanner = new Scanner(System.in);
    static String[] numerosVoos = new String[12];
    static String[] origensVoos = new String[12];
    static String[] destinosVoos = new String[12];
    static int[] lugaresDisponiveis = new int[12];

    public static void main(String[] args) {
        lerInformacoesVoos();
        
        int opcao;
        do {
            System.out.println("\nMenu Principal:");
            System.out.println("1. Consultar");
            System.out.println("2. Efetuar Reserva");
            System.out.println("3. Sair");
            System.out.print("Escolha a opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer de entrada
            
            switch (opcao) {
                case 1:
                    menuConsultar();
                    break;
                case 2:
                    efetuarReserva();
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
    }

    public static void lerInformacoesVoos() {
        for (int i = 0; i < 12; i++) {
            System.out.println("\nInforme os detalhes do voo " + (i + 1) + ":");
            System.out.print("Número do voo: ");
            numerosVoos[i] = scanner.nextLine();
            System.out.print("Origem: ");
            origensVoos[i] = scanner.nextLine();
            System.out.print("Destino: ");
            destinosVoos[i] = scanner.nextLine();
            System.out.print("Número de lugares disponíveis: ");
            lugaresDisponiveis[i] = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer de entrada
        }
    }

    public static void menuConsultar() {
        int opcao;
        do {
            System.out.println("\nMenu de Consulta:");
            System.out.println("1. Por número do voo");
            System.out.println("2. Por origem");
            System.out.println("3. Por destino");
            System.out.println("4. Voltar ao menu principal");
            System.out.print("Escolha a opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer de entrada
            
            switch (opcao) {
                case 1:
                    consultarPorNumeroVoo();
                    break;
                case 2:
                    consultarPorOrigem();
                    break;
                case 3:
                    consultarPorDestino();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);
    }

    public static void consultarPorNumeroVoo() {
        System.out.print("\nDigite o número do voo: ");
        String numeroVoo = scanner.nextLine();
        
        for (int i = 0; i < 12; i++) {
            if (numerosVoos[i].equalsIgnoreCase(numeroVoo)) {
                System.out.println("Origem: " + origensVoos[i]);
                System.out.println("Destino: " + destinosVoos[i]);
                System.out.println("Lugares disponíveis: " + lugaresDisponiveis[i]);
                return;
            }
        }
        System.out.println("Voo inexistente.");
    }

    public static void consultarPorOrigem() {
        System.out.print("\nDigite a origem: ");
        String origem = scanner.nextLine();
        
        System.out.println("\nVoos com origem em " + origem + ":");
        boolean encontrado = false;
        for (int i = 0; i < 12; i++) {
            if (origensVoos[i].equalsIgnoreCase(origem)) {
                System.out.println("Número do voo: " + numerosVoos[i]);
                System.out.println("Destino: " + destinosVoos[i]);
                System.out.println("Lugares disponíveis: " + lugaresDisponiveis[i]);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum voo encontrado com origem em " + origem);
        }
    }

    public static void consultarPorDestino() {
        System.out.print("\nDigite o destino: ");
        String destino = scanner.nextLine();
        
        System.out.println("\nVoos com destino a " + destino + ":");
        boolean encontrado = false;
        for (int i = 0; i < 12; i++) {
            if (destinosVoos[i].equalsIgnoreCase(destino)) {
                System.out.println("Número do voo: " + numerosVoos[i]);
                System.out.println("Origem: " + origensVoos[i]);
                System.out.println("Lugares disponíveis: " + lugaresDisponiveis[i]);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum voo encontrado com destino a " + destino);
        }
    }

    public static void efetuarReserva() {
        System.out.print("\nDigite o número do voo: ");
        String numeroVoo = scanner.nextLine();
        
        for (int i = 0; i < 12; i++) {
            if (numerosVoos[i].equalsIgnoreCase(numeroVoo)) {
                if (lugaresDisponiveis[i] > 0) {
                    lugaresDisponiveis[i]--;
                    System.out.println("Reserva confirmada.");
                } else {
                    System.out.println("Voo lotado.");
                }
                return;
            }
        }
        System.out.println("Voo inexistente.");
    }
}
