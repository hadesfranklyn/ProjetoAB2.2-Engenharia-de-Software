package testes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

public class TesteBoletim {
	
	
	private static final byte TIPO_MEDIA_ARITMETICA = 0;
	private static final byte TIPO_MEDIA_PONDERADA = 1;
	Boletim media = new Boletim();
	
	// Teste 1 MEDIA ARITMETICA
	@Test
	public void testMediaAritmetica1() {

		media.setTipoMedia(TIPO_MEDIA_ARITMETICA);

		float[] nota = { 8, 6}; // notas diferentes
		int[] peso = { 1,1 }; // pesos iguais
		media.calculaMedia(nota, peso);

		float a = media.calculaMedia(nota, peso);

		List<Float> listaASerTestada = new ArrayList<>();
		listaASerTestada.add(a);
		List<Float> listaEsperada = Arrays.asList(7.0f);

		MatcherAssert.assertThat(listaASerTestada, CoreMatchers.is(listaEsperada));

		System.out.println("=== testMediaAritmetica1 ===");
		System.out.println("listaASerTestada: " + listaASerTestada);
		System.out.println("listaEsperada: " + listaEsperada);
		System.out.println();
	}

	// Teste 2 MEDIA ARITMETICA
	@Test
	public void testMediaAritmetica2() {

		media.setTipoMedia(TIPO_MEDIA_ARITMETICA);

		float[] nota = { 8, 6 }; // notas diferentes
		int[] peso = { 2, 3 }; // pesos diferentes
		media.calculaMedia(nota, peso);

		float a = media.calculaMedia(nota, peso);

		List<Float> listaASerTestada = new ArrayList<>();
		listaASerTestada.add(a);
		List<Float> listaEsperada = Arrays.asList(7.0f);

		MatcherAssert.assertThat(listaASerTestada, CoreMatchers.is(listaEsperada));

		System.out.println("=== testMediaAritmetica2 ===");
		System.out.println("listaASerTestada: " + listaASerTestada);
		System.out.println("listaEsperada: " + listaEsperada);
		System.out.println();
	}

	
	// Teste 2 MEDIA ARITMETICA
	@Test
	public void testMediaAritmetica5() {

		media.setTipoMedia(TIPO_MEDIA_ARITMETICA);

		float[] nota = { 0, 0 }; // divis�o por zero
		int[] peso = { 1, 1 }; // iguais
		media.calculaMedia(nota, peso);

		float a = media.calculaMedia(nota, peso);

		List<Float> listaASerTestada = new ArrayList<>();
		listaASerTestada.add(a);
		List<Float> listaEsperada = Arrays.asList(0f);

		MatcherAssert.assertThat(listaASerTestada, CoreMatchers.is(listaEsperada));

		System.out.println("=== testMediaAritmetica5 ===");
		System.out.println("listaASerTestada: " + listaASerTestada);
		System.out.println("listaEsperada: " + listaEsperada);
		System.out.println();
	}

	@Test
	public void testMediaAritmetica6() {

		media.setTipoMedia(TIPO_MEDIA_ARITMETICA);

		float[] nota = { -1, -1 }; // n�mero negativo iguais
		int[] peso = { 1, 1 }; // iguais
		media.calculaMedia(nota, peso);

		float a = media.calculaMedia(nota, peso);

		List<Float> listaASerTestada = new ArrayList<>();
		listaASerTestada.add(a);
		List<Float> listaEsperada = Arrays.asList(-1.0f);

		MatcherAssert.assertThat(listaASerTestada, CoreMatchers.is(listaEsperada));

		System.out.println("=== testMediaAritmetica6 ===");
		System.out.println("listaASerTestada: " + listaASerTestada);
		System.out.println("listaEsperada: " + listaEsperada);
		System.out.println();
	}

	@Test
	public void testMediaPodderada1() {

		media.setTipoMedia(TIPO_MEDIA_PONDERADA);

		float[] nota = { 8.2f, 10.0f, 9.5f, 7.8f, 10.0f, 9.5f, 6.7f };
		int[] peso = { 3, 2, 4, 2, 2, 3, 4 };
		media.calculaMedia(nota, peso);

		float a = media.calculaMedia(nota, peso);

		List<Float> listaASerTestada = new ArrayList<>();
		listaASerTestada.add(a);
		List<Float> listaEsperada = Arrays.asList(8.675f);

		MatcherAssert.assertThat(listaASerTestada, CoreMatchers.is(listaEsperada));

		System.out.println("=== testMediaPodderada1 ===");
		System.out.println("listaASerTestada: " + listaASerTestada);
		System.out.println("listaEsperada: " + listaEsperada);
		System.out.println();
	}

	@Test
	public void testMediaPodderada2() {

		media.setTipoMedia(TIPO_MEDIA_PONDERADA);

		float[] nota = { 8, 7};
		int[] peso = { 0,  1};
		media.calculaMedia(nota, peso);

		float a = media.calculaMedia(nota, peso);

		List<Float> listaASerTestada = new ArrayList<>();
		listaASerTestada.add(a);
		List<Float> listaEsperada = Arrays.asList(7f);

		MatcherAssert.assertThat(listaASerTestada, CoreMatchers.is(listaEsperada));

		System.out.println("=== testMediaPodderada2 ===");
		System.out.println("listaASerTestada: " + listaASerTestada);
		System.out.println("listaEsperada: " + listaEsperada);
		System.out.println();
	}
	
	@Test
	public void testMediaPodderada3() {

		media.setTipoMedia(TIPO_MEDIA_PONDERADA);

		float[] nota = {6, 6};
		int[] peso = { 1,  2};
		media.calculaMedia(nota, peso);

		float a = media.calculaMedia(nota, peso);

		List<Float> listaASerTestada = new ArrayList<>();
		listaASerTestada.add(a);
		List<Float> listaEsperada = Arrays.asList(6f);

		MatcherAssert.assertThat(listaASerTestada, CoreMatchers.is(listaEsperada));

		System.out.println("=== testMediaPodderada3 ===");
		System.out.println("listaASerTestada: " + listaASerTestada);
		System.out.println("listaEsperada: " + listaEsperada);
		System.out.println();
	}
	
	
	@Test
	public void testMediaPodderada4() {

		media.setTipoMedia(TIPO_MEDIA_PONDERADA);

		float[] nota = {-2, -3};
		int[] peso = { 5,  2};
		media.calculaMedia(nota, peso);

		float a = media.calculaMedia(nota, peso);

		List<Float> listaASerTestada = new ArrayList<>();
		listaASerTestada.add(a);
		List<Float> listaEsperada = Arrays.asList(-2.2857144f);

		MatcherAssert.assertThat(listaASerTestada, CoreMatchers.is(listaEsperada));

		System.out.println("=== testMediaPodderada4 ===");
		System.out.println("listaASerTestada: " + listaASerTestada);
		System.out.println("listaEsperada: " + listaEsperada);
		System.out.println();
	}
	

	@Test
	public void determinarSituacaoMEDIA_ARITMETICA1() {
		media.setTipoMedia(TIPO_MEDIA_ARITMETICA);
		float[] nota = { 8, 6 };
		int[] peso = { 1, 1 };

		String a = media.determinarSituacao(nota, peso);

		List<String> listaASerTestada = new ArrayList<>();
		listaASerTestada.add(a);
		List<String> listaEsperada = Arrays.asList("Aprovado");

		MatcherAssert.assertThat(listaASerTestada, CoreMatchers.is(listaEsperada));

		System.out.println("--- determinarSituacaoMEDIA_ARITMETICA1 ---");
		System.out.println("listaASerTestada: " + listaASerTestada);
		System.out.println("listaEsperada: " + listaEsperada);
		System.out.println();
	}
	
	@Test
	public void determinarSituacaoMEDIA_ARITMETICA2() {
		media.setTipoMedia(TIPO_MEDIA_ARITMETICA);
		float[] nota = { 6.9f, 7f};
		int[] peso = { 1, 1 };

		String a = media.determinarSituacao(nota, peso);

		List<String> listaASerTestada = new ArrayList<>();
		listaASerTestada.add(a);
		List<String> listaEsperada = Arrays.asList("Reprovado");

		MatcherAssert.assertThat(listaASerTestada, CoreMatchers.is(listaEsperada));

		System.out.println("--- determinarSituacaoMEDIA_ARITMETICA2 ---");
		System.out.println("listaASerTestada: " + listaASerTestada);
		System.out.println("listaEsperada: " + listaEsperada);
		System.out.println();
	}

	@Test
	public void determinarSituacaoMEDIA_ARITMETICA3() {
		media.setTipoMedia(TIPO_MEDIA_ARITMETICA);
		float[] nota = { 8, 8, 8, 8 };
		int[] peso = { 1, 1, 1, 1 };

		String a = media.determinarSituacao(nota, peso);

		List<String> listaASerTestada = new ArrayList<>();
		listaASerTestada.add(a);
		List<String> listaEsperada = Arrays.asList("Aprovado");

		MatcherAssert.assertThat(listaASerTestada, CoreMatchers.is(listaEsperada));

		System.out.println("--- determinarSituacaoMEDIA_ARITMETICA3 ---");
		System.out.println("listaASerTestada: " + listaASerTestada);
		System.out.println("listaEsperada: " + listaEsperada);
		System.out.println();
	}


	
	@Test
	public void determinarSituacaoTIPO_MEDIA_PONDERADA1() {
		media.setTipoMedia(TIPO_MEDIA_PONDERADA);
		float[] nota = { 6.9f, 7f};
		int[] peso = { 2, 5 };

		String a = media.determinarSituacao(nota, peso);

		List<String> listaASerTestada = new ArrayList<>();
		listaASerTestada.add(a);
		List<String> listaEsperada = Arrays.asList("Reprovado");

		MatcherAssert.assertThat(listaASerTestada, CoreMatchers.is(listaEsperada));

		System.out.println("--- determinarSituacaoTIPO_MEDIA_PONDERADA1 ---");
		System.out.println("listaASerTestada: " + listaASerTestada);
		System.out.println("listaEsperada: " + listaEsperada);
		System.out.println();
	}
	
	@Test
	public void determinarSituacaoTIPO_MEDIA_PONDERADA2() {
		media.setTipoMedia(TIPO_MEDIA_PONDERADA);
		float[] nota = { 9f, 7f};
		int[] peso = { 2, 3 };

		String a = media.determinarSituacao(nota, peso);

		List<String> listaASerTestada = new ArrayList<>();
		listaASerTestada.add(a);
		List<String> listaEsperada = Arrays.asList("Aprovado");

		MatcherAssert.assertThat(listaASerTestada, CoreMatchers.is(listaEsperada));

		System.out.println("--- determinarSituacaoTIPO_MEDIA_PONDERADA2 ---");
		System.out.println("listaASerTestada: " + listaASerTestada);
		System.out.println("listaEsperada: " + listaEsperada);
		System.out.println();
	}
	
	@Test
	public void determinarSituacaoTIPO_MEDIA_PONDERADA3() {
		media.setTipoMedia(TIPO_MEDIA_PONDERADA);
		float[] nota = { 8.2f, 10.0f, 9.5f, 7.8f, 10.0f, 9.5f, 6.7f };
        int[] peso = { 3, 2, 4, 2, 2, 3, 4 };
        
		String a = media.determinarSituacao(nota, peso);

		List<String> listaASerTestada = new ArrayList<>();
		listaASerTestada.add(a);
		List<String> listaEsperada = Arrays.asList("Aprovado");

		MatcherAssert.assertThat(listaASerTestada, CoreMatchers.is(listaEsperada));

		System.out.println("--- determinarSituacaoTIPO_MEDIA_PONDERADA3 ---");
		System.out.println("listaASerTestada: " + listaASerTestada);
		System.out.println("listaEsperada: " + listaEsperada);
		System.out.println();
	}

}
