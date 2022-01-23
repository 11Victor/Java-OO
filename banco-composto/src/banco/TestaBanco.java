package banco;

public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente victor = new Cliente();
		
		victor.nome = "Victor Valencio";
		victor.cpf = "425.487.548-52";
		victor.profissao = "Desenvolvedor Java Jr.";
		
		Conta contaVictor = new Conta();
		contaVictor.deposita(100);
		
		//Associa a Conta(contaVictor) ao Cliente(victor)
		contaVictor.titular = victor;
		
		System.out.println(contaVictor.titular.nome);
	}
	
}
