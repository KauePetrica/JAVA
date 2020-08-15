import java.util.Scanner;
public class Exrc01 {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		System.out.println("digite o valor 1");
		double a = ler.nextDouble();


		System.out.println("digite o valor 2");
		double b = ler.nextDouble();

		System.out.println("digite o valor 3");
		double c = ler.nextDouble();
		//soma
		double soma=(a+b+c);
		//calculo do percentual
		double pessoa1 =(((a*100)/soma)/100)*1000;

		double pessoa2 =(((b*100)/soma)/100)*1000;

		double pessoa3 =(((c*100)/soma)/100)*1000;
		
		System.out.println("Valor pessoa1 "+pessoa1);
		System.out.println("Valor pessoa2 "+pessoa2);
		System.out.println("Valor pessoa3 "+pessoa3);
		
		}
	}


