package banco;

public class Clientes extends ContaCorrente {

	@Override
	public String toString() {
		return "Clientes [numeroDaAgencia=" + numeroDaAgencia + ", numeroContaCorrente=" + numeroContaCorrente
				+ ", saldo=" + saldo + ", getNumeroDaAgencia()=" + getNumeroDaAgencia() + ", getNumeroContaCorrente()="
				+ getNumeroContaCorrente() + ", getSaldo()=" + getSaldo() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
//metodo tostring
	

	public String nome;
	public String getNome() {
	 return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public	int idade;
	public	String sexo;
	public	String endereco;
	public	String cpf;
	
// atributos pessoais do cliente 

	
	

	public void VincularCliente(double numeroConta, double numeroAgencia) {
		double numeroC = numeroConta;
		double numeroA = numeroAgencia;
	}
	
	// vincular um único cliente a uma contacorrente

	public void verificaSaldo() {
		System.out.println("Valor do Saldo: " + getSaldo());
	}
	// mostra o saldo 

	public void depositar(Double valor) {
		saldo += valor;
	}
	// realiza deposito na conta

	public void sacar(double valor) {

		if ((saldo - valor) >=0) {
			saldo -= valor;
			System.out.println("saque permitido");
		}else {
			System.out.println("Saque não permitido");
		}
		
	//saque da conta, caso seja negativo ele retorna falso 
		
	

	}

}