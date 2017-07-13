package es.cic.taller.ejercicio09.mus;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TapeteTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetPuntuacion() {
		/*Preparo la prueba*/
		Baraja baraja = new Baraja();
		Tapete tapete = baraja.getTapete();
		
		
		Carta carta1 = tapete.getCarta1();
		Carta carta2 = tapete.getCarta2();
		Carta carta3 = tapete.getCarta3();
		Carta carta4 = tapete.getCarta4();
		
		int resultadoEsperado = 
				carta1.getNumero().getValor() +
				carta2.getNumero().getValor() + 
				carta3.getNumero().getValor() + 
				carta4.getNumero().getValor();
		
		/*Ejecuto la prueba*/
		
		int puntuacion = tapete.getPuntuacion();
		
		/*Verificacion*/
		assertEquals(resultadoEsperado, puntuacion);
	}
	
	@Test
	public void testCompararMayor() {
		Tapete tapete1 = new Tapete();
		tapete1.setCarta1(new Carta(Numero.CINCO, Palo.BASTOS));
		tapete1.setCarta2(new Carta(Numero.REY, Palo.BASTOS));
		tapete1.setCarta3(new Carta(Numero.TRES, Palo.BASTOS));
		tapete1.setCarta4(new Carta(Numero.SOTA, Palo.BASTOS));
		
		Tapete tapete2 = new Tapete();
		tapete2.setCarta1(new Carta(Numero.CINCO, Palo.BASTOS));
		tapete2.setCarta2(new Carta(Numero.REY, Palo.BASTOS));
		tapete2.setCarta3(new Carta(Numero.TRES, Palo.BASTOS));
		tapete2.setCarta4(new Carta(Numero.CABALLO, Palo.BASTOS));
		
		int resultado = Tapete.compararMayor(tapete1, tapete2);
		
		assertTrue("Estaba esperando un numero positivo si el segundo jugador gana a grande",
				resultado>0);
		
	}
	
	@Test
	public void testCompararMenor() {
		Tapete tapete1 = new Tapete();
		tapete1.setCarta1(new Carta(Numero.CINCO, Palo.BASTOS));
		tapete1.setCarta2(new Carta(Numero.UNO, Palo.BASTOS));
		tapete1.setCarta3(new Carta(Numero.DOS, Palo.BASTOS));
		tapete1.setCarta4(new Carta(Numero.SOTA, Palo.BASTOS));
		
		Tapete tapete2 = new Tapete();
		tapete2.setCarta1(new Carta(Numero.CINCO, Palo.BASTOS));
		tapete2.setCarta2(new Carta(Numero.DOS, Palo.BASTOS));
		tapete2.setCarta3(new Carta(Numero.DOS, Palo.BASTOS));
		tapete2.setCarta4(new Carta(Numero.CABALLO, Palo.BASTOS));
		
		int resultado = Tapete.compararMenor(tapete1, tapete2);
		
		assertTrue("Estaba esperando un numero negativo si el primer jugador gana a chica",
				resultado<0);
		
	}
	
	@Test
	public void testJuego() {
		Tapete tapete = new Tapete();
		tapete.setCarta1(new Carta(Numero.CINCO, Palo.BASTOS));
		tapete.setCarta2(new Carta(Numero.REY, Palo.BASTOS));
		tapete.setCarta3(new Carta(Numero.TRES, Palo.BASTOS));
		tapete.setCarta4(new Carta(Numero.CABALLO, Palo.BASTOS));
		
		int resultado = tapete.getPuntuacion();
		
		assertTrue("Estaba esperando juego",
				resultado>30);
	}

}
