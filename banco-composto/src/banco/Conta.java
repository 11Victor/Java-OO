package banco;

public class Conta {
	
	double saldo;
    int agencia;
    int numero;
    Cliente titular;
	
    
    
    //Com o void não precisamos retornar nada no metodo
    //Método depositar
    public void deposita(double valor) {
    	saldo += valor;
    }
    
    //Método sacar
    public boolean saca(double valor){
    	if(this.saldo >= valor) {
    		this.saldo -= valor;
    		return true;
    	} else {
    		return false;
    	}
    }
    
    //Método transferir
    public boolean transfere(double valor, Conta destino) {
    	if(this.saldo >= valor) {
    		saldo -= valor;
    		destino.deposita(valor);
    		return true;
    	} 
    		return false;
    }
    
    
}
