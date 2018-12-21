package ex_banco;

public class ContaCorrente {
	
	// Atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	// Metodo Construtor
	public ContaCorrente() {
		super();
		this.saldo = 0.0f;
		this.status = false;
	}

	// Metodos
	public void abrirConta(String c) {
		
		this.setTipo(c);
		if(this.tipo.equals("cc")) {			
			this.saldo = 50.0f;
			System.out.println("Conta corrente criada com SUCESSO \n(Você recebeu um saldo bônos de: 50$)");
		} else {
			this.saldo = 150.0f;
			System.out.println("Conta Poupança criada com SUCESSO \n(Você recebeu um saldo bônos de: 150$)\n");
		}
		this.setStatus(true);
		
	}
	
	public void fecharConta() {
		
		if(this.saldo > 0.0f) {
			System.out.println("\nSaldo de: " + this.saldo +"$" + "\nSaque todo o saldo para fechar a conta!");
		} else
			if(this.saldo < 0.0f) {
				System.out.println("\nNão foi possivel fechar a conta, pois o saldo está NEGATIVO");
			}
			else {
				System.out.println("\nConta fechada com SUCESSO!");
				this.setStatus(false);
			}
		
	}
	
	public void depositar(float d) {
		
		if (this.status = true) {
			this.saldo += d;
		} else System.out.println("Erro! conta não existe!");
		
	}
	
	public void sacar(float s) {
		
		if( this.status = true ) {
			if(this.saldo < s) {
				System.out.println("Erro! saldo insuficiente para efetuar o saque!\n"
								+ "Saldo atual: " + this.saldo);
			} 
			else { 
				this.saldo -= s;
				System.out.println("Valor do saque: " + s
								+ "\nSaldo final: " + this.saldo);
			}
		}
		
	}
	
	public void pagarMensal() {
		
		if(this.tipo.equals("cc")) {
			System.out.println("Valor da taxa para Conta Corrente: " + "12$");
			this.saldo -= 12.0f;
			System.out.println("Saldo final: " + this.saldo);
		} else {
			System.out.println("Valor da taxa para Conta Poupança: " + "20$");
			this.saldo -= 20.0f;
			System.out.println("Saldo final: " + this.saldo);
		}
		
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
public void mostrar() {
		
		System.out.println("----------DADOS DA CONTA---------" +
						   "\nNumero: " + this.getNumConta() +
						   "\nDono: " + this.getDono() +
						   "\nTipo: " + this.getTipo() +
						   "\nSaldo: " + this.getSaldo() +
						   "\nStatus: " + this.status);
		
	}

}
