package iphone;

public class AparelhoTelefonico implements Iphone {

	
	@Override
	public void sair() {
		System.out.println("Saindo do aplicativo de musica.");
		
	}
	
	
	public void ligar() {
		System.out.println("Iphone ligado");
	}
	
	public void atender() { 
		System.out.println("Iphone atendeu");
	}
	
	public void iniciaCorreioVoz() { 
		System.out.print( "Correio de voz iniciado");
	}
	
	
	
}
