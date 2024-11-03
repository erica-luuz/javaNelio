package Secao4;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero do funcionario: ");
        int idFuncionario = scan.nextInt();

        System.out.println("Digite o numero de horas trabalhadas: ");
        int horasTrabalhadas = scan.nextInt();

        System.out.println("Digite o valor que Recebe por hora: ");
        double valorPorHorasTrabalhadas = scan.nextDouble();

        double salario = horasTrabalhadas * valorPorHorasTrabalhadas;

        System.out.println("Number " + idFuncionario);
        System.out.printf("Salary: R$ %.2f%n ", salario);

        scan.close();
    }
}
