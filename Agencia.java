package banco;

public class Agencia extends ContaCorrente {

	
	@Override
	public String toString() {
	   return "Agencia [numeroDaAgencia=" + numeroDaAgencia + ", numeroContaCorrente=" + numeroContaCorrente
				+ ", saldo=" + saldo + ", getNumeroDaAgencia()=" + getNumeroDaAgencia() + ", getNumeroContaCorrente()="
				+ getNumeroContaCorrente() + ", getSaldo()=" + getSaldo() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
//metodo to string 
	
	public void NovoCliente(String nome, String cpf,String endereco) {
		String nomeNovoCliente = nome;
		String cpfNovoCliente = cpf;
		String enderecoAgencia = endereco;

	}
	
// metodo para criar cliente na agencia ^^
	
public void NovaContaCorrente(int NumeroConta) {
	int novoNumeroConta = NumeroConta ;
}
//metodo para criar conta corrente para algum cliente novo

public void excluirConta(int NumeroConta) {
	if(saldo == 0) {
		System.out.println("Conta apagada com sucesso.");
	}
	//apagar a conta.
}
}
