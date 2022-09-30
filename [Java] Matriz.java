/* 01. Faça um programa que leia uma matriz A de tamanho 5 × 5. 
Em seguida, calcule e imprima a matriz B, sendo que B = A2.*/

package ATV24;
import java.util.Scanner;
import java.util.Locale;

public class Q01 {

	public static void main(String[] args) {
	Locale.setDefault(new Locale("pt", "BR"));
	Scanner read = new Scanner(System.in);
		
		int matrizA[][] = new int [5][5], matrizB[][] = new int [5][5];
		
		for(int linha=0;linha<matrizA.length;linha++) {
			for(int coluna=0;coluna<matrizA.length;coluna++) {
				System.out.printf("Insira um número na matriz [%dº][%dº]: ", linha+1, coluna+1);
				matrizA[linha][coluna]=read.nextInt();
			}
		}
		System.out.println("---Matriz B (Matriz elevado a 2)---\n");
		for(int linha=0;linha<matrizB.length;linha++) {
			for(int coluna=0;coluna<matrizB.length;coluna++) {
				matrizB[linha][coluna]=matrizA[linha][coluna]*matrizA[linha][coluna];
				System.out.printf("[%d]", matrizB[linha][coluna]);
			}
			System.out.println("\n");
		}
	}
}
// 02. Faça um programa que leia uma matriz de tamanho 6 × 6. Calcule e imprima a soma dos elementos dessa matriz que estão abaixo da diagonal principal.

package ATV24;
import java.util.Scanner;
import java.util.Locale;

public class Q02 {

	public static void main(String[] args) {
	Locale.setDefault(new Locale("pt", "BR"));
	Scanner read = new Scanner(System.in);
		
		int matriz[][] = new int [6][6], soma=0;
		
		for (int linha=0;linha<matriz.length;linha++) {
			for (int coluna=0;coluna<matriz.length;coluna++) {
				System.out.printf("Insira um número na matriz [%dº][%dº]: ", linha+1, coluna+1);
				matriz[linha][coluna]=read.nextInt();
				if(coluna<linha) {
					soma = soma+matriz[linha][coluna];
				}
			}
		}
		System.out.println("A soma do valores abaixo da diagonal principal é: "+soma);
	}
}

/* 3. Leia uma matriz de tamanho 10 × 3 com as notas de 10 alunos em três provas. 
Em seguida, calcule e escreva na tela o número de alunos cuja pior nota foi na prova 1, o número de alunos cuja pior nota foi na prova 2 
e o número de alunos cuja pior nota foi na prova 3. */

package ATV24;
import java.util.Scanner;
import java.util.Locale;

public class Q03 {

	public static void main(String[] args) {
	Locale.setDefault(new Locale("pt", "BR"));
	Scanner read = new Scanner(System.in);
		
	int notas[][] = new int [10][3], prova1=0, prova2=0, prova3=0;
	
		for(int linha=0;linha<notas.length;linha++) {
			for(int coluna=0;coluna<3;coluna++) {
				System.out.printf("%dº nota do %dº aluno: ", coluna+1, linha+1);
				notas[linha][coluna]=read.nextInt();
			}
		}
		for(int linha=0;linha<notas.length;linha++) {
			for(int coluna=0;coluna<3;coluna++) {
				if(notas[linha][0]<notas[linha][1] && notas[linha][0]<notas[linha][2]) {
					prova1++;
				}else if(notas[linha][1]<notas[linha][0] && notas[linha][1]<notas[linha][2]) {
					prova2++;
				}else if(notas[linha][2]<notas[linha][1] && notas[linha][2]<notas[linha][0]) {
					prova3++;
				}
			}
		}
	     System.out.printf("Número de alunos com a pior nota na 1º prova: %d", prova1/3);
	     System.out.printf("\nNúmero de alunos com a pior nota na 2º prova: %d", prova2/3);
	     System.out.printf("\nNúmero de alunos com a pior nota na 3º prova: %d", prova3/3);
	}
}

/* 4. Desenvolva um sistema onde o usuário irá cadastrar uma determinada quantidade de produtos e seu preços. 
Logo após o sistema deverá mostrar o nome do produto, preço original, preço com 10% de desconto e preço reajustado com 5% do preço original. Utilize array. */

package ATV24;
import java.util.Scanner;
import java.util.Locale;

public class Q04 {

	public static void main(String[] args) {
	Locale.setDefault(new Locale("pt", "BR"));
	Scanner read = new Scanner(System.in);
	
		int quantidade;
		System.out.println("Cadastro de produtos");
		System.out.println("Quantidade de produtos: ");
		quantidade = read.nextInt();
		
		String nome[] = new String[quantidade];
		float precos[] = new float[quantidade], desconto=0, reajuste=0;
		
		System.out.println("Insira o nome dos produtos");
		for(int linha=0;linha<quantidade;linha++) {
			System.out.printf("%dº produto: ", linha+1);
			nome[linha]=read.next();
		}
		System.out.println("Insira o preço dos produtos");
		for(int linha=0;linha<quantidade;linha++) {
			System.out.printf("%dº produto [%s]: ", linha+1, nome[linha]);
			precos[linha]=read.nextFloat();
			desconto = precos[linha]-((precos[linha]*10)/100);
			reajuste = precos[linha]+((precos[linha]*5)/100);
		}
		System.out.println("Mercadinho SENAI");
		for(int linha=0;linha<quantidade;linha++) {
			System.out.printf("\n%s\nPreço original: %.2f\n10%% de desconto: %.2f\nReajuste de 5%%: %.2f", nome[linha], precos[linha], desconto, reajuste);
		}
	}
}
