package academy.devdojo.maratonajava.projeto.test;

import academy.devdojo.maratonajava.projeto.dominio.BankAccount;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount conta = new BankAccount("Emily Xavier","A0022");
        conta.showMenu();
    }
}
