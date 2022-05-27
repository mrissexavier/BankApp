package academy.devdojo.maratonajava.projeto.dominio;

import java.util.Scanner;

public class BankAccount {
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    public BankAccount(String cname, String cid)
    {
        customerName = cname;
        customerId = cid;
    }

    public void deposit(int amount)
    {
        if(amount > 0)
        {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    public void withdraw(int amount)
    {
        if(amount != 0)
        {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    public void getPreviousTransaction()
    {
        if(previousTransaction > 0 )
        {
            System.out.println("Valor Depositado: " + previousTransaction);
        }
        else if(previousTransaction < 0)
        {
            System.out.println("Último saque realizado: " + Math.abs(previousTransaction));
        }
        else
        {
            System.out.println("Não foi possivel efetuar a transação.");
        }
    }

    public void showMenu()
    {
        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo " + customerName);
        System.out.println("O seu ID é: " + customerId);
        System.out.println("\n");
        System.out.println("1. Consulte o seu Saldo");
        System.out.println("2. Efetue um Depósito");
        System.out.println("3. Efetue um Saque");
        System.out.println("4. Última Transação");
        System.out.println("5. Sair");

        do
        {
            System.out.println("=======================================================================================");
            System.out.println("Selecione uma Opção");
            System.out.println("=======================================================================================");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch (option)
            {
                case '1':
                    System.out.println("-----------------------------------------");
                    System.out.println("Saldo = " +balance);
                    System.out.println("-----------------------------------------");
                    System.out.println("\n");
                    break;

                case '2':
                    System.out.println("-----------------------------------------");
                    System.out.println("Insira o valor que deseja  depositar:");
                    System.out.println("-----------------------------------------");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;

                case '3':
                    System.out.println("-----------------------------------------");
                    System.out.println("Insira o valor que deseja sacar:");
                    System.out.println("-----------------------------------------");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;

                case '4':
                    System.out.println("-----------------------------------------");
                    getPreviousTransaction();
                    System.out.println("-----------------------------------------");
                    System.out.println("\n");
                    break;

                case '5':
                    System.out.println("*************************************************************");
                    break;

                default:
                    System.out.println("Opção Inválida! Tente novamente");
                    break;
            }
        }while (option != '5');
        System.out.println("Obrigado por utilizar os serviços do Maike Bancos");
    }

}
