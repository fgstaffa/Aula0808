package aula0808;

public class TestaConta {

	public static void main(String[] args) {
		
		Conta c = new Conta();
		Conta c1 = new Conta(3897.64,"0728","6482-1","Felipe Fagundes Staffa", 341);
		
		c.setCodBanco(237);
		c.setNrAgencia("2920");
		c.setNrConta("100889-7");
		c.setTitular("Felipe Fagundes Staffa");
		c.setSaldo(231.52);
		
		c.imprimeDados();
		c1.imprimeDados();

	}

}
