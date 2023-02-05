package primeiroprojeto;

public class IfCalculoMatematico {
	public static void main(String[] args) {

		int mediaPassar = 8;
		int nota1 = 5;
		int nota2 = 1;
		int nota3 = 9;
		int media = (nota1 + nota2 + nota3) / 3;

		if (media >= mediaPassar) {

			System.out.println("PARABENS ALUNO APROVADO A SUA MEDIA: " + media);

		} else {

			System.out.println("ALUNO REPROVADO A SUA MEDIA: " + media);

		}

	}
}
