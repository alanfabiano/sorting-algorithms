package trabalhoGrauB1;

import java.util.LinkedList;

public class QuickSort {

	public String name = "Quick Sort";
	
	public String description = "O algoritmo Quicksort utiliza o paradigma de programação Dividir para Conquistar. Esse paradigma é uma abordagem recursiva em que a entrada do algoritmo é ramificada múltiplas vezes a fim de quebrar o problema maior em problema menores da mesma natureza.";
	
	
	public void ordenarDados(LinkedList<Integer> list, int esquerda, int direita) {
		int esq = esquerda;
		int dir = direita;
		int pivo = list.get((esq + dir) / 2);
		int troca;

		while (esq <= dir) {
			while (list.get(esq) < pivo) {
				esq = esq + 1;
			}
			while (list.get(dir) > pivo) {
				dir = dir - 1;
			}
			if (esq <= dir) {
				troca = list.get(esq);
				list.set(esq, list.get(dir));
				list.set(dir, troca);
				esq = esq + 1;
				dir = dir - 1;
			}
		}
		if (dir > esquerda)
			ordenarDados(list, esquerda, dir);

		if (esq < direita)
			ordenarDados(list, esq, direita);
	}
	
}
