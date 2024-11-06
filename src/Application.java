import iphone.AparelhoTelefonico;
import iphone.NavegadorInternet;
import iphone.ReprodutorMusical;

public class Application {
	
	public static void main(String[] args) {
		
		
		
		ReprodutorMusical reprodutor = new ReprodutorMusical();
		reprodutor.tocar();
		reprodutor.pausar();
		reprodutor.selecionarMusica("Minha Musica Favorita");
		reprodutor.sair();

		AparelhoTelefonico telefone = new AparelhoTelefonico();
		telefone.ligar();
		telefone.atender();
		telefone.iniciaCorreioVoz();
		telefone.sair();

		NavegadorInternet navegador = new NavegadorInternet();
		navegador.exebirPagina();
		navegador.adicionarNovaAba();
		navegador.atualizarPagina();
		navegador.sair();
		
	}

}
