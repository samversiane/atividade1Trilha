package Program;

import Entities.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa p;

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Data de nascimento: (DD/MM/AAAA) ");
        String dtNascimento = sc.nextLine();
        System.out.print("CPF: ");
        String cpf = sc.nextLine();
        System.out.print("Salário: ");
        Double salario = sc.nextDouble();
        System.out.print("Quantidade de dependentes: ");
        Integer qtdDependentes = sc.nextInt();
        System.out.print("Altura: ");
        Float altura = sc.nextFloat();
        p = new Pessoa(nome, dtNascimento, cpf, salario, qtdDependentes, altura);

        sc.close();

        System.out.print("\n============== DADOS DO USUARIO ==============\n");
        System.out.print(p.toString());
        System.out.print("\n==================== FIM =====================\n");

    }
}
