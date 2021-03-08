package produto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProdutoTest {
	
	Produto livro;
	
	@BeforeEach
	public void inicializa() {
		livro = new Produto("Introdução ao Teste de Software", 100.00);
	}

	@DisplayName("Teste criação de produto")
	@Test
	public void testCriaProduto() {
		Assertions.assertAll("livro",
				() -> assertEquals("Introdução ao Teste de Software", livro.getNome()),
				() -> assertTrue(100.00 == livro.getPreco())						
				);
	}

	@DisplayName("Teste produtos iguais")
	@Test
	public void testProdutosIguais() {
		Produto livro2 = new Produto("Introdução ao Teste de Software", 90.00);

		assertNotSame(livro, livro2);
		assertTrue(livro.equals(livro2));
	}

	@DisplayName("Teste produto")
	@Test
	public void assertionComHamcrestMatcher() {
		assertThat(livro.getPreco(), equalTo(100.00));
		assertThat(livro.getNome(), notNullValue());
		assertThat(livro.getNome(), containsString("Teste"));
		assertThat(livro, instanceOf(Produto.class));
	}

}
