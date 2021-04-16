package br.com.erickfreire.apolicedesegurodeautomovel;


/**
 * Programa em Java que controla apólice de seguros
 * @author Erick Freire
 * @version 1 - Criado em 16-04-2021 as 15:02
 */

public class ApoliceDeSeguroDeAutomovel {
	
		private int numeroDaConta;
		private String modeloDoCarro;
		private String estado;
		
		public ApoliceDeSeguroDeAutomovel(int numeroDaConta, String modeloDoCarro, String estado) {
			this.numeroDaConta = numeroDaConta;
			this.modeloDoCarro = modeloDoCarro;
			this.estado = estado;
		}

		public int getNumeroDaConta() {
			return numeroDaConta;
		}

		public void setNumeroDaConta(int numeroDaConta) {
			this.numeroDaConta = numeroDaConta;
		}

		public String getModeloDoCarro() {
			return modeloDoCarro;
		}

		public void setModeloDoCarro(String modeloDoCarro) {
			this.modeloDoCarro = modeloDoCarro;
		}

		public String getEstado() {
			return estado;
		}

		public void setEstado(String estado) {
			this.estado = estado;
		}
		
		public boolean estadoValido() {
			boolean estVal;
			switch (getEstado()) 
			{
			case "MA": 
			case "NJ": 
			case "NY":
			case "PA": 
		       estVal = true; 
			   break; 
		    default: 
			   estVal = false; 
			   break; 
			} 
			return estVal;
		}
		


}
