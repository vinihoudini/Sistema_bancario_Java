package banco;

public class ContaCorrente  {
	@Override
	public String toString() {
		return "ContaCorrente [numeroDaAgencia=" + numeroDaAgencia + ", numeroContaCorrente=" + numeroContaCorrente
				+ ", saldo=" + saldo + ", getNumeroDaAgencia()=" + getNumeroDaAgencia() + ", getNumeroContaCorrente()="
				+ getNumeroContaCorrente() + ", getSaldo()=" + getSaldo() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
//metodo tostring
	
	public double numeroDaAgencia;
	
	public double getNumeroDaAgencia() {
		return numeroDaAgencia;
	}

	public void setNumeroDaAgencia(double numeroDaAgencia) {
		this.numeroDaAgencia = numeroDaAgencia;
	}

	public double numeroContaCorrente;

	public double getNumeroContaCorrente() {
		return numeroContaCorrente;
	}

	public void setNumeroContaCorrente(double numeroContaCorrente) {
		this.numeroContaCorrente = numeroContaCorrente;
	}

	public double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double valor) {
		saldo += valor;
	}
//realiza deposito na conta 
	public void verificaSaldo() {
		System.out.println("Valor do Saldo: " + getSaldo());
	}
//retorna o valor do saldo
	
	public void AssociaCliente(String nome, String cpf) {
	    String nomeCliente = nome;
		String cpfCliente = cpf;
	}
//ligar uma conta a um cliente
	public void sacar(double valor) {

		if ((saldo - valor) >=0) {
			saldo -= valor;
			System.out.println("saque permitido");
		}else {
			System.out.println("Saque não permitido");
		}
	//metodo de saque	
	

	}
// retorna o numero da conta e da agencia
	public void verificaNumerodaConta(double numero) {
		System.out.println(getNumeroContaCorrente());
	}

	public void verificaNumerodaAgencia(int numero) {
		System.out.println(getNumeroDaAgencia());
	}
}
