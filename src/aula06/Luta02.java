package aula06;

import java.util.Random;

public class Luta02 {
		private Lutador desafiado;
		private Lutador desafiente;
		private int rounds;
		private boolean aprovada;
		
		public void marcarLuta(Lutador l1, Lutador l2) {
			if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
				this.aprovada = true;
				this.desafiado = l1;
				this.desafiente = l2;
			} else {
				this.aprovada = false;
				this.desafiado = null;
				this.desafiente = null;
			}
		}
		
		public void lutar() {
			if(this.aprovada) {
				System.out.println("###DESAFIADO###");
				this.desafiado.apresentar();
				System.out.println("###DESAFIANTE###");
				this.desafiente.apresentar();
				
				Random aleatorio = new Random();//Valores Randomicos
				int vencedor = aleatorio.nextInt(3);//0 1 2
				System.out.println("===== RESULTADO DA LUTA =====");
				switch(vencedor) {
				 case 0 ://Empate
					System.out.println("EMPATOU");
					this.desafiado.empateluta();
					this.desafiente.empateluta();
					break;
				 case 1:
					 System.out.println("Vitória do " + this.desafiado.getNome());
					 this.desafiado.ganharluta();
					 this.desafiente.derrotaluta();
					 break;
				 case 2:
					 System.out.println("Vitória do " + this.desafiente.getNome());
					 this.desafiado.derrotaluta();
					 this.desafiente.derrotaluta();
					 break;
				}
				System.out.println("====================================");
				
			} else {
				System.out.println("A luta não pode ocorrer");
			}
		}
		
		public Lutador getDesafiando() {
			return desafiado;
		}
		public void setDesafiando(Lutador desafiando) {
			this.desafiado = desafiando;
		}
		public Lutador getDesafiente() {
			return desafiente;
		}
		public void setDesafiente(Lutador desafiente) {
			this.desafiente = desafiente;
		}
		public int getRounds() {
			return rounds;
		}
		public void setRounds(int rounds) {
			this.rounds = rounds;
		}
		public boolean getAprovada() {
			return aprovada;
		}
		public void setAprovada(boolean aprovada) {
			this.aprovada = aprovada;
		}

}
