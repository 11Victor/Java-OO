
public class TestaGetSet {
	
	public static void main(String[] args) {
		Conta conta = new Conta(54654, 6546574);
		conta.setSaldo(1000);
		System.out.println(conta.getSaldo());
		
		Cliente victor = new Cliente();
		victor.setNome("Victor Valencio");
		conta.setTitular(victor);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Desenvolvedor Java");
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Desenvolvedor Java");
		
		System.out.println(titularDaConta);
		System.out.println(victor);
		System.out.println(conta.getTitular());
		
	}
	
}
