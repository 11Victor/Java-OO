package bytebank;

public class CriaConta {
	
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 200;
		
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);

		Conta  segundaConta = primeiraConta;
		segundaConta.saldo = 50;
		
		System.out.println("A primeira conta possui -> " + primeiraConta.saldo);
		System.out.println("A segunda conta possui -> " + segundaConta.saldo);
		
		
		System.out.println(primeiraConta);
		
		
	}
}
