package testes;

public class Boletim {
	public static byte TIPO_MEDIA_ARITMETICA = 0;
	public static byte TIPO_MEDIA_PONDERADA = 1;
	
	public static String SITUACAO_APROVADO = "Aprovado";
	public static String SITUACAO_REPROVADO = "Reprovado";
	
	private byte tipoMedia; 
	
	public Boletim() {
		this.tipoMedia = TIPO_MEDIA_ARITMETICA; 
	}
	
	public void setTipoMedia(byte tipo) {
		if ((tipo == TIPO_MEDIA_ARITMETICA) || (tipo == TIPO_MEDIA_PONDERADA)) {
			this.tipoMedia = tipo;
		}
	}
	
	public float calculaMedia(float[] notas, int[] pesos) {
		float media = 0;
		int peso    = 0;
		if (tipoMedia == this.TIPO_MEDIA_ARITMETICA)  { // media aritmética
			for (float nota : notas) {
				media = media + nota;
			}
			peso = pesos.length; // todos os pesos são 1
			media = media / peso;
		} else if (tipoMedia == this.TIPO_MEDIA_PONDERADA)  { // media ponderada
			for (int i = 0; i < pesos.length; i++) {
				media = media + notas[i] * pesos[i];
				peso  = peso + pesos[i];
			}
			media = media / peso;
		}
		return media;
	}
	
	public String determinarSituacao(float[] notas, int[] pesos) {
		float media = calculaMedia(notas, pesos);
		if (media >= 7) { // determinando status Aprovado
			return SITUACAO_APROVADO;
		} else if (media < 7) { // determinando status Reprovado
			return SITUACAO_REPROVADO;
		}
		return "-"; // status inexistente
	}
}
