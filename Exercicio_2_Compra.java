import java.util.Scanner;

public class Exercicio_2_Compra {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int codigo;
		float descontos,quantidade,preco,total, valor_pagar;
	     String produto;
	     String codigos;
		//Fa�a um programa que receba:

			//O c�digo do produto comprado; e
			//A quantidade comprada do produto.
			//Calcule e mostre:

			//O pre�o unit�rio do produto comprado, seguindo a Tabela abaixo;
			//O pre�o total da nota;
			//O valor do desconto, seguindo a Tabela abaixo e aplicado sobre o pre�o total da nota; e
			//O pre�o final da nota depois do desconto.

           System.out.println("             COMPRA DE PRODUTO");
           System.out.println("========================================================");

           System.out.println("Qual produto voc� deseja comprar ?");
           produto = leitor.nextLine();
           System.out.println(" Por favor me informe o c�digo desse produto :");
           codigo = leitor.nextInt();
          
                               
           
           switch(codigo) {
           case 1 : codigos = "AT�  R$250,00  DAMOS 5% DE DESCONTO"; break;
           case 2 : codigos = "AT�  R$250,00  DAMOS 5% DE DESCONTO"; break;
           case 3 : codigos = "AT�  R$250,00  DAMOS 5% DE DESCONTO"; break;
           case 4 : codigos = "AT�  R$250,00  DAMOS 5% DE DESCONTO"; break;
           case 5 : codigos = "AT�  R$250,00  DAMOS 5% DE DESCONTO"; break;
           case 6 : codigos = "AT�  R$250,00  DAMOS 5% DE DESCONTO"; break;
           case 7 : codigos = "AT�  R$250,00  DAMOS 5% DE DESCONTO"; break;
           case 8 : codigos = "AT�  R$250,00  DAMOS 5% DE DESCONTO"; break;
           case 9 : codigos = "AT�  R$250,00  DAMOS 5% DE DESCONTO"; break;
           case 10 : codigos = "AT�  R$250,00  DAMOS 5% DE DESCONTO"; break;
           
           case 11 : codigos = "ENTRE  R$250,00 E R$ 500,00  DAMOS 10% DE DESCONTO"; break;
           case 12 : codigos = "ENTRE  R$250,00 E R$ 500,00  DAMOS 10% DE DESCONTO"; break;
           case 13 : codigos = "ENTRE  R$250,00 E R$ 500,00  DAMOS 10% DE DESCONTO"; break;
           case 14 : codigos = "ENTRE  R$250,00 E R$ 500,00  DAMOS 10% DE DESCONTO"; break;
           case 15 : codigos = "ENTRE  R$250,00 E R$ 500,00  DAMOS 10% DE DESCONTO"; break;
           case 16 : codigos = "ENTRE  R$250,00 E R$ 500,00  DAMOS 10% DE DESCONTO"; break;
           case 17 : codigos = "ENTRE  R$250,00 E R$ 500,00  DAMOS 10% DE DESCONTO"; break;
           case 18 : codigos = "ENTRE  R$250,00 E R$ 500,00  DAMOS 10% DE DESCONTO"; break;
           case 19 : codigos = "ENTRE  R$250,00 E R$ 500,00  DAMOS 10% DE DESCONTO"; break;
           case 20 : codigos = "ENTRE  R$250,00 E R$ 500,00  DAMOS 10% DE DESCONTO"; break;
           
           case 21 : codigos = "ACIMA DE R$ 50,00  DAMOS 15% DE DESCONTO"; break;
           case 22 : codigos = "ACIMA DE R$ 50,00  DAMOS 15% DE DESCONTO"; break;
           case 23 : codigos = "ACIMA DE R$ 50,00  DAMOS 15% DE DESCONTO"; break;
           case 24 : codigos = "ACIMA DE R$ 50,00  DAMOS 15% DE DESCONTO"; break;
           case 25 : codigos = "ACIMA DE R$ 50,00  DAMOS 15% DE DESCONTO"; break;
           case 26 : codigos = "ACIMA DE R$ 50,00  DAMOS 15% DE DESCONTO"; break;
           case 27 : codigos = "ACIMA DE R$ 50,00  DAMOS 15% DE DESCONTO"; break;
           case 28 : codigos = "ACIMA DE R$ 50,00  DAMOS 15% DE DESCONTO"; break;
           case 29 : codigos = "ACIMA DE R$ 50,00  DAMOS 15% DE DESCONTO"; break;
           case 30 : codigos = "ACIMA DE R$ 50,00  DAMOS 15% DE DESCONTO"; break;
           
           case 31 : codigos = "SEM DESCONTO"; break;
           case 32 : codigos = "SEM DESCONTO"; break;
           case 33 : codigos = "SEM DESCONTO"; break;
           case 34 : codigos = "SEM DESCONTO"; break;
           case 35 : codigos = "SEM DESCONTO"; break;
           case 36 : codigos = "SEM DESCONTO"; break;
           case 37 : codigos = "SEM DESCONTO"; break;
           case 38 : codigos = "SEM DESCONTO"; break;
           case 39 : codigos = "SEM DESCONTO"; break;
           case 40 : codigos = "SEM DESCONTO"; break;
          
           default : codigos = "OP��O INV�LIDA";break;
           
              
           }
           

           System.out.println(codigos);
           System.out.println("==================================================================");
      	 
           System.out.println(" Qual a quantidade que deseja ?");
           quantidade = leitor.nextInt();
           
        
           // Codigo do 1 ao 10
           if(codigo <=10 && quantidade <=25) {
        	   preco = 10;
        	   System.out.println("==================================================================");
        	   System.out.println(" O PRE�O UNIT�RIO DESSE PRODUTO � R$ 10,00");
        	   total = quantidade * preco ;
        	   System.out.println(" O valor total da nota � :" + total);
               descontos  = (total/100) * 5;
               System.out.printf(" O valor do desconto � %.2f ", + descontos);
               
               valor_pagar = total - descontos;
               System.out.printf("\n O valor total da nota � %.2f ", + valor_pagar );
               
           }else  if(codigo <=10 && quantidade >25){
        	   
        	   preco = 10;
        	   System.out.println("==================================================================");
        	   
        	   System.out.println(" O PRE�O UNIT�RIO DESSE PRODUTO � R$ 10,00");
        	   total = quantidade * preco ;
        	   System.out.println(" O valor total da nota � :" + total);
        	   System.out.println(" Acima de 25 unidades n�o damos desconto");
                            
                  
           }
                     // Codigo do 11 ao 20
           else if( codigo <=20 && quantidade <=33 ) {
        	   preco = 15;
        	   System.out.println("==================================================================");
        	   System.out.println(" O PRE�O UNIT�RIO DESSE PRODUTO � R$ 15,00");
        	   total = quantidade * preco ;
        	   System.out.println(" O valor total da nota � :" + total);
               descontos  = (total/100) * 10;
               System.out.printf(" O valor do desconto � %.2f ", + descontos);
               
               valor_pagar = total - descontos;
               System.out.printf("\n O valor total da nota � %.2f ", + valor_pagar );
               
           }else if( codigo <=20 && quantidade >  33){
        	   
        	   preco = 15;
        	   System.out.println("==================================================================");
        	   
        	   System.out.println(" O PRE�O UNIT�RIO DESSE PRODUTO � R$ 15,00");
        	   total = quantidade * preco ;
        	   System.out.println(" O valor total da nota � :" + total);
        	   System.out.println(" Acima de 33 unidades n�o damos desconto");
                            
                  
           }
           // Codigo do 21 ao 30
           else if( codigo <=30 && quantidade >=3 ) {
        	   preco = 20;
        	   System.out.println("==================================================================");
        	   System.out.println(" O PRE�O UNIT�RIO DESSE PRODUTO � R$ 20,00");
        	   total = quantidade * preco ;
        	   System.out.println(" O valor total da nota � :" + total);
               descontos  = (total/100) * 15;
               System.out.printf(" O valor do desconto � %.2f ", + descontos);
               
               valor_pagar = total - descontos;
               System.out.printf("\n O valor total da nota � %.2f ", + valor_pagar );
               
           }else if( codigo <=30 && quantidade <= 2){
        	   
        	   preco = 20;
        	   System.out.println("==================================================================");
        	   
        	   System.out.println(" O PRE�O UNIT�RIO DESSE PRODUTO � R$ 20,00");
        	   total = quantidade * preco ;
        	   System.out.println(" O valor total da nota � :" + total);
        	   System.out.println(" Abaixo de  3 unidades n�o damos desconto");
                            
                  
           }// Codigo do 31 ao 40
           else if( codigo <=40 ) {
        	   preco = 30;
        	   System.out.println("==================================================================");
        	   System.out.println(" O PRE�O UNIT�RIO DESSE PRODUTO � R$ 30,00");
        	   total = quantidade * preco ;
        	  
               System.out.printf("\n O valor total da nota � %.2f ", + total );
               
           }
           
           
            
           
          
           
	}

}
