package banco;

public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		Conta contaVictor = new Conta();
		System.out.println(contaVictor.saldo);
		
		contaVictor.titular = new Cliente();
		System.out.println(contaVictor.titular);
		
		contaVictor.titular.nome = "Victor Valencio";
		System.out.println(contaVictor.titular.nome);
		
		
	}
	
}
