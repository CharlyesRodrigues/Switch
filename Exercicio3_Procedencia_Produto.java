import java.util.Scanner;

public class Exercicio3_Procedencia_Produto {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		float valor;
		int codigo;
		String procedencia;
//Faça um programa que receba o preço de um produto e seu código de origem e 
//mostre sua procedência. A procedência obedece à tabela a seguir.

		System.out.println("               Procedência de Produtos");
		System.out.println("=================================================");
		System.out.println("Qual o valor do produto ?");
	valor = leitor.nextFloat();
	System.out.println("Qual é o código da região ?");
	codigo = leitor.nextInt();
	
	switch(codigo) {
	
	
	case 1: procedencia = "SUL"; break;
	case 2: procedencia = "NORTE"; break;
	case 3: procedencia = "LESTE"; break;
	case 4: procedencia = "OESTE"; break;
	case 5: procedencia = "NORDESTE"; break;
	case 6: procedencia = "NORDESTE"; break;
	case 7: procedencia = "SUDESTE"; break;
	case 8: procedencia = "SUDESTE"; break;
	case 9: procedencia = "SUDESTE"; break;
	case 10: procedencia = "CENTRO-OESTE"; break;
	case 11: procedencia = "CENTRO-OESTE"; break;
	case 12: procedencia = "CENTRO-OESTE"; break;
	case 13: procedencia = "CENTRO-OESTE"; break;
	case 14: procedencia = "CENTRO-OESTE"; break;
	case 15: procedencia = "CENTRO-OESTE"; break;
	case 16: procedencia = "CENTRO-OESTE"; break;
	case 17: procedencia = "CENTRO-OESTE"; break;
	case 18: procedencia = "CENTRO-OESTE"; break;
	case 19: procedencia = "CENTRO-OESTE"; break;
	case 20: procedencia = "CENTRO-OESTE"; break;
	case 21: procedencia = "NORDESTE"; break;
	case 22: procedencia = "NORDESTE"; break;
	case 23: procedencia = "NORDESTE"; break;
	case 24: procedencia = "NORDESTE"; break;
	case 25: procedencia = "NORDESTE"; break;
	case 26: procedencia = "NORDESTE"; break;
	case 27: procedencia = "NORDESTE"; break;
	case 28: procedencia = "NORDESTE"; break;
	case 29: procedencia = "NORDESTE"; break;
	case 30: procedencia = "NORDESTE"; break;
	
default : procedencia = "OPÇÃO INVÁLIDA"; break;
	
	
	}
	
	System.out.println("A região referente ao código digitado é "+ procedencia);
	}

}
