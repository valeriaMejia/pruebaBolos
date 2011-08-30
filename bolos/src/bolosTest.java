import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class bolosTest {

	Juego juego=new Juego();
	
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	@Test
	public  void enUnInicioElPuntajedebeSerCero()
	{
		
		assertEquals(0, juego.getPunTaje());

		
	}
	
	@Test
	public  void siLaSumatoriaDeDosTirosEsDiezEntoncesEsSpare()
	{
		
		juego.lanzar(5);
		juego.lanzar(5);
	
		assertTrue(juego.esSpare(0));

		
	}
	@Test
	public  void siElPuntajeEsDiezEntoncesEstrike()
	{
		
		juego.lanzar(10);
		
	
		assertTrue(juego.esStrike(0));		
	}
	@Test
	public  void debeCalcularStrike()
	{
		juego.lanzar(10);
		juego.lanzar(5);
		juego.lanzar(6);
		assertEquals(23, juego.puntajeTotal());
		
	}
	@Test
	public  void debeCalcularSPare()
	{
		juego.lanzar(5);
		juego.lanzar(5);
		juego.lanzar(6);
		assertEquals(16, juego.puntajeTotal());
		
	}
	/*@Test
	public  void todosLanzamientosUno()
	{
		
		lanzarMuchos(20,1);
		assertEquals(20,juego.score());
		
	}
	@Test
	public  void CalcularUnSpare()
	{
	
			juego.lanzar(5);
			juego.lanzar(5);//spare
			juego.lanzar(3);
			lanzarMuchos(17,0);
		assertEquals(16,juego.score());
		
	}
	private void lanzarMuchos(int jugada,int score)
	{
		for(int i=0;i<jugada;i++)
		{
			juego.lanzar(score);
		}
	}*/
	/*@Test
	public  void alIniciarElJuegoElScoreEsCero()
	{
		Juego bolos=new Juego();
		assertEquals(0, bolos.scoreInicial());
	}
	@Test
	public  void alRealizarUnTiroDebeSerMayorOIgualACero()
	{
		Juego bolos=new Juego();
		 bolos.lanzar();
		 assertEquals(0,bolos.score());
	}*/
	
	
}

