package aula0808;

public class Conta {
	
	private double saldo;
	private String nrAgencia;
	private String titular;
	private String nrConta;
	private int codBanco;
	
	public Conta(double saldo, String nrAgencia, String titular, String nrConta, int codBanco) {
		this.saldo = saldo;
		this.nrAgencia = nrAgencia;
		this.titular = titular;
		this.nrConta = nrConta;
		this.codBanco = codBanco;
	}
	public Conta() {
		
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNrAgencia() {
		return nrAgencia;
	}
	public void setNrAgencia(String nrAgencia) {
		this.nrAgencia = nrAgencia;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getNrConta() {
		return nrConta;
	}
	public void setNrConta(String nrConta) {
		this.nrConta = nrConta;
	}
	public int getCodBanco() {
		return codBanco;
	}
	public void setCodBanco(int codBanco) {
		this.codBanco = codBanco;
	}
	
	public void saque(double valor) {
		if(valor > 0) {
			if(saldo > valor) {
				saldo = saldo - valor;
			}else {
			System.out.println("Saldo insuficiente!");
			}
		}
	}
	
	void deposito(double valor) {
		if(valor > 0) {
			saldo = saldo + valor;
		}
	}
	
	public void imprimeDados() {
		System.out.println("Banco: "+codBanco+"\tAgencia: "+nrAgencia);
		System.out.println("Conta: \t"+nrConta);
		System.out.println("Titular: "+titular);
		System.out.println("Saldo: "+saldo);
		System.out.println("----------------------");
	}
	
}
