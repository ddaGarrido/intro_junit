package calculadora;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Classe para teste da calculadora")
public class CalculadoraTest {
	
	private Calculadora calc;
	
	@BeforeEach
	public void inicializa() {
		calc = new Calculadora();
	}

	@DisplayName("Testa a soma de dois números")
	@Test
	public void testSomaDoisNumeros() {
		assertEquals(9, calc.soma(4, 5));
		assertEquals(1, calc.soma(-1, 2));
	}

	@DisplayName("Testa a subtração de dois números")
	@Test
	public void testSomaDoisNumeros() {
		assertEquals(-10, calc.subtracao(5, 15));
		assertEquals(-20, calc.subtracao(-5, 15));
	}

	@DisplayName("Testa a multiplicação de dois números")
	@Test
	public void testMultiplicaDoisNumerosPositivos() {
		assertEquals(100, calc.multiplicacao(10, 10));
		assertEquals(-4, calc.multiplicacao(2, -2));
		assertEquals(1, calc.multiplicacao(-1, -1));
	}

	@DisplayName("Testa a divisão de dois números")
	@Test
	public void testDivisaoDoisNumeros() {
		assertEquals(2, calc.divisao(8, 4));
		assertEquals(2, calc.divisao(-4, -2));
		assertEquals(-5, calc.divisao(-10, 2));
	}

	@DisplayName("Testa erro por divisão por zero")
	@Test
	public void testDivisaoPorZeroComAssertThrows() {
		assertThrows(ArithmeticException.class, () -> calc.divisao(8, 0));
	}

	@DisplayName("Testa se número é positivo")
	@Test
	public void testValidacaoEhPositivo() {
		assertEquals(true, calc.ehPositivo(1));
		assertEquals(false, calc.ehPositivo(-1));
	}

	@DisplayName("Testa comparação de números")
	@Test
	public void testComparaValores() {
		assertEquals(1, calc.compara(15, 5));
		assertEquals(0, calc.compara(15, 15));
		assertEquals(-1, calc.compara(5, 15));
	}

	@DisplayName("Testa somatório de números")
	@Test
	public void testSomatoriaValores() {
		assertEquals(6, calc.somatoria(3));
		assertEquals(0, calc.somatoria(-3));
	}

}
