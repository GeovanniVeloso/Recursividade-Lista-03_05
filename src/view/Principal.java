package view;

import javax.swing.JOptionPane;

import controller.RecursivaFibonacci;

public class Principal {

	public static void main(String[] args) {
		RecursivaFibonacci rf = new RecursivaFibonacci();
		int n;
		do {
			n = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor a ser calculado"));
			if (n>30 || n<0) {
				JOptionPane.showMessageDialog(null, "Valor Inválido, por favor re - insira");
			}
		}while(n>30 || n<0);
		int res = rf.rfib(n);
		
		System.out.println(res);

	}

}
