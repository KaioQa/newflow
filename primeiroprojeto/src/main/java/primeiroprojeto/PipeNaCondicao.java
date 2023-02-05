package primeiroprojeto;

public class PipeNaCondicao {
	public static void main(String[] args) {
		
		
		String nome = "KAIO";
		int idadePermitida = 18;
		int idade = 1;
		boolean autorização = true;
		
		
		//VALIDA A PRIMEIRA CONDIÇÃO OU A SEGUNDA CONDIÇÃO
		
		if (idade >= idadePermitida || autorização) {
			
			System.out.println("PARABENS " + nome + " VOCE PODE TIRAR HABILITACAO POIS VOCE FOI AUTORIZADO");
			
			
		}else {
			
			System.out.println(nome +" VOCE NAO PODE TIRAR HABILITACAO");
		}
		
		
		
		
		
		
		
		
	}

}
