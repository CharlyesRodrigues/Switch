import java.util.Scanner;

public class Exercicio4_Operacoes_Numeros {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		float x,y,media;
		float subtracao,multiplicacao,divisao;
		int escolha;
		String operacoes;
		
	System.out.println("OPERA��ES NUM�RICAS");
    System.out.println("======================================");
		
	System.out.println("Digite o primeiro n�mero :");
	x = leitor.nextFloat();
	System.out.println("Digite o segundo n�mero :");
	y = leitor.nextFloat();
   
	
	System.out.println("=================================================");
   
	System.out.println("ESCOLHA A OP��O DA OPERERA��O QUE VOC� DESEJA");
	System.out.println("=================================================");
	   
    System.out.println("OP��ES : 1- MEDIA ENTRE OS N�MEROS DIGITADOS");
    System.out.println("OP��ES : 2- DIFEREN�A DO MAIOR PARA O MENOR");
    System.out.println("OP��ES : 3- MULTIPLICA��O DO N�MEROS DIGITADOS");
    System.out.println("OP��ES : 4- DIVIS�O DO PRIMEIRO PELO SEGUNDO");
	
	escolha = leitor.nextInt();
	
	switch(escolha) {
	
	case 1: operacoes = " Media dos n�meros digitados �"; break;
	case 2: operacoes = " Diferen�a do Maior para o menor"; break;
	case 3: operacoes = " Multiplica��o entre os n�meros digitados"; break;
	case 4: operacoes = " Divis�o do primeiro pelo segundo"; break;
	default : operacoes = "OP��O INV�LIDA"; break;
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
