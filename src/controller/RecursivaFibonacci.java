package controller;

public class RecursivaFibonacci {
	public RecursivaFibonacci() {
		super();
}
	
	/*Explicação: Recebe um valor n que é reduzido até 2, último termo de fibonacci que tem como valor 1, então retorna somando com os valores posteriores.
	  Tem como condição de parada n<=2 pois 2 é o último termo de fibonacci a valer 1.
	  Tem como passagem de parâmetro n-1 e n-2 pois o valor do termo atual de fibonacci é igual ao valor do termo anterior de fibonnaci mais o valor do termo anterior do anterior, ou o termo - 2.
	 */
	public int rfib(int n) {
			if (n<=2) {
				return 1;
			}else {
			return rfib(n-1)+rfib(n-2);
		}	
	}
}