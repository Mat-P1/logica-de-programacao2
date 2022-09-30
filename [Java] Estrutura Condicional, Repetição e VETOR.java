// 01.Escreva um algoritmo que leia um valor inicial A e imprima a seqüência de valores do cálculo de A! e o seu resultado. Ex: 5! = 5 X 4 X 3 X 2 X 1 = 120

package ATV23;
import java.util.Scanner;
import java.util.Locale;
 
public class Q01 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner read = new Scanner(System.in);
 
        int valor, fatorial=1;
 
        System.out.println("Digite um número inteiro: ");
        valor = read.nextInt();
 
        for(;valor>=1;valor--){
            fatorial*=valor;
            if(valor<=1){
                System.out.printf("%d = %d", valor, fatorial);
            }else{
                System.out.printf("%d X ", valor);
            }
        }
    }
}

/* 2.Crie um programa em linguagem Java que permita entrar com a nota da prova 1 e da prova 2 de 15 alunos. 
Ao final, imprimir uma listagem, contendo: nota da prova 1, nota da prova 2, a média das notas de cada aluno e a situação final de cada. 
Ao final, imprimir a média geral da turma.*/

package ATV23;
import java.util.Scanner;
import java.util.Locale;
 
public class Q02 {
    public static void main(String[] args) {
    Locale.setDefault(new Locale("pt", "BR"));
    Scanner read = new Scanner(System.in);
 
        double media, media_geral=0;
        double[] nota01 = new double[15], nota02 = new double[15];
 
        for(int contagem=0;contagem<15;contagem++){
            System.out.printf("Insira a primeira nota do %dº aluno: ", contagem+1);
            nota01[contagem]=read.nextDouble();
            System.out.printf("Insira a segunda nota do %dº aluno: ", contagem+1);
            nota02[contagem]=read.nextDouble();
        }
        for(int contagem=0;contagem<15;contagem++){
            media = (nota01[contagem]+nota02[contagem])/2;
            System.out.printf("\n%dº Aluno\n1º Nota: %.2f\n2º Nota: %.2f\nMedia: %.2f", contagem+1, nota01[contagem], nota02[contagem], media);
        }
        for(int contagem=0;contagem<15;contagem++){
            media_geral = media_geral+((nota01[contagem]+nota02[contagem])/2);
        }
        System.out.printf("\nMédia geral da turma: %.2f", media_geral/15);
    }
}

/* 03.Depois da liberação do governo para as mensalidades dos planos de saúde, as pessoas começaram a fazer pesquisas para descobrir um bom plano, não muito caro. 
Um vendedor de um plano de saúde apresentou a tabela a seguir. 
Faça um programa que entre com o nome e a idade de uma pessoa e imprima o nome e o valor que ela deverá pagar.
Idade                                                            Valor
Até 10 anos                                                      R$30,00
Acima de 10 até 29 anos                                          R$60,00
Acima de 29 até 45 anos                                          R$120,00
Acima de 45 até 59 anos                                          R$150,00
Acima de 59 até 65 anos                                          R$250,00
Maior que 65 anos                                                R$400,00*/

package ATV23;
import java.util.Scanner;
import java.util.Locale;
 
public class Q03 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner read = new Scanner(System.in);
 
        String nome;
        int idade;
 
        System.out.printf("---Planos de Saúde---\n---Valores----\n");
        System.out.println("Nome: ");
        nome = read.nextLine();
        System.out.println("Idade: ");
        idade = read.nextInt();
 
        if(idade<=10){
            System.out.printf("Nome: %s\nValor do plano mensal: R$30,00", nome);
            }else if(idade<=29){
                System.out.printf("Nome: %s\nValor do plano mensal: R$60,00", nome);
            }else if(idade<=45){
                System.out.printf("Nome: %s\nValor do plano mensal: R$120,00", nome);
            }else if(idade<=59){
                System.out.printf("Nome: %s\nValor do plano mensal: R$150,00", nome);
            }else if(idade<=65){
                System.out.printf("Nome: %s\nValor do plano mensal: R$250,00", nome);
        }else{
            System.out.printf("Nome: %s\nValor do plano mensal: R$400,00", nome);
        }
    }
}

/* 04.Faça um programa para ler 10 números diferentes a serem armazenados em um vetor. 
Os números deverão ser armazenados no vetor na ordem em que forem lidos, sendo que, caso o usuário digite um número que já foi digitado anteriormente, 
o programa deverá pedir a ele para digitar outro número. 
Note que cada valor digitado pelo usuário deve ser pesquisado no vetor, verificando se ele existe entre os números que já foram fornecidos. 
Exiba na tela o vetor final que foi digitado. */

package ATV23;
import java.util.Scanner;
import java.util.Locale;
 
public class Q04 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner read = new Scanner(System.in);
 
        int[] vetor = new int[10];
 
        for(int contagem=0;contagem<10;contagem++){
            System.out.println("Digite um número inteiro: ");
            vetor[contagem]=read.nextInt();
            for(int contagem2=0;contagem2<contagem;contagem2++){
                if(vetor[contagem]==vetor[contagem2]){
                    System.out.println("Número repetido. Por favor insira outro valor.");
                    contagem--;
                }
            }
        }
        System.out.println("Os números inseridos foram: ");
        for(int contagem=0;contagem<10;contagem++){
            System.out.println(vetor[contagem]);
        }
    }    
}
