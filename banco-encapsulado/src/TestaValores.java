
public class TestaValores {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(5554, 54654);
		
		conta.setAgencia(-36);
		conta.setNumero(-254);
		
		Conta conta2 = new Conta(7575, 54654);
		Conta conta3 = new Conta(6546, 654);
		
		System.out.println(Conta.getTotal());
	}	
}
