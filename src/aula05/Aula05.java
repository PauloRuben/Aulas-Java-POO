package aula05;

public class Aula05 {
	public static void main(String[] args) {
		ControleRemoto c = new ControleRemoto();
		c.ligar();
		c.maisVolume();//Aumentando Volume
		c.play();
		
		c.abrirMenu();//Abrir menu
		c.fecharMenu();//Fechar menu
	}
}
