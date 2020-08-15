
public class TestaConta {
	public static void main(String[] args) {
		
	
	Conta a = new Conta ();
	a.nrAgencia ="1";
	a.codBanco=234;		
	a.nrConta="01945";
	a.titular="FULANO";
	a.saldo=10000;
	System.out.println("--------------------");
	System.out.println("Agencia "+a.nrAgencia +"\tBanco "+a.codBanco );
	System.out.println("NOME "+a.nrConta);
	System.out.println("CPF "+a.titular);
	System.out.println("Saldo R$ "+a.saldo);
	System.out.println("--------------------");
	}
}