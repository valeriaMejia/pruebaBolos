
public class Juego {

	private int puntaje=0;
	private int [] lanzamientos = new int [21];
	private int lanzamientoActual=0;

	public int getPunTaje() {
		// TODO Auto-generated method stub
		return puntaje;
	}

	public void lanzar(int pino) {
		
		lanzamientos[lanzamientoActual]=pino;
		puntaje=puntaje+pino;
		lanzamientoActual++;
		
	}

	

	public boolean esSpare(int ind) {
		// TODO Auto-generated method stub
		if(lanzamientos[ind]+lanzamientos[ind+1]==10)
			return true;
		else
			return false;
	}

	public boolean esStrike(int ind) {
		// TODO Auto-generated method stub
		if(lanzamientos[ind]==10)
			return true;
		else
			return false;
	}
	
public int puntajeTotal()
{
	int puntajeTotal=0;
	for(int indice=0;indice<lanzamientoActual;indice++)
	{
		if(esStrike(indice))//STRIKE
		{
			puntajeTotal=10+lanzamientos[indice+1]+lanzamientos[indice+2];
			indice++;
			
		}
		else
		{
		
			if(esSpare(indice))//SPARE
				{
			
			puntajeTotal+=10+lanzamientos[indice+2];
			indice++;
			}
			else
			{
				puntajeTotal+=lanzamientos[indice]+lanzamientos[indice+1];
			indice+=1;}
		}
	}
	return puntajeTotal;
}
}
