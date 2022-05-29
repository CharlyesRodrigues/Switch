import java.util.Scanner;

public class Exercicio4_Operacoes_Numeros {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		float x,y,media;
		float subtracao,multiplicacao,divisao;
		int escolha;
		String operacoes;
		
	System.out.println("OPERAÇÕES NUMÉRICAS");
    System.out.println("======================================");
		
	System.out.println("Digite o primeiro número :");
	x = leitor.nextFloat();
	System.out.println("Digite o segundo número :");
	y = leitor.nextFloat();
   
	
	System.out.println("=================================================");
   
	System.out.println("ESCOLHA A OPÇÃO DA OPERERAÇÃO QUE VOCÊ DESEJA");
	System.out.println("=================================================");
	   
    System.out.println("OPÇÕES : 1- MEDIA ENTRE OS NÚMEROS DIGITADOS");
    System.out.println("OPÇÕES : 2- DIFERENÇA DO MAIOR PARA O MENOR");
    System.out.println("OPÇÕES : 3- MULTIPLICAÇÃO DO NÚMEROS DIGITADOS");
    System.out.println("OPÇÕES : 4- DIVISÃO DO PRIMEIRO PELO SEGUNDO");
	
	escolha = leitor.nextInt();
	
	switch(escolha) {
	
	case 1: operacoes = " Media dos números digitados é"; break;
	case 2: operacoes = " Diferença do Maior para o menor"; break;
	case 3: operacoes = " Multiplicação entre os números digitados"; break;
	case 4: operacoes = " Divisão do primeiro pelo segundo"; break;
	default : operacoes = "OPÇÃO INVÁLIDA"; break;
	}
	 System.out.println(operacoes);
	
	if (escolha ==1) {
	 media = (x + y) /2;	 
	System.out.println(+ media); 
 
	}else if(escolha == 2 && x > y) {
	 
	 subtracao = x - y;
	 System.out.println(+ subtracao);
 } else if(escolha == 2 && y > x) {
	 
	 subtracao = y - x;
	 System.out.println(+ subtracao);
 } else if (escolha ==3 )  {
	 
	 multiplicacao = x * y;
	 System.out.println(+multiplicacao);
	 
 }else {
	 
	divisao = x / y;
	 System.out.println(+ divisao);
	 
 }
  

	}

}
