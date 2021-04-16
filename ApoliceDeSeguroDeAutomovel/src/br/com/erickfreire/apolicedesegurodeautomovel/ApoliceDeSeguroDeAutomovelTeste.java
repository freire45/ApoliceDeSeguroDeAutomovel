package br.com.erickfreire.apolicedesegurodeautomovel;

public class ApoliceDeSeguroDeAutomovelTeste {
	public static void main(String[] args) {
		ApoliceDeSeguroDeAutomovel apolice1 = new ApoliceDeSeguroDeAutomovel(11111111, "Toyota Camry", "NJ");
		ApoliceDeSeguroDeAutomovel apolice2 = new ApoliceDeSeguroDeAutomovel(22222222, "Ford Fusion", "ME");

		estadoValido1(apolice1);
		estadoValido1(apolice2);
	}

	public static void estadoValido1(ApoliceDeSeguroDeAutomovel apolice) {
		System.out.println("A Apolice do seguro do carro:");
		System.out.printf("Conta #: %d; Carro: %s; Estado %s %s Estado válido: %n%n", apolice.getNumeroDaConta(),
				apolice.getModeloDoCarro(), apolice.getEstado(), (apolice.estadoValido() ? "é" : "não é"));
	}

}
