package iphone;

public class NavegadorInternet implements Iphone  {

	@Override
	public void sair() {
		 System.out.println("Saindo do navegador de internet.");
		
	}
	
	public void exebirPagina() {
		System.out.println("Exebindo pagina");
	}
	
	public void adicionarNovaAba() {
		System.out.println("Nova Aba");
	}
	
	public void atualizarPagina() {
		System.out.println("Pagina atualizada");
	}

}
