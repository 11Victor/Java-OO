package banco;

public class Conta {
	
	double saldo;
    int agencia;
    int numero;
    Cliente titular;
	
    
    
    //Com o void n�o precisamos retornar nada no metodo
    //M�todo depositar
    public void deposita(double valor) {
    	saldo += valor;
    }
    
    //M�todo sacar
    public boolean saca(double valor){
    	if(this.saldo >= valor) {
    		this.saldo -= valor;
    		return true;
    	} else {
    		return false;
    	}
    }
    
    //M�todo transferir
    public boolean transfere(double valor, Conta destino) {
    	if(this.saldo >= valor) {
    		saldo -= valor;
    		destino.deposita(valor);
    		return true;
    	} 
    		return false;
    }
    
    
}
