import model.*;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente ana = new Cliente("ANA MARIA DOS SANTOS", "001.002.003-04");
        Cliente jose = new Cliente("jose pereira da silva", "005.006.007-08");
        ContaCorrente conta1 = new ContaCorrente(ana);
        ContaPoupanca conta2 = new ContaPoupanca(jose);
        
        conta1.depositar(1000);
        System.out.println("Saldo Conta Corrente: R$ " + conta1.getSaldo());
        
        conta1.transferir(600, conta2);
        
        System.out.println("Saldo Conta Corrente (" + conta1.getNumero() + "): R$ " + conta1.getSaldo());
        System.out.println("Saldo Conta Poupança (" + conta2.getNumero() + "): R$ " + conta2.getSaldo());
        System.out.println(conta1);
    }
}
