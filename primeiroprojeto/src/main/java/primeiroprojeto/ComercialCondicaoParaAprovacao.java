package primeiroprojeto;

public class ComercialCondicaoParaAprovacao {
public static void main(String[] args) {
	
	String aluno = "Kaio";
	double mediaAprovacao = 7.5;
	double n1 = 10.0;
	double n2 = 10.0;
	double n3 = 10.0;
	boolean frequenciaEscolar = true;
	
 
	double media = (n1+n2+n3)/3;
	
	//%% VALIDA AS DUAS CONDIÇÕES
	
	if (media >= mediaAprovacao && frequenciaEscolar) {
		
		System.out.println("PARABENS " + aluno + " VOCE FOI APROVADO a sua media foi: " + media);
		
	}else {
		System.out.println("O ALUNO " + aluno + " FOI REPROVADO, SUA MEDIA FOI: " + media );
		
	}
	
	
	
}
}



