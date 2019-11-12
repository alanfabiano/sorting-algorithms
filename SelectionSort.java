package trabalhoGrauB1;

import java.util.LinkedList;

public class SelectionSort {

	public String name = "Selection Sort";
	
	public String description = "Consiste em comparar a cada interação um elemento com outros, visando encontrar o menor. Dessa forma, podemos entender que não existe um melhor caso mesmo que o vator esteja ordenado ou em ordem inversa serão executados dois laços no algoritmo, o externo e o interno.";
	
	void ordenarDados(LinkedList<Integer> list) 
    { 
        int n = list.size(); 
  
        for (int i = 0; i < n-1; i++) {
        	
        	int min_idx = i; 
            for (int j = i+1; j < n; j++) {
            	if (list.get(j) < list.get(min_idx)) {
                    min_idx = j;
            	}
            }
            int temp = list.get(min_idx);
            list.set(min_idx, list.get(i));
            list.set(i, temp);
        } 
    }
}
