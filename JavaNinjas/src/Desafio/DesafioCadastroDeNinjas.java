package Desafio; // Defino o pacote onde meu código está localizado.

import java.util.Scanner; // Importo a classe Scanner para capturar a entrada do usuário.

public class DesafioCadastroDeNinjas { // Declaro a classe principal do meu programa.
    public static void main(String[] args) { // Método principal, onde o programa começa a rodar.

        // Crio um array para armazenar os nomes dos ninjas cadastrados. O limite é 9.
        String[] CadastroVF = new String[9];

        // Declaro um contador para acompanhar quantos ninjas já foram cadastrados.
        int contador = 0;

        // Crio um Scanner para capturar a entrada do usuário pelo teclado.
        Scanner scanner = new Scanner(System.in);

        // Inicio um loop infinito para manter o menu sempre ativo, até o usuário decidir sair.
        while (true) {
            // Exibo as opções disponíveis para o usuário.
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Cadastrar um ninja");
            System.out.println("2 - Listar os ninjas cadastrados");
            System.out.println("3 - Sair.");
            System.out.print("Escolha uma opção: ");

            // Capturo a escolha do usuário.
            int escolhaDoUsuario = scanner.nextInt();

            // Uso um switch para decidir a ação com base na escolha do usuário.
            switch (escolhaDoUsuario) {

                case 1: // Caso o usuário escolha cadastrar um ninja.
                    if (contador < CadastroVF.length) { // Verifico se ainda há espaço no array.
                        System.out.println("Digite o nome do ninja: ");

                        scanner.nextLine(); // Consumir o enter pendente antes de capturar o nome corretamente.

                        CadastroVF[contador] = scanner.nextLine(); // Armazeno o nome do ninja na posição correta do array.
                        contador++; // Aumento o contador para indicar que um novo ninja foi cadastrado.
                    }
                    else { // Se o limite de ninjas for atingido, exibo uma mensagem de aviso.
                        System.out.println("Limite de ninjas atingidos");
                    }
                    break;

                case 2: // Caso o usuário escolha listar os ninjas cadastrados.
                    System.out.println("Lista de Ninjas cadastrados: ");
                    System.out.println("-----------------------");

                    if (contador == 0) { // Se nenhum ninja foi cadastrado ainda, aviso o usuário.
                        System.out.println("Nenhum Ninja Cadastrado ainda.");
                    }
                    else { // Caso contrário, exibo todos os ninjas cadastrados até agora.
                        for (int i = 0; i < contador; i++) {
                            System.out.println((i + 1) + " - " + CadastroVF[i]); // Exibo os ninjas com numeração iniciando em 1.
                        }
                        System.out.println("-----------------------");
                    }

                    System.out.println("================="); // Apenas um separador visual.
                    break;

                case 3: // Caso o usuário escolha sair do programa.
                    System.out.println("Saindo do programa...");
                    return; // Encerro o programa imediatamente.

                default: // Se o usuário inserir uma opção inválida, exibo um aviso.
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
