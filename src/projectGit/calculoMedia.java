package projectGit;

import java.util.Scanner;

public class calculoMedia {

	public static void main(String[] args) {
		
		//comentario para atualizacao
		
		Scanner entrada = new Scanner(System.in);
		
		double nota1, nota2, nota3, media;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = entrada.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = entrada.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = entrada.nextDouble();
		
		media = (nota1 + nota2 + nota3)/3;
		
		System.out.printf("Sua média é : %.1f \n", media);
		
		if (media >= 7) {
			System.out.println("Você foi aprovado!");
		} else if (media >= 5) {
			System.out.println("Você ficou de recuperação!");
		} else {
			System.out.println("Você foi reprovado!");
		}
		
		entrada.close();
	}
}
