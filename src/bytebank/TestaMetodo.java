package bytebank;

public class TestaMetodo {
	
	
	public static void main(String[] args) {
		
		Conta contaVictor = new Conta();
		
		//Deposita
		System.out.println("Depositando valor");
		contaVictor.saldo = 100;
		contaVictor.deposita(500);
		System.out.println(contaVictor.saldo);
		
		//Saca
		System.out.println("\nSacando valor");
		boolean conseguiuRetirar = contaVictor.saca(20);
		System.out.println(contaVictor.saldo);
		System.out.println("Conseguiu retirar? " + conseguiuRetirar);
		
		//Transferir
		System.out.println("\nTransferindo valor");
		Conta contaStephany = new Conta();
		contaStephany.deposita(1000);
		boolean sucessoTransferencia = contaStephany.transfere(1580, contaVictor);
		if(sucessoTransferencia) {
			System.out.println("Transferencia realizada com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}
		System.out.println("Saldo da conta da Stephany -> " + contaStephany.saldo);
		System.out.println("Saldo da conta do Victor -> " + contaVictor.saldo);
		
		
		
		
	}
	
}
