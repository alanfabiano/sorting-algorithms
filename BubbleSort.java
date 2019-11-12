package trabalhoGrauB1;

import java.util.LinkedList;

public class BubbleSort {

	public String name = "Bubble Sort";
	
	public String description = "Realiza a ordenação de forma decrescente, a posição atual é comparada com a próxima posição e, se a posição atual for maior que a posição posterior, é realizada a troca dos valores nessa posição. Caso contrário, não é realizada a troca, apenas passa-se para o próximo par de comparações.";
	
	
	public void ordenarDados(LinkedList<Integer> list) {
	
		int inputLength = list.size();
		int temp;
		boolean is_sorted;

		for (int i = 0; i < inputLength; i++) {
			is_sorted = true;

			for (int j = 1; j < (inputLength - i); j++) {

				if (list.get(j - 1) > list.get(j)) {
					temp = list.get(j - 1);
					list.set((j - 1), list.get(j));
					list.set(j, temp);
					is_sorted = false;
				}
			}
			if (is_sorted) break;

			System.out.println("\n");
		}
    }
}
