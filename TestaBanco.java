package banco;

public class TestaBanco {

	public static void main(String[] args) {

		System.out.println("### Testa conta bancaria ###");
		
		Clientes novoCliente1 = new Clientes();
		novoCliente1.setNome("John");
		novoCliente1.setSexo("M");
		novoCliente1.setIdade(38);
		novoCliente1.setEndereco("Rua das tantas numero 220");
		novoCliente1.setCpf("123.598.669-71");

		novoCliente1.VincularCliente(578, 01);
		novoCliente1.depositar(600.00);
		novoCliente1.verificaSaldo();
		novoCliente1.sacar(150.00);
		novoCliente1.verificaSaldo();
		
		Clientes novoCliente2 = new Clientes();
		novoCliente2.setNome("Maria");
		novoCliente2.setSexo("F");
		novoCliente2.setIdade(22);
		novoCliente2.setEndereco("Rua das baratas numero 17");
		novoCliente2.setCpf("122.631.555-31");

		novoCliente2.VincularCliente(51, 02);
		novoCliente2.depositar(1000.00);
		novoCliente2.verificaSaldo();
		novoCliente2.sacar(2000.00);
		novoCliente2.verificaSaldo();
	
	    ContaCorrente novaConta1 = new ContaCorrente();
	    novaConta1.AssociaCliente("John", "123.598.669-71");
	    
	    ContaCorrente novaConta2 = new ContaCorrente();
	    novaConta2.AssociaCliente("Maria", "122.631.555-31");
	    
	    Agencia novaAgencia1 = new Agencia();
	    novaAgencia1.NovoCliente("John", "123.598.669-71","Rua das neves bairro X");
	    
	    Agencia novaAgencia2 = new Agencia();
	    novaAgencia2.NovoCliente("Maria", "122.631.555-31","Rua das botas bairro yy");
	    
	   // caso queira apagar a conta do john ---> novaAgencia1.excluirConta(578);
	    
	    
	    
	    
	    
	    
	    
		
		
		

	}

}
