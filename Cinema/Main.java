package Teste.Cinema;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Filme filme = new Filme("Harry Potter & the Philospher's Stone", 2001);

        Ator ator1 = new Ator("Daniel Radcliffe", "Britanico");
        Ator ator2= new Ator("Emma Watson", "Francesa");

        filme.adicionarAtor(ator1);
        filme.adicionarAtor(ator2);

        int opcao;
        do { 
            System.out.println("\nMenu: ");
            System.out.println("1. Adicionar ator");
            System.out.println("2. Remover ator");
            System.out.println("3. Encontrar ator");
            System.out.println("4. Listar atores");
            System.out.println("5. Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Diga o nome do ator: ");
                    String nomeAtor = scanner.nextLine();
                    System.out.println("Diga a nacionalidade do ator: ");
                    String nacionalidade = scanner.nextLine();
                    Ator novoAtor = new Ator(nomeAtor, nacionalidade);
                    filme.adicionarAtor(novoAtor);
                    System.out.println("Ator adicionado com sucesso.");
                    break;
                case 2:
                    System.out.println("Diga o nome do ator para remover: ");
                    String nomeAtorRemover = scanner.nextLine();
                    filme.removerAtor(nomeAtorRemover);
                    System.out.println("Ator removido com sucesso.");
                    break;
                case 3:
                    System.out.println("Diga o nome do ator para ser procurado: ");
                    String nomeAtorProcurado = scanner.nextLine();
                    if(filme.encontrarAtor(nomeAtorProcurado)){
                        System.out.println("Ator encontrado.");
                    } else{
                        System.out.println("Ator nao encontrado");
                    }
                    break;
                case 4:
                    filme.listarAtores();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção invalida. Tente novamnete.");
            }
        } while (opcao != 5);
        scanner.close();
    }
}
