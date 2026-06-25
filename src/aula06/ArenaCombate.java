package aula06;

public class ArenaCombate {
	public static void main(String[] args) {
		Lutador l[] = new Lutador[6];
		
		l[0] = new Lutador("Smurfs", "França", 31, 1.75f, 68.9f, 11, 2, 1);
		
		l[1] = new Lutador("Script", "Brasil", 29, 1.68f, 57.9f, 14, 2, 3);
		
		l[2] = new Lutador("Snap", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
		
		l[3] = new Lutador("Code", "EUA", 37, 1.75f, 119.9f, 13, 0, 2);
		
		l[4] = new Lutador("Javao", "Austrália", 28, 1.93f, 81.9f, 13, 0, 2);
		
		l[5] = new Lutador("Nerd", "EUA", 30, 1.81f, 68.9f, 11, 2, 1);
	
		Luta02 UEC01 = new Luta02();
		UEC01.marcarLuta(l[0], l[1]);
		
		UEC01.lutar();
		l[0].status();
		l[1].status();
	}
}
