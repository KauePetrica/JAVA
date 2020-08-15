package aula0603;

public class Contribuinte {

		private double salario ;
		
		 
			
		public double getSalario() {
			return salario;
		}	



		public void setSalario(double salario) {
			this.salario = salario;
		}



		public void imposto(double salario) {
				if (salario<=1164)	
				System.out.println("Isento de impostos ");
				else if (salario<=2326) {
					double imposto=salario*0.15;
				System.out.println("Imposto: "+imposto);}
				
				else {
					double imposto=salario*0.27;
					System.out.println("Imposto: "+imposto);}
				
				}
}


