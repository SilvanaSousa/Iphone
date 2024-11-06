package iphone;

public class ReprodutorMusical implements Iphone{

	@Override
	public void sair() {
		System.out.println("Saindo do aplicativo de musica.");
		
	}
	
	public void tocar() {
		System.out.println("Reproduzindo musica.");
	}
	
	public void pausar() {
		System.out.println("Musica pausa");
	}
	
	public void selecionarMusica(String musica) {
		System.out.println("Musica selecionada" + musica);
	}

	public static String entrar(String aplicativo) {
        return "Entrando no aplicativo: " + aplicativo;
    }
}
