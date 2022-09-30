// 01. Faça um programa em Java que leia o nome o endereço e o telefone de um cliente e ao final, imprima esses dados.

package Atividade;
import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		
		String nome, endereco, telefone;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Qual o seu nome? ");
		nome = read.nextLine();
		System.out.println("Qual o seu endereço? ");
		endereco = read.nextLine();
		System.out.println("Qual o seu telefone?: ");
		telefone = read.nextLine();
		
		System.out.printf("Nome: %s\nEndereço: %s\nTelefone: %s", nome, endereco, telefone);
		
	}

}

/* 02. Faça um programa em Java que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$). 
Para isso, será necessário também ler o valor da cotação do dólar.*/

package Atividade;
import java.util.Scanner;

public class Q02 {
	
	public static void main(String[] args) {
		
		float cotacao, dolar;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Insira o valor em dólar (US$): ");
		dolar = read.nextFloat();
		System.out.println("Qual a cotação do dólar hoje?: ");
		cotacao = read.nextFloat();
		
		System.out.printf("O valor em real é: %.2f R$", dolar*cotacao);
	}

}

/* 03. Faça um programa em Java que calcule o valor de uma prestação em atraso. 
Para isso, o programa deve ler o valor da prestação vencida, a taxa periódica de juros e o período de atraso. 
Ao final, o programa deve imprimir o valor da prestação atrasada, o período de atraso, os juros que serão cobrados pelo período de atraso, 
o valor da prestação acrescido dos juros. Considere juros simples. */

package Atividade;
import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		
		float prestacao, juros, valor_final;
		int atraso;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Valor da prestação: ");
		prestacao = read.nextFloat();
		System.out.println("Valor dos juros simples: ");
		juros = read.nextFloat();
		System.out.println("Meses de atraso: ");
		atraso = read.nextInt();
		
		valor_final = prestacao+((prestacao*juros/100)*atraso);
		
		System.out.printf("Valor da prestação original: %.2f R$\nPeríodo atrasado: %d meses\nValor final: %.2f R$", prestacao, atraso, valor_final);

	}

}

// 04. Faça um programa em Java que leia dois valores numéricos inteiros e efetue a adição, caso o resultado seja maior que 10, apresentá-lo.

package Atividade;
import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		
		int valor1, valor2, soma;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Insira o primeiro valor inteiro: ");
		valor1 = read.nextInt();
		System.out.println("Insira o segundo valor inteiro");
		valor2 = read.nextInt();
		
		soma = valor1+valor2;
		
		if (soma>10) {
			System.out.printf("Valor: %d", soma);
		}else {
			System.out.println("Valor menor que 10!");
		}
		
	}

}

// 05. Faça um programa em Java que leia três notas de um aluno e mostre a média obtida, a maior nota, a menor nota e se o aluno foi aprovado ou reprovado. 
Para alunos aprovados média >=7.

package Atividade;
import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		
		float nota1, nota2, nota3, media, menor_nota, maior_nota;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Insira a primeira nota: ");
		nota1 = read.nextFloat();
		maior_nota = nota1;
		menor_nota = nota1;
		System.out.println("Insira a segunda nota: ");
		nota2 = read.nextFloat();
			if (nota2>maior_nota) {
				maior_nota=nota2;
			}else if(nota2<menor_nota) {
				menor_nota=nota2;
			}
		System.out.println("Insira a terceria nota: ");
		nota3 = read.nextFloat();
			if (nota3>maior_nota) {
				maior_nota=nota3;
			}else if(nota3<menor_nota) {
				menor_nota=nota3;
			}
			
		media = (nota1+nota2+nota3)/3;
		
		if(media>=7) {
			System.out.printf("Média: %.2f\nAluno aprovado!", media);
		}else {
			System.out.printf("Média: %.2f\nAluno reprovado!", media);
		}
		
		System.out.printf("\nMaior nota: %.2f\nMenor nota: %.2f", maior_nota, menor_nota);
	}
}
