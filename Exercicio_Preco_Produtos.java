import java.util.Scanner;

public class Exercicio_Preco_Produtos {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		// Faça um programa que receba o preço, a categoria
		// (1 – limpeza; 2 – alimentação; ou 3 – vestuário)
		// e a situação (R – produtos que necessitam de
		// refrigeração; e N – produtos que não necessitam
		// de refrigeração). Calcule e mostre:

		// O valor do aumento, usando as regras que se seguem.

		float preco, aumento, com_imposto, novo_valor;
		int categoria, refrigeracao;
		String cat;
		String situacao;
		System.out.println(" Qual o valor do produto ?");
		preco = leitor.nextFloat();
		System.out.println("==============================================");

		System.out.println(" Qual categoria pertence ?");
		System.out.println("1-LIMPEZA  == 2-ALIMENTAÇÃO  == 3-VESTUÁRIO");
		System.out.println("==============================================");
		categoria = leitor.nextInt();

		switch (categoria) {
		case 1:
			cat = "LIMPEZA";
			break;
		case 2:
			cat = "ALIMENTAÇÃO";
			break;
		case 3:
			cat = "VESTUÁRIO";
			break;
		default:
			cat = " OPÇÃO INVÁLIDA";
			break;

		}

		System.out.println(cat);

		/*
		 * if(categoria == 1 && preco <=25) {
		 * 
		 * aumento = preco + ((preco/100) * 5);
		 * System.out.println(" Teve um reajuste de 5% e foi para :" + aumento);
		 * 
		 * }else if(categoria == 2 && preco <= 25) {
		 * 
		 * aumento = preco + ((preco/100) * 8);
		 * System.out.println(" Teve um reajuste de 8% e foi para :" + aumento);
		 * 
		 * }else if(categoria == 3 && preco <= 25) {
		 * 
		 * aumento = preco + ((preco/100) * 10);
		 * System.out.println(" Teve um reajuste de 10% e foi para :" + aumento);
		 * 
		 * }else if(categoria == 1 && preco > 25) {
		 * 
		 * aumento = preco + ((preco/100) * 12);
		 * System.out.println(" Teve um reajuste de 12% e foi para :" + aumento);
		 * 
		 * }else if(categoria == 2 && preco > 25) {
		 * 
		 * aumento = preco + ((preco/100) * 15);
		 * System.out.println(" Teve um reajuste de 15% e foi para :" + aumento);
		 * 
		 * }else if(categoria == 3 && preco > 25) {
		 * 
		 * aumento = preco + ((preco/100) * 18);
		 * System.out.println(" Teve um reajuste de 18% e foi para :" + aumento);
		 * 
		 * }
		 */
		System.out.println("==============================================");

		System.out.println(" Esse produto precisa de refrigeração ?");
		System.out.println("1-R (Necessita)  ==  2-N ( Não Necessita ) ");
		System.out.println("==============================================");
		refrigeracao = leitor.nextInt();

		switch (refrigeracao) {
		case 1:
			situacao = "NECESSITA DE REFRIGERAÇÃO";
			break;
		case 2:
			situacao = "NÃO NECESSITA DE REFRIGERAÇÃO";
			break;

		default:
			situacao = " OPÇÃO INVÁLIDA";
			break;

		}

		System.out.println(situacao);

		// Categoria 1
		if (preco <= 25 && categoria == 1) {
			aumento = preco + ((preco / 100) * 5);

			System.out.println("\n O valor com aumento é :" + aumento);
			novo_valor = aumento;

			if (refrigeracao == 1 && novo_valor <= 50 && categoria == 1) {
				novo_valor = novo_valor + ((novo_valor / 100) * 5);
				System.out.printf(" VAI COLCAR MATERIAL DE LIMPEZA NA GELADEIRA ?");
				System.out.printf("\n O valor do aumento com imposto é  %.2f", novo_valor);
				System.out.println("\n CLASSIFICAÇÃO = BARATO");
			} else if (refrigeracao == 1 && novo_valor < 120 && categoria == 1) {
				novo_valor = novo_valor + ((novo_valor / 100) * 5);
				System.out.printf(" VAI COLCAR MATERIAL DE LIMPEZA NA GELADEIRA ?");
				System.out.printf("O valor do aumento com imposto é  %.2f", novo_valor);
				System.out.println("\n CLASSIFICAÇÃO = NORMAL");
			} else if (refrigeracao == 1 && novo_valor >= 120 && categoria == 1) {
				novo_valor = novo_valor + ((novo_valor / 100) * 5);
				System.out.printf(" VAI COLCAR MATERIAL DE LIMPEZA NA GELADEIRA ?");
				System.out.printf("O valor do aumento com imposto é  %.2f", novo_valor);
				System.out.println("\n CLASSIFICAÇÃO = 	CARO");
				// refrigeração = opção 2 não necessita
			} else if (refrigeracao == 2 && novo_valor <= 50 && categoria == 1) {
				novo_valor = novo_valor + ((novo_valor / 100) * 8);
				System.out.printf(" VAI COLCAR MATERIAL DE LIMPEZA NA GELADEIRA ?");
				System.out.printf("\n O valor do aumento com imposto é  %.2f", novo_valor);
				System.out.println("\n CLASSIFICAÇÃO = BARATO");
			} else if (refrigeracao == 2 && novo_valor < 120 && categoria == 1) {
				novo_valor = novo_valor + ((novo_valor / 100) * 8);
				System.out.printf(" VAI COLCAR MATERIAL DE LIMPEZA NA GELADEIRA ?");
				System.out.printf("O valor do aumento com imposto é  %.2f", novo_valor);
				System.out.println("\n CLASSIFICAÇÃO = NORMAL");
			} else if (refrigeracao == 2 && novo_valor >= 120 && categoria == 1) {
				novo_valor = novo_valor + ((novo_valor / 100) * 8);
				System.out.printf(" VAI COLCAR MATERIAL DE LIMPEZA NA GELADEIRA ?");
				System.out.printf("O valor do aumento com imposto é  %.2f", novo_valor);
				System.out.println("\n CLASSIFICAÇÃO = 	CARO");

			}

			// Maior que 25 categoria 1

		} else if (preco > 25 && categoria == 1) {
			aumento = preco + ((preco / 100) * 12);

			System.out.println("\n O valor com aumento é :" + aumento);
			novo_valor = aumento;

			if (refrigeracao == 1 && novo_valor <= 50 && categoria == 1) {
				novo_valor = novo_valor + ((novo_valor / 100) * 5);
				System.out.printf(" VAI COLOCAR MATERIAL DE LIMPEZA NA GELADEIRA ?");
				System.out.printf("\n O valor do aumento com imposto é  %.2f", novo_valor);
				System.out.println("\n CLASSIFICAÇÃO = BARATO");
			} else if (refrigeracao == 1 && novo_valor < 120 && categoria == 1) {
				novo_valor = novo_valor + ((novo_valor / 100) * 5);
				System.out.printf(" VAI COLOCAR MATERIAL DE LIMPEZA NA GELADEIRA ?");
				System.out.printf("\n O valor do aumento com imposto é  %.2f", novo_valor);
				System.out.println("\n CLASSIFICAÇÃO = NORMAL");
			} else if (refrigeracao == 1 && novo_valor >= 120 && categoria == 1) {
				novo_valor = novo_valor + ((novo_valor / 100) * 5);
				System.out.printf(" VAI COLOCAR MATERIAL DE LIMPEZA NA GELADEIRA ?");
				System.out.printf("\n O valor do aumento com imposto é  %.2f", novo_valor);
				System.out.println("\n CLASSIFICAÇÃO = 	CARO");
				// refrigeração = opção 2 não necessita
			} else if (refrigeracao == 2 && novo_valor <= 50 && categoria == 1) {
				novo_valor = novo_valor + ((novo_valor / 100) * 8);
				System.out.printf(" VAI COLOCAR MATERIAL DE LIMPEZA NA GELADEIRA ?");
				System.out.printf("\n O valor do aumento com imposto é  %.2f", novo_valor);
				System.out.println("\n CLASSIFICAÇÃO = BARATO");
			} else if (refrigeracao == 2 && novo_valor < 120 && categoria == 1) {
				novo_valor = novo_valor + ((novo_valor / 100) * 8);
				System.out.printf(" VAI COLOCAR MATERIAL DE LIMPEZA NA GELADEIRA ?");
				System.out.printf("\n O valor do aumento com imposto é  %.2f", novo_valor);
				System.out.println("\n CLASSIFICAÇÃO = NORMAL");
			} else if (refrigeracao == 2 && novo_valor >= 120 && categoria == 1) {
				novo_valor = novo_valor + ((novo_valor / 100) * 8);
				System.out.printf(" VAI COLOCAR MATERIAL DE LIMPEZA NA GELADEIRA ?");
				System.out.printf("\n O valor do aumento com imposto é  %.2f", novo_valor);
				System.out.println("\n CLASSIFICAÇÃO = 	CARO");

			}

			// apartir daqui categoria 2
		}
		if (preco <= 25 && categoria == 2) {
			aumento = preco + ((preco / 100) * 8);

			System.out.println(" O valor com aumento é :" + aumento);
			novo_valor = aumento;

			if (refrigeracao == 1 && novo_valor <= 50 && categoria == 2) {
				novo_valor = novo_valor + ((novo_valor / 100) * 5);

				System.out.printf(" O valor do aumento com imposto é  %.2f", novo_valor);
				System.out.println("\n CLASSIFICAÇÃO = BARATO");
			} else if (refrigeracao == 1 && novo_valor < 120 && categoria == 2) {
				novo_valor = novo_valor + ((novo_valor / 100) * 5);

				System.out.printf(" O valor do aumento com imposto é  %.2f", novo_valor);
				System.out.println("\n CLASSIFICAÇÃO = NORMAL");
			} else if (refrigeracao == 1 && novo_valor >= 120 && categoria == 2) {
				novo_valor = novo_valor + ((novo_valor / 100) * 5);

				System.out.printf(" O valor do aumento com imposto é  %.2f", novo_valor);
				System.out.println("\n CLASSIFICAÇÃO = 	CARO");
				// refrigeração = opção 2 não necessita
			} else if (refrigeracao == 2 && novo_valor <= 50 && categoria == 2) {
				novo_valor = novo_valor + ((novo_valor / 100) * 8);

				System.out.printf(" O valor do aumento com imposto é  %.2f", novo_valor);
				System.out.println("\n CLASSIFICAÇÃO = BARATO");
			} else if (refrigeracao == 2 && novo_valor < 120 && categoria == 2) {
				novo_valor = novo_valor + ((novo_valor / 100) * 8);

				System.out.printf("O valor do aumento com imposto é  %.2f", novo_valor);
				System.out.println("\n CLASSIFICAÇÃO = NORMAL");
			} else if (refrigeracao == 2 && novo_valor >= 120 && categoria == 2) {
				novo_valor = novo_valor + ((novo_valor / 100) * 8);

				System.out.printf("O valor do aumento com imposto é  %.2f", novo_valor);
				System.out.println("\n CLASSIFICAÇÃO = 	CARO");

			}

			// Maior que 25 categoria 2

		} else if (preco > 25 && categoria == 2) {
			aumento = preco + ((preco / 100) * 15);

			System.out.println(" O valor com aumento é :" + aumento);
			novo_valor = aumento;

			if (refrigeracao == 1 && novo_valor <= 50 && categoria == 2) {
				novo_valor = novo_valor + ((novo_valor / 100) * 5);

				System.out.printf("\n O valor do aumento com imposto é  %.2f", novo_valor);
				System.out.println("\n CLASSIFICAÇÃO = BARATO");
			} else if (refrigeracao == 1 && novo_valor < 120 && categoria == 2) {
				novo_valor = novo_valor + ((novo_valor / 100) * 5);

				System.out.printf(" O valor do aumento com imposto é  %.2f", novo_valor);
				System.out.println("\n CLASSIFICAÇÃO = NORMAL");
			} else if (refrigeracao == 1 && novo_valor >= 120 && categoria == 2) {
				novo_valor = novo_valor + ((novo_valor / 100) * 5);

				System.out.printf(" O valor do aumento com imposto é  %.2f", novo_valor);
				System.out.println("\n CLASSIFICAÇÃO = 	CARO");
				// refrigeração = opção 2 não necessita
			} else if (refrigeracao == 2 && novo_valor <= 50 && categoria == 2) {
				novo_valor = novo_valor + ((novo_valor / 100) * 8);

				System.out.printf(" O valor do aumento com imposto é  %.2f", novo_valor);
				System.out.println("\n CLASSIFICAÇÃO = BARATO");
			} else if (refrigeracao == 2 && novo_valor < 120 && categoria == 2) {
				novo_valor = novo_valor + ((novo_valor / 100) * 8);

				System.out.printf(" O valor do aumento com imposto é  %.2f", novo_valor);
				System.out.println("\n CLASSIFICAÇÃO = NORMAL");
			} else if (refrigeracao == 2 && novo_valor >= 120 && categoria == 2) {
				novo_valor = novo_valor + ((novo_valor / 100) * 8);

				System.out.printf(" O valor do aumento com imposto é  %.2f", novo_valor);
				System.out.println("\n CLASSIFICAÇÃO = 	CARO");

			}

			// apartir daqui categoria 3
		} else if (preco <= 25 && categoria == 3) {
			aumento = preco + ((preco / 100) * 18);

			System.out.println(" O valor com aumento é :" + aumento);
			novo_valor = aumento;

			if (refrigeracao == 1 && novo_valor <= 50 && categoria == 3) {
				novo_valor = novo_valor + ((novo_valor / 100) * 5);
				System.out.printf(" VAI COLOCAR MATERIAL DE LIMPEZA NA GELADEIRA ?");
				System.out.printf("\n O valor do aumento com imposto é  %.2f", novo_valor);
				System.out.println("\n CLASSIFICAÇÃO = BARATO");
			} else if (refrigeracao == 1 && novo_valor < 120 && categoria == 3) {
				novo_valor = novo_valor + ((novo_valor / 100) * 5);
				System.out.printf(" VAI COLOCAR MATERIAL DE LIMPEZA NA GELADEIRA ?");
				System.out.printf("\nO valor do aumento com imposto é  %.2f", novo_valor);
				System.out.println("\n CLASSIFICAÇÃO = NORMAL");
			} else if (refrigeracao == 1 && novo_valor >= 120 && categoria == 3) {
				novo_valor = novo_valor + ((novo_valor / 100) * 5);
				System.out.printf(" VAI COLOCAR MATERIAL DE LIMPEZA NA GELADEIRA ?");
				System.out.printf("\nO valor do aumento com imposto é  %.2f", novo_valor);
				System.out.println("\n CLASSIFICAÇÃO = 	CARO");
				// refrigeração = opção 2 não necessita
			} else if (refrigeracao == 2 && novo_valor <= 50 && categoria == 3) {
				novo_valor = novo_valor + ((novo_valor / 100) * 8);
				System.out.printf(" VAI COLOCAR MATERIAL DE LIMPEZA NA GELADEIRA ?");
				System.out.printf("\n O valor do aumento com imposto é  %.2f", novo_valor);
				System.out.println("\n CLASSIFICAÇÃO = BARATO");
			} else if (refrigeracao == 2 && novo_valor < 120 && categoria == 3) {
				novo_valor = novo_valor + ((novo_valor / 100) * 8);
				System.out.printf(" VAI COLOCAR MATERIAL DE LIMPEZA NA GELADEIRA ?");
				System.out.printf("\nO valor do aumento com imposto é  %.2f", novo_valor);
				System.out.println("\n CLASSIFICAÇÃO = NORMAL");
			} else if (refrigeracao == 2 && novo_valor >= 120 && categoria == 3) {
				novo_valor = novo_valor + ((novo_valor / 100) * 8);
				System.out.printf(" VAI COLOCAR MATERIAL DE LIMPEZA NA GELADEIRA ?");
				System.out.printf("\nO valor do aumento com imposto é  %.2f", novo_valor);
				System.out.println("\n CLASSIFICAÇÃO = 	CARO");

			}

			// Maior que 25 categoria 3

		} else if (preco > 25 && categoria == 3) {
			aumento = preco + ((preco / 100) * 18);

			System.out.println(" O valor com aumento é :" + aumento);
			novo_valor = aumento;

			if (refrigeracao == 1 && novo_valor <= 50 && categoria == 3) {
				novo_valor = novo_valor + ((novo_valor / 100) * 5);
				System.out.printf(" VAI COLOCAR MATERIAL DE LIMPEZA NA GELADEIRA ?");
				System.out.printf("\nO valor do aumento com imposto é  %.2f", novo_valor);
				System.out.println("\n CLASSIFICAÇÃO = BARATO");
			} else if (refrigeracao == 1 && novo_valor < 120 && categoria == 3) {
				novo_valor = novo_valor + ((novo_valor / 100) * 5);
				System.out.printf(" VAI COLOCAR MATERIAL DE LIMPEZA NA GELADEIRA ?");
				System.out.printf("\nO valor do aumento com imposto é  %.2f", novo_valor);
				System.out.println("\n CLASSIFICAÇÃO = NORMAL");
			} else if (refrigeracao == 1 && novo_valor >= 120 && categoria == 3) {
				novo_valor = novo_valor + ((novo_valor / 100) * 5);
				System.out.printf(" VAI COLOCAR MATERIAL DE LIMPEZA NA GELADEIRA ?");
				System.out.printf("\nO valor do aumento com imposto é  %.2f", novo_valor);
				System.out.println("\n CLASSIFICAÇÃO = 	CARO");
				// refrigeração = opção 2 não necessita
			} else if (refrigeracao == 2 && novo_valor <= 50 && categoria == 3) {
				novo_valor = novo_valor + ((novo_valor / 100) * 8);
				System.out.printf(" VAI COLOCAR MATERIAL DE LIMPEZA NA GELADEIRA ?");
				System.out.printf("\nO valor do aumento com imposto é  %.2f", novo_valor);
				System.out.println("\n CLASSIFICAÇÃO = BARATO");
			} else if (refrigeracao == 2 && novo_valor < 120 && categoria == 3) {
				novo_valor = novo_valor + ((novo_valor / 100) * 8);
				System.out.printf(" VAI COLOCAR MATERIAL DE LIMPEZA NA GELADEIRA ?");
				System.out.printf("\n O valor do aumento com imposto é  %.2f", novo_valor);
				System.out.println("\n CLASSIFICAÇÃO = NORMAL");
			} else if (refrigeracao == 2 && novo_valor >= 120 && categoria == 3) {
				novo_valor = novo_valor + ((novo_valor / 100) * 8);
				System.out.printf(" VAI COLOCAR MATERIAL DE LIMPEZA NA GELADEIRA ?");
				System.out.printf("\n O valor do aumento com imposto é  %.2f", novo_valor);
				System.out.println("\n CLASSIFICAÇÃO = 	CARO");

			}

		}

	}

}
