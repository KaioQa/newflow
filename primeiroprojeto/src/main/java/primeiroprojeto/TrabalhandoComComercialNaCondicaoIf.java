package primeiroprojeto;

public class TrabalhandoComComercialNaCondicaoIf {
	
	public static void main(String[] args) {
		
		String nome = "kaio";
		int idadePermitida = 18;
		int minhaIdade = 20;
		boolean autorizacao = true;
		
		
		
		if(minhaIdade >= idadePermitida && autorizacao) {
			
			System.out.println(nome + " VOCE PODE TIRAR HABILITACAO");
			
		}else {
			
			System.out.println(nome + " VOCE NAO PODE TIRAR HABILITACAO");
			
		}
		
		
		
		
		
	}
	
	

}
