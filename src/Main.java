import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        Cliente carlos = new Cliente();
        carlos.setNome("Carlos");

        Conta ccCarlos = new ContaCorrente(carlos);
        Conta poupancaCarlos = new ContaPoupanca(carlos);

        ccCarlos.depositar(600);
        ccCarlos.transferir(100, poupanca);

        List<Conta> contas = new ArrayList<>();
        contas.add(ccCarlos);
        contas.add(cc);

        Banco santander = new Banco();

        santander.setNome("Santander");
        santander.setContas(contas);
        santander.listClientes();
    }

}