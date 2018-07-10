package br.com.liliane.javaMagazine;

/**
 *Inicializa o projeto
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String[] resultado = ResultadoMegasena.obtemUltimoResultado();
        
        for(String dezena: resultado) {
        	
            System.out.print(dezena + " ");
        }
    }
}
