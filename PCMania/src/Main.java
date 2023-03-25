import java.util.Scanner;

public class Main {

    public static Scanner reader = new Scanner(System.in);
    public static Computador[] computadores = new Computador[3];
    public static Cliente cliente;

    public static String separator = "\n======================//====================\n"; // usado para criar um espaço
                                                                                         // no prompot para melhor
                                                                                         // visualização de itens

    public static void main(String[] args) {
        int op; // variável das opções (1,2,3 ou 0)

        criaComputadores();
        System.out.println(separator);
        criaCliente();
        System.out.println(separator);

        do {
            printaMenu();
            mostraCarrinhoAtual();
            op = reader.nextInt(); // Lê o que o usuário digitou e atrubui na variável op
            reader.nextLine();

            switch (op) { // verifica os casos digitados pelo cliente
                case 1:
                    cliente.adicionarComputadorAoCarrinho(computadores[0]);
                    break;
                case 2:
                    cliente.adicionarComputadorAoCarrinho(computadores[1]);
                    break;
                case 3:
                    cliente.adicionarComputadorAoCarrinho(computadores[2]);
                    break;
                case 0:
                default:
                    System.out.println("Saindo...");
                    break;
            }
        } while (op != 0); // repete a pergunta até while ser falso (op = 0)

        System.out.println(separator);
        finalizaCompra();
    }

    public static void printaMenu() {
        System.out.println("Escolha uma das opcoes abaixo:");
        System.out.println("1 - Promocao 1");
        System.out.println("2 - Promocao 2");
        System.out.println("3 - Promocao 3");
        System.out.println("0 - Sair");
    }

    public static void mostraCarrinhoAtual() {
        System.out.println("\nCarrinho atual:");
        System.out.println("R$ " + cliente.calculaTotalCompra()); // atualiza sempre que o cliente adiciona algo novo
    }

    public static void finalizaCompra() {
        System.out.println("Total da compra: R$ " + cliente.calculaTotalCompra());
        System.out.println("Lista de computadores escolhidos: \n" + cliente.getComputadores());
        System.out.println(separator);
        System.out.println("Obrigado por comprar na PCMania!");
    }

    public static void criaComputadores() {
        HardwareBasico[] hardwaresBasicos = new HardwareBasico[3]; // Cria 3 computadores com suas especificações
        hardwaresBasicos[0] = new HardwareBasico("Pentium Core i3", 2200.0f);
        hardwaresBasicos[1] = new HardwareBasico("Memoria RAM", 8.0f);
        hardwaresBasicos[2] = new HardwareBasico("HD", 500.0f);
        computadores[0] = new Computador("Positivo", 2300.0f, "Linux Ubuntu", 32, hardwaresBasicos);
        computadores[0].adicionaMemoriaUSB(new MemoriaUSB("Pendrive", 16));

        hardwaresBasicos[0] = new HardwareBasico("Pentium Core i5", 3370.0f);
        hardwaresBasicos[1] = new HardwareBasico("Memoria RAM", 16.0f);
        hardwaresBasicos[2] = new HardwareBasico("HD", 1000.0f);
        computadores[1] = new Computador("Acer", 5800.0f, "Windows 8", 64, hardwaresBasicos);
        computadores[1].adicionaMemoriaUSB(new MemoriaUSB("Pendrive", 32));

        hardwaresBasicos[0] = new HardwareBasico("Pentium Core i7", 4500.0f);
        hardwaresBasicos[1] = new HardwareBasico("Memoria RAM", 32.0f);
        hardwaresBasicos[2] = new HardwareBasico("HD", 2000.0f);
        computadores[2] = new Computador("Vaio", 1800.0f, "Windows 10", 64, hardwaresBasicos);
        computadores[2].adicionaMemoriaUSB(new MemoriaUSB("HD Externo", 1000));
    }

    public static void criaCliente() {
        System.out.print("Caro cliente, digite seu nome: ");
        String nome = reader.nextLine(); // Lê o que o usuario colocou e atribui na variável nome
        System.out.print("Agora digite seu CPF: ");
        long cpf = reader.nextLong(); // Lê o que o usuario colocou e atribui na variável cpf

        // Verificação do tamanho do CPF inserido
        String valorString = Long.valueOf(cpf).toString(); // transforma o long em string para fazer a verificação de
                                                           // caracteres
        int comprimentoMaximo = 11; // define um valor maximo que o cpf pode ter

        // Caso seja maior que 11 OU menor que 10, pede novamente o CPF
        while (valorString.length() > comprimentoMaximo || valorString.length() < comprimentoMaximo - 1) {

            System.out.println("CPF inválido!");
            System.out.print("Digite um CPF valido: ");
            cpf = reader.nextLong();
            valorString = Long.valueOf(cpf).toString();
        }

        reader.nextLine();
        cliente = new Cliente(nome, cpf);

        // Indica que o cadastro foi finalizado
        System.out.println(nome + ", seu cadastro foi criado com sucesso!");
    }
}