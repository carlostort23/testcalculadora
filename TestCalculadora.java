package calcualdora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalculadora {
	CerebroCalculadoraED calc = new CerebroCalculadoraED();
	
	
	@Test
	void testsuma() {
		System.out.println("vamos a hacer un test de la suma \n introduce los números 5 y 6");
		double esperado=11.0;
		calc.operarSuma(Operaciones.SUMAR);
		//introducimos los números por consola 
		assertEquals(esperado, calc.resultado);
	}
	@Test
	void testresta() {
		System.out.println("Vamos a hacer un test de la resta \n introduce los números 10 y 5");
		double esperado=5.0;
		calc.operarResta(Operaciones.RESTAR);
		//Introducimos los números por consola
		assertEquals(esperado, calc.resultado);
	}
	
	@Test 
	void testmultiplicacion() {
		System.out.println("Vamos a realizar el test de la multiplicación \n introduce los números 7 y 8");
		double esperado=56.0;
		calc.operarMultiplica(Operaciones.MULTIPLICAR);
		//Introducimos los números por consola
		assertEquals(esperado, calc.resultado);
	}
	
	@Test 
	void testdivide() {
		System.out.println("Vamos a realizar el test de la división \n introduce los números 25 y 5");
		double esperado=5.0;
		calc.operarDivide(Operaciones.DIVIDIR);
		//Introducimos los números por consola
		assertEquals(esperado, calc.resultado);
	}
	
	@Test
	void testsumaresultado() {
		System.out.println("vamos a sumar un número al resultado de la suma \n introduce primero el numero 5 y 6 y luego el número 6");
		double esperado=15.0;
		calc.procesarOperacion("1");
		calc.operarSumaRes(Operaciones.SUMAR_RES);
		//Introducimos el número pedido por pantalla
		assertEquals(esperado, calc.resultado);
	}
	
	@Test
	void testrestaresultado() {
		System.out.println("vamos a restar un número al resultado de la resta \n introduce primero el numero 30 y 5 y luego el número 10");
		double esperado=15.0;
		calc.procesarOperacion("2");
		calc.operarSumaRes(Operaciones.RESTAR_RES);
		//Introducimos el número pedido por pantalla
		assertEquals(esperado, calc.resultado);
	}
	
	@Test
	void testmultiplicarresul() {
		System.out.println("vamos a multiplicar un número al resultado de la multiplicación \n introduce primero el numero 5 y 5 y luego el número 6");
		double esperado=150.0;
		calc.procesarOperacion("3");
		calc.operarMultiplicaRes(Operaciones.MULTIPLICAR_RES);
		//Introducimos el número pedido por pantalla
		assertEquals(esperado, calc.resultado);
	}
	
	@Test
	void testdividirresul() {
		System.out.println("vamos a dividir un número al resultado de la división \n introduce primero el numero 50 y 2 y luego el número 5");
		double esperado=5.0;
		calc.procesarOperacion("4");
		calc.operarDivideRes(Operaciones.DIVIDIR_RES);
		//Introducimos el número pedido por pantalla
		assertEquals(esperado, calc.resultado);
	}
}
