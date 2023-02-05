package primeiroprojeto;

public class TrabalhandoIf {
	public static void main(String[] args) {

		int idadePermitida = 18;
		int minhaIdade = 26;
		String nome = "Kaio";

		if (minhaIdade >= idadePermitida) {

			System.out.println(nome + " Idade Permitida Para Tirar Habilitacao pois voce tem " + minhaIdade + " Anos");

		} else {

			System.out.println(nome + " Idade de " + minhaIdade + " Anos Nao Pode Tirar Habilitacao pois voce tem " + minhaIdade + " Anos, a idade permitida e de " + idadePermitida + " de Idade." );

		}

	}

}
