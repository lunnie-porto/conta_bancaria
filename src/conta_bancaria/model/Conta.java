package conta_bancaria.model;

public abstract class Conta {

	// Atributos privados, só podem ser acessados ou modificados por metodos
	// publicos (get e set)

	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;

	// Source Generate Constructor using Fields ("Atalho")
	// this é para se referir aos atributos da classe atual
	// this.numero => atributo da classe
	// =numero; => parametro do método construtor

	public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean sacar(float valor) {

		if (this.saldo < valor) {
			System.out.println("\n Saldo Insuficiente!");
			return false;
		}
		this.saldo = this.saldo - valor;
		return true;
	}

	public void depositar(float valor) {

		this.saldo = this.saldo + valor;

	}

	public void visualizar() {

		String tipo = "";

		switch (this.tipo) {
		case 1:
			tipo = "Conta Corrente";
			break;
		case 2:
			tipo = "Conta Poupança";
			break;
		}
		
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados da Conta:");
		System.out.println("***********************************************************");
		System.out.println("Numero da Conta: " + this.numero);
		System.out.println("Agência: " + this.agencia);
		System.out.println("Tipo da Conta: " + tipo);
		System.out.println("Titular: " + this.titular);
		System.out.printf("Saldo: R$ %.2f%n", this.saldo);
	}
}
